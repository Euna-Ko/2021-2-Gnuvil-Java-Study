package week2;
//Practice try, catch, finally

public class Work7 {

	public static void main(String[] args) {
		// �α��� ���� �� catch���� ���� X, finally�� ����Ǹ� ����
		try {
		boolean isSuccess = login("gnuvil", "202109");
		if(isSuccess) System.out.println("Login success");
		else System.out.println("Login Failed");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Gnuvil Java Study 2021-2");
		}

	}
	
	static boolean login(String id, String pw) throws Exception{
		
		// Client -> "gnuvil", "202109" -> Server
		// ���� �� �� ��� �ϳ��� true�� �� ��� catch���� ����, �޼��� ��� �� finally ����
		// �� �� �̻��� ���� true�� ��� ���� �ռ� ���� ���
		boolean isNetworkFailed = false;
		boolean isNoId = false;
		boolean isPasswordWrong = false;
		boolean isPWExpired = false;
		
		if (isNetworkFailed) throw new Exception("Network Failed");
		else if (isNoId) throw new Exception("User ID does not exist");
		else if (isPasswordWrong) throw new Exception("Wrong password");
		else if (isPWExpired) throw new Exception("Password change needed");
		
		return true;
	}

}
