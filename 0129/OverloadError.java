//�R���p�C���G���[�ɂȂ�R�[�h
//hello���\�b�h��2���邽�߁B
class OverloadError {
	public static void main(String args[]) {
		System.out.println("���\�b�h���Ăяo���܂��B");
		hello();
		System.out.println("���\�b�h�̌Ăяo�����I���܂����B");
		
	}
	public static void hello() {
		System.out.println("������A����ɂ���");
		
	}
	
	public static void hello() {
		System.out.println("����ɂ���");
	}
}