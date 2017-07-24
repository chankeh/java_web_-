package mypackage;

import java.sql.ResultSet;
import java.util.ArrayList;


public class ptuserop {

     
     	public void add(String username,String type,String password){
		String sql="";
		try {
			DB db=new DB();
 
			sql="insert into lingdao(username,type,password)";
			sql=sql+" values('"+username+"','"+type+"','"+password+"')";
			db.executeUpdate(sql);
			db.close();
		}catch (Exception e) {
			System.err.println("增加用户信息错误，错误信息："+e.getMessage());
		}
	}
	
		public void delete(String username){
		DB db=new DB();
		try {
			String sql="delete from lingdao where  username='"+username+"'";
			db.executeUpdate(sql);			
      	 
			db.close();
			     
		}catch (Exception e) {
			System.err.println("删除人员信息失败，错误信息："+e.getMessage());
		}
	}
	
	public void update(String username,String type,String password){
		DB db=new DB();
		try {
			String sql ="update lingdao set  password="+password+"',type='"+type+"' where username = '"+username+"'";			
			db.executeUpdate(sql);
			db.close();
		}catch (Exception e) {
			System.err.println("人员信息更新错误，错误信息："+e.getMessage());
		}
	}
	
	 public ArrayList<ptuser> getlingdao( ){
        ArrayList<ptuser> al=new ArrayList<ptuser>();
		String sql="";
		try {
			DB db=new DB();
			sql="select * from lingdao where type<>'1' ";
			ResultSet rs=db.executeQuery(sql);
	 
			while(rs.next()){
			
		    	ptuser pt = new ptuser();
		    	pt.setUsername(rs.getString("username"));
		    	pt.setType(rs.getString("type"));
				pt.setPassword(rs.getString("password"));
		 
				al.add(pt);
			
			}
			if(rs!=null){
				rs.close();
				rs=null;
			}
			db.close();
		}catch (Exception e) {
			System.err.println("读取人员信息失败，错误信息："+e.getMessage());
		}
		return al;
	}
	
	
    
}