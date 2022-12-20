
<!DOCTYPE html>
<!-- saved from url=(0054)https://preview.colorlib.com/theme/bootstrap/table-01/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Table 01</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="./css/css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="./css/font-awesome.min.css">
<link rel="stylesheet" href="./css/style.css">
      <script src="./js/jquery-1.11.1.min.js.download"></script>
    <script type="text/javascript">
        $(function () {
            function moveItems(origin, dest) {
                $(origin).find(':selected').appendTo(dest);
            }

            function moveAllItems(origin, dest) {
                $(origin).children().appendTo(dest);
            }

            $('#left').click(function () {
                moveItems('#sbTwo', '#sbOne');
            });

            $('#right').on('click', function () {
                moveItems('#sbOne', '#sbTwo');
            });

            $('#leftall').on('click', function () {
                moveAllItems('#sbTwo', '#sbOne');
            });

            $('#rightall').on('click', function () {
                moveAllItems('#sbOne', '#sbTwo');
            });
        });
function myFunction() {
	 var mydata = [];
	    for (var option of document.getElementById('sbTwo').options)
	    {
	    	mydata.push(option.value);
	         
	    }
	    alert(mydata);
}
</script>	
</head>
<body>

<jsp:include page="home.jsp"/>

 <div class="container">
 
 <p id="jhhh"></p>
  
  <h3 align="center" class="heading-section">Show ApI Keys</h3>
  <div align="center">
				<table >
				<thead>
								<tr ><th>
								<select id="sbOne" multiple="multiple" style="width: 12em; height: 16em;" >
        <option value="1">Alpha</option>
        <option value="2">Beta</option>
        <option value="3">Gamma</option>
        <option value="4">Delta</option>
        <option value="5">Epsilon</option>
        <option value="6">mac</option>
        <option value="7">Epsilon1</option>
        <option value="8">fury2</option>
        <option value="9">Epsilon3</option>
        <option value="10">pury24</option>
        <option value="11">Epsilon24</option>
        <option value="12">mary4</option>
        <option value="13">Epsilon446</option>
        <option value="14">dany4646</option>
        <option value="15">Epsilon676</option>
        <option value="16">benny57</option>
        <option value="17">cany7</option>
        <option value="18">benny8</option>
        <option value="19">pany90</option>
        <option value="20">benny0</option>
    </select></th>
							
<td>

</td>
<td>

</td>
<td>

</td>

<td>

</td>
<td>

</td><td>

</td>	
<td>

</td><td>

</td><td>

</td>
<td>

</td>
<td >
<button type="button" id="right" style="width: 2.8em; height: 2.7em;" class="btn btn-primary mb-1">&gt;</button> <br/>
<button type="button" id="left" style="width: 2.8em; height: 2.7em;"class="btn btn-primary mb-1">&lt;</button> <br/>
<button type="button" id="rightall" class="btn btn-primary mb-1">&gt></button> <br/>
<button type="button" id="leftall" class="btn btn-primary mb-1">&lt<</button> <br/>


</td>
	
	<td >

</td>
<td>

</td><td>

</td><td>

</td><td>

</td><td>

</td><td>

</td><td>

</td><td>

</td>
<td>

</td>
<td>

</td>						
<th>
    <select id="sbTwo" multiple="multiple" style="width: 12em; height: 16em;" >
       
    </select>
</th>

							
							</td>

</tr>

							</thead>
							
							<td>
							
							
				</table>
				
				<div>
				</br>
				</div>

<div align="center">

<button type="button" onclick="myFunction()" " class="btn btn-primary mb-1">Generate</button>

</div>



 </div>
    
</body>
</html>