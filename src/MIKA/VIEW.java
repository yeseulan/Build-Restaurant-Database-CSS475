/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIKA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalyanid
 */
public class VIEW extends javax.swing.JFrame {

    public static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://restaurant.cnqcserbyunw.us-west-2.rds.amazonaws.com:3306/Mika";
        String username = "dbmaster";
        String password = "dbmaster";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
    
    /*                                                      */
    
    
    
    /*                      ORDERS                          */
    
    public static String[] getReceiptID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Receipt";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("ReceiptID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }    

    public static String[] getReceiptDateTime(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Receipt";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("DateTime");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }   

    public static String[] getReceiptBranchID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Receipt";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("BranchID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }   

    public static String[] getReceiptMobileOrder(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Receipt";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("isMobile");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }       
    
    /*                      INGREDIENTS                       */
    
    public static String[] getIngredientsID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Ingredients";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("IngredientID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }

    public static String[] getIngredientsName(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Ingredients";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Name");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    public static String[] getIngredientsUnitPrice(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Ingredients";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("UnitPrice");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    public static String[] getIngredientsUnit(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Ingredients";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Unit");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    
    
    
    
    /*                      DISPOSABLE ITEMS                       */

    public static String[] getDisposableItemsID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM DisposableItems";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("DisposableItemID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    public static String[] getDisposableItemsName(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM DisposableItems";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Name");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    public static String[] getDisposableItemsUnitPrice(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM DisposableItems";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("UnitPrice");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    public static String[] getDisposableItemsUnit(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM DisposableItems";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Unit");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    
    
    
    /*                      MENU ITEM                       */
    
    public static String[] getMenusID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM MenuItem";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("MenuID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    
        public static String[] getMenusName(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM MenuItem";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("ItemName");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }

    public static String[] getMenusUnitPrice(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM MenuItem";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("UnitPrice");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }    
    public static String[] getMenusFoodType(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM MenuItem";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("FoodType");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }

    /*                          EMPLOYEE                    */
    
    public static String[] getEmployeesFirstName(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Employee";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("FirstName");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }

public static String[] getEmployeesLastName(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Employee";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("LastName");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }
    public static String[] getEmployeesID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Employee";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("EmployeeID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();

        return restos;
    }

    public static String[] getEmployeesPhone(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Employee";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Phone");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }

    /*                          SHIPMENT                    */
    public static String[] getShipmentID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Shipment";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("ShipmentID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
  public static String[] getShipmentDate(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Shipment";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("DeliveryDate");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
    
    public static String[] getShipmentQuantity(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Shipment";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Quantity");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
  
    
      public static String[] getShipmentIngredientID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Shipment";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("IngredientID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
    
              
        public static String[] getShipmentDisposableID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Shipment";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("DisposableItemID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
          public static String[] getShipmentBranchID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Shipment";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("BranchID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
      
         /*                          RESTAURANT BRANCH                    */
            
    public static String[] getRestaurantBranchID(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM RestaurantBranch";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("BranchID");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
    public static String[] getRestaurantStreet(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Address";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Street");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
    
        public static String[] getRestaurantCity(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Address";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("City");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
               
          public static String[] getRestaurantState(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Address";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("State");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
 
          public static String[] getRestaurantZip(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM Address";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Zip");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
                   public static String[] getRestaurantPhone(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM RestaurantBranch";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("Phone");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
public static String[] getRestaurantPeakTime(Connection c) throws Exception {
        PreparedStatement pstmt = null;

        String query = "SELECT * FROM RestaurantBranch";
        pstmt = c.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery(query);

        String[] restos = new String[100];
        int counter = 0;
        while (rs.next()) {
            String id = rs.getString("PeakTimes");
            restos[counter] = id;
            counter++;
        }
        pstmt.close();
        return restos;
    }
    /**
     * Creates new form VIEW
     */
    DefaultTableModel employeeModel,

    /**
     * Creates new form Database
     */

    /**
     * Creates new form VIEW
     */
    menuModel, 

    /**
     * Creates new form Database
     */

    /**
     * Creates new form VIEW
     */
    ingredientsModel, 

    /**
     * Creates new form Database
     */

    /**
     * Creates new form VIEW
     */
    disposableItemsModel,

    /**
     * Creates new form Database
     */

    /**
     * Creates new form VIEW
     */
    ordersModel, 

    /**
     * Creates new form Database
     */

    /**
     * Creates new form VIEW
     */
    shipmentModel, 

    /**
     * Creates new form Database
     */

    /**
     * Creates new form VIEW
     */
    receiptModel, 

    /**
     * Creates new form Database
     */

    /**
     * Creates new form VIEW
     */
    restaurantBranchModel;

    public VIEW() {
        initComponents();
        employeeModel = (DefaultTableModel) employeeTable.getModel();
        menuModel = (DefaultTableModel) menuTable.getModel();
        ingredientsModel = (DefaultTableModel) ingTable.getModel();
        disposableItemsModel = (DefaultTableModel) dispItemsTable.getModel();
        ordersModel = (DefaultTableModel) ordersTable.getModel();
        shipmentModel = (DefaultTableModel) ShipmentTable.getModel();
        restaurantBranchModel = (DefaultTableModel) restaurantBranchTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Orders = new javax.swing.JPanel();
        Overview = new javax.swing.JPanel();
        viewMenu = new javax.swing.JButton();
        viewEmployees = new javax.swing.JButton();
        viewIng = new javax.swing.JButton();
        viewDispItems = new javax.swing.JButton();
        viewOrders = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        dispItemsTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        allMenu = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        allIngredients = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        allOrders = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        allEmployees = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        allDisposableItems = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        ShipmentTable = new javax.swing.JTable();
        viewShipment = new javax.swing.JButton();
        allShipment = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        restaurantBranchTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        allRestaurantBranch = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIEW");

        jLabel5.setText("MIKA");

        jLabel1.setText("Entrees");

        jLabel2.setText("Appetizers");

        jLabel3.setText("Desserts");

        jLabel4.setText("Beverages");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(1073, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(415, 415, 415)))
                .addGap(56, 56, 56))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 585, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(127, 127, 127))
        );

        jTabbedPane1.addTab("Insert", Menu);

        javax.swing.GroupLayout OrdersLayout = new javax.swing.GroupLayout(Orders);
        Orders.setLayout(OrdersLayout);
        OrdersLayout.setHorizontalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        OrdersLayout.setVerticalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Update", Orders);

        Overview.setBackground(new java.awt.Color(204, 204, 204));

        viewMenu.setText("Menu");
        viewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMenuActionPerformed(evt);
            }
        });

        viewEmployees.setText("Employees");
        viewEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeesActionPerformed(evt);
            }
        });

        viewIng.setText("Ingredients");
        viewIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIngActionPerformed(evt);
            }
        });

        viewDispItems.setText("Disposable Items");
        viewDispItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDispItemsActionPerformed(evt);
            }
        });

        viewOrders.setText("Orders");
        viewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Phone"
            }
        ));
        jScrollPane6.setViewportView(employeeTable);

        menuTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu ID", "Name", "Unit Price", "Food Type"
            }
        ));
        jScrollPane2.setViewportView(menuTable);

        ingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingredient ID", "Name", "Unit Price", "Unit"
            }
        ));
        jScrollPane3.setViewportView(ingTable);

        dispItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Name", "Unit Price", "Unit"
            }
        ));
        jScrollPane4.setViewportView(dispItemsTable);

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RecieptID", "Date/Time", "BranchID", "Mobile Order?"
            }
        ));
        jScrollPane5.setViewportView(ordersTable);

        allMenu.setText("All");
        allMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMenuActionPerformed(evt);
            }
        });

        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        allIngredients.setText("All");
        allIngredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allIngredientsActionPerformed(evt);
            }
        });

        jRadioButton4.setText("jRadioButton4");

        allOrders.setText("All");
        allOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allOrdersActionPerformed(evt);
            }
        });

        jRadioButton6.setText("jRadioButton6");

        allEmployees.setText("All");
        allEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allEmployeesActionPerformed(evt);
            }
        });

        jRadioButton8.setText("jRadioButton8");

        allDisposableItems.setText("All");
        allDisposableItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDisposableItemsActionPerformed(evt);
            }
        });

        jRadioButton10.setText("jRadioButton10");

        ShipmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ShipmentID", "DeliverdyDate", "Quantity", "IngredientID", "DisposableItemID", "BranchID"
            }
        ));
        jScrollPane7.setViewportView(ShipmentTable);

        viewShipment.setText("Shipment");
        viewShipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewShipmentActionPerformed(evt);
            }
        });

        allShipment.setText("All");
        allShipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allShipmentActionPerformed(evt);
            }
        });

        jRadioButton3.setText("jRadioButton3");

        restaurantBranchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BranchID", "Street", "City", "State", "Zip", "Phone", "PeakTime"
            }
        ));
        jScrollPane9.setViewportView(restaurantBranchTable);

        jLabel7.setText("RestaurantBranch");

        allRestaurantBranch.setText("All");
        allRestaurantBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRestaurantBranchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OverviewLayout = new javax.swing.GroupLayout(Overview);
        Overview.setLayout(OverviewLayout);
        OverviewLayout.setHorizontalGroup(
            OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OverviewLayout.createSequentialGroup()
                                .addComponent(viewMenu)
                                .addGap(36, 36, 36)
                                .addComponent(allMenu)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addGroup(OverviewLayout.createSequentialGroup()
                                .addComponent(viewIng)
                                .addGap(18, 18, 18)
                                .addComponent(allIngredients)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4))
                            .addGroup(OverviewLayout.createSequentialGroup()
                                .addComponent(viewOrders)
                                .addGap(18, 18, 18)
                                .addComponent(allOrders)
                                .addGap(37, 37, 37)
                                .addComponent(jRadioButton6))
                            .addGroup(OverviewLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(allRestaurantBranch)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(337, 337, 337)
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addComponent(viewShipment)
                        .addGap(29, 29, 29)
                        .addComponent(allShipment)
                        .addGap(39, 39, 39)
                        .addComponent(jRadioButton3))
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addComponent(viewEmployees)
                        .addGap(18, 18, 18)
                        .addComponent(allEmployees)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton8))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addComponent(viewDispItems)
                        .addGap(18, 18, 18)
                        .addComponent(allDisposableItems)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton10))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(338, 338, 338))
        );
        OverviewLayout.setVerticalGroup(
            OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverviewLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewEmployees)
                    .addComponent(viewMenu)
                    .addComponent(allMenu)
                    .addComponent(jRadioButton2)
                    .addComponent(allEmployees)
                    .addComponent(jRadioButton8))
                .addGap(18, 18, 18)
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewIng)
                            .addComponent(allIngredients)
                            .addComponent(jRadioButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewOrders)
                            .addComponent(allOrders)
                            .addComponent(jRadioButton6)))
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewDispItems)
                            .addComponent(allDisposableItems)
                            .addComponent(jRadioButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(allRestaurantBranch))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))
                    .addGroup(OverviewLayout.createSequentialGroup()
                        .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OverviewLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(allShipment)
                                    .addComponent(jRadioButton3))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OverviewLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewShipment)
                                .addGap(27, 27, 27)))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("View", Overview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeesActionPerformed
       
    }//GEN-LAST:event_viewEmployeesActionPerformed

    private void viewIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIngActionPerformed
        // TODO add your handling code here:
                       
    }//GEN-LAST:event_viewIngActionPerformed

    private void viewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersActionPerformed
        // TODO add your handling code here:
            

    }//GEN-LAST:event_viewOrdersActionPerformed

    private void viewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewMenuActionPerformed

    private void viewDispItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDispItemsActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
                
    }//GEN-LAST:event_viewDispItemsActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void allOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allOrdersActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String[] receiptIDArr = getReceiptID(conn);
            String[] dateTimeArr = getReceiptDateTime(conn);
            String[] branchIDArr = getReceiptBranchID(conn);
            String[] boolArr = getReceiptMobileOrder(conn);

            for (int i = 0; i < receiptIDArr.length; i++) {
                if (receiptIDArr[i] != null) {
                    ordersModel.addRow(new Object[]{receiptIDArr[i], dateTimeArr[i], branchIDArr[i], boolArr[i]});
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allOrdersActionPerformed

    private void viewShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewShipmentActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
          
      
      
    }//GEN-LAST:event_viewShipmentActionPerformed

    private void allMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMenuActionPerformed
        // TODO add your handling code here:
        
        Connection conn = null;
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String[] unitPriceArr = getMenusUnitPrice(conn);
            String[] foodTypeArr = getMenusFoodType(conn);
            String[] nameArr = getMenusName(conn);
            String[] idArr = getMenusID(conn);

            for (int i = 0; i < idArr.length; i++) {
                if (idArr[i] != null) {
                    menuModel.addRow(new Object[]{idArr[i], nameArr[i], unitPriceArr[i], foodTypeArr[i]});
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_allMenuActionPerformed

    private void allIngredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allIngredientsActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String[] idArr = getIngredientsID(conn);
            String[] nameArr = getIngredientsName(conn);
            String[] unitPriceArr = getIngredientsUnitPrice(conn);
            String[] unitArr = getIngredientsUnit(conn);

            for (int i = 0; i < idArr.length; i++) {
                if (idArr[i] != null) {
                    ingredientsModel.addRow(new Object[]{idArr[i], nameArr[i], unitPriceArr[i], unitArr[i]});
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allIngredientsActionPerformed

    private void allEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allEmployeesActionPerformed
        // TODO add your handling code here:
         Connection conn = null;
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String[] phoneArr = getEmployeesPhone(conn);
            String[] firstNameArr = getEmployeesFirstName(conn);
            String[] lastNameArr = getEmployeesLastName(conn);
            String[] idArr = getEmployeesID(conn);

            for (int i = 0; i < idArr.length; i++) {
                if (idArr[i] != null) {
                    //model.insertRow(employeeModel.getRowCount(), new Object[]{idArr[i],firstNameArr[i],lastNameArr[i],phoneArr[i]});
                    employeeModel.addRow(new Object[]{idArr[i], firstNameArr[i], lastNameArr[i], phoneArr[i]});
                    idArr[i] = null;
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allEmployeesActionPerformed

    private void allDisposableItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDisposableItemsActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String[] idArr = getDisposableItemsID(conn);
            String[] nameArr = getDisposableItemsName(conn);
            String[] unitPriceArr = getDisposableItemsUnitPrice(conn);
            String[] unitArr = getDisposableItemsUnit(conn);

            for (int i = 0; i < idArr.length; i++) {
                if (idArr[i] != null) {
                    disposableItemsModel.addRow(new Object[]{idArr[i], nameArr[i], unitPriceArr[i], unitArr[i]});
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allDisposableItemsActionPerformed

    private void allShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allShipmentActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String[] idArr = getShipmentID(conn);
            String[] dateArr = getShipmentDate(conn);
            String[] quanArr = getShipmentQuantity(conn);
            String[] ingArr = getShipmentIngredientID(conn);
            String[] disArr = getShipmentDisposableID(conn);
            String[] braArr = getShipmentBranchID(conn);
    
        
                      
            for (int i = 0; i < idArr.length; i++) {
                if (idArr[i] != null) {
                    shipmentModel.addRow(new Object[]{idArr[i], dateArr[i], quanArr[i], ingArr[i], disArr[i], braArr[i]});
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allShipmentActionPerformed

    private void allRestaurantBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRestaurantBranchActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String[] idArr = getRestaurantBranchID(conn);
            String[] locArr = getRestaurantStreet(conn);
            String[] cityArr = getRestaurantCity(conn);
            String[] stateArr = getRestaurantState(conn);
            String[] zipArr = getRestaurantZip(conn);
            String[] phoneArr = getRestaurantPhone(conn);
            String[] timeArr = getRestaurantPeakTime(conn);
                
            for (int i = 0; i < idArr.length; i++) {
                if (idArr[i] != null) {
                    restaurantBranchModel.addRow(new Object[]{idArr[i], locArr[i], cityArr[i], 
                        stateArr[i],zipArr[i],phoneArr[i],timeArr[i]});
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_allRestaurantBranchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VIEW().setVisible(true);
                    Connection conn = null;
                    try {
                        conn = getConnection();
                    } catch (Exception ex) {
                        Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VIEW.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Orders;
    private javax.swing.JPanel Overview;
    private javax.swing.JTable ShipmentTable;
    private javax.swing.JRadioButton allDisposableItems;
    private javax.swing.JRadioButton allEmployees;
    private javax.swing.JRadioButton allIngredients;
    private javax.swing.JRadioButton allMenu;
    private javax.swing.JRadioButton allOrders;
    private javax.swing.JRadioButton allRestaurantBranch;
    private javax.swing.JRadioButton allShipment;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable dispItemsTable;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTable ingTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable menuTable;
    private javax.swing.JTable ordersTable;
    private javax.swing.JTable restaurantBranchTable;
    private javax.swing.JButton viewDispItems;
    private javax.swing.JButton viewEmployees;
    private javax.swing.JButton viewIng;
    private javax.swing.JButton viewMenu;
    private javax.swing.JButton viewOrders;
    private javax.swing.JButton viewShipment;
    // End of variables declaration//GEN-END:variables
}
