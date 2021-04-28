/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTEND;

import BACKEND.clsReservacion;
import DATA.clsConexion;
import DATA.clsQuerys;
import javax.swing.JOptionPane;

/**
 *
 * @author geovanni
 */
public class frmReserva extends javax.swing.JFrame {
    private clsConexion Con = new clsConexion();
    private clsQuerys q = new clsQuerys();
    private clsReservacion r = new clsReservacion();
    /**
     * Creates new form frmReserva
     */
    public frmReserva() {
        initComponents();
        this.cbVuelosdis.setModel(q.Obt_VueloEmbraer());
        InicializaMatriz();
    }

    //Atributos             //Filas y Columnas
    String Embraer[][] = new String [20][4];
    
    private void InicializaMatriz(){
        for(int y = 0; y < 20; y++){
            for(int x = 0; x < 4; x++){
                int a = y + 1;
                int b = x + 1;
                if (b == 1) {
                    Embraer[y][x] = String.valueOf(a) +  "A";
                }
                if (b == 2) {
                    Embraer[y][x] = String.valueOf(a) +  "B";
                }
                if (b == 3) {
                    Embraer[y][x] = String.valueOf(a) +  "C";
                }
                if (b == 4) {
                    Embraer[y][x] = String.valueOf(a) +  "D";
                }
               
            }
        }
    }
    
    private void RecorreMatriz(){
        System.out.println("____________________________________LUGARES DEL AVIÓN EMBRAER________________________________________");

         for(int y = 0; y < 20; y++){
            for(int x = 0; x < 4; x++){
              
                System.out.print(Embraer[y][x] + "               -               ");
            }
            System.out.println("");
        }
        System.out.println("_______________________________________________________________________________________________________");
     
    }
    private void RecorreMatrizDisponibles(){
        System.out.println("_____________________LUGARES Disponibles AVIÓN EMBRAER________________________");

        for(int y = 0; y < 20; y++){
            for(int x = 0; x < 4; x++){
                if ( Embraer[y][x].length() <= 3) {
                    System.out.println("Lugar " + Embraer[y][x] + "- Disponible -");
                }              
                
            }
            System.out.println("");
        }
        System.out.println("_________________________________________________________________________");
    }
     private void RecorreMatrizOcupados(){
        System.out.println("_____________________LUGARES Ocupados AVIÓN EMBRAER________________________");

        for(int y = 0; y < 20; y++){
            for(int x = 0; x < 4; x++){
                if ( Embraer[y][x].length() > 3) {
                int y2 = y + 1;    
                String x2 = "";
                 if (x == 0) {
                        x2 = "A";
                }
                 if (x == 1) {
                        x2 = "B";
                }
                 if (x == 2) {
                        x2 = "C";
                }
                 if (x == 3) {
                        x2 = "D";
                }
              
                
                    System.out.println("Lugar: " + String.valueOf(y2) + x2 + "  Ocupado por: " + Embraer[y][x] );
               
                }              
                
            }
           
        }
        System.out.println("_________________________________________________________________________");
    }
    private void GuardarMatriz(){
        int Fila = 0;
        int Columna = 0;
        String Valor;
        
        String s = "";
        int filaSel = 0;
        s = (String) cbFila.getSelectedItem();
        if (s == "1") {
             filaSel = 0;
        }
        if (s == "2") {
             filaSel = 1;
        }
        if (s == "3") {
             filaSel = 2;
        }
        if (s == "4") {
             filaSel = 3;
        }
        if (s == "5") {
             filaSel = 4;
        }
        if (s == "6") {
             filaSel = 5;
        }
        if (s == "7") {
             filaSel = 6;
        }
        if (s == "8") {
             filaSel = 7;
        }
        if (s == "9") {
             filaSel = 8;
        }
        if (s == "10") {
             filaSel = 9;
        }
        if (s == "11") {
             filaSel = 10;
        }
        if (s == "12") {
             filaSel = 11;
        }
        if (s == "13") {
             filaSel = 12;
        }
         if (s == "14") {
             filaSel = 13;
        }
        if (s == "15") {
             filaSel = 14;
        }
          if (s == "16") {
             filaSel = 15;
        }
          if (s == "17") {
             filaSel = 16;
        }
           if (s == "18") {
             filaSel = 17;
        }
            if (s == "19") {
             filaSel = 18;
        }
             if (s == "20") {
             filaSel = 19;
        }
         
        
        //asientos
        String a = "";
        int colSel = 0;
        a = (String) cbAsiento.getSelectedItem();
        if (a == "A") {
             colSel = 0;
        }
        if (a == "B") {
             colSel = 1;
        }
        if (a == "C") {
             colSel = 2;
        }
        if (a == "D") {
             colSel = 3;
        }
      
        
        
        Fila = filaSel;
        Columna = colSel;
        Valor = ctNombre.getText() + " Pasaporte:" + ctPasaporte.getText();
        Embraer[Fila][Columna] = Valor;
    }
    
