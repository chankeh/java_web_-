 package mypackage;

import java.sql.ResultSet;
import java.util.ArrayList;

public class stxxop {

   	public void add(String s_stu_dabh,String s_stu_xm,String s_stu_sfz,String s_stu_dhhm,String s_stu_jtdz,String s_stu_dasj,String s_stu_dadz,String s_stu_xl,String s_stu_jl,String s_stu_cf,String s_stu_yx,String s_stu_mz,String s_stu_zy,String s_stu_jy,String s_stu_mm,String s_stu_fq,String s_stu_jq,String s_stu_dj,String s_stu_cl,String s_stu_djb,String s_stu_tjb,String s_stu_cjb,String s_stu_xwb,String s_stu_rdb,String s_stu_mzb,String s_stu_mmb,String s_stu_ffb,String s_stu_ydb){
		String sql="";
		try {
			DB db=new DB();
 
			sql="insert into s_stu(s_stu_dabh,s_stu_xm,s_stu_sfz,s_stu_dhhm,s_stu_jtdz,s_stu_dasj,s_stu_dadz,s_stu_xl,s_stu_jl,s_stu_cf,s_stu_yx,s_stu_mz,s_stu_zy,s_stu_jy,s_stu_mm,s_stu_fq,s_stu_jq,s_stu_dj,s_stu_cl,s_stu_djb,s_stu_tjb,s_stu_cjb,s_stu_xwb,s_stu_rdb,s_stu_mzb,s_stu_mmb,s_stu_ffb,s_stu_ydb)";
			sql=sql+" values('"+s_stu_dabh+"','"+s_stu_xm+"','"+s_stu_sfz+"','"+s_stu_dhhm+"','"+s_stu_jtdz+"','"+s_stu_dasj+"','"+s_stu_dadz+"','"+s_stu_xl+"','"+s_stu_jl+"','"+s_stu_cf+"','"+s_stu_yx+"','"+s_stu_mz+"','"+s_stu_zy+"','"+s_stu_jy+"','"+s_stu_mm+"','"+s_stu_fq+"','"+s_stu_jq+"','"+s_stu_dj+"','"+s_stu_cl+"','"+s_stu_djb+"','"+s_stu_tjb+"','"+s_stu_cjb+"','"+s_stu_xwb+"','"+s_stu_rdb+"','"+s_stu_mzb+"','"+s_stu_mmb+"','"+s_stu_ffb+"','"+s_stu_ydb+"')";
			System.out.print(sql);
			System.out.print("dfsdf");
			db.executeUpdate(sql);
			db.close();
		}catch (Exception e) {
			System.err.println("增加学生信息错误，错误信息："+e.getMessage());
		}
	}
	
	
		
	public void update(String s_stu_dabh,String s_stu_xm,String s_stu_sfz,String s_stu_dhhm,String s_stu_jtdz,String s_stu_dasj,String s_stu_dadz,String s_stu_xl,String s_stu_jl,String s_stu_cf,String s_stu_yx,String s_stu_mz,String s_stu_zy,String s_stu_jy,String s_stu_fq,String s_stu_jq,String s_stu_dj,String s_stu_cl,String s_stu_djb,String s_stu_tjb,String s_stu_cjb,String s_stu_xwb,String s_stu_rdb,String s_stu_mzb,String s_stu_mmb,String s_stu_ffb,String s_stu_ydb)
		{
		DB db=new DB();
	 	try {
			String sql ="update s_stu set  s_stu_xm='"+s_stu_xm+"',s_stu_sfz='"+s_stu_sfz+"',s_stu_dhhm='"+s_stu_dhhm+"',s_stu_jtdz='"+s_stu_jtdz+"',s_stu_dasj='"+s_stu_dasj+"',s_stu_dadz='"+s_stu_dadz+"',s_stu_xl='"+s_stu_xl+"',s_stu_jl='"+s_stu_jl+"',s_stu_cf='"+s_stu_cf+"',s_stu_yx='"+s_stu_yx+"',s_stu_mz='"+s_stu_mz+"',s_stu_zy='"+s_stu_zy+"',s_stu_jy='"+s_stu_jy+"',s_stu_fq='"+s_stu_fq+"',s_stu_jq='"+s_stu_jq+"',s_stu_dj='"+s_stu_dj+"',s_stu_cl='"+s_stu_cl+"',s_stu_djb='"+s_stu_djb+"',s_stu_tjb='"+s_stu_tjb+"',s_stu_cjb='"+s_stu_cjb+"',s_stu_xwb='"+s_stu_xwb+"',s_stu_rdb='"+s_stu_rdb+"',s_stu_mzb='"+s_stu_mzb+"',s_stu_mmb='"+s_stu_mmb+"',s_stu_ffb='"+s_stu_ffb+"',s_stu_ydb='"+s_stu_ydb+"'  where s_stu_dabh = '"+s_stu_dabh+"'";			
		    System.out.print(sql);
			db.executeUpdate(sql);
			db.close();
	    	}catch (Exception e) {
			System.err.println("学生信息更新错误，错误信息："+e.getMessage());
		    }
	    }
	
 
		public void delete(String s_stu_bh){
		DB db=new DB();
		try {
			String sql="delete from s_stu where s_stu_dabh='"+s_stu_bh+"'";
			db.executeUpdate(sql);			
      	 
			db.close();
			     
		}catch (Exception e) {
			System.err.println("删除学生信息失败，错误信息："+e.getMessage());
		}
	}
	
	
	
	
	
	
    public ArrayList<stxx> getStxxall( ){
        ArrayList<stxx> al=new ArrayList<stxx>();
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_stu ";
			ResultSet rs=db.executeQuery(sql);
	 
			while(rs.next()){
			
		    	stxx st = new stxx();
				st.setS_stu_dabh(rs.getString("s_stu_dabh"));
				st.setS_stu_xm(rs.getString("s_stu_xm"));
				st.setS_stu_sfz(rs.getString("s_stu_sfz"));
				st.setS_stu_dhhm(rs.getString("s_stu_dhhm"));
				st.setS_stu_jtdz(rs.getString("s_stu_jtdz"));
				st.setS_stu_dasj(rs.getString("s_stu_dasj"));
				st.setS_stu_dadz(rs.getString("s_stu_dadz"));
				st.setS_stu_xl(rs.getString("s_stu_xl"));
				st.setS_stu_jl(rs.getString("s_stu_jl"));
				st.setS_stu_cf(rs.getString("s_stu_cf"));
				st.setS_stu_yx(rs.getString("s_stu_yx"));
				st.setS_stu_mz(rs.getString("s_stu_mz"));
				st.setS_stu_zy(rs.getString("s_stu_zy"));
				st.setS_stu_jy(rs.getString("s_stu_jy"));
		    	st.setS_stu_mm(rs.getString("s_stu_mm"));
		    	st.setS_stu_fq(rs.getString("s_stu_fq"));
		    	st.setS_stu_jq(rs.getString("s_stu_jq"));
		    	st.setS_stu_dj(rs.getString("s_stu_dj"));
		    	st.setS_stu_cl(rs.getString("s_stu_cl"));
		    	st.setS_stu_djb(rs.getString("s_stu_djb"));
		    	st.setS_stu_tjb(rs.getString("s_stu_tjb"));
		    	st.setS_stu_cjb(rs.getString("s_stu_cjb"));
		    	st.setS_stu_xwb(rs.getString("s_stu_xwb"));
		    	st.setS_stu_rdb(rs.getString("s_stu_rdb"));
		    	st.setS_stu_mzb(rs.getString("s_stu_mzb"));
		    	st.setS_stu_mmb(rs.getString("s_stu_mmb"));
		    	st.setS_stu_ffb(rs.getString("s_stu_ffb"));
		    	st.setS_stu_ydb(rs.getString("s_stu_ydb"));
		    	 
		    	
		    	
			 
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
	
		
	public  ArrayList<stxx>  getStxxbybh1(String s_stu_dabh){
		 ArrayList<stxx> al=new ArrayList<stxx>();
      
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_stu  where s_stu_dabh='"+s_stu_dabh+"'";
			ResultSet rs=db.executeQuery(sql);
	    	
			while(rs.next()){
				  stxx st = new stxx();
				st.setS_stu_dabh(rs.getString("s_stu_dabh"));
				st.setS_stu_xm(rs.getString("s_stu_xm"));
				st.setS_stu_sfz(rs.getString("s_stu_sfz"));
				st.setS_stu_dhhm(rs.getString("s_stu_dhhm"));
				st.setS_stu_jtdz(rs.getString("s_stu_jtdz"));
				st.setS_stu_dasj(rs.getString("s_stu_dasj"));
				st.setS_stu_dadz(rs.getString("s_stu_dadz"));
				st.setS_stu_xl(rs.getString("s_stu_xl"));
				st.setS_stu_jl(rs.getString("s_stu_jl"));
				st.setS_stu_cf(rs.getString("s_stu_cf"));
				st.setS_stu_yx(rs.getString("s_stu_yx"));
				st.setS_stu_mz(rs.getString("s_stu_mz"));
				st.setS_stu_zy(rs.getString("s_stu_zy"));
				st.setS_stu_jy(rs.getString("s_stu_jy"));
		    	st.setS_stu_mm(rs.getString("s_stu_mm"));
		    	st.setS_stu_fq(rs.getString("s_stu_fq"));
		    	st.setS_stu_jq(rs.getString("s_stu_jq"));
		    	st.setS_stu_dj(rs.getString("s_stu_dj"));
		    	st.setS_stu_cl(rs.getString("s_stu_cl"));
		    	st.setS_stu_djb(rs.getString("s_stu_djb"));
		    	st.setS_stu_tjb(rs.getString("s_stu_tjb"));
		    	st.setS_stu_cjb(rs.getString("s_stu_cjb"));
		    	st.setS_stu_xwb(rs.getString("s_stu_xwb"));
		    	st.setS_stu_rdb(rs.getString("s_stu_rdb"));
		    	st.setS_stu_mzb(rs.getString("s_stu_mzb"));
		    	st.setS_stu_mmb(rs.getString("s_stu_mmb"));
		    	st.setS_stu_ffb(rs.getString("s_stu_ffb"));
		    	st.setS_stu_ydb(rs.getString("s_stu_ydb"));
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
	
	

		
	public  stxx  getStxxbybh2(String s_stu_dabh){
        stxx st = new stxx();
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_stu  where s_stu_dabh='"+s_stu_dabh+"'";
			ResultSet rs=db.executeQuery(sql);
	    	
			if(rs.next()){
				st.setS_stu_dabh(rs.getString("s_stu_dabh"));
				st.setS_stu_xm(rs.getString("s_stu_xm"));
				st.setS_stu_sfz(rs.getString("s_stu_sfz"));
				st.setS_stu_dhhm(rs.getString("s_stu_dhhm"));
				st.setS_stu_jtdz(rs.getString("s_stu_jtdz"));
				st.setS_stu_dasj(rs.getString("s_stu_dasj"));
				st.setS_stu_dadz(rs.getString("s_stu_dadz"));
				st.setS_stu_xl(rs.getString("s_stu_xl"));
				st.setS_stu_jl(rs.getString("s_stu_jl"));
				st.setS_stu_cf(rs.getString("s_stu_cf"));
				st.setS_stu_yx(rs.getString("s_stu_yx"));
				st.setS_stu_mz(rs.getString("s_stu_mz"));
				st.setS_stu_zy(rs.getString("s_stu_zy"));
				st.setS_stu_jy(rs.getString("s_stu_jy"));
		    	st.setS_stu_mm(rs.getString("s_stu_mm"));
		    	st.setS_stu_fq(rs.getString("s_stu_fq"));
		    	st.setS_stu_jq(rs.getString("s_stu_jq"));
		    	st.setS_stu_dj(rs.getString("s_stu_dj"));
		    	st.setS_stu_cl(rs.getString("s_stu_cl"));
		    	st.setS_stu_djb(rs.getString("s_stu_djb"));
		    	st.setS_stu_tjb(rs.getString("s_stu_tjb"));
		    	st.setS_stu_cjb(rs.getString("s_stu_cjb"));
		    	st.setS_stu_xwb(rs.getString("s_stu_xwb"));
		    	st.setS_stu_rdb(rs.getString("s_stu_rdb"));
		    	st.setS_stu_mzb(rs.getString("s_stu_mzb"));
		    	st.setS_stu_mmb(rs.getString("s_stu_mmb"));
		    	st.setS_stu_ffb(rs.getString("s_stu_ffb"));
		    	st.setS_stu_ydb(rs.getString("s_stu_ydb"));
			
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
	
	
		public  ArrayList<stxx>  getStxxbybh3(String s_stu_dabh){
		 ArrayList<stxx> al=new ArrayList<stxx>();
      
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_stu  where s_stu_xm='"+s_stu_dabh+"'";
			ResultSet rs=db.executeQuery(sql);
	    	
			while(rs.next()){
				  stxx st = new stxx();
				st.setS_stu_dabh(rs.getString("s_stu_dabh"));
				st.setS_stu_xm(rs.getString("s_stu_xm"));
				st.setS_stu_sfz(rs.getString("s_stu_sfz"));
				st.setS_stu_dhhm(rs.getString("s_stu_dhhm"));
				st.setS_stu_jtdz(rs.getString("s_stu_jtdz"));
				st.setS_stu_dasj(rs.getString("s_stu_dasj"));
				st.setS_stu_dadz(rs.getString("s_stu_dadz"));
				st.setS_stu_xl(rs.getString("s_stu_xl"));
				st.setS_stu_jl(rs.getString("s_stu_jl"));
				st.setS_stu_cf(rs.getString("s_stu_cf"));
				st.setS_stu_yx(rs.getString("s_stu_yx"));
				st.setS_stu_mz(rs.getString("s_stu_mz"));
				st.setS_stu_zy(rs.getString("s_stu_zy"));
				st.setS_stu_jy(rs.getString("s_stu_jy"));
		    	st.setS_stu_mm(rs.getString("s_stu_mm"));
		    	st.setS_stu_fq(rs.getString("s_stu_fq"));
		    	st.setS_stu_jq(rs.getString("s_stu_jq"));
		    	st.setS_stu_dj(rs.getString("s_stu_dj"));
		    	st.setS_stu_cl(rs.getString("s_stu_cl"));
		    	st.setS_stu_djb(rs.getString("s_stu_djb"));
		    	st.setS_stu_tjb(rs.getString("s_stu_tjb"));
		    	st.setS_stu_cjb(rs.getString("s_stu_cjb"));
		    	st.setS_stu_xwb(rs.getString("s_stu_xwb"));
		    	st.setS_stu_rdb(rs.getString("s_stu_rdb"));
		    	st.setS_stu_mzb(rs.getString("s_stu_mzb"));
		    	st.setS_stu_mmb(rs.getString("s_stu_mmb"));
		    	st.setS_stu_ffb(rs.getString("s_stu_ffb"));
		    	st.setS_stu_ydb(rs.getString("s_stu_ydb"));
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
	
	
	
		public  ArrayList<stxx>  getStxxbybh4(String s_stu_dabh){
		 ArrayList<stxx> al=new ArrayList<stxx>();
      
		String sql="";
		try {
			DB db=new DB();
			sql="select * from s_stu  where s_stu_jy='"+s_stu_dabh+"'";
			ResultSet rs=db.executeQuery(sql);
	    	
			while(rs.next()){
				  stxx st = new stxx();
				st.setS_stu_dabh(rs.getString("s_stu_dabh"));
				st.setS_stu_xm(rs.getString("s_stu_xm"));
				st.setS_stu_sfz(rs.getString("s_stu_sfz"));
				st.setS_stu_dhhm(rs.getString("s_stu_dhhm"));
				st.setS_stu_jtdz(rs.getString("s_stu_jtdz"));
				st.setS_stu_dasj(rs.getString("s_stu_dasj"));
				st.setS_stu_dadz(rs.getString("s_stu_dadz"));
				st.setS_stu_xl(rs.getString("s_stu_xl"));
				st.setS_stu_jl(rs.getString("s_stu_jl"));
				st.setS_stu_cf(rs.getString("s_stu_cf"));
				st.setS_stu_yx(rs.getString("s_stu_yx"));
				st.setS_stu_mz(rs.getString("s_stu_mz"));
				st.setS_stu_zy(rs.getString("s_stu_zy"));
				st.setS_stu_jy(rs.getString("s_stu_jy"));
		    	st.setS_stu_mm(rs.getString("s_stu_mm"));
		    	st.setS_stu_fq(rs.getString("s_stu_fq"));
		    	st.setS_stu_jq(rs.getString("s_stu_jq"));
		    	st.setS_stu_dj(rs.getString("s_stu_dj"));
		    	st.setS_stu_cl(rs.getString("s_stu_cl"));
		    	st.setS_stu_djb(rs.getString("s_stu_djb"));
		    	st.setS_stu_tjb(rs.getString("s_stu_tjb"));
		    	st.setS_stu_cjb(rs.getString("s_stu_cjb"));
		    	st.setS_stu_xwb(rs.getString("s_stu_xwb"));
		    	st.setS_stu_rdb(rs.getString("s_stu_rdb"));
		    	st.setS_stu_mzb(rs.getString("s_stu_mzb"));
		    	st.setS_stu_mmb(rs.getString("s_stu_mmb"));
		    	st.setS_stu_ffb(rs.getString("s_stu_ffb"));
		    	st.setS_stu_ydb(rs.getString("s_stu_ydb"));
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
	
	 public int  getjyl1(String lx,String ls){
	   	int li_count1=0;
	   	try {
	   	 String sql1="";
		 DB db=new DB();
		 if("1".equals(lx))
		 {
		 	sql1 = "select count(*) from s_stu where s_stu_jy = '1' and s_stu_yx='"+ls+"'";
		 }
	  	 else if("2".equals(lx))
	  	 {
	  	 	sql1 = "select count(*) from s_stu where s_stu_jy = '1' and s_stu_zy='"+ls+"'";
	  	 }
	  	 else
	  	 {
	  	 sql1 = "select count(*) from s_stu where s_stu_jy = '1'";	
	  	 	
	  	 	}
	     ResultSet rs1=db.executeQuery(sql1);
		 if(rs1.next()){
				li_count1=rs1.getInt(1);
			}
			if(rs1!=null){
				rs1.close();
				rs1=null;
			}
			
			
			
			
			
		 db.close();
		 
		}catch (Exception e) {
			System.err.println("错误，错误信息："+e.getMessage());
		}
		return li_count1;
	}
	
	
		 public int  getjyl2(String lx,String ls){
	   	int li_count1=0;
	   	try {
		 DB db=new DB();
	  	 String sql1 = "";
	  	 if("1".equals(lx))
	  	 {
		 	sql1 = "select count(*) from s_stu where   s_stu_yx='"+ls+"'";
		 }
	  	 else if("2".equals(lx))
	  	 {
	  	 	sql1 = "select count(*) from s_stu where   s_stu_zy='"+ls+"'";
	  	 }
	  	 else
	  	 {
	  	 sql1 = "select count(*) from s_stu";	
	  	 	
	  	 	}
	  	 
	     ResultSet rs1=db.executeQuery(sql1);
		 if(rs1.next()){
				li_count1=rs1.getInt(1);
			}
			if(rs1!=null){
				rs1.close();
				rs1=null;
			}
			
			
			
			
			
		 db.close();
		 
		}catch (Exception e) {
			System.err.println("错误，错误信息："+e.getMessage());
		}
		return li_count1;
	}
	
	
}