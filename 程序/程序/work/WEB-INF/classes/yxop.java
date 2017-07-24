package mypackage;

import java.sql.ResultSet;
import java.util.ArrayList;

public class yxop {

 	public void add(String s_yx_bh,String s_yx_mc){
		String sql="";
		try {
			DB db=new DB();
 
			sql="insert into s_yx(s_yx_bh,s_yx_mc)";
			sql=sql+" values('"+s_yx_bh+"','"+s_yx_mc+"')";
			db.executeUpdate(sql);
			db.close();
		}catch (Exception e) {
			System.err.println("增加类型错误，错误信息："+e.getMessage());
		}
	}
 
 
  	public void delete(String s_yx_bh){
		DB db=new DB();
		try {
			String sql="delete from s_yx where s_yx_bh='"+s_yx_bh+"'";
			db.close();
			db.executeUpdate(sql);			

		}catch (Exception e) {
			System.err.println("删除类型信息失败，错误信息："+e.getMessage());
		}
	}

    public ArrayList<yx> getYx(){
        ArrayList<yx> al=new ArrayList<yx>();
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_yx";
			ResultSet rs=db.executeQuery(sql);
			while(rs.next()){
			
		    	yx y = new yx();
			    y.setS_yx_bh(rs.getString("s_yx_bh"));
			    y.setS_yx_mc(rs.getString("s_yx_mc"));
				al.add(y);
			
			}
			if(rs!=null){
				rs.close();
				rs=null;
			}
			db.close();
		}catch (Exception e) {
			System.err.println("用户信息失败，错误信息："+e.getMessage());
		}
		return al;
	}
	 
}