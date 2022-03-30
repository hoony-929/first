package class07_array;

public class Lotto {

	public static void main(String[] args) {
		// 로또
		// Math.random() : 0부터 1사이의 랜덤 실수를 생성
		// 0~0.99999999999999999999
		// 로또는 1부터 45까지 6자리의 숫자 배열

		// Math.random * 10 을 하면 0~ 9.99999 (int 0 ~ 9)
		// Math.random * 100 을 하면 0~ 99.99999 (int 0 ~ 99)
		// Math.random * 45 을 하면 0 ~ 44.9999 (int 0 ~ 44)
		int lottoNum = (int) ((Math.random() * 45) + 1);
//		System.out.print(lottoNum);

		int[] myLotto = new int[6];

		// 로또는 중복이 없다
		// myLotto에 Math.random()을 이용해서 로또번호(1 ~ 45)를 중복되지 않게 담아주세요.
//		for(int i= 0; i < 6; i++) {
//		
//			myLotto[i] = (int)((Math.random()*45)+1);
//			
//			for(int j = 0; j < i; j++) {
//				if(myLotto[i] == myLotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.print("로또 번호: ");
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.print(myLotto[i] + " ");
//		}
//		
//		System.out.print("로또 번호: ");
//		for(int i = 0; i < myLotto.length; i++) {
//			int lottNum = (int)((Math.random()*45)+1);
//			myLotto[i] = lottNum;
//			for(int j = 0; j < i; j++) {
//				if(myLotto[i] == myLotto[j]) {
//					i--;
//					break;
//				}
//			}
//			System.out.print(myLotto[i] + " ");
//		} 

		int idx = 0;
		while (true) {
			int lottNum = (int) ((Math.random() * 45) + 1);

			boolean isEqual = false;

			// 중복 체크
			for (int i = 0; i < myLotto.length; i++) {
				if (myLotto[i] == lottNum) {
					isEqual = true;
				}
			}

			if (isEqual == false) {
				myLotto[idx] = lottNum;
				idx++;

				if (idx > 5) {
					break;
				}
			}

		}
		ArrayStudy.printArray(myLotto);

		// 로또는 정렬도 해야함 (오름차순)
		for (int i = 0; i < myLotto.length; i++) {
			boolean swapped = false;

			for (int j = 0; j < myLotto.length - 1 - i; j++) {
				if (myLotto[j] > myLotto[j + 1]) {
					myLotto[j] = myLotto[j] + myLotto[j + 1];
					myLotto[j + 1] = myLotto[j] - myLotto[j + 1];
					myLotto[j] = myLotto[j] - myLotto[j + 1];
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}
		ArrayStudy.printArray(myLotto);

		int[] winLotto = { 1, 4, 29, 39, 43, 45 };
		int[] lottoArr = makeLotto();

		ArrayStudy.printArray(winLotto);
		ArrayStudy.printArray(lottoArr);

		// winLotto 와 lottoArr을 비교해서 당첨 갯수를 리턴하는 함수를 만들어주세요

		compareLotto(winLotto, lottoArr);
		
		long runTime = 0;
//		while(true) {
//			System.out.println(++runTime+"회 실행");
//			if(compareLotto(winLotto, makeLotto())) {
//				System.out.println("1등 당첨되셨습니다! 축하합니다!");
//				System.out.println("구매 횟수: " + runTime);
//				System.out.println("구매 금액: " + (runTime * 1000));
//				break;
//			}
//		} // 1등 당첨

		

	} // main 괄호

	// 두 숫자 배열을 배교하여 6개가 같다면 true를 리턴
	public static boolean compareLotto(int[] winArr, int[] myArr) {
		int count = 0;
		for (int i = 0; i < winArr.length; i++) {

			if (winArr[i] == myArr[i]) {
				count++;
			}

		}
		System.out.println(count + "개 일치");
//				if(count == 6) {
//					return true;
//				}
//				return false;
		return (count == 6);
	}

	// 로또 만들어서 숫자 배열 리턴
	public static int[] makeLotto() {
		int[] myLotto = new int[6];
		int idx = 0;
		while (true) {
			int lottNum = (int) ((Math.random() * 45) + 1);

			boolean isEqual = false;

			// 중복 체크
			for (int i = 0; i < myLotto.length; i++) {
				if (myLotto[i] == lottNum) {
					isEqual = true;
				}
			}

			if (isEqual == false) {
				myLotto[idx] = lottNum;
				idx++;

				if (idx > 5) {
					break;
				}
			}

		}
		ArrayStudy.printArray(myLotto);
		for (int i = 0; i < myLotto.length; i++) {
			boolean swapped = false;

			for (int j = 0; j < myLotto.length - 1 - i; j++) {
				if (myLotto[j] > myLotto[j + 1]) {
					myLotto[j] = myLotto[j] + myLotto[j + 1];
					myLotto[j + 1] = myLotto[j] - myLotto[j + 1];
					myLotto[j] = myLotto[j] - myLotto[j + 1];
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}
		ArrayStudy.printArray(myLotto);
		return myLotto;
	}
}
