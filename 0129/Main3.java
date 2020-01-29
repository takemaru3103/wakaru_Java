public class Main3 {
	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add();
	}
	public static void add() {
		int ans = x + y; //コンパイルエラー
		//変数(xとy)のスコープが原因
		System.out.println(x + "+" + y + "=" + ans);//コンパイルエラー
		//変数(xとy)のスコープが原因
	}
}