let proviso_count=[];
let frontDoorLines =
	[
		"늘 보던 현관문이다.",
		" 이걸 빨리 열어야 집에 들어가서 쉴 수 있을텐데..."
	];
let doorLockLines =
	[
		"\"혹시 배터리가 다 닳아서 안되는걸까?\"",
		"그럼 배터리만 가지고 있으면  간단히 해결할 수 있지 않은가?",
		"생각난김에 옆에 메고있던 에코백을 급하게 뒤져봤지만 배터리를 상시로 갖고 다니는 사람이 얼마나 있을까",
		"\"환장하겠네!! 진짜!!!!\"",
		"\'단서 : 도어락\' 을 획득하셨습니다."
	];
let upstairLines =
	[
		"계단 위쪽에서는 아무런 소리도 들려오지 않는다.",
		" 누가 도와주지 않으려나.."
	]
let downstairLines =
	[
		"내가 올라온 계단이다.",
		"딱히 특별한 점은 보이지 않는다."
	]

let narratorObj = {
	narratorElem: document.getElementById('linebox'),

	narratorLines: [],
	count: 0,

	getLine: function() {
		if (this.count < this.narratorLines.length)
			narratorElem.innerHTML = this.narratorLines[this.count++];
		else {
			narratorElem.innerHTML = "무엇을 조사해볼까?";
		}
	}
}

document.getElementById('doorlock').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = doorLockLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count = 0;
	if(!proviso_count.includes("도어락")){
		proviso_count.push("도어락");
		console.log(proviso_count)
	}
}
document.getElementById('frontdoor').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = frontDoorLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count = 0;
	if(!proviso_count.includes("현관문")){
		proviso_count.push("현관문");
		console.log(proviso_count)
	}
}
document.getElementById('upstair').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = upstairLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count = 0;
	if(!proviso_count.includes("윗계단")){
		proviso_count.push("윗계단");
		console.log(proviso_count)
	}
}
document.getElementById('downstair').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = downstairLines;
	narratorElem.onclick = narratorObj.getLine;
	narratorObj.count = 0;
	if(!proviso_count.includes("아랫계단")){
		proviso_count.push("아랫계단");
		console.log(proviso_count)
	}
}
if	(
	proviso_count.includes("아랫계단")&&
	proviso_count.includes("윗계단")&&
	proviso_count.includes("도어락")&&
	proviso_count.includes("현관문")	
	)		window.location.href("/Deep_sleep1/deep_sleep/stage1/stage1org.jsp")
narratorObj.getLine = narratorObj.getLine.bind(narratorObj);

