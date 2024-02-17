package examenlab5p2_carloslanza;

import java.util.ArrayList;
import java.util.Date;

public class ExamenLab5P2_CarlosLanza extends javax.swing.JFrame {

    //Carlos Lanza F3 asiento 11
    public ExamenLab5P2_CarlosLanza() {
        Empleado empleado = new Empleado(
                "Finanzas", 
                "Gerente", 
                10, 
                "Juan Emilio", 
                "Banegas", 
                "admin123", 
                new Date(75, 11, 25),
                'M',
                "Comayagua"
        );
        Civil civil = new Civil(
                "Carlos", 
                "Lanza", 
                "password123",
                new Date(105, 9, 21), 
                'M', 
                "Francisco Morazan");
        Trámite trámite = new Trámite(
                "Carlos Lanza", 
                "Si, debo comer", 
                new Date(), 
                civil.getDNI());
        civil.getTrámites().add(trámite);
        
        usuarios.add(empleado);
        usuarios.add(civil);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        civil_panel = new javax.swing.JPanel();
        bienvenido_txt = new javax.swing.JLabel();
        nombreEmpleado_txt = new javax.swing.JLabel();
        cerrarSesion_btn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        infoPersonal_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoPersonal_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tramitesPersonal_table = new javax.swing.JTable();
        infoPersonal_txt = new javax.swing.JLabel();
        tramitesPersonal_txt = new javax.swing.JLabel();
        tramites_panel = new javax.swing.JPanel();
        enviar_btn = new javax.swing.JButton();
        nombreTramite_txt = new javax.swing.JLabel();
        nombreTramite_field = new javax.swing.JTextField();
        descripcion_txt = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        descripcion_area = new javax.swing.JTextArea();
        empleado_panel = new javax.swing.JPanel();
        bienvenido_txt1 = new javax.swing.JLabel();
        nombreEmpleado_txt1 = new javax.swing.JLabel();
        cerrarSesion_btn1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        infoCiviles_panel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoCiviles_table1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tramitesCiviles_table1 = new javax.swing.JTable();
        infoCiviles_txt1 = new javax.swing.JLabel();
        tramites_txt1 = new javax.swing.JLabel();
        modCiviles_panel1 = new javax.swing.JPanel();
        identidades_cb1 = new javax.swing.JComboBox<>();
        nombre_txt1 = new javax.swing.JLabel();
        nombre_field1 = new javax.swing.JTextField();
        apellido_txt1 = new javax.swing.JLabel();
        apellido_field1 = new javax.swing.JTextField();
        contraseñaCivil_txt1 = new javax.swing.JLabel();
        contraseñaCivil_field1 = new javax.swing.JTextField();
        fechaNacimiento_txt1 = new javax.swing.JLabel();
        sexo_txt1 = new javax.swing.JLabel();
        sexo_cb1 = new javax.swing.JComboBox<>();
        departamento_txt1 = new javax.swing.JLabel();
        departamento_cb1 = new javax.swing.JComboBox<>();
        modificar_btn1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        login_panel = new javax.swing.JPanel();
        login_txt = new javax.swing.JLabel();
        nombreCompleto_txt = new javax.swing.JLabel();
        contraseña_txt = new javax.swing.JLabel();
        nombreCompleto_field = new javax.swing.JTextField();
        contraseña_field = new javax.swing.JTextField();
        ingresar_btn = new javax.swing.JButton();

        civil_panel.setMinimumSize(new java.awt.Dimension(492, 437));

        bienvenido_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bienvenido_txt.setText("Bienvenido:");

        cerrarSesion_btn.setText("Cerrar Sesión");

        infoPersonal_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Completo", "No. Identidad", "Fecha de Nacimiento"
            }
        ));
        infoPersonal_table.setShowGrid(true);
        jScrollPane1.setViewportView(infoPersonal_table);

        tramitesPersonal_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Tramite", "Descripción", "Fecha", "No. Identidad"
            }
        ));
        tramitesPersonal_table.setShowGrid(true);
        jScrollPane2.setViewportView(tramitesPersonal_table);

        infoPersonal_txt.setText("Información Personal:");

        tramitesPersonal_txt.setText("Trámites:");

        javax.swing.GroupLayout infoPersonal_panelLayout = new javax.swing.GroupLayout(infoPersonal_panel);
        infoPersonal_panel.setLayout(infoPersonal_panelLayout);
        infoPersonal_panelLayout.setHorizontalGroup(
            infoPersonal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPersonal_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPersonal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPersonal_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(infoPersonal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoPersonal_panelLayout.createSequentialGroup()
                        .addGroup(infoPersonal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoPersonal_txt)
                            .addComponent(tramitesPersonal_txt))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoPersonal_panelLayout.setVerticalGroup(
            infoPersonal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPersonal_panelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(infoPersonal_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tramitesPersonal_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Información Personal", infoPersonal_panel);

        enviar_btn.setText("Enviar");

        nombreTramite_txt.setText("Nombre");

        descripcion_txt.setText("Descripción");

        descripcion_area.setColumns(20);
        descripcion_area.setRows(5);
        jScrollPane5.setViewportView(descripcion_area);

        javax.swing.GroupLayout tramites_panelLayout = new javax.swing.GroupLayout(tramites_panel);
        tramites_panel.setLayout(tramites_panelLayout);
        tramites_panelLayout.setHorizontalGroup(
            tramites_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramites_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enviar_btn))
            .addGroup(tramites_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tramites_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(tramites_panelLayout.createSequentialGroup()
                        .addGroup(tramites_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTramite_txt)
                            .addComponent(descripcion_txt))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nombreTramite_field))
                .addContainerGap())
        );
        tramites_panelLayout.setVerticalGroup(
            tramites_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramites_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nombreTramite_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTramite_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcion_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviar_btn)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestión de Trámites", tramites_panel);

        javax.swing.GroupLayout civil_panelLayout = new javax.swing.GroupLayout(civil_panel);
        civil_panel.setLayout(civil_panelLayout);
        civil_panelLayout.setHorizontalGroup(
            civil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, civil_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(civil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(civil_panelLayout.createSequentialGroup()
                        .addComponent(bienvenido_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreEmpleado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesion_btn)))
                .addGap(20, 20, 20))
        );
        civil_panelLayout.setVerticalGroup(
            civil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(civil_panelLayout.createSequentialGroup()
                .addGroup(civil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(civil_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(civil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bienvenido_txt)
                            .addComponent(nombreEmpleado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(civil_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cerrarSesion_btn)))
                .addGap(62, 62, 62)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        empleado_panel.setMinimumSize(new java.awt.Dimension(492, 437));

        bienvenido_txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bienvenido_txt1.setText("Bienvenido:");

        cerrarSesion_btn1.setText("Cerrar Sesión");

        infoCiviles_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Completo", "No. Identidad", "Fecha de Nacimiento"
            }
        ));
        infoCiviles_table1.setShowGrid(true);
        jScrollPane3.setViewportView(infoCiviles_table1);

        tramitesCiviles_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Tramite", "Descripción", "Fecha", "No. Identidad"
            }
        ));
        tramitesCiviles_table1.setShowGrid(true);
        jScrollPane4.setViewportView(tramitesCiviles_table1);

        infoCiviles_txt1.setText("Información de los civiles:");

        tramites_txt1.setText("Trámites:");

        javax.swing.GroupLayout infoCiviles_panel1Layout = new javax.swing.GroupLayout(infoCiviles_panel1);
        infoCiviles_panel1.setLayout(infoCiviles_panel1Layout);
        infoCiviles_panel1Layout.setHorizontalGroup(
            infoCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCiviles_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoCiviles_panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(infoCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoCiviles_panel1Layout.createSequentialGroup()
                        .addGroup(infoCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoCiviles_txt1)
                            .addComponent(tramites_txt1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoCiviles_panel1Layout.setVerticalGroup(
            infoCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoCiviles_panel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(infoCiviles_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tramites_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane2.addTab("Información Civiles", infoCiviles_panel1);

        nombre_txt1.setText("Nombre");

        apellido_txt1.setText("Apellido");

        contraseñaCivil_txt1.setText("Contraseña");

        fechaNacimiento_txt1.setText("Fecha de Nacimiento");

        sexo_txt1.setText("Sexo");

        sexo_cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        departamento_txt1.setText("Departamento");

        departamento_cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Francisco Morazan", "Comayagua", "Cortes" }));

        modificar_btn1.setText("Modificar");

        javax.swing.GroupLayout modCiviles_panel1Layout = new javax.swing.GroupLayout(modCiviles_panel1);
        modCiviles_panel1.setLayout(modCiviles_panel1Layout);
        modCiviles_panel1Layout.setHorizontalGroup(
            modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                        .addComponent(nombre_txt1)
                        .addGap(109, 109, 109))
                    .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                        .addComponent(nombre_field1)
                        .addGap(26, 26, 26)))
                .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido_txt1)
                    .addComponent(apellido_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 167, Short.MAX_VALUE))
            .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(identidades_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sexo_txt1)
                    .addComponent(sexo_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento_txt1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                .addComponent(departamento_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificar_btn1))
            .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseñaCivil_txt1)
                    .addComponent(contraseñaCivil_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaNacimiento_txt1)
                    .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(167, 167, 167))))
        );
        modCiviles_panel1Layout.setVerticalGroup(
            modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modificar_btn1)
                    .addGroup(modCiviles_panel1Layout.createSequentialGroup()
                        .addComponent(identidades_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido_txt1)
                            .addComponent(nombre_txt1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contraseñaCivil_txt1)
                            .addComponent(fechaNacimiento_txt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(modCiviles_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseñaCivil_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo_txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departamento_txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departamento_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Modificación Civiles", modCiviles_panel1);

        javax.swing.GroupLayout empleado_panelLayout = new javax.swing.GroupLayout(empleado_panel);
        empleado_panel.setLayout(empleado_panelLayout);
        empleado_panelLayout.setHorizontalGroup(
            empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empleado_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane2)
                    .addGroup(empleado_panelLayout.createSequentialGroup()
                        .addComponent(bienvenido_txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreEmpleado_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesion_btn1)))
                .addGap(20, 20, 20))
        );
        empleado_panelLayout.setVerticalGroup(
            empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleado_panelLayout.createSequentialGroup()
                .addGroup(empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empleado_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bienvenido_txt1)
                            .addComponent(nombreEmpleado_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empleado_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cerrarSesion_btn1)))
                .addGap(62, 62, 62)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        login_txt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        login_txt.setText("LogIn");

        nombreCompleto_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreCompleto_txt.setText("Nombre Completo");

        contraseña_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contraseña_txt.setText("Contraseña");

        ingresar_btn.setText("Ingresar");

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(contraseña_field)
                        .addComponent(contraseña_txt)
                        .addComponent(nombreCompleto_txt)
                        .addComponent(nombreCompleto_field, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(ingresar_btn))
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(login_txt)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(login_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCompleto_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCompleto_field, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseña_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(ingresar_btn)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenLab5P2_CarlosLanza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_field1;
    private javax.swing.JLabel apellido_txt1;
    private javax.swing.JLabel bienvenido_txt;
    private javax.swing.JLabel bienvenido_txt1;
    private javax.swing.JButton cerrarSesion_btn;
    private javax.swing.JButton cerrarSesion_btn1;
    private javax.swing.JPanel civil_panel;
    private javax.swing.JTextField contraseñaCivil_field1;
    private javax.swing.JLabel contraseñaCivil_txt1;
    private javax.swing.JTextField contraseña_field;
    private javax.swing.JLabel contraseña_txt;
    private javax.swing.JComboBox<String> departamento_cb1;
    private javax.swing.JLabel departamento_txt1;
    private javax.swing.JTextArea descripcion_area;
    private javax.swing.JLabel descripcion_txt;
    private javax.swing.JPanel empleado_panel;
    private javax.swing.JButton enviar_btn;
    private javax.swing.JLabel fechaNacimiento_txt1;
    private javax.swing.JComboBox<String> identidades_cb1;
    private javax.swing.JPanel infoCiviles_panel1;
    private javax.swing.JTable infoCiviles_table1;
    private javax.swing.JLabel infoCiviles_txt1;
    private javax.swing.JPanel infoPersonal_panel;
    private javax.swing.JTable infoPersonal_table;
    private javax.swing.JLabel infoPersonal_txt;
    private javax.swing.JButton ingresar_btn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel login_txt;
    private javax.swing.JPanel modCiviles_panel1;
    private javax.swing.JButton modificar_btn1;
    private javax.swing.JTextField nombreCompleto_field;
    private javax.swing.JLabel nombreCompleto_txt;
    private javax.swing.JLabel nombreEmpleado_txt;
    private javax.swing.JLabel nombreEmpleado_txt1;
    private javax.swing.JTextField nombreTramite_field;
    private javax.swing.JLabel nombreTramite_txt;
    private javax.swing.JTextField nombre_field1;
    private javax.swing.JLabel nombre_txt1;
    private javax.swing.JComboBox<String> sexo_cb1;
    private javax.swing.JLabel sexo_txt1;
    private javax.swing.JTable tramitesCiviles_table1;
    private javax.swing.JTable tramitesPersonal_table;
    private javax.swing.JLabel tramitesPersonal_txt;
    private javax.swing.JPanel tramites_panel;
    private javax.swing.JLabel tramites_txt1;
    // End of variables declaration//GEN-END:variables

    ArrayList<Usuario> usuarios = new ArrayList();
    
    public boolean iniciarSesión(Usuario usuario) {
        String usuarioNombreCompleto = usuario.getNombre() + usuario.getApellido();
        String usuarioContraseña = usuario.getContraseña();
        
        if (!usuarios.isEmpty()) {
            for (int i = 0; i < usuarios.size(); i++) {
                String nombreCompleto = usuarios.get(i).getNombre() + usuarios.get(i).getApellido();
                String contraseña = usuarios.get(i).getContraseña();
                if (usuarioNombreCompleto.equals(nombreCompleto) && 
                        usuarioContraseña.equals(contraseña)) {
                    return true;
                }
            }
        }
        return false;
    }
}
