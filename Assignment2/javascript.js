window.onload = function(){changeSize();};
window.onresize = changeSize;

function changeColor()
{
	document.getElementById("color1").style.color="#FFFF00";
	document.getElementById("color2").style.color="#FF0000";
  	document.getElementById("color3").style.color="#339933";
	document.getElementById("bg1").style.backgroundColor="#CC9900";
	document.getElementById("bg2").style.backgroundColor="99FF00";
}

function defaultColor()
{
	document.getElementById("color1").style.color="";
  	document.getElementById("color2").style.color="";
  	document.getElementById("color3").style.color="";
	document.getElementById("bg1").style.backgroundColor="";
	document.getElementById("bg2").style.backgroundColor="";
}

function changeSize()
{
	var getWidth = document.documentElement.clientWidth;

	if(getWidth < 1100)
	{
		document.body.className="small";
	}

	if(getWidth >=1100)
	{
		document.body.className="normal";
	}
}
