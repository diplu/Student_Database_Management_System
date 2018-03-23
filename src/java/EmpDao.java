import java.util.*;  
import java.sql.*;  
  
public class EmpDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("oracle.jdbc.OracleDriver");  
            con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-UJOF98J:1521:orcl","scott","vishal");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Emp e){  
        int status=0;  
        try(Connection con = EmpDao.getConnection()) {  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user2(id,name,stream,mno,email,address) values (?,?,?,?,?,?)");
            
            ps.setString(2,e.getName());  
            ps.setString(3,e.getStream());  
            ps.setString(4,e.getMno());  
            ps.setString(5,e.getEmail());
            ps.setString(6,e.getAddress());
            ps.setInt(1, e.getId());  
            status=ps.executeUpdate();  
           con.close();   
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Emp e){  
        int status=0;  
        try(Connection con = EmpDao.getConnection()) {  
            PreparedStatement ps=con.prepareStatement("update user2 set name=?,stream=?,mno=?,email=?,address=? where id=?");  
           ps.setInt(6, e.getId());
            ps.setString(1,e.getName());  
            ps.setString(2,e.getStream());  
            ps.setString(3,e.getMno());  
            ps.setString(4,e.getEmail());
            ps.setString(5,e.getAddress());
              
              
            status=ps.executeUpdate();  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try(Connection con = EmpDao.getConnection()) {  
            PreparedStatement ps=con.prepareStatement("delete from user2 where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              con.close();
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Emp getEmployeeById(int id){  
        Emp e=new Emp();  
          
        try(Connection con = EmpDao.getConnection()) {  
            PreparedStatement ps=con.prepareStatement("select * from user2 where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setStream(rs.getString(3));  
                e.setMno(rs.getString(4));
                e.setEmail(rs.getString(5));
                e.setAddress(rs.getString(6));  
            }  
            con.close();
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<>();  
          
        try(Connection con = EmpDao.getConnection()) {  
            PreparedStatement ps=con.prepareStatement("select * from user2");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
               e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setStream(rs.getString(3));  
                e.setMno(rs.getString(4));
                e.setEmail(rs.getString(5));
                e.setAddress(rs.getString(6));
                list.add(e);
            }  
            con.close();
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  

    
}  