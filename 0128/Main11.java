public class Main11 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9 };
		System.out.println("1���̐�������͂��Ă�������");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int n: numbers) {
			if(n == input) {
				System.out.println("�A�^��!");
			} else
			System.out.println("�n�Y��");
		}
	}
}