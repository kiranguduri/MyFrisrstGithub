package bankPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestBank {
	
	static Map<String, Bank> bankMap;

	public static void main(String[] args) {
		Branch br1=new Branch(1,"Kulathoor",false);
		Branch br2=new Branch(2,"Kazikottam",true);
		Branch br3=new Branch(3,"pottam",false);
		Branch br4=new Branch(4,"kovalam",true);
		
		ArrayList<Branch> icicibranches=new ArrayList<Branch>();
		icicibranches.add(br1);
		icicibranches.add(br2);
		icicibranches.add(br3);
		icicibranches.add(br4);
		
		Bank b=new Bank(11,"ICICI",icicibranches);
		
		bankMap=new HashMap<>();
		bankMap.put("icici", b);
		
		List<Branch> foundBranches=findBranchAtms("icici");
		System.out.println(foundBranches);
		
		
	
	}
	public static List<Branch> findBranchAtms(String bankName){
		List<Branch> foundBranches=new ArrayList<Branch>();
		Bank bankObj=bankMap.get(bankName);
		if(bankObj != null)
		{
			for(Branch branchs: bankObj.branchs)
			{
				if(branchs.isHasAtm())
				{
					foundBranches.add(branchs);
				}
			}
		}
		
		
		return foundBranches;
		
	}

}
