<html>
<script type="text/javascript">
function sub(){
	/* var n1=64;
	console.log(n1);
	console.log(n1-60);
	var n2=document.getElementById("date").value;
	console.log(n2)
	var n3=n2.split("-");
	
	console.log(n3[0]);
	
	const d = new Date();
	let year = d.getFullYear();
	
	console.log(year);
	console.log(year-n3[0]);
	
	 */
	var n2=document.getElementById("file").value;
	 console.log(n2);
	 
	 if(this.files[0].size>2097152){
		 alert("too big")
		 this.value="";
	 }
	 
}

function upload_check()
{
    var upl = document.getElementById("file");
    var max =2500000;

    if(upl.files[0].size > max)
    {
       alert("File too big!");
       upl.value = "";
    }
    else{
    	alert("Uploaded")
    }
};
</script>
<body>
<h2>Hello World!</h2>
<input type="file" id="file"  accept=".png, .jpg, .jpeg, .pdf">
<input type="submit" onclick="upload_check()">
</body>
</html>
