public class Main5 {
	public static void main(String[] args) {
		System.out.println("�悤�����肢�̊ق�");
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("���Ȃ��̔N�����͂��Ă�������");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("�肢�̌��ʂ��o�܂����I");
		System.out.println(age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune + "�ł��B");
		System.out.println("1: ��g 2:���g 3:�g 4:��");
	}
}