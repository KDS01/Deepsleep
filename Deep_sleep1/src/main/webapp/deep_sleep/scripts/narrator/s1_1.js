let stage1Start=[
				"현관에 다가서자, 형광등이 밝아지며 평범한 빌라의 현관문이 드러난다.",
				"퀴퀴한 곰팡이 냄새, 습기를 잔뜩 먹은 먼지 냄새, 천장의 희미한 등빛에 모인 이름 모를 날벌레들. 징그럽도록 익숙한 풍경이다.",
				"익숙한 풍경, 익숙한 냄새에 반쯤 포기한 듯 한숨을 쉬면서 집 문의 도어락에 손을 갖다댔다.",
				"\"오늘은 너무 힘들었어…  이만 들어가서 쉬자…\"",
				"덜컥 덜컥",
				"다른 걸 생각할 겨를조차 없다. 뭔가에 쫒기듯이 도어락을 위로 제꼈지만 뭐가 문제인지 반응이 없다.",
				"\"뭐야?\"",
				"덜컥 덜컥 덜컥",
				"설마 도어락이 고장난거야?",
				"\"아니 왜\"",
				"덜컥 덜컥 덜컥 덜컥",
				"\"아니 왜!!\"",
				"덜컥 덜컥 덜컥 덜컥 덜컥",
				"쾅!",
				"\"아니 왜 하필 오늘 난리야!!!!\""
				]
let narratorObj = {
	narratorElem: document.getElementById('linebox'),
	
   narratorLines: [],
   count:0 ,
   
   getLine: function() {
      if (this.count < this.narratorLines.length)
         narratorElem.innerHTML = this.narratorLines[this.count++];
      else {
		  window.location.href="../stage1/stage1-1.jsp"
		  }
      }
	 }
   
   

document.getElementById('linebox').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = stage1Start;
	narratorElem.onclick = narratorObj.getLine;
}
narratorObj.getLine = narratorObj.getLine.bind(narratorObj);