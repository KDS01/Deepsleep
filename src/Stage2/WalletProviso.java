package Stage2;

import Stage1.ChoiceObject;

public class WalletProviso extends ChoiceObject {
	{
		this.choicename = "지갑";
		this.choiceObjectLines =new String[] {
				"카드와 신분증, 아주 소량의 현금이 들어있는 작은 지갑이다.",
				 "요새 현금 쓰는 사람 얼마 없으니까 굳이 현금은 들고 다니지 않는다..진짜로 ...",
				 "\"단서 : 지갑\"을 획득하셨습니다."
				};
		this.addProviso("단서 : 지갑");
		
	}

}
