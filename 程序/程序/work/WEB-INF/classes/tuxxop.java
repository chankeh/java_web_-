 package mypackage;

import java.sql.ResultSet;
import java.util.ArrayList;

public class tuxxop {

   	public void add(String s_tu_bh,String s_tu_name,String s_tu_yx,String s_tu_password,String s_tu_dh,String s_tu_dz){
		String sql="";
		try {
			DB db=new DB();
 
			sql="insert into s_tu(s_tu_bh,s_tu_name,s_tu_yx,s_tu_password,s_tu_dh,s_tu_dz)";
			sql=sql+" values('"+s_tu_bh+"','"+s_tu_name+"','"+s_tu_yx+"','"+s_tu_password+"','"+s_tu_dh+"','"+s_tu_dz+"')";
			System.out.print(sql);
			db.executeUpdate(sql);
			db.close();
		}catch (Exception e) {
			System.err.println("增加学生信息错误，错误信息："+e.getMessage());
		}
	}
	
	
		
	public void update(String s_tu_bh,String s_tu_name,String s_tu_yx,String s_tu_dh,String s_tu_dz)
		{
		DB db=new DB();
	 	try {
			String sql ="update s_tu set  s_tu_bh='"+s_tu_bh+"',s_tu_name='"+s_tu_name+"',s_tu_yx='"+s_tu_yx+"',s_tu_dh='"+s_tu_dh+"',s_tu_dz='"+s_tu_dz+"'  where s_tu_bh = '"+s_tu_bh+"'";			
			db.executeUpdate(sql);
			db.close();
	    	}catch (Exception e) {
			System.err.println("学生信息更新错误，错误信息："+e.getMessage());
		    }
	    }
	
	

 
 
 
 
		public void delete(String s_tu_bh){
		DB db=new DB();
		try {
			String sql="delete from s_tu where s_tu_bh='"+s_tu_bh+"'";
			db.executeUpdate(sql);			
      	 
			db.close();
			     
		}catch (Exception e) {
			System.err.println("删除学生信息失败，错误信息："+e.getMessage());
		}
	}
	
	
	
	
	
	
    public ArrayList<tuxx> getTuxxall( ){
        ArrayList<tuxx> al=new ArrayList<tuxx>();
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_tu ";
			ResultSet rs=db.executeQuery(sql);
	 
			while(rs.next()){
			
		    	tuxx st = new tuxx();
				st.setS_tu_bh(rs.getString("s_tu_bh"));
				st.setS_tu_name(rs.getString("s_tu_name"));
				st.setS_tu_yx(rs.getString("s_tu_yx"));
					st.setS_tu_dh(rs.getString("s_tu_dh"));
				st.setS_tu_dz(rs.getString("s_tu_dz"));
				st.setS_tu_password(rs.getString("s_tu_password"));
			
				 
				al.add(st);
			
			}
			if(rs!=null){
				rs.close();
				rs=null;
			}
			db.close();
		}catch (Exception e) {
			System.err.println("2222读取学生信息失败，错误信息："+e.getMessage());
		}
		return al;
	}
	
		

    public ArrayList<tuxx> getTuxxbh1(String s_tu_bh){
    	 ArrayList<tuxx> al=new ArrayList<tuxx>();
       
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_tu where s_tu_bh='"+s_tu_bh+"'";
			ResultSet rs=db.executeQuery(sql);
	 
			while(rs.next()){
			
		    	  tuxx st = new tuxx();
				st.setS_tu_bh(rs.getString("s_tu_bh"));
				st.setS_tu_name(rs.getString("s_tu_name"));
				st.setS_tu_yx(rs.getString("s_tu_yx"));
				st.setS_tu_dh(rs.getString("s_tu_dh"));
				st.setS_tu_dz(rs.getString("s_tu_dz"));
				st.setS_tu_password(rs.getString("s_tu_password"));
				
				 	al.add(st);
			 
			
			}
			if(rs!=null){
				rs.close();
				rs=null;
			}
			db.close();
		}catch (Exception e) {
			System.err.println("读取学生信息失败，错误信息："+e.getMessage());
		}
		return al;
	}
	
	
	
	 public tuxx getTuxxbh2(String s_tu_bh){
        tuxx st = new tuxx();
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_tu where s_tu_bh='"+s_tu_bh+"'";
			ResultSet rs=db.executeQuery(sql);
	 
			if(rs.next()){
			
		    	
				st.setS_tu_bh(rs.getString("s_tu_bh"));
				st.setS_tu_name(rs.getString("s_tu_name"));
				st.setS_tu_yx(rs.getString("s_tu_yx"));
					st.setS_tu_dh(rs.getString("s_tu_dh"));
				st.setS_tu_dz(rs.getString("s_tu_dz"));
				st.setS_tu_password(rs.getString("s_tu_password"));
				
				 
			 
			
			}
			if(rs!=null){
				rs.close();
				rs=null;
			}
			db.close();
		}catch (Exception e) {
			System.err.println("读取学生信息失败，错误信息："+e.getMessage());
		}
		return st;
	}
	
	
	
	
}