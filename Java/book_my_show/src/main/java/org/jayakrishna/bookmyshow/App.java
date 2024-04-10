package org.jayakrishna.bookmyshow;

import org.jayakrishna.bookmyshow.repository.ShowRepository;
import org.jayakrishna.bookmyshow.showentity.ShowEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ShowEntity showEntity = new ShowEntity();
        
        showEntity.setAltkey(143);
        showEntity.setMovieName("Maharshi");
        showEntity.setActorName("Prince Mahesh babu");
        showEntity.setActressName("Pooja Hegde");
        showEntity.setReleaseDate("09/May/2019");
        showEntity.setRating("4.7");
        
        ShowRepository showRepository = new ShowRepository();
//        showRepository.saveOrUpdate(showEntity);
        System.out.println(showRepository.findMovieById(143));
      
        
    }
}
