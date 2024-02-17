package examenlab5p2_carloslanza;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ExamenLab5P2_CarlosLanza extends javax.swing.JFrame {

    //Carlos Lanza F3 asiento 11
    public ExamenLab5P2_CarlosLanza() {
        Empleado empleado = new Empleado(
                "Finanzas",
                "Gerente",
                10,
                "Juan",
                "Banegas",
                "admin123",
                new Date(75, 11, 25),
                "M",
                "Comayagua"
        );
        Civil civil = new Civil(
                "Carlos",
                "Lanza",
                "password123",
                new Date(105, 9, 21),
                "M",
                "Francisco Morazan");
        Tramite trámite = new Tramite(
                "Comer",
                "Si, debo comer",
                new Date(),
                civil.getDNI());
        Tramite tramite1 = new Tramite(
                "Leer",
                "Si, debo leer",
                new Date(),
                civil.getDNI());
        civil.getTramites().add(trámite);
        civil.getTramites().add(tramite1);

        usuarios.add(empleado);
        usuarios.add(civil);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empleado_jd = new javax.swing.JDialog();
        bienvenido_txt2 = new javax.swing.JLabel();
        nombreEmpleado_txt2 = new javax.swing.JLabel();
        cerrarSesion_btn2 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        infoCiviles_panel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        infoCiviles_table2 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tramitesCiviles_table2 = new javax.swing.JTable();
        infoCiviles_txt2 = new javax.swing.JLabel();
        tramites_txt2 = new javax.swing.JLabel();
        modCiviles_panel2 = new javax.swing.JPanel();
        identidades_cb2 = new javax.swing.JComboBox<>();
        nombre_txt2 = new javax.swing.JLabel();
        nombre_field2 = new javax.swing.JTextField();
        apellido_txt2 = new javax.swing.JLabel();
        apellido_field2 = new javax.swing.JTextField();
        contraseñaCivil_txt2 = new javax.swing.JLabel();
        contraseñaCivil_field2 = new javax.swing.JTextField();
        fechaNacimiento_txt2 = new javax.swing.JLabel();
        sexo_txt2 = new javax.swing.JLabel();
        sexo_cb2 = new javax.swing.JComboBox<>();
        departamento_txt2 = new javax.swing.JLabel();
        departamento_cb2 = new javax.swing.JComboBox<>();
        modificar_btn2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        civil_jd = new javax.swing.JDialog();
        bienvenido_txt1 = new javax.swing.JLabel();
        nombreCivil_txt1 = new javax.swing.JLabel();
        cerrarSesion_btn1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        infoPersonal_panel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoPersonal_table1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tramitesPersonal_table1 = new javax.swing.JTable();
        infoPersonal_txt1 = new javax.swing.JLabel();
        tramitesPersonal_txt1 = new javax.swing.JLabel();
        tramites_panel1 = new javax.swing.JPanel();
        enviar_btn1 = new javax.swing.JButton();
        nombreTramite_txt1 = new javax.swing.JLabel();
        nombreTramite_field1 = new javax.swing.JTextField();
        descripcion_txt1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        descripcion_area1 = new javax.swing.JTextArea();
        login_panel = new javax.swing.JPanel();
        login_txt = new javax.swing.JLabel();
        nombreCompleto_txt = new javax.swing.JLabel();
        contraseña_txt = new javax.swing.JLabel();
        nombreCompleto_field = new javax.swing.JTextField();
        contraseña_field = new javax.swing.JTextField();
        ingresar_btn = new javax.swing.JButton();

        bienvenido_txt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bienvenido_txt2.setText("Bienvenido:");

        cerrarSesion_btn2.setText("Cerrar Sesión");
        cerrarSesion_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesion_btn2MouseClicked(evt);
            }
        });

        infoCiviles_table2.setModel(new javax.swing.table.DefaultTableModel(
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
        infoCiviles_table2.setShowGrid(true);
        jScrollPane6.setViewportView(infoCiviles_table2);

        tramitesCiviles_table2.setModel(new javax.swing.table.DefaultTableModel(
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
        tramitesCiviles_table2.setShowGrid(true);
        jScrollPane7.setViewportView(tramitesCiviles_table2);

        infoCiviles_txt2.setText("Información de los civiles:");

        tramites_txt2.setText("Trámites:");

        javax.swing.GroupLayout infoCiviles_panel2Layout = new javax.swing.GroupLayout(infoCiviles_panel2);
        infoCiviles_panel2.setLayout(infoCiviles_panel2Layout);
        infoCiviles_panel2Layout.setHorizontalGroup(
            infoCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCiviles_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoCiviles_panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(infoCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoCiviles_panel2Layout.createSequentialGroup()
                        .addGroup(infoCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoCiviles_txt2)
                            .addComponent(tramites_txt2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoCiviles_panel2Layout.setVerticalGroup(
            infoCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoCiviles_panel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(infoCiviles_txt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tramites_txt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane3.addTab("Información Civiles", infoCiviles_panel2);

        nombre_txt2.setText("Nombre");

        apellido_txt2.setText("Apellido");

        contraseñaCivil_txt2.setText("Contraseña");

        fechaNacimiento_txt2.setText("Fecha de Nacimiento");

        sexo_txt2.setText("Sexo");

        sexo_cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        departamento_txt2.setText("Departamento");

        departamento_cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Francisco Morazan", "Comayagua", "Cortes" }));

        modificar_btn2.setText("Modificar");
        modificar_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_btn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modCiviles_panel2Layout = new javax.swing.GroupLayout(modCiviles_panel2);
        modCiviles_panel2.setLayout(modCiviles_panel2Layout);
        modCiviles_panel2Layout.setHorizontalGroup(
            modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                        .addComponent(nombre_txt2)
                        .addGap(109, 109, 109))
                    .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                        .addComponent(nombre_field2)
                        .addGap(26, 26, 26)))
                .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido_txt2)
                    .addComponent(apellido_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 167, Short.MAX_VALUE))
            .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                .addComponent(departamento_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificar_btn2))
            .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(identidades_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sexo_txt2)
                    .addComponent(sexo_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento_txt2)
                    .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                        .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseñaCivil_txt2)
                            .addComponent(contraseñaCivil_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaNacimiento_txt2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modCiviles_panel2Layout.setVerticalGroup(
            modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modificar_btn2)
                    .addGroup(modCiviles_panel2Layout.createSequentialGroup()
                        .addComponent(identidades_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido_txt2)
                            .addComponent(nombre_txt2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido_field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contraseñaCivil_txt2)
                            .addComponent(fechaNacimiento_txt2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(modCiviles_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseñaCivil_field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo_txt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departamento_txt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departamento_cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Modificación Civiles", modCiviles_panel2);

        javax.swing.GroupLayout empleado_jdLayout = new javax.swing.GroupLayout(empleado_jd.getContentPane());
        empleado_jd.getContentPane().setLayout(empleado_jdLayout);
        empleado_jdLayout.setHorizontalGroup(
            empleado_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empleado_jdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(empleado_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane3)
                    .addGroup(empleado_jdLayout.createSequentialGroup()
                        .addComponent(bienvenido_txt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreEmpleado_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesion_btn2)))
                .addGap(20, 20, 20))
        );
        empleado_jdLayout.setVerticalGroup(
            empleado_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleado_jdLayout.createSequentialGroup()
                .addGroup(empleado_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empleado_jdLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(empleado_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bienvenido_txt2)
                            .addComponent(nombreEmpleado_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empleado_jdLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cerrarSesion_btn2)))
                .addGap(62, 62, 62)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        bienvenido_txt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bienvenido_txt1.setText("Bienvenido:");

        cerrarSesion_btn1.setText("Cerrar Sesión");
        cerrarSesion_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesion_btn1MouseClicked(evt);
            }
        });

        infoPersonal_table1.setModel(new javax.swing.table.DefaultTableModel(
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
        infoPersonal_table1.setShowGrid(true);
        jScrollPane3.setViewportView(infoPersonal_table1);

        tramitesPersonal_table1.setModel(new javax.swing.table.DefaultTableModel(
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
        tramitesPersonal_table1.setShowGrid(true);
        jScrollPane4.setViewportView(tramitesPersonal_table1);

        infoPersonal_txt1.setText("Información Personal:");

        tramitesPersonal_txt1.setText("Trámites:");

        javax.swing.GroupLayout infoPersonal_panel1Layout = new javax.swing.GroupLayout(infoPersonal_panel1);
        infoPersonal_panel1.setLayout(infoPersonal_panel1Layout);
        infoPersonal_panel1Layout.setHorizontalGroup(
            infoPersonal_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPersonal_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPersonal_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPersonal_panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(infoPersonal_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoPersonal_panel1Layout.createSequentialGroup()
                        .addGroup(infoPersonal_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoPersonal_txt1)
                            .addComponent(tramitesPersonal_txt1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoPersonal_panel1Layout.setVerticalGroup(
            infoPersonal_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPersonal_panel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(infoPersonal_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tramitesPersonal_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane2.addTab("Información Personal", infoPersonal_panel1);

        enviar_btn1.setText("Enviar");
        enviar_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_btn1MouseClicked(evt);
            }
        });

        nombreTramite_txt1.setText("Nombre");

        descripcion_txt1.setText("Descripción");

        descripcion_area1.setColumns(20);
        descripcion_area1.setRows(5);
        jScrollPane8.setViewportView(descripcion_area1);

        javax.swing.GroupLayout tramites_panel1Layout = new javax.swing.GroupLayout(tramites_panel1);
        tramites_panel1.setLayout(tramites_panel1Layout);
        tramites_panel1Layout.setHorizontalGroup(
            tramites_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramites_panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enviar_btn1))
            .addGroup(tramites_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tramites_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(tramites_panel1Layout.createSequentialGroup()
                        .addGroup(tramites_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTramite_txt1)
                            .addComponent(descripcion_txt1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nombreTramite_field1))
                .addContainerGap())
        );
        tramites_panel1Layout.setVerticalGroup(
            tramites_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tramites_panel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nombreTramite_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTramite_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcion_txt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviar_btn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Gestión de Trámites", tramites_panel1);

        javax.swing.GroupLayout civil_jdLayout = new javax.swing.GroupLayout(civil_jd.getContentPane());
        civil_jd.getContentPane().setLayout(civil_jdLayout);
        civil_jdLayout.setHorizontalGroup(
            civil_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, civil_jdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(civil_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane2)
                    .addGroup(civil_jdLayout.createSequentialGroup()
                        .addComponent(bienvenido_txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreCivil_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesion_btn1)))
                .addGap(20, 20, 20))
        );
        civil_jdLayout.setVerticalGroup(
            civil_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(civil_jdLayout.createSequentialGroup()
                .addGroup(civil_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(civil_jdLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(civil_jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bienvenido_txt1)
                            .addComponent(nombreCivil_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(civil_jdLayout.createSequentialGroup()
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
        ingresar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresar_btnMouseClicked(evt);
            }
        });

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

    private void ingresar_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_btnMouseClicked
        String usuario = nombreCompleto_field.getText();
        String password = contraseña_field.getText();

        if (iniciarSesión(usuario, password) instanceof Empleado) {
            this.setVisible(false);
            empleado_jd.setVisible(true);
            empleado_jd.pack();
            empleado_jd.setLocationRelativeTo(this);
            nombreEmpleado_txt2.setText(usuario);
            llenarTablaEmpleado();
            llenarDNIComboBox();
            setModificarCivil();
        } else if (iniciarSesión(usuario, password) instanceof Civil) {
            this.setVisible(false);
            civil_jd.setVisible(true);
            civil_jd.pack();
            civil_jd.setLocationRelativeTo(this);
            nombreCivil_txt1.setText(usuario);
            llenarTablaCivil(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta.");
        }
    }//GEN-LAST:event_ingresar_btnMouseClicked

    private void cerrarSesion_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesion_btn1MouseClicked
        this.setVisible(true);
        civil_jd.setVisible(false);
        empleado_jd.setVisible(false);
    }//GEN-LAST:event_cerrarSesion_btn1MouseClicked

    private void cerrarSesion_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesion_btn2MouseClicked
        this.setVisible(true);
        civil_jd.setVisible(false);
        empleado_jd.setVisible(false);
    }//GEN-LAST:event_cerrarSesion_btn2MouseClicked

    private void enviar_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_btn1MouseClicked
        String nombreTramite = nombreTramite_field1.getText();
        String descripcion = descripcion_area1.getText();

        String nombreUsuario = nombreCivil_txt1.getText();
        Civil civil = null;
        for (Usuario u : usuarios) {
            String nombre = u.getNombre() + " " + u.getApellido();
            if (nombre.equals(nombreUsuario)) {
                civil = (Civil) u;
            }
        }
        if (civil != null) {
            Tramite tramite = new Tramite(nombreTramite, descripcion, new Date(), civil.getDNI());
            civil.getTramites().add(tramite);
        }

        nombreTramite_field1.setText("");
        descripcion_area1.setText("");
        llenarTablaCivil(nombreUsuario);
    }//GEN-LAST:event_enviar_btn1MouseClicked

    private void modificar_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_btn2MouseClicked
        String DNI = (String) identidades_cb2.getSelectedItem();

        Civil civil = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getDNI().equals(DNI)) {
                if (usuario instanceof Civil c) {
                    civil = c;
                }
            }
        }
        modificarCivil(civil);
        JOptionPane.showMessageDialog(null, "¡Se ha modificado exitosamente!");
        setModificarCivil();
    }//GEN-LAST:event_modificar_btn2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenLab5P2_CarlosLanza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_field2;
    private javax.swing.JLabel apellido_txt2;
    private javax.swing.JLabel bienvenido_txt1;
    private javax.swing.JLabel bienvenido_txt2;
    private javax.swing.JButton cerrarSesion_btn1;
    private javax.swing.JButton cerrarSesion_btn2;
    private javax.swing.JDialog civil_jd;
    private javax.swing.JTextField contraseñaCivil_field2;
    private javax.swing.JLabel contraseñaCivil_txt2;
    private javax.swing.JTextField contraseña_field;
    private javax.swing.JLabel contraseña_txt;
    private javax.swing.JComboBox<String> departamento_cb2;
    private javax.swing.JLabel departamento_txt2;
    private javax.swing.JTextArea descripcion_area1;
    private javax.swing.JLabel descripcion_txt1;
    private javax.swing.JDialog empleado_jd;
    private javax.swing.JButton enviar_btn1;
    private javax.swing.JLabel fechaNacimiento_txt2;
    private javax.swing.JComboBox<String> identidades_cb2;
    private javax.swing.JPanel infoCiviles_panel2;
    private javax.swing.JTable infoCiviles_table2;
    private javax.swing.JLabel infoCiviles_txt2;
    private javax.swing.JPanel infoPersonal_panel1;
    private javax.swing.JTable infoPersonal_table1;
    private javax.swing.JLabel infoPersonal_txt1;
    private javax.swing.JButton ingresar_btn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel login_txt;
    private javax.swing.JPanel modCiviles_panel2;
    private javax.swing.JButton modificar_btn2;
    private javax.swing.JLabel nombreCivil_txt1;
    private javax.swing.JTextField nombreCompleto_field;
    private javax.swing.JLabel nombreCompleto_txt;
    private javax.swing.JLabel nombreEmpleado_txt2;
    private javax.swing.JTextField nombreTramite_field1;
    private javax.swing.JLabel nombreTramite_txt1;
    private javax.swing.JTextField nombre_field2;
    private javax.swing.JLabel nombre_txt2;
    private javax.swing.JComboBox<String> sexo_cb2;
    private javax.swing.JLabel sexo_txt2;
    private javax.swing.JTable tramitesCiviles_table2;
    private javax.swing.JTable tramitesPersonal_table1;
    private javax.swing.JLabel tramitesPersonal_txt1;
    private javax.swing.JPanel tramites_panel1;
    private javax.swing.JLabel tramites_txt2;
    // End of variables declaration//GEN-END:variables

    ArrayList<Usuario> usuarios = new ArrayList();

    public Usuario iniciarSesión(String usuario, String password) {
        if (!usuarios.isEmpty()) {
            for (int i = 0; i < usuarios.size(); i++) {
                String nombreCompleto = usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido();
                String contraseña = usuarios.get(i).getContraseña();

                if (usuario.equals(nombreCompleto)
                        && password.equals(contraseña)) {
                    return usuarios.get(i);
                }
            }
        }
        return null;
    }

    public void setModificarCivil() {
        String DNI = (String) identidades_cb2.getSelectedItem();

        Civil civil = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getDNI().equals(DNI)) {
                if (usuario instanceof Civil c) {
                    civil = c;
                }
            }
        }

        nombre_field2.setText(civil.getNombre());
        apellido_field2.setText(civil.getApellido());
        contraseñaCivil_field2.setText(civil.getContraseña());

        String genero = civil.getSexo();
        if (genero.equals("M")) {
            sexo_cb2.setSelectedItem("M");
        } else {
            sexo_cb2.setSelectedItem("F");
        }

        String departamentoCB = civil.getDepartamento();
        switch (departamentoCB.toLowerCase()) {
            case "francisco morazan":
                departamento_cb2.setSelectedItem("francisco morazan");
                break;
            case "cortes":
                departamento_cb2.setSelectedItem("cortes");
                break;
            case "comayagua":
                departamento_cb2.setSelectedItem("comayagua");
                break;
        }

    }

    public void modificarCivil(Civil civil) {
        String nombre = nombre_field2.getText();
        String apellido = apellido_field2.getText();
        String contraseña = contraseñaCivil_field2.getText();
        String sexo = (String)sexo_cb2.getSelectedItem();
        String departamento = (String) departamento_cb2.getSelectedItem();
        Date fechaDeNacimiento = jDateChooser1.getDate();

        civil.setNombre(nombre);
        civil.setApellido(apellido);
        civil.setContraseña(contraseña);
        civil.setSexo(sexo);
        civil.setDepartamento(departamento);
        civil.setFechaDeNacimiento(fechaDeNacimiento);
    }

    public void llenarDNIComboBox() {
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Civil civil) {
                identidades_cb2.addItem(civil.getDNI());
            }
        }

    }

    public void llenarTablaEmpleado() {
        DefaultTableModel modelCiviles = (DefaultTableModel) infoCiviles_table2.getModel();
        modelCiviles.setRowCount(0);
        for (Usuario u : usuarios) {
            if (u instanceof Civil civil) {
                Object[] rowData = {
                    civil.getNombre(),
                    civil.getDNI(),
                    civil.getFechaDeNacimiento()
                };
                modelCiviles.addRow(rowData);
            }
        }

        DefaultTableModel modelTramites = (DefaultTableModel) tramitesCiviles_table2.getModel();
        modelTramites.setRowCount(0);
        for (Usuario u : usuarios) {
            if (u instanceof Civil civil) {
                for (Tramite t : civil.getTramites()) {
                    Object[] rowData = {
                        t.getNombre(),
                        t.getDescripción(),
                        t.getFecha(),
                        t.getUsuarioDNI()
                    };
                    modelTramites.addRow(rowData);
                }
            }
        }
    }

    public void llenarTablaCivil(String nombreCompleto) {
        DefaultTableModel modelInfo = (DefaultTableModel) infoPersonal_table1.getModel();
        modelInfo.setRowCount(0);
        for (Usuario u : usuarios) {
            String usuario = u.getNombre() + " " + u.getApellido();
            if (usuario.equals(nombreCompleto)) {
                Object[] rowData = {
                    u.getNombre(),
                    u.getDNI(),
                    u.getFechaDeNacimiento()
                };
                modelInfo.addRow(rowData);
            }
        }

        DefaultTableModel modelTramite = (DefaultTableModel) tramitesPersonal_table1.getModel();
        modelTramite.setRowCount(0);
        for (Usuario u : usuarios) {
            String usuario = u.getNombre() + " " + u.getApellido();
            if (usuario.equals(nombreCompleto)) {
                Civil civil = (Civil) u;
                for (Tramite t : civil.getTramites()) {
                    Object[] rowData = {
                        t.getNombre(),
                        t.getDescripción(),
                        t.getFecha(),
                        t.getUsuarioDNI()
                    };
                    modelTramite.addRow(rowData);
                }
            }
        }
    }
}
