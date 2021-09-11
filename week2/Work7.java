package week2;
//Practice try, catch, finally

public class Work7 {

	public static void main(String[] args) {
		// 로그인 성공 시 catch문은 실행 X, finally는 실행되며 종료
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
		// 밑의 값 중 어느 하나가 true가 될 경우 catch문이 실행, 메세지 출력 후 finally 실행
		// 두 개 이상의 값이 true인 경우 보다 앞선 것이 출력
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
