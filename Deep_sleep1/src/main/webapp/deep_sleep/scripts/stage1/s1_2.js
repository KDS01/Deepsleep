let doorlockLines=[
				"\"혹시 배터리가 다 닳아서 안되는걸까?\"",
				"그럼 배터리만 가지고 있으면  간단히 해결할 수 있지 않은가?",
				"생각난김에 옆에 메고있던 에코백을 급하게 뒤져봤지만 배터리를 상시로 갖고 다니는 사람이 얼마나 있을까",
				"\"환장하겠네!! 진짜!!!!\"",
				"\'단서 : 도어락\' 을 획득하셨습니다."
				]
let frontDoorLines=[
					"늘 보던 현관문이다.",
				 	" 이걸 빨리 열어야 집에 들어가서 쉴 수 있을텐데..."
				]
let upstairLines=[
				"계단 위쪽에서는 아무런 소리도 들려오지 않는다.",
				" 누가 도와주지 않으려나.."
				]
let downStairLines=[
				"내가 올라온 계단이다.",
				"딱히 특별한 점은 보이지 않는다."
				]
let clawhammerLines=
				[
				"뒷면에 못을 뽑을 수 있는 노루발 모양의 못뽑이가 달린 작은 망치.",
				" 크기는 작지만 통짜 철로 되어 있어 힘을 주어 때리면 상당한 파괴력을 내는 물건이다."
				]
let S1EndingLines=
				[
				"이미 머리 끝까지 화가 난 상태라 장도리를 집자 마자 이성이 반 정도 날아가는 걸 느꼈다.",
				"장도리를 천천히 고쳐잡으며 현관문으로 향했다",
				"이제 더 이상 방해하지마!",
				"...",
				".....",
				"쾅!!",
				"쾅!!!",
				"쾅!!!! 콰직!!!!",
				"도어락은 싱거울 정도로 쉽게 부서졌다.",
				"\"집에 오자마자 이게 뭐하는 짓인지...\" ",
				"그래도 문은 열었네... 이만 집에 들어가자...",
				"[Stage 1] CLEAR"
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

document.getElementById('doorlock').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = doorlockLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
	if(!provisos.includes("도어락")){
		provisos.push("도어락");
	}
}
document.getElementById('frontdoor').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = frontDoorLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
		if(!provisos.includes("현관문")){
		provisos.push("현관문");
		}
}
document.getElementById('upstair').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = upstairLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
	if(!provisos.includes("윗계단")){
		provisos.push("윗계단");
	}
}
document.getElementById('downstair').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = downStairLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count=0;
	if(!provisos.includes("아랫계단")){
		provisos.push("아랫계단");
		}
	}
document.getElementById('clawHammer').onclick = function() {
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
	}
narratorObj.getLine = narratorObj.getLine.bind(narratorObj);