    private void PasaDatos(){
        sId.setText(cbVuelosdis.getSelectedItem().toString());
    }

    private void RegistrarBoleto(){
              String s = "";
        int filaSel = 0;
        s = (String) cbFila.getSelectedItem();
        if (s == "1") {
             filaSel = 0;
        }
        if (s == "2") {
             filaSel = 1;
        }
        if (s == "3") {
             filaSel = 2;
        }
        if (s == "4") {
             filaSel = 3;
        }
        if (s == "5") {
             filaSel = 4;
        }
        if (s == "6") {
             filaSel = 5;
        }
        if (s == "7") {
             filaSel = 6;
        }
        if (s == "8") {
             filaSel = 7;
        }
        if (s == "9") {
             filaSel = 8;
        }
        if (s == "10") {
             filaSel = 9;
        }
        if (s == "11") {
             filaSel = 10;
        }
        if (s == "12") {
             filaSel = 11;
        }
        if (s == "13") {
             filaSel = 12;
        }
         if (s == "14") {
             filaSel = 13;
        }
        if (s == "15") {
             filaSel = 14;
        }
         if (s == "16") {
             filaSel = 15;
        }
          if (s == "17") {
             filaSel = 16;
        }
           if (s == "18") {
             filaSel = 17;
        }
            if (s == "19") {
             filaSel = 18;
        }
             if (s == "20") {
             filaSel = 19;
        }
           
        
        String a = "";
        int colSel = 0;
        a = (String) cbAsiento.getSelectedItem();
        if ("A".equals(a)) {
             colSel = 0;
        }
        if ("B".equals(a)) {
             colSel = 1;
        }
        if ("C".equals(a)) {
             colSel = 2;
        }
        if ("D".equals(a)) {
             colSel = 3;
        }
       
        
        int VUELO_ID = Integer.valueOf(sId.getText());
        int FILA = filaSel;
        String ASIENTO = String.valueOf(colSel);
        int NO_PASAPORTE = Integer.valueOf(ctPasaporte.getText());
        String NOMBRE = ctNombre.getText();
        String NACIONALIDAD = ctNacion.getText();
        String FECHA_NAC = ctFecha.getText();
        String TIPO_AVION = "Embraer";
        
        r.setVUELO_ID(VUELO_ID);
        r.setFILA(FILA);
        r.setASIENTO(ASIENTO);
        r.setNO_PASAPORTE(NO_PASAPORTE);
        r.setNOMBRE(NOMBRE);
        r.setNACIONALIDAD(NACIONALIDAD);
        r.setFECHA_NAC(FECHA_NAC);
        r.setTIPO_AVION(TIPO_AVION);
        q.fncReservaBoing(r);
        
        JOptionPane.showMessageDialog(this, "RESERVACION ASIGNADA CORRECTAMENTE");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ctPasaporte = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ctNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ctNacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ctFecha = new javax.swing.JTextField();
        cbVuelosdis = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        sId = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        cbFila = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbAsiento = new javax.swing.JComboBox<>();
        btnVer2 = new javax.swing.JButton();
        btnVer1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(7, 193, 191));

