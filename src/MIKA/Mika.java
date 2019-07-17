package MIKA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mika {
    
    /*
        GET CONNECTION
    */
    
    
  public static Connection getConnection() throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://restaurant.cnqcserbyunw.us-west-2.rds.amazonaws.com:3306/Mika";
    String username = "dbmaster";
    String password = "dbmaster";
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  /* 
        INSERT functions
  */
  public static int insertIntoReceipt(int ID, String dt, double price, int m, int bid) throws Exception
  {
    Connection conn = getConnection();
    PreparedStatement pstmt = null;
    
    String query = "Insert INTO Receipt VALUES("+ ID +"," + dt + "," + price + "," + m + "," + bid +")";
    pstmt = conn.prepareStatement(query);
    

    int status = pstmt.executeUpdate(query);
      pstmt.close();
      conn.close();
     return status; 
  }
  
  public static int insertIntoMenuItem(String in, double uPrice, String c) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      String query = "Insert INTO MenuItem(ItemName,UnitPrice,FoodType) "
              + "VALUES(" + in + "," + uPrice + "," + c +")";
      pstmt = conn.prepareStatement(query);
      
      int status = pstmt.executeUpdate(query);
      pstmt.close();
      conn.close();
      return status;
  }
  
 public static int insertIntoIngredients(String in, String u, double uP) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      String query = "Insert INTO Ingredients(Name,Unit,UnitPrice) "
              + "VALUES(" + in + "," + u + "," + uP +")";
      pstmt = conn.prepareStatement(query);
      
      int status = pstmt.executeUpdate(query);
      pstmt.close();
      conn.close();
      return status;
  }
  
    public static int getIngID(String name) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement ps = null;
      String query = "select * from Ingredients where Name like " + name;
      ps = conn.prepareStatement(query);
      ResultSet rs = ps.executeQuery(query);
      rs.next();
      int ingID = rs.getInt("IngredientID");
      ps.close();
      conn.close();
      return ingID;
  }
    
    public static String[] getMenuItemName() throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement ps = null;
      String query = "select * from MenuItem";
      ps = conn.prepareStatement(query);
      ResultSet rs = ps.executeQuery(query);
      
      String[] menuItems = new String[300];
      
      int i = 0;
      while (rs.next())
      {
          String n = rs.getString("Name");
          menuItems[i] = n;
          i++;
      }
      
      ps.close();
      conn.close();
      return menuItems;
  }
    public static int getDispID(String name) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement ps = null;
      String query = "select * from DisposableItems where Name like " + name;
      ps = conn.prepareStatement(query);
      ResultSet rs = ps.executeQuery(query);
      rs.next();
      int dispID = rs.getInt("DisposableItemID");
      ps.close();
      conn.close();
      return dispID;
  }
    
   public static void insertIntoShipment(int id, String d, int ing, int disp, double q) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      String query = null;
      if(ing != 0)
      {
          query = "select * from Ingredients where IngredientID =" + ing;
      }
      else
      {
          query = "select * from DisposableItems where DisposableItemID =" + disp;
      }
      pstmt = conn.prepareStatement(query);
      ResultSet rs = pstmt.executeQuery(query);
      rs.next();
      int branchID = 1;
      double totalp = q * rs.getDouble("UnitPrice");
      if(ing != 0)
      {
      query = "Insert INTO Shipment VALUES ("
              +id + "," + d + "," + ing +",NULL," + q + "," + totalp + "," + branchID + ")";
      }
      else
      {
                query = "Insert INTO Shipment VALUES ("
              +id + "," + d + ",NULL," + disp + "," + q + "," + totalp + "," +branchID+")";
      }
      pstmt = conn.prepareStatement(query);
      
      pstmt.executeUpdate(query);
      pstmt.close();
      conn.close();
  }

  public static void insertIntoEmployee(int id, String fn, String ln, String p) throws Exception
  {
    Connection conn = getConnection();
    PreparedStatement pstmt = null;
    
    String query = "Insert INTO Employee VALUES("+ id +"," + fn + "," + ln + "," + p + ")";
    pstmt = conn.prepareStatement(query);
    pstmt.executeUpdate(query);
    pstmt.close();
    conn.close();
  }
  
  public static Boolean validateEmployee(int id) throws Exception
  {
    Connection conn = getConnection();
    PreparedStatement pstmt = null;
    
    String query = "select * from Employee where EmployeeID = " + id;
    pstmt = conn.prepareStatement(query);
    ResultSet rs = pstmt.executeQuery(query);
    if(rs.next())
    {
        pstmt.close();
        conn.close();
        return true;
    }
    else
    {
        pstmt.close();
        conn.close();
        return false;
    }
  }
  
 public static Boolean validateMenuID(int id) throws Exception
  {
    Connection conn = getConnection();
    PreparedStatement pstmt = null;
    
    String query = "select * from Employee where EmployeeID = " + id;
    pstmt = conn.prepareStatement(query);
    ResultSet rs = pstmt.executeQuery(query);
    if(rs.next())
    {
        pstmt.close();
        conn.close();
        return true;
    }
    else
    {
        pstmt.close();
        conn.close();
        return false;
    }
  }
  
  public static void insertIntoEmployeeShift(int id, int sid, String d, int bid, int p) throws Exception
  {
    Connection conn = getConnection();
    PreparedStatement pstmt = null;
    
    String query = "Insert INTO EmployeeShift(workDate, ShiftID, EmployeeID, BranchID, PositionID) "
            + "VALUES("+ d +"," + sid + "," + id + "," + bid + "," + p + ")";
    pstmt = conn.prepareStatement(query);
    pstmt.executeUpdate(query);
    pstmt.close();
    conn.close();
  }
  
  /*
        UPDATE functions
  */
  
  public static int updateIntoMenuItem(int menuID, double menuPrice, String itemName, String category) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      String query = "Update MenuItem SET MenuID=" + menuID + ", UnitPrice =" + menuPrice +
              ", ItemName =" + itemName + ", FoodType=" + category + " where menuID=" + menuID;
      pstmt = conn.prepareStatement(query);
      int status = pstmt.executeUpdate(query);
      pstmt.close();
      conn.close();
      return status;
  }
  
  public static int updateIntoMenuItemWithoutName(int menuID, double menuPrice, String category) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      String query = "Update MenuItem SET MenuID=" + menuID + ", UnitPrice =" + menuPrice +
              ", FoodType=" + category + " where menuID=" + menuID;
      pstmt = conn.prepareStatement(query);
      int status = pstmt.executeUpdate(query);
      pstmt.close();
      conn.close();
      return status;
  }
  
  public static int updateIntoShifts(int shiftID, String startTime, String endTime, double totalHours) throws Exception
  {
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      String query = "Update Shifts SET ShiftID=" + shiftID + ", StartTime =" + startTime +
              ", EndTime =" + endTime + ", TotalHours=" + totalHours + " where ShiftID=" + shiftID;
      pstmt = conn.prepareStatement(query);
      int status = pstmt.executeUpdate(query);
      pstmt.close();
      conn.close();
      return status;
  }
  
  public static int updateIntoDisposableItem(int disposableItemID, String itemName, double dispPrice, String unit) throws Exception {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        String query = "Update DisposableItems SET DisposableItemID=" + disposableItemID + ", Name =" + itemName + 
                ", UnitPrice =" + dispPrice
                + ", Unit=" + unit + 
                " where DisposableItemID=" + disposableItemID;
        pstmt = conn.prepareStatement(query);
        int status = pstmt.executeUpdate(query);
        pstmt.close();
        conn.close();
        return status;
    }

    public static int updateIntoIngredients(int ingredientsID, String name, double unitPrice, String unit) throws Exception {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        String query = "Update Ingredients SET IngredientID=" + ingredientsID + ", Name =" + name
                + ", UnitPrice =" + unitPrice + ", Unit=" + unit + " where IngredientID=" + ingredientsID;
        pstmt = conn.prepareStatement(query);
        int status = pstmt.executeUpdate(query);
        pstmt.close();
        conn.close();
        return status;

    }
    
     public static int updateIntoEmployee(int employeeID, String firstName, String lastName, String phone) throws Exception {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        String query = "Update Employee SET EmployeeID=" + employeeID + ", FirstName =" + firstName
                + ", LastName =" + lastName + ", Phone=" + phone + " where employeeID=" + employeeID;
        pstmt = conn.prepareStatement(query);
        int status = pstmt.executeUpdate(query);
        pstmt.close();
        conn.close();
        return status;

    }
public static void main(String[] args) throws Exception 
  {
    new Locator().setVisible(true);
      //insertIntoReceipt(100099, "'2010-10-11 01:01:01'", 21.11, 0, 1);
  }
}