package projectorapp;

/**
 * ProjectorAppWindow
 * 
 * @author marzin
 * @version 0.1
 */

public class ConfigurationWindow extends javax.swing.JFrame
{
    /**
     * Creates new form NewJFrame
     */
    
    public ConfigurationWindow() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type_Group = new javax.swing.ButtonGroup();
        connection_Group = new javax.swing.ButtonGroup();
        config_Panel = new javax.swing.JPanel();
        config_Label = new javax.swing.JLabel();
        config_Scroll = new javax.swing.JScrollPane();
        config_List = new javax.swing.JList();
        add_Button = new javax.swing.JButton();
        remove_Button = new javax.swing.JButton();
        reload_Button = new javax.swing.JButton();
        info_Panel = new javax.swing.JPanel();
        info_Label = new javax.swing.JLabel();
        name_Label = new javax.swing.JLabel();
        name_TextField = new javax.swing.JTextField();
        type_Label = new javax.swing.JLabel();
        type_Button1 = new javax.swing.JRadioButton();
        type_Button2 = new javax.swing.JRadioButton();
        make_Label = new javax.swing.JLabel();
        make_ComboBox = new javax.swing.JComboBox();
        model_Label = new javax.swing.JLabel();
        model_ComboBox = new javax.swing.JComboBox();
        settings_Label = new javax.swing.JLabel();
        ip_TextField1 = new javax.swing.JTextField();
        ip_TextField2 = new javax.swing.JTextField();
        ip_TextField3 = new javax.swing.JTextField();
        ip_TextField4 = new javax.swing.JTextField();
        dot_Label1 = new javax.swing.JLabel();
        dot_Label2 = new javax.swing.JLabel();
        dot_Label3 = new javax.swing.JLabel();
        or_Label = new javax.swing.JLabel();
        speed_ComboBox = new javax.swing.JComboBox();
        dataBits_ComboBox = new javax.swing.JComboBox();
        parity_ComboBox = new javax.swing.JComboBox();
        stopBits_ComboBox = new javax.swing.JComboBox();
        connection_Button1 = new javax.swing.JRadioButton();
        connection_Button2 = new javax.swing.JRadioButton();
        tec_Panel = new javax.swing.JPanel();
        tec_Label = new javax.swing.JLabel();
        tec_CheckBox = new javax.swing.JCheckBox();
        button_Panel = new javax.swing.JPanel();
        save_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();
        run_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuration Editor");

        config_Label.setText("Configuration:");

        config_List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        config_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                config_ListValueChanged(evt);
            }
        });
        config_Scroll.setViewportView(config_List);
        config_List.setSelectedIndex(0);

        add_Button.setText("+");
        add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ButtonActionPerformed(evt);
            }
        });

        remove_Button.setText("-");
        remove_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_ButtonActionPerformed(evt);
            }
        });

        reload_Button.setText("ReRead");

        org.jdesktop.layout.GroupLayout config_PanelLayout = new org.jdesktop.layout.GroupLayout(config_Panel);
        config_Panel.setLayout(config_PanelLayout);
        config_PanelLayout.setHorizontalGroup(
            config_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(config_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(config_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(config_Scroll)
                    .add(config_PanelLayout.createSequentialGroup()
                        .add(add_Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(remove_Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 50, Short.MAX_VALUE)
                        .add(reload_Button))
                    .add(config_PanelLayout.createSequentialGroup()
                        .add(config_Label)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        config_PanelLayout.setVerticalGroup(
            config_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(config_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(config_Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(config_Scroll, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 319, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(config_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(remove_Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(reload_Button)
                    .add(add_Button, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reload_Button.setEnabled(false);

        info_Label.setText("Details:");

        name_Label.setText("Name:");

        type_Label.setText("Type:");

        type_Group.add(type_Button1);
        type_Button1.setText("Projector");

        type_Group.add(type_Button2);
        type_Button2.setText("Television");

        make_Label.setText("Make:");

        make_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        model_Label.setText("Model:");

        model_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        settings_Label.setText("Connection Settings:");

        ip_TextField1.setText("xxx");

        ip_TextField2.setText("xxx");

        ip_TextField3.setText("xxx");

        ip_TextField4.setText("xxx");

        dot_Label1.setText(".");

        dot_Label2.setText(".");

        dot_Label3.setText(".");

        or_Label.setText("or");

        speed_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(projectorapp.Serial.getSpeeds()));

        dataBits_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(projectorapp.Serial.getDataBits()));

        parity_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(projectorapp.Serial.getParity()));

        stopBits_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(projectorapp.Serial.getStopBits()));

        connection_Group.add(connection_Button1);
        connection_Button1.setSelected(true);
        connection_Button1.setText("IP Address:");
        connection_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connection_Button1ActionPerformed(evt);
            }
        });

        connection_Group.add(connection_Button2);
        connection_Button2.setText("Serial:");
        connection_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connection_Button2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout info_PanelLayout = new org.jdesktop.layout.GroupLayout(info_Panel);
        info_Panel.setLayout(info_PanelLayout);
        info_PanelLayout.setHorizontalGroup(
            info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(info_PanelLayout.createSequentialGroup()
                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(info_PanelLayout.createSequentialGroup()
                        .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(info_PanelLayout.createSequentialGroup()
                                .add(112, 112, 112)
                                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(or_Label)
                                    .add(info_PanelLayout.createSequentialGroup()
                                        .add(ip_TextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(dot_Label1)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(ip_TextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(dot_Label2)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(ip_TextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(dot_Label3))
                            .add(info_PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(info_Label)
                                    .add(info_PanelLayout.createSequentialGroup()
                                        .add(6, 6, 6)
                                        .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                                .add(info_PanelLayout.createSequentialGroup()
                                                    .add(model_Label)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                    .add(model_ComboBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .add(info_PanelLayout.createSequentialGroup()
                                                    .add(name_Label)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                    .add(name_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                .add(info_PanelLayout.createSequentialGroup()
                                                    .add(type_Label)
                                                    .add(18, 18, 18)
                                                    .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                        .add(type_Button2)
                                                        .add(type_Button1)))
                                                .add(info_PanelLayout.createSequentialGroup()
                                                    .add(make_Label)
                                                    .add(18, 18, 18)
                                                    .add(make_ComboBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .add(settings_Label)
                                            .add(connection_Button1)
                                            .add(connection_Button2))))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(ip_TextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(info_PanelLayout.createSequentialGroup()
                        .add(86, 86, 86)
                        .add(speed_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(dataBits_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(parity_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(stopBits_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        info_PanelLayout.setVerticalGroup(
            info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, info_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(info_Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(name_Label)
                    .add(name_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(type_Label)
                    .add(type_Button1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(type_Button2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(make_Label)
                    .add(make_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(model_Label)
                    .add(model_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(settings_Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ip_TextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(dot_Label1)
                    .add(ip_TextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(dot_Label2)
                    .add(ip_TextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ip_TextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(dot_Label3)
                    .add(connection_Button1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(or_Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(connection_Button2)
                    .add(info_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(speed_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(dataBits_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(parity_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(stopBits_ComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        //Disable the Serial ComboBox's
        speed_ComboBox.setEnabled(false);
        dataBits_ComboBox.setEnabled(false);
        parity_ComboBox.setEnabled(false);
        stopBits_ComboBox.setEnabled(false);

        tec_Label.setText("TEC Classroom:");

        tec_CheckBox.setText(" ");

        org.jdesktop.layout.GroupLayout tec_PanelLayout = new org.jdesktop.layout.GroupLayout(tec_Panel);
        tec_Panel.setLayout(tec_PanelLayout);
        tec_PanelLayout.setHorizontalGroup(
            tec_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tec_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(tec_Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tec_CheckBox)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tec_PanelLayout.setVerticalGroup(
            tec_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tec_PanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(tec_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tec_Label)
                    .add(tec_CheckBox))
                .addContainerGap())
        );

        save_Button.setText("Save");
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });

        cancel_Button.setText("Cancel");
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });

        run_Button.setText("RUN!!");
        run_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run_ButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout button_PanelLayout = new org.jdesktop.layout.GroupLayout(button_Panel);
        button_Panel.setLayout(button_PanelLayout);
        button_PanelLayout.setHorizontalGroup(
            button_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(button_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(button_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(button_PanelLayout.createSequentialGroup()
                        .add(save_Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33)
                        .add(cancel_Button)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(run_Button, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        button_PanelLayout.setVerticalGroup(
            button_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(button_PanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(button_PanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(save_Button)
                    .add(cancel_Button))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(run_Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(config_Panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(tec_Panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(73, 73, 73)
                        .add(button_Panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(info_Panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(config_Panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(info_Panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tec_Panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(button_Panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(16, 16, 16)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_ButtonActionPerformed

    private void remove_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remove_ButtonActionPerformed

    private void connection_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connection_Button1ActionPerformed
        //Disable the Serial ComboBox's
        speed_ComboBox.setEnabled(false);
        dataBits_ComboBox.setEnabled(false);
        parity_ComboBox.setEnabled(false);
        stopBits_ComboBox.setEnabled(false);
        //Enable the IP TextFields
        ip_TextField1.setEnabled(true);
        ip_TextField1.setEditable(true);
        ip_TextField2.setEnabled(true);
        ip_TextField2.setEditable(true);
        ip_TextField3.setEnabled(true);
        ip_TextField3.setEditable(true);
        ip_TextField4.setEnabled(true);
        ip_TextField4.setEditable(true);
    }//GEN-LAST:event_connection_Button1ActionPerformed

    private void connection_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connection_Button2ActionPerformed
        //Disable the IP TextFields
        ip_TextField1.setEnabled(false);
        ip_TextField1.setEditable(false);
        ip_TextField2.setEnabled(false);
        ip_TextField2.setEditable(false);
        ip_TextField3.setEnabled(false);
        ip_TextField3.setEditable(false);
        ip_TextField4.setEnabled(false);
        ip_TextField4.setEditable(false);
        //Enable the Serial ComboBox's
        speed_ComboBox.setEnabled(true);
        dataBits_ComboBox.setEnabled(true);
        parity_ComboBox.setEnabled(true);
        stopBits_ComboBox.setEnabled(true);
    }//GEN-LAST:event_connection_Button2ActionPerformed

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    private void run_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run_ButtonActionPerformed

    private void config_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_config_ListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_config_ListValueChanged

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
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurationWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_Button;
    private javax.swing.JPanel button_Panel;
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLabel config_Label;
    private javax.swing.JList config_List;
    private javax.swing.JPanel config_Panel;
    private javax.swing.JScrollPane config_Scroll;
    private javax.swing.JRadioButton connection_Button1;
    private javax.swing.JRadioButton connection_Button2;
    private javax.swing.ButtonGroup connection_Group;
    private javax.swing.JComboBox dataBits_ComboBox;
    private javax.swing.JLabel dot_Label1;
    private javax.swing.JLabel dot_Label2;
    private javax.swing.JLabel dot_Label3;
    private javax.swing.JLabel info_Label;
    private javax.swing.JPanel info_Panel;
    private javax.swing.JTextField ip_TextField1;
    private javax.swing.JTextField ip_TextField2;
    private javax.swing.JTextField ip_TextField3;
    private javax.swing.JTextField ip_TextField4;
    private javax.swing.JComboBox make_ComboBox;
    private javax.swing.JLabel make_Label;
    private javax.swing.JComboBox model_ComboBox;
    private javax.swing.JLabel model_Label;
    private javax.swing.JLabel name_Label;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JLabel or_Label;
    private javax.swing.JComboBox parity_ComboBox;
    private javax.swing.JButton reload_Button;
    private javax.swing.JButton remove_Button;
    private javax.swing.JButton run_Button;
    private javax.swing.JButton save_Button;
    private javax.swing.JLabel settings_Label;
    private javax.swing.JComboBox speed_ComboBox;
    private javax.swing.JComboBox stopBits_ComboBox;
    private javax.swing.JCheckBox tec_CheckBox;
    private javax.swing.JLabel tec_Label;
    private javax.swing.JPanel tec_Panel;
    private javax.swing.JRadioButton type_Button1;
    private javax.swing.JRadioButton type_Button2;
    private javax.swing.ButtonGroup type_Group;
    private javax.swing.JLabel type_Label;
    // End of variables declaration//GEN-END:variables
}