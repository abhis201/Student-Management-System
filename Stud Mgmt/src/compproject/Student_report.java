/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Student_report.java
 *
 * Created on Oct 19, 2014, 12:23:21 PM
 */

package compproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



/**
 *
 * @author Mukesh
 */
public class Student_report extends javax.swing.JFrame {

    /** Creates new form Student_report */
    public Student_report() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cls = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        hostel = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        house = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        year_join = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        age = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1103, 586));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24));
        jLabel1.setText("School Reports");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Classwise Report");

        cls.setBackground(new java.awt.Color(51, 0, 51));
        cls.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14));
        cls.setForeground(new java.awt.Color(255, 255, 255));
        cls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Section", "No. Students", "Class Teacher"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cls.setGridColor(new java.awt.Color(255, 102, 0));
        cls.setRowHeight(25);
        cls.setSelectionBackground(new java.awt.Color(0, 102, 255));
        cls.setSelectionForeground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(cls);

        hostel.setBackground(new java.awt.Color(0, 51, 153));
        hostel.setFont(new java.awt.Font("Kartika", 1, 14));
        hostel.setForeground(new java.awt.Color(204, 255, 255));
        hostel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hostel", "Floor", "No. Students", "RHM 1", "RHM 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hostel.setGridColor(new java.awt.Color(255, 255, 255));
        hostel.setRowHeight(25);
        jScrollPane3.setViewportView(hostel);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Hostel Wise");

        house.setBackground(new java.awt.Color(0, 0, 0));
        house.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18));
        house.setForeground(new java.awt.Color(255, 204, 0));
        house.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House", "No. of Students"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        house.setRowHeight(25);
        house.setSelectionForeground(new java.awt.Color(0, 153, 0));
        jScrollPane2.setViewportView(house);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("House Wise");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Year of Joining (only hostellers)");

        year_join.setBackground(new java.awt.Color(255, 51, 0));
        year_join.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        year_join.setForeground(new java.awt.Color(255, 255, 204));
        year_join.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "No. of Students"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        year_join.setGridColor(new java.awt.Color(204, 51, 0));
        year_join.setRowHeight(25);
        jScrollPane4.setViewportView(year_join);

        age.setBackground(new java.awt.Color(143, 255, 0));
        age.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18));
        age.setForeground(new java.awt.Color(0, 51, 0));
        age.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Age", "No. of Students"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        age.setGridColor(new java.awt.Color(0, 102, 204));
        age.setRowHeight(20);
        age.setSelectionBackground(new java.awt.Color(255, 102, 0));
        age.setSelectionForeground(new java.awt.Color(255, 254, 254));
        jScrollPane5.setViewportView(age);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Age wise");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/turtle book.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(370, 370, 370))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(549, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(76, 76, 76)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(485, 485, 485)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(729, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, 0, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                        .addGap(157, 157, 157))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel model1=(DefaultTableModel) cls.getModel();
        DefaultTableModel model2=(DefaultTableModel) hostel.getModel();
        DefaultTableModel model3=(DefaultTableModel) house.getModel();
        DefaultTableModel model4=(DefaultTableModel) year_join.getModel();
        DefaultTableModel model5=(DefaultTableModel) age.getModel();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/skool","root","mysqlip");
            Statement stmt=(Statement)con.createStatement();

            String sql1="Select sm.class,sm.section,count(*),(select name from teachers where code like classes.cls_tchr) cls_tch from student_master sm natural join classes group by class,section;";
            ResultSet rs1=stmt.executeQuery(sql1);

            while(rs1.next()){
                String cl=rs1.getString("Class");
                String sec=rs1.getString("Section");
                String no=rs1.getString("count(*)");
                String cls_tchr=rs1.getString("cls_tch");

                model1.addRow(new Object[] {cl,sec,no,cls_tchr});
            }

            String sql2="Select hostel,floor,count(*),(select name from teachers where code like RHM1) R1,(Select name from teachers where code like RHM2) R2 from student_master sm natural join hostels  group by hostel,floor order by hostel,floor;";
            ResultSet rs2=stmt.executeQuery(sql2);
            while(rs2.next()){
                String h=rs2.getString("hostel");
                String fl=rs2.getString("floor");
                String nos=rs2.getString("count(*)");
                String rhm1=rs2.getString("R1");
                String rhm2=rs2.getString("R2");

                model2.addRow(new Object[] {h,fl,nos,rhm1,rhm2});
            }

            String sql3="Select house,count(*) from student_master group by house;";
            ResultSet rs3=stmt.executeQuery(sql3);
            while(rs3.next()){
                String hou=rs3.getString("house");
                String coun=rs3.getString("count(*)");

                model3.addRow(new Object[] {hou,coun});
            }

            String sql4="select substr(admnNo,1,1) year,count(*) from student_master where length(AdmnNo)=4 group by substr(admnNo,1,1);";
            ResultSet rs4=stmt.executeQuery(sql4);
            
            while(rs4.next()){
                String year1="200"+rs4.getString("year");
                String count1=rs4.getString("count(*)");

                model4.addRow(new Object[] {year1,count1});
            }

            String sql5="select substr(admnNo,1,2) year,count(*) from student_master where length(AdmnNo)=5 group by substr(admnNo,1,2);";
            ResultSet rs5=stmt.executeQuery(sql5);
            while(rs5.next()){
                String year2="20"+rs5.getString("year");
                String count2=rs5.getString("count(*)");

                 model4.addRow(new Object[] {year2,count2});
            }

            String sql6="select ifnull(DATE_FORMAT(FROM_DAYS(TO_DAYS(NOW())-TO_DAYS(dob-interval 1 day)), '%Y')+0,'N/A') as age,count(*) from student_master group by age order by age;";
            ResultSet rs6=stmt.executeQuery(sql6);
            while(rs6.next()){
                String ag=rs6.getString("age");
                String coun_stu=rs6.getString("count(*)");

                model5.addRow(new Object[] {ag,coun_stu});
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
        }
             TableColumnModel tcm1 = cls.getColumnModel();
             tcm1.getColumn(0).setMaxWidth(70);
             tcm1.getColumn(0).setMinWidth(70);
             tcm1.getColumn(1).setMaxWidth(70);
             tcm1.getColumn(1).setMinWidth(70);
             tcm1.getColumn(2).setMaxWidth(90);
             tcm1.getColumn(2).setMinWidth(90);

             TableColumnModel tcm2 = hostel.getColumnModel();
             tcm2.getColumn(0).setMinWidth(90);
             tcm2.getColumn(0).setMaxWidth(90);
             tcm2.getColumn(1).setMinWidth(40);
             tcm2.getColumn(1).setMaxWidth(40);
             tcm2.getColumn(2).setMinWidth(100);
             tcm2.getColumn(2).setMaxWidth(100);
             tcm2.getColumn(3).setMinWidth(175);
             tcm2.getColumn(3).setMaxWidth(175);
             tcm2.getColumn(4).setMinWidth(175);
             tcm2.getColumn(4).setMaxWidth(175);

             TableColumnModel tcm3 = house.getColumnModel();
             tcm3.getColumn(0).setMinWidth(100);
             tcm3.getColumn(0).setMaxWidth(100);
             tcm3.getColumn(1).setMinWidth(125);
             tcm3.getColumn(1).setMaxWidth(125);

             TableColumnModel tcm4 = year_join.getColumnModel();
             tcm4.getColumn(0).setMinWidth(80);
             tcm4.getColumn(0).setMaxWidth(80);
             tcm4.getColumn(1).setMinWidth(116);
             tcm4.getColumn(1).setMaxWidth(116);

             TableColumnModel tcm5 = age.getColumnModel();
             tcm5.getColumn(0).setMinWidth(83);
             tcm5.getColumn(0).setMaxWidth(83);
             tcm5.getColumn(1).setMinWidth(126);
             tcm5.getColumn(1).setMaxWidth(126);

             DefaultTableCellRenderer centreRenderer = new DefaultTableCellRenderer();
             centreRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
             cls.getColumn("Class").setCellRenderer( centreRenderer );
             cls.getColumn("Section").setCellRenderer( centreRenderer );
             cls.getColumn("No. Students").setCellRenderer( centreRenderer );
             cls.getColumn("Class Teacher").setCellRenderer( centreRenderer );

             hostel.getColumn("Hostel").setCellRenderer( centreRenderer );
             hostel.getColumn("Floor").setCellRenderer( centreRenderer );
             hostel.getColumn("No. Students").setCellRenderer( centreRenderer );
             hostel.getColumn("RHM 1").setCellRenderer( centreRenderer );
             hostel.getColumn("RHM 2").setCellRenderer( centreRenderer );

             house.getColumn("House").setCellRenderer( centreRenderer );
             house.getColumn("No. of Students").setCellRenderer( centreRenderer );
             
             year_join.getColumn("Year").setCellRenderer( centreRenderer );
             year_join.getColumn("No. of Students").setCellRenderer( centreRenderer );

             age.getColumn("Age").setCellRenderer( centreRenderer );
             age.getColumn("No. of Students").setCellRenderer( centreRenderer );
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable age;
    private javax.swing.JTable cls;
    private javax.swing.JTable hostel;
    private javax.swing.JTable house;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable year_join;
    // End of variables declaration//GEN-END:variables

}
