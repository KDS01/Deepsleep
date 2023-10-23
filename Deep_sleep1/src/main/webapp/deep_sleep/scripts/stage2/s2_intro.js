let stage2Start=[
				"문을 열고 안으로 들어가자, 눅눅하고 후텁지근한 공기가 훅 몰아쳤다",
				"좁은 거실에 옹기종기 모여있는 가구들, 이상할 정도로 큰 냉장고와 푹신해 보이는 소파",
				"익숙하지만... 어딘가 낯설게 느껴지는 풍경이다.",
				"\"쿵!\"",
				"어깨를 묘하게 짓누르던 에코백을 바닥에 던지고, 한숨을 쉬며 신발을 벗었다.",
				"\"하아아아아아아아...\"",
				"오늘은 너무 많은 일이 있었다.. 정말로...",
				"집에 오자마자 도어락이 고장나질 않나.. 정말 되는 일이 하나도 없다.",
				"\"그래도 돌아왔으니까..\"",
				"그런데...",
				"\"도대체 뭐야...\"",
				"아까부터 느껴지는 이 기묘한 위화감과...",
				"뭔가 잊어버린 것 같은 이 찜찜한 느낌...",
				"\"내가....뭔가를 놓치고 있는 걸까..?\"",
				"피로가 뇌를 지배해서 당장이라도 누워서 잠들고 싶지만",
				"이 찜찜한 느낌이 도저히 떨쳐지질 않고, 머릿속을 완전히 뒤흔들고 있다.",
				"내가 도대체 뭐를 잊어버린거지..?"
				]
let narratorObj = {
	narratorElem: document.getElementById('linebox'),
   narratorLines: [],
   count:0 ,
   
   getLine: function() {
      if (this.count < this.narratorLines.length)
         narratorElem.innerHTML = this.narratorLines[this.count++];
      else {
		  window.location.href="../stage2/stage2-1.jsp"
		  }
      }
	}
document.getElementById('linebox').onclick = function() {
	narratorElem = document.getElementById('linebox');
	narratorObj.narratorLines = stage2Start;
	narratorElem.onclick = narratorObj.getLine;
}
narratorObj.getLine = narratorObj.getLine.bind(narratorObj);