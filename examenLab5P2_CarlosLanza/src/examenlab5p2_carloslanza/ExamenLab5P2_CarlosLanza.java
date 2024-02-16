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

        empleado_panel = new javax.swing.JPanel();
        bienvenido_txt = new javax.swing.JLabel();
        nombreEmpleado_txt = new javax.swing.JLabel();
        cerrarSesion_btn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        infoCiviles_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoCiviles_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tramitesCiviles_table = new javax.swing.JTable();
        infoCiviles_txt = new javax.swing.JLabel();
        tramites_txt = new javax.swing.JLabel();
        modCiviles_panel = new javax.swing.JPanel();
        identidades_cb = new javax.swing.JComboBox<>();
        nombre_txt = new javax.swing.JLabel();
        nombre_field = new javax.swing.JTextField();
        apellido_txt = new javax.swing.JLabel();
        apellido_field = new javax.swing.JTextField();
        contraseñaCivil_txt = new javax.swing.JLabel();
        contraseñaCivil_field = new javax.swing.JTextField();
        fechaNacimiento_txt = new javax.swing.JLabel();
        sexo_txt = new javax.swing.JLabel();
        login_panel = new javax.swing.JPanel();
        login_txt = new javax.swing.JLabel();
        nombreCompleto_txt = new javax.swing.JLabel();
        contraseña_txt = new javax.swing.JLabel();
        nombreCompleto_field = new javax.swing.JTextField();
        contraseña_field = new javax.swing.JTextField();
        ingresar_btn = new javax.swing.JButton();

        empleado_panel.setMinimumSize(new java.awt.Dimension(492, 437));

        bienvenido_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bienvenido_txt.setText("Bienvenido:");

        cerrarSesion_btn.setText("Cerrar Sesión");
        cerrarSesion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_btnActionPerformed(evt);
            }
        });

        infoCiviles_table.setModel(new javax.swing.table.DefaultTableModel(
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
        infoCiviles_table.setShowGrid(true);
        jScrollPane1.setViewportView(infoCiviles_table);

        tramitesCiviles_table.setModel(new javax.swing.table.DefaultTableModel(
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
        tramitesCiviles_table.setShowGrid(true);
        jScrollPane2.setViewportView(tramitesCiviles_table);

        infoCiviles_txt.setText("Información de los civiles:");

        tramites_txt.setText("Trámites:");

        javax.swing.GroupLayout infoCiviles_panelLayout = new javax.swing.GroupLayout(infoCiviles_panel);
        infoCiviles_panel.setLayout(infoCiviles_panelLayout);
        infoCiviles_panelLayout.setHorizontalGroup(
            infoCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCiviles_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoCiviles_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(infoCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoCiviles_panelLayout.createSequentialGroup()
                        .addGroup(infoCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoCiviles_txt)
                            .addComponent(tramites_txt))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        infoCiviles_panelLayout.setVerticalGroup(
            infoCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoCiviles_panelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(infoCiviles_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tramites_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Información Civiles", infoCiviles_panel);

        identidades_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identidades_cbActionPerformed(evt);
            }
        });

        nombre_txt.setText("Nombre");

        nombre_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_fieldActionPerformed(evt);
            }
        });

        apellido_txt.setText("Apellido");

        contraseñaCivil_txt.setText("Contraseña");

        fechaNacimiento_txt.setText("Fecha de Nacimiento");

        sexo_txt.setText("Sexo");

        javax.swing.GroupLayout modCiviles_panelLayout = new javax.swing.GroupLayout(modCiviles_panel);
        modCiviles_panel.setLayout(modCiviles_panelLayout);
        modCiviles_panelLayout.setHorizontalGroup(
            modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modCiviles_panelLayout.createSequentialGroup()
                .addGroup(modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(modCiviles_panelLayout.createSequentialGroup()
                        .addComponent(nombre_txt)
                        .addGap(109, 109, 109))
                    .addGroup(modCiviles_panelLayout.createSequentialGroup()
                        .addComponent(nombre_field)
                        .addGap(26, 26, 26)))
                .addGroup(modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido_txt)
                    .addComponent(apellido_field, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(modCiviles_panelLayout.createSequentialGroup()
                .addGroup(modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modCiviles_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(identidades_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modCiviles_panelLayout.createSequentialGroup()
                        .addComponent(contraseñaCivil_txt)
                        .addGap(93, 93, 93)
                        .addComponent(fechaNacimiento_txt))
                    .addComponent(contraseñaCivil_field, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo_txt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modCiviles_panelLayout.setVerticalGroup(
            modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modCiviles_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(identidades_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_txt)
                    .addComponent(apellido_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modCiviles_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaCivil_txt)
                    .addComponent(fechaNacimiento_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaCivil_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sexo_txt)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificación Civiles", modCiviles_panel);

        javax.swing.GroupLayout empleado_panelLayout = new javax.swing.GroupLayout(empleado_panel);
        empleado_panel.setLayout(empleado_panelLayout);
        empleado_panelLayout.setHorizontalGroup(
            empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empleado_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(empleado_panelLayout.createSequentialGroup()
                        .addComponent(bienvenido_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreEmpleado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesion_btn)))
                .addGap(20, 20, 20))
        );
        empleado_panelLayout.setVerticalGroup(
            empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleado_panelLayout.createSequentialGroup()
                .addGroup(empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empleado_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(empleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bienvenido_txt)
                            .addComponent(nombreEmpleado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empleado_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cerrarSesion_btn)))
                .addGap(62, 62, 62)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cerrarSesion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesion_btnActionPerformed

    private void identidades_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identidades_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identidades_cbActionPerformed

    private void nombre_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_fieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenLab5P2_CarlosLanza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_field;
    private javax.swing.JLabel apellido_txt;
    private javax.swing.JLabel bienvenido_txt;
    private javax.swing.JButton cerrarSesion_btn;
    private javax.swing.JTextField contraseñaCivil_field;
    private javax.swing.JLabel contraseñaCivil_txt;
    private javax.swing.JTextField contraseña_field;
    private javax.swing.JLabel contraseña_txt;
    private javax.swing.JPanel empleado_panel;
    private javax.swing.JLabel fechaNacimiento_txt;
    private javax.swing.JComboBox<String> identidades_cb;
    private javax.swing.JPanel infoCiviles_panel;
    private javax.swing.JTable infoCiviles_table;
    private javax.swing.JLabel infoCiviles_txt;
    private javax.swing.JButton ingresar_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel login_txt;
    private javax.swing.JPanel modCiviles_panel;
    private javax.swing.JTextField nombreCompleto_field;
    private javax.swing.JLabel nombreCompleto_txt;
    private javax.swing.JLabel nombreEmpleado_txt;
    private javax.swing.JTextField nombre_field;
    private javax.swing.JLabel nombre_txt;
    private javax.swing.JLabel sexo_txt;
    private javax.swing.JTable tramitesCiviles_table;
    private javax.swing.JLabel tramites_txt;
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
