package Utils;



import java.util.List;

import dtu.ws.fastmoney.Account;
import dtu.ws.fastmoney.AccountInfo;
import dtu.ws.fastmoney.BankService;
import dtu.ws.fastmoney.BankServiceException_Exception;
import dtu.ws.fastmoney.BankServiceService;

public class TestBankAPI {

	public static void main(String[] args) {
		BankService bank = new BankServiceService().getBankServicePort();
		List<AccountInfo> accounts = bank.getAccounts();
		System.out.println(accounts.get(0).getAccountId());
		
		try {
			Account ac = bank.getAccount("c825b1df-8313-4516-b9b1-a0940efb192a");
			System.out.println(ac);
		} catch (BankServiceException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}