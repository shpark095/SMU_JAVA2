package chap06;

public class example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = new int[5];
		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " 번째 요소 값 : " + myArr[i]);
		}

	}

}