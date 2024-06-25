import java.text.Format;

public class TestPrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int octNum = 010;
		
		System.out.println(octNum);
		
		int num = 8;
		
		System.out.printf("num=%#o\n", num);
		System.out.printf("num=%#x\n", num);
		
		int hexNum = Integer.parseInt("0a", 16);
		System.out.println(hexNum);
		
		System.out.println("이 내용 취소될까?");

	}

}
