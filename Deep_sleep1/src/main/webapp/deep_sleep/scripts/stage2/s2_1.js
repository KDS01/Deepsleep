let RefregeratorLines=[
				"30년은 족히 된 것 같은 육중한 냉장고다.",
				"내 형편에 양문형 냉장고는 꿈도 꿀 수 없겠지.",
				"나보다 늙은 냉장고가 제대로 작동해주는 것만 해도 감사하다"
				]
let mainRoomLines=[
				"냉장고 옆쪽의 구석에 안방으로 가는 문이 보인다.",
				"집 구조상 안쪽에 숨어있어 잘 보이지 않는다.",
				"당장이라도 방문을 열고 들어가서 눕고 싶지만...",
				"\"너무 피곤하지만...지금은 해야 할 일이 있는 것 같은 기분이 들어..\""
				]
let cellphoneLines=[
				"평범한 갤럭시 휴대폰이다.",
				"오래 된 모델인데다가 액정의 오른쪽 귀퉁이에 금이 가 있다. 하지만 여전히 문제없이 작동한다",
				"위이잉",
				"휴대폰을 집어 올리다가 화면이 눌렸는지 옅은 진동이 느껴졌다.",
				"삑, 삑 하는 기계음이 멀리서 들리더니, 바퀴 끌리는 소리를 내며 작은 장난감이 확 튀어나왔다.",
				"\"이건.....\"",
				"아래쪽에 바퀴가 달린, 작은 쥐 모양의 장난감이 구석에서 튀어나왔다 ",
				]
let envelopeLines=[
				"무엇이 들어있는지 모를 작은 봉투다.",
				"언제부터 내 가방에 있었더라.. 뭐가 들어있을 지 모르니 조심스럽게 열어보자",
				"부스럭 부스럭..",
				"봉투를 헤집자 작은 약통이 툭 하고 떨어졌다.",
				"보통의 약통 크기가 크지 않은 걸 감안해도, 상당히 작은 크기의 약통이었다.",
				"내가 평소에 먹었던 약인가보다..",
				"약통에는 작은 네이밍 태그가 붙어있었다.",
				"네이밍 태그에는 \'티오펜탈나트륨\'이라고 적혀있었다.",
				]
let walletLines=[
				"카드와 신분증, 아주 소량의 현금이 들어있는 작은 지갑이다.",
				 "요새 현금 쓰는 사람 얼마 없으니까 굳이 현금은 들고 다니지 않는다..진짜로 ...",
				]
let remoteLines=
				[
				"휴대폰과 연동해서 조종하는 작은 쥐 모양의 장난감이다.",
				"바닥에 바퀴가 달려있어 조종하는 대로 자유롭게 움직일 수 있다.",
				"\"이런 게 왜 우리 집에 있는거지...?\""
				]
let tableLines=
				[
				"흔히 볼 수 있는 나무로 된 식탁이다.",
				"자세히 보니 작은 에코백이 걸려 있다.",
				"이건.....",
				"내가 평소에 자주 메고 다니는 에코백이다.",
				".....",
				"저 안에 뭐가 들어있었더라...",
				"에코백을 거꾸로 뒤집자 요란한 소리를 내며 내용물들이 우수수 쏟아졌다.",
				"이건 아니고.... 이건 또 뭐야... 이런 건 전혀 쓸모없잖아..",
				"전혀 쓸모없어 보이는 것들을 제외하니, 지갑과 휴대폰 그리고 뭐가 들어있는지 알 수 없는 작은 봉투가 남았다.",
				]
let sofaLines=[
				"푹신해 보이는 소파다.",
				"당장이라도 달려가 눕고 싶지만 그 전에 해야할 일이...",
				"어..? 해야 할 일이 있었던가?"
				]

												
let narratorObj = {
	narratorElem: document.getElementById('linebox'),
   narratorLines: [],
   count:0 ,
   
   getLine: function() {
      if (this.count < this.narratorLines.length)
         narratorElem.innerHTML = this.narratorLines[this.count++];
      else {
		  }
      }
	 }
   
function toNextStage(){
	window.location.href("/Deep_sleep1/deep_sleep/stage2/index.jsp");
}

document.getElementById('ref').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = RefregeratorLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
	if(!provisos.includes("냉장고")){
		provisos.push("냉장고");
	}
}
document.getElementById('sofa').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = sofaLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
		if(!provisos.includes("소파")){
		provisos.push("소파");
		}
}
document.getElementById('table').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = tableLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
	if(!provisos.includes("에코백")){
		provisos.push("에코백");
	}
}
document.getElementById('mainroomdoor').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = downStairLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
	if(!provisos.includes("안방")){
		provisos.push("안방");
		}
	}
/*document.getElementById('clawHammer').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = clawhammerLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
	if(!provisos.includes("장도리")){
		provisos.push("장도리");
		narratorElem.onclick=function(){
		narratorObj.narratorLines=S1EndingLines
		narratorElem.onclick=narratorObj.getLine;
		}
		window.onload(toNextStage());
		}
	}*/
narratorObj.getLine = narratorObj.getLine.bind(narratorObj);