package mypackage;

import java.sql.ResultSet;
import java.util.ArrayList;

public class mzop {

 	public void add(String s_mz_bh,String s_mz_mc){
		String sql="";
		try {
			DB db=new DB();
 
			sql="insert into s_mz(s_mz_bh,s_mz_mc)";
			sql=sql+" values('"+s_mz_bh+"','"+s_mz_mc+"')";
			db.executeUpdate(sql);
			db.close();
		}catch (Exception e) {
			System.err.println("�������ʹ��󣬴�����Ϣ��"+e.getMessage());
		}
	}
 
 
  	public void delete(String s_mz_bh){
		DB db=new DB();
		try {
			String sql="delete from s_mz where s_mz_bh='"+s_mz_bh+"'";
			db.close();
			db.executeUpdate(sql);			

		}catch (Exception e) {
			System.err.println("ɾ��������Ϣʧ�ܣ�������Ϣ��"+e.getMessage());
		}
	}

    public ArrayList<mz> getMz(){
        ArrayList<mz> al=new ArrayList<mz>();
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_mz";
			ResultSet rs=db.executeQuery(sql);
			while(rs.next()){
			
		    	mz y = new mz();
			    y.setS_mz_bh(rs.getString("s_mz_bh"));
			    y.setS_mz_mc(rs.getString("s_mz_mc"));
				al.add(y);
			
			}
			if(rs!=null){
				rs.close();
				rs=null;
			}
			db.close();
		}catch (Exception e) {
			System.err.println("�û���Ϣʧ�ܣ�������Ϣ��"+e.getMessage());
		}
		return al;
	}
	 
}