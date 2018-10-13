package gui;

import gui.DialogAcerca;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import logica.DBContactos;
import logica.Contacto;
import logicacitas.DBCitas;
import logicacitas.Citas;
import javax.swing.table.DefaultTableModel;

public class FormAgenda implements ActionListener{
    JFrame frame;
    JPanel panel;
    JMenuBar menuBar;
    JMenu menu, subMenu;
    JMenuItem menuItem;
    JScrollPane scrollPanel,scrollPanel2;
    DefaultTableModel modeloTabla, modeloTablaCita;
    JTable tablaContactos, tablaCitas;
    JTabbedPane pestana;
    Container panelInformacion,panelCitas;
    JLabel labelId,labelNombre,labelApellido,labelTelefonoDomicilio,
    labelTelefonoOficina,labelDireccionDomicilio,labelDireccionOficina,
    labelCelular,labelCorreo;
    
    JLabel labelIdCita,labelPersona,labelLugar,labelFecha,labelHora, labelDescripcion;
        
    JTextField textId,textNombre,textApellido,textTelefonoDomicilio,textTelefonoOficina,
    textDireccionDomicilio,textDireccionOficina,textCelular,textCorreo;
    
    JTextField textIdCita,textPersona, textLugar, textFecha,textHora;
    JTextArea textDescripcion;    
    
    JButton botonNuevoContacto,botonGuardarContacto,botonEditarContacto,botonBorrarContacto;

    JButton botonNuevaCita,botonGuardarCita,botonEditarCita,botonBorrarCita;
    
    DBContactos dbc = new DBContactos();
    DBCitas dbcitas = new DBCitas();
    Citas[] citas;
    Contacto[] contactos;
    int estado=0;
    int fila;
    
    public FormAgenda() {
        initComponents();
    }

    public void initComponents(){
        frame = new JFrame("Agenda de Contactos");
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("Opciones");
        menuBar.add(menu);
        menuItem = new JMenuItem("Acerca de ...");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem = new JMenuItem("Salir");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem = new JMenuItem("Borrar");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menu = new JMenu("Tablas");
        menuBar.add(menu);
        menuItem = new JMenuItem("Contactos");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem = new JMenuItem("Citas");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        panelInformacion = new JPanel(null);
        panelInformacion.setLayout(null);
        panelCitas = new JPanel(null);
        panelCitas.setLayout(null);
        pestana = new JTabbedPane();
        pestana.addTab("Información de contacto", panelInformacion);
        pestana.addTab("Citas",panelCitas);

        int y = 5;
        int x = 10;
        int labelAncho = 150;
        int labelAlto = 20;
        int textAncho = 200;
        int textAlto = 20;

        labelId = new JLabel("Id");
        labelId.setBounds(x,y,20,20);
        panelInformacion.add(labelId);
        
        textId = new JTextField();
        textId.setBounds(x+30,y,50,20);
        panelInformacion.add(textId);
        
        y+=30;
        labelNombre = new JLabel("Nombre",SwingConstants.RIGHT);
        labelNombre.setBounds(x,y,labelAncho,labelAlto);
        panelInformacion.add(labelNombre);

        textNombre = new JTextField();
        textNombre.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textNombre);

        labelApellido = new JLabel("Apellido",SwingConstants.RIGHT);
        labelApellido.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labelApellido);

        textApellido = new JTextField();
        textApellido.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textApellido);
        y+=30;
        labelTelefonoDomicilio = new JLabel("Telefono Domicilio",SwingConstants.RIGHT);
        labelTelefonoDomicilio.setBounds(x,y,labelAncho,labelAlto);
        panelInformacion.add(labelTelefonoDomicilio);

        textTelefonoDomicilio = new JTextField();
        textTelefonoDomicilio.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textTelefonoDomicilio);

        labelTelefonoOficina = new JLabel("Telefono Oficina",SwingConstants.RIGHT);
        labelTelefonoOficina.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labelTelefonoOficina);

        textTelefonoOficina = new JTextField();
        textTelefonoOficina.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textTelefonoOficina);

        y+=30;
        labelDireccionDomicilio = new JLabel("Dirreción Domicilio",SwingConstants.RIGHT);
        labelDireccionDomicilio.setBounds(x,y,labelAncho,labelAlto);
        panelInformacion.add(labelDireccionDomicilio);

        textDireccionDomicilio = new JTextField();
        textDireccionDomicilio.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textDireccionDomicilio);

        labelDireccionOficina = new JLabel("Dirección Oficina",SwingConstants.RIGHT);
        labelDireccionOficina.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labelDireccionOficina);

        textDireccionOficina = new JTextField();
        textDireccionOficina.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textDireccionOficina);

        y+=30;
        labelCelular = new JLabel("Celular",SwingConstants.RIGHT);
        labelCelular.setBounds(x,y,labelAncho,labelAlto);
        panelInformacion.add(labelCelular);

        textCelular = new JTextField();
        textCelular.setBounds(x+160,y,textAncho,textAlto);
        panelInformacion.add(textCelular);

        labelCorreo = new JLabel("Correo",SwingConstants.RIGHT);
        labelCorreo.setBounds(x+350,y,labelAncho,labelAlto);
        panelInformacion.add(labelCorreo);

        textCorreo = new JTextField();
        textCorreo.setBounds(x+510,y,textAncho,textAlto);
        panelInformacion.add(textCorreo);

        y+=60;
        botonNuevoContacto = new JButton("Nuevo Contacto");
        botonNuevoContacto.setBounds(x,y,labelAncho,50);
        panelInformacion.add(botonNuevoContacto);
        botonNuevoContacto.addActionListener(this);

        botonGuardarContacto = new JButton("Guardar Contacto");
        botonGuardarContacto.setBounds(x+200,y,labelAncho,50);
        panelInformacion.add(botonGuardarContacto);
        botonGuardarContacto.addActionListener(this);
        botonEditarContacto = new JButton("Editar Contacto");
        botonEditarContacto.setBounds(x+400,y,labelAncho,50);
        panelInformacion.add(botonEditarContacto);
        botonEditarContacto.addActionListener(this);

        botonBorrarContacto = new JButton("Borrar Contacto");
        botonBorrarContacto.setBounds(x+600,y,labelAncho,50);
        panelInformacion.add(botonBorrarContacto);
        botonBorrarContacto.addActionListener(this);

        contactos = dbc.getContactos();
        Object[][] data = new Object[contactos.length][5];
        for (int c=0;c<contactos.length;c++){
        data[c][0]=contactos[c].getId();
        data[c][1]=contactos[c].getNombre();
        data[c][2]=contactos[c].getApellido();
        data[c][3]=contactos[c].getCelular();
        data[c][4]=contactos[c].getCorreo();
                
        /* PESTAÑA CITAS*/
        citas = dbcitas.getCitas();
        Object[][] datacitas = new Object[citas.length][5];         
        for (int i=0;i<citas.length;i++){
        datacitas[i][0]=citas[i].getId();
        datacitas[i][1]=citas[i].getPersona();
        datacitas[i][2]=citas[i].getLugar();
        datacitas[i][3]=citas[i].getFecha();
        datacitas[i][4]=citas[i].getHora();
        
        y=5;
        labelIdCita = new JLabel("Id");
        labelIdCita.setBounds(x,y,20,20);
        panelCitas.add(labelIdCita);
        
        textIdCita = new JTextField();
        textIdCita.setBounds(x+30,y,50,20);
        panelCitas.add(textIdCita);
        
        y+=30;
        labelPersona = new JLabel("Persona",SwingConstants.RIGHT);
        labelPersona.setBounds(x,y,labelAncho,labelAlto);
        panelCitas.add(labelPersona);

        textPersona = new JTextField();
        textPersona.setBounds(x+160,y,textAncho,textAlto);
        panelCitas.add(textPersona);
        
        labelLugar = new JLabel("Lugar",SwingConstants.RIGHT);
        labelLugar.setBounds(x+350,y,labelAncho,labelAlto);
        panelCitas.add(labelLugar);

        textLugar = new JTextField();
        textLugar.setBounds(x+510,y,textAncho,textAlto);
        panelCitas.add(textLugar);
        
        y+=30;
        
        labelFecha = new JLabel("Fecha",SwingConstants.RIGHT);
        labelFecha.setBounds(x,y,labelAncho,labelAlto);
        panelCitas.add(labelFecha);

        textFecha = new JTextField();
        textFecha.setBounds(x+160,y,textAncho,textAlto);
        panelCitas.add(textFecha);
        
        labelHora = new JLabel("Hora",SwingConstants.RIGHT);
        labelHora.setBounds(x+350,y,labelAncho,labelAlto);
        panelCitas.add(labelHora);

        textHora = new JTextField();
        textHora.setBounds(x+510,y,textAncho,textAlto);
        panelCitas.add(textHora);
        
        y+=30;

        labelDescripcion = new JLabel("Descripción",SwingConstants.RIGHT);
        labelDescripcion.setBounds(x,y,labelAncho,labelAlto);
        panelCitas.add(labelDescripcion);

        textDescripcion = new JTextArea();
        textDescripcion.setBounds(x+160,y,textAncho+350,textAlto+30);
        panelCitas.add(textDescripcion);
        
        y+=80;
        botonNuevaCita = new JButton("Nueva Cita");
        botonNuevaCita.setBounds(x,y,labelAncho,50);
        panelCitas.add(botonNuevaCita);
        botonNuevaCita.addActionListener(this);

        botonGuardarCita = new JButton("Guardar Cita");
        botonGuardarCita.setBounds(x+200,y,labelAncho,50);
        panelCitas.add(botonGuardarCita);
        botonGuardarCita.addActionListener(this);
        
        botonEditarCita = new JButton("Editar Cita");
        botonEditarCita.setBounds(x+400,y,labelAncho,50);
        panelCitas.add(botonEditarCita);
        botonEditarCita.addActionListener(this);

        botonBorrarCita = new JButton("Borrar Cita");
        botonBorrarCita.setBounds(x+600,y,labelAncho,50);
        panelCitas.add(botonBorrarCita);
        botonBorrarCita.addActionListener(this);
        
        
        
    }

    /*Contactos*/
    String[] columNames = {"id","nombres","apellidos","celular","correo"};
   
    modeloTabla= new DefaultTableModel(data, columNames);

    tablaContactos = new JTable(modeloTabla);
    tablaContactos.setPreferredScrollableViewportSize(new Dimension(1500, 150));

    scrollPanel = new JScrollPane(tablaContactos);
    
    /*Citas*/
    String[] columNamesCitas = {"id","Persona","Lugar","Fecha","Hora"};
    
    modeloTablaCita= new DefaultTableModel(datacitas, columNamesCitas);

    tablaCitas = new JTable(modeloTablaCita);
    tablaCitas.setPreferredScrollableViewportSize(new Dimension(500, 150));

    scrollPanel = new JScrollPane(tablaCitas);
    
    
    
    
    

    tablaContactos.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            fila = tablaContactos.rowAtPoint(e.getPoint());
            int columna = tablaContactos.columnAtPoint(e.getPoint());
            if ((fila > -1) && (columna > -1)){
                textId.setText(String.valueOf(tablaContactos.getValueAt(fila,0)));
                for(int i=0;i<contactos.length;i++){
                    if(String.valueOf(contactos[i].getId()).equals(
                    String.valueOf(tablaContactos.getValueAt(fila, 0)))){
                    textNombre.setText(contactos[i].getNombre());
                    textApellido.setText(contactos[i].getApellido());
                    textTelefonoDomicilio.setText(contactos[i].getTelefonoDomicilio());
                    textTelefonoOficina.setText(contactos[i].getTelefonoOficina());
                    textDireccionDomicilio.setText(contactos[i].getDireccionResidencia());
                    textDireccionOficina.setText(contactos[i].getDireccionTrabajo());
                    textCelular.setText(contactos[i].getCelular());
                    textCorreo.setText(contactos[i].getCorreo());
                    }

                }
                estado = 2;
                alterarEstado();
            }   
        }
    });

    /* Cita */
    tablaCitas.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            fila = tablaCitas.rowAtPoint(e.getPoint());
            int columna = tablaCitas.columnAtPoint(e.getPoint());
            if ((fila > -1) && (columna > -1)){
                textIdCita.setText(String.valueOf(tablaCitas.getValueAt(fila,0)));
                for(int i=0;i<citas.length;i++){
                    if(String.valueOf(citas[i].getId()).equals(
                    String.valueOf(tablaCitas.getValueAt(fila, 0)))){
                    /*textPersona.setText(citas[i].getPersona());*/
                    textLugar.setText(citas[i].getLugar());
                    /*textFecha.setText(citas[i].getFecha());
                    textHora.setText(citas[i].getHora());*/
                    textDescripcion.setText(citas[i].getDescripcion());
                    
                    }

                }
                estado = 2;
                alterarEstadoCita();
            }   
        }
    });
    
    
    
    frame.getContentPane().add(scrollPanel,BorderLayout.NORTH);
    frame.getContentPane().add(pestana,BorderLayout.CENTER);

    frame.pack();
    frame.setSize(800, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    JFrame.setDefaultLookAndFeelDecorated(true);

    frame.setVisible(true);

    alterarEstado();
    }

    alterarEstadoCita();
    }
    public void alterarEstado(){
        switch(this.estado){
            case 0://estado por defecto
                botonNuevoContacto.setEnabled(true);
                botonBorrarContacto.setEnabled(false);
                botonEditarContacto.setEnabled(false);
                botonGuardarContacto.setEnabled(false);
                textId.setEditable(false);
                textNombre.setEditable(false);
                textApellido.setEditable(false);
                textTelefonoDomicilio.setEditable(false);
                textTelefonoOficina.setEditable(false);
                textDireccionDomicilio.setEditable(false);
                textDireccionOficina.setEditable(false);
                textCorreo.setEditable(false);
                textCelular.setEditable(false);
                break;
            case 1://estado para un nuevo contacto
                botonNuevoContacto.setEnabled(false);
                botonBorrarContacto.setEnabled(false);
                botonEditarContacto.setEnabled(false);
                botonGuardarContacto.setEnabled(true);
                textId.setEditable(false);
                textNombre.setEditable(true);
                textApellido.setEditable(true);
                textTelefonoDomicilio.setEditable(true);
                textTelefonoOficina.setEditable(true);
                textDireccionDomicilio.setEditable(true);
                textDireccionOficina.setEditable(true);
                textCorreo.setEditable(true);
                textCelular.setEditable(true);
                break;
            case 2://estado de carga de un contacto
                botonNuevoContacto.setEnabled(false);
                botonBorrarContacto.setEnabled(true);
                botonEditarContacto.setEnabled(true);
                botonGuardarContacto.setEnabled(false);
                textId.setEditable(false);
                textNombre.setEditable(false);
                textApellido.setEditable(false);
                textTelefonoDomicilio.setEditable(false);
                textTelefonoOficina.setEditable(false);
                textDireccionDomicilio.setEditable(false);
                textDireccionOficina.setEditable(false);
                textCorreo.setEditable(false);
                textCelular.setEditable(false);
                break;
            case 3://estado para editar un contacto
                botonNuevoContacto.setEnabled(false);
                botonBorrarContacto.setEnabled(false);
                botonEditarContacto.setEnabled(false);
                botonGuardarContacto.setEnabled(true);
                textId.setEditable(false);
                textNombre.setEditable(true);
                textApellido.setEditable(true);
                textTelefonoDomicilio.setEditable(true);
                textTelefonoOficina.setEditable(true);
                textDireccionDomicilio.setEditable(true);
                textDireccionOficina.setEditable(true);
                textCorreo.setEditable(true);
                textCelular.setEditable(true);
            break;
        }
    }
    
    /* Citas */
    public void alterarEstadoCita(){
        switch(this.estado){
            case 0://estado por defecto
                botonNuevaCita.setEnabled(true);
                botonBorrarCita.setEnabled(false);
                botonEditarCita.setEnabled(false);
                botonGuardarCita.setEnabled(false);
                textIdCita.setEditable(false);
                textPersona.setEditable(false);
                textLugar.setEditable(false);
                textFecha.setEditable(false);
                textHora.setEditable(false);
                textDescripcion.setEditable(false);
                
                break;
            case 1://estado para un nuevo contacto
                botonNuevaCita.setEnabled(false);
                botonBorrarCita.setEnabled(false);
                botonEditarCita.setEnabled(false);
                botonGuardarCita.setEnabled(true);
                textIdCita.setEditable(false);
                textPersona.setEditable(true);
                textLugar.setEditable(true);
                textFecha.setEditable(true);
                textHora.setEditable(true);
                textDescripcion.setEditable(true);
                break;
            case 2://estado de carga de un contacto
                botonNuevaCita.setEnabled(false);
                botonBorrarCita.setEnabled(true);
                botonEditarCita.setEnabled(true);
                botonGuardarCita.setEnabled(false);
                textIdCita.setEditable(false);
                textPersona.setEditable(false);
                textLugar.setEditable(false);
                textFecha.setEditable(false);
                textHora.setEditable(false);
                textDescripcion.setEditable(false);
                break;
            case 3://estado para editar un contacto
                botonNuevaCita.setEnabled(false);
                botonBorrarCita.setEnabled(false);
                botonEditarCita.setEnabled(false);
                botonGuardarCita.setEnabled(true);
                textIdCita.setEditable(false);
                textPersona.setEditable(true);
                textLugar.setEditable(true);
                textFecha.setEditable(true);
                textHora.setEditable(true);
                textDescripcion.setEditable(true);
            break;
        }
    }
    
    public void limpiarCampos(){
        textId.setText("");
        textNombre.setText("");
        textApellido.setText("");
        textTelefonoDomicilio.setText("");
        textTelefonoOficina.setText("");
        textDireccionDomicilio.setText("");
        textDireccionOficina.setText("");
        textCorreo.setText("");
        textCelular.setText("");
    }

    public void limpiarCamposCita(){
        textIdCita.setText("");
        textPersona.setText("");
        textLugar.setText("");
        textFecha.setText("");
        textHora.setText("");
        textDescripcion.setText("");        
    }
    
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        System.out.println(accion);
        if(accion.equals("Salir")){
            System.exit(-1);
        }        
        if(accion.equals("Acerca de ...")){
            DialogAcerca a = new DialogAcerca(null,false);
            a.setVisible(true);
        }
        
        if(accion.equals("Nuevo Contacto")){
            limpiarCampos();
            this.estado=1;
        }
        if(accion.equals("Editar Contacto")){
            this.estado=3;
        }
    if(accion.equals("Guardar Contacto")){
        if(this.estado==1){
            Contacto c = new Contacto();
            c.setNombre(textNombre.getText());
            c.setApellido(textApellido.getText());
            c.setTelefonoDomicilio(textTelefonoDomicilio.getText());
            c.setTelefonoOficina(textTelefonoOficina.getText());
            c.setDireccionResidencia(textDireccionDomicilio.getText());
            c.setDireccionTrabajo(textDireccionOficina.getText());
            c.setCorreo(textCorreo.getText());
            c.setCelular(textCelular.getText());
            int r = dbc.insertarContacto(c);
            if(r>0){
                Object[] newRow={r,c.getNombre(),c.getApellido(),c.getCelular(),c.getCorreo()};
                modeloTabla.addRow(newRow);
                JOptionPane.showMessageDialog(null, "Contacto agregado");
            }
        }else if(this.estado==3){ 
            Contacto c = new Contacto();
            c.setId(Integer.parseInt(textId.getText(),10));
            c.setNombre(textNombre.getText());
            c.setApellido(textApellido.getText());
            c.setTelefonoDomicilio(textTelefonoDomicilio.getText());
            c.setTelefonoOficina(textTelefonoOficina.getText());
            c.setDireccionResidencia(textDireccionDomicilio.getText());
            c.setDireccionTrabajo(textDireccionOficina.getText());
            c.setCorreo(textCorreo.getText());
            c.setCelular(textCelular.getText());
            int r = dbc.actualizarContacto(c);
            if(r>0){
                modeloTabla.setValueAt(c.getNombre(), fila, 1);
                modeloTabla.setValueAt(c.getApellido(), fila, 2);
                modeloTabla.setValueAt(c.getCelular(), fila, 3);
                modeloTabla.setValueAt(c.getCorreo(), fila, 4);
                JOptionPane.showMessageDialog(null, "Contacto actualizado");
            }
        }
        contactos = dbc.getContactos();
        limpiarCampos();
        this.estado=0;
    }
    
    /*Cita*/
    if(accion.equals("Guardar Cita")){
        if(this.estado==1){
            Citas cts = new Citas();
            /*cts.setPersona(textPersona.getText());*/
            cts.setLugar(textLugar.getText());
            /*cts.setFecha(textFecha.getText());
            cts.setHora(textHora.getText());*/
            cts.setDescripcion(textDescripcion.getText());
            int r = dbcitas.insertarCitas(cts);
            if(r>0){
                Object[] newRow={r,cts.getPersona(),cts.getLugar(),cts.getFecha(),cts.getHora(),cts.getDescripcion()};
                modeloTablaCita.addRow(newRow);
                JOptionPane.showMessageDialog(null, "Cita agregada");
            }
        }else if(this.estado==3){ 
            Citas cts = new Citas();
            cts.setId(Integer.parseInt(textId.getText(),10));
            cts.setNombre(textPersona.getText());
            cts.setLugar(textLugar.getText());
            /*cts.setFecha(textFecha.getText());
            cts.setHora(textHora.getText());*/
            cts.setDescripcion(textDescripcion.getText());
            int r = dbcitas.actualizarCita(cts);
            if(r>0){
                modeloTablaCita.setValueAt(cts.getNombre(), fila, 1);
                modeloTablaCita.setValueAt(cts.getLugar(), fila, 2);
                modeloTablaCita.setValueAt(cts.getFecha(), fila, 3);
                modeloTablaCita.setValueAt(cts.getHora(), fila, 4);
                modeloTablaCita.setValueAt(cts.getDescripcion(), fila, 5);
                JOptionPane.showMessageDialog(null, "Cita actualizada");
            }
        }
        citas = dbcitas.getCitas();
        limpiarCamposCita();
        this.estado=0;
    }
    /*---------------------------------------------------------------*/
    /* cita */
    if(accion.equals("Borrar Cita")){
        Citas cts = new Citas();
        cts.setId(Integer.parseInt(textIdCita.getText(),10));
        int r = dbcitas.borrarCita(cts);
        if(r>0){
            modeloTablaCita.removeRow(fila);
            JOptionPane.showMessageDialog(null, "Cita borrada");
            limpiarCampos();
        }
        citas = dbcitas.getCitas();
        this.estado=0;
    }
    
    /*---------------------------------------------------------------*/
    
    if(accion.equals("Borrar Ccontacto")){
        Contacto c = new Contacto();
        c.setId(Integer.parseInt(textId.getText(),10));
        int r = dbc.borrarContacto(c);
        if(r>0){
            modeloTabla.removeRow(fila);
            JOptionPane.showMessageDialog(null, "Contacto borrado");
            limpiarCampos();
        }
        contactos = dbc.getContactos();
        this.estado=0;
    }
    alterarEstado();
    alterarEstadoCita();    
   } 
}
