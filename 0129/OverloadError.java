//コンパイルエラーになるコード
//helloメソッドが2つあるため。
class OverloadError {
	public static void main(String args[]) {
		System.out.println("メソッドを呼び出します。");
		hello();
		System.out.println("メソッドの呼び出しが終わりました。");
		
	}
	public static void hello() {
		System.out.println("湊さん、こんにちは");
		
	}
	
	public static void hello() {
		System.out.println("こんにちは");
	}
}