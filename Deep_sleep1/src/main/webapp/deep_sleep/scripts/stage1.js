let arr=[];
let count=0;

function getLines(){
    return lines;
}
function narrator(arr) {
	let text=document.getElementById('linebox').innerHTML;
    const el=document.getElementsByClassName('linesbox')
    el.onclick=new function(){
        document.getElementById('linebox').innerHTML=arr[count];
        }
    count++;
   	if(arr[count]==null){
		document.getElementById('linebox').innerHTML=text;
		count=0;
	}
}
function toNextStage(arr1){
    const el=document.getElementsByClassName('linesbox')
    el.onclick=new function(){
        document.getElementById('linebox').innerHTML=arr1[count];
        }
    count++;
    if(arr1[count]==null&&arr1==stage1Start){
		count=0;
		window.location.href="/Deep_sleep1/deep_sleep/stage1/stage1-1.jsp"
	}
	else if(arr1[count]==null&&arr1==stage1Organize){
		count=0;
		window.location.href="/Deep_sleep1/deep_sleep/stage1/stage1-2.jsp"
	}
	else if(arr1[count]==null&&arr1==S1Ending){
		count=0;
		window.location.href="/Deep_sleep1/deep_sleep/stage2/index.jsp"
	}
 }







