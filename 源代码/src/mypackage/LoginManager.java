package mypackage;

import java.sql.ResultSet;

 
public class LoginManager {
	public boolean testUser(String username,String password,String type){
		boolean result=false;
		String sql="";
		DB db=new DB();
		if("1".equals(type)){
			sql="select count(*) from s_stu where  s_stu_dabh='"+username+"' and s_stu_mm='"+password+"'";
		}else if("2".equals(type)){
			sql="select count(*) from s_tu where  s_tu_bh='"+username+"' and s_tu_password='"+password+"'";
		}else if("3".equals(type)){
			sql="select count(*) from guanli where  adminid='"+username+"' and adminmm='"+password+"'";
	    }else{
			result=false;
		}
		try{
			System.out.print(sql);
			ResultSet rs=db.executeQuery(sql);
			if(rs.next()){
				if(rs.getInt(1)>0){
					result=true;
				}else{
				    result=false;
				}
			}else{
				result=false;
			}
		}catch(Exception e){
			
		}
		return result;
	}

}