        btnMenu.setBackground(new java.awt.Color(35, 35, 35));
        btnMenu.setFont(new java.awt.Font("Lato Thin", 1, 15)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(254, 254, 254));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logout.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reservación de Vuelos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/AEROPLANE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Vuelos disponibles");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("Número de pasaporte");

        ctPasaporte.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ctPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPasaporteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setText("Nombre");

        ctNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ctNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNombreActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 1, 1));
        jLabel9.setText("Nacionalidad");

        ctNacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ctNacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNacionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 1, 1));
        jLabel10.setText("Fecha de nacimiento");

        ctFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ctFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctFechaActionPerformed(evt);
            }
        });

        cbVuelosdis.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbVuelosdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVuelosdisActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/save-icon.png"))); // NOI18N
        btnGuardar.setText("Registrar Reservación");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Eye-icon.png"))); // NOI18N
        btnVer.setText("Ver Matriz de Asientos");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        sId.setText("textField1");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("Fila");

        cbFila.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        cbFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFilaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 1, 1));
        jLabel11.setText("No. Asiento");

        cbAsiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", " " }));
        cbAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsientoActionPerformed(evt);
            }
        });

        btnVer2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/no-icon.png"))); // NOI18N
        btnVer2.setText("Reporte de Asientos Ocupados");
        btnVer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer2ActionPerformed(evt);
            }
        });

        btnVer1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Accept-icon.png"))); // NOI18N
        btnVer1.setText("Reporte de Asientos Disponibles");
        btnVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lato Thin", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 1, 1));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Embraer.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbVuelosdis, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(ctFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(ctNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbFila, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cbAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(ctNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(ctPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVer1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVer2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(109, 109, 109)))
                .addComponent(jLabel13)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbVuelosdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(cbAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctNacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVer)
                                    .addComponent(btnGuardar))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVer1)
                                    .addComponent(btnVer2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        frmMenu F = new frmMenu();
        F.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void ctPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPasaporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPasaporteActionPerformed

    private void ctNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNombreActionPerformed

    private void ctNacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNacionActionPerformed

    private void ctFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctFechaActionPerformed

    private void cbVuelosdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVuelosdisActionPerformed
      
    }//GEN-LAST:event_cbVuelosdisActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        PasaDatos();
        RegistrarBoleto();
        GuardarMatriz();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        RecorreMatriz();
         JOptionPane.showMessageDialog(this, "Vea la consola para ver la matriz.");
    }//GEN-LAST:event_btnVerActionPerformed

    private void cbFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFilaActionPerformed

    private void cbAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAsientoActionPerformed

    private void btnVer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer2ActionPerformed
        RecorreMatrizOcupados();
        JOptionPane.showMessageDialog(this, "Vea la consola para ver el reporte");
    }//GEN-LAST:event_btnVer2ActionPerformed

    private void btnVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer1ActionPerformed
        RecorreMatrizDisponibles();
        JOptionPane.showMessageDialog(this, "Vea la consola para ver el reporte");
    }//GEN-LAST:event_btnVer1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVer1;
    private javax.swing.JButton btnVer2;
    private javax.swing.JComboBox<String> cbAsiento;
    private javax.swing.JComboBox<String> cbFila;
    private javax.swing.JComboBox<String> cbVuelosdis;
    private javax.swing.JTextField ctFecha;
    private javax.swing.JTextField ctNacion;
    private javax.swing.JTextField ctNombre;
    private javax.swing.JTextField ctPasaporte;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.TextField sId;
    // End of variables declaration//GEN-END:variables
}
