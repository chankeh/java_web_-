package mypackage;

import java.sql.ResultSet;
import java.util.ArrayList;
 

public class ZgManager {
 

	public void setPassword(String username,String usertype,String newpass){
		String sql="";
		DB db=new DB();
		if("1".equals(usertype)){
	    	sql="update s_stu set s_stu_mm='"+newpass+"' where s_stu_dabh='"+username+"'";
		}else if("2".equals(usertype)){
			sql="update s_tu set s_tu_password='"+newpass+"' where s_tu_bh='"+username+"'";
		}else if("3".equals(usertype)){
			sql="update guanli set adminmm='"+newpass+"' where adminid='"+username+"'";
		}
		try{
			db.executeUpdate(sql);
		}catch(Exception e){
			System.err.println("ĞŞ¸ÄÃÜÂë´íÎó£¬´íÎóĞÅÏ¢£º"+e.getMessage());
		}
	}
}
