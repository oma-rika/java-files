
public class Test {

	public static void main(String[] args) {
		// Testを作成してインスタンス化および実行する
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");
		dao.selectByName("taro");
	}

}
