package cl.system.esucomex;

import java.awt.*;
import java.awt.event.*;

class IUAritmeticaComplejos extends Frame {

	private static final long serialVersionUID = 1L;
	
	Complejo c1, c2, c3;
    Label operando1, operando2;
    TextField operando1Re, operando1Im,
            operando2Re, operando2Im, resultado;
    Button sumar, restar, multiplicar, dividir;

    public IUAritmeticaComplejos() {
        addWindowListener(
                new WindowAdapter() {

                    public void windowClosing(WindowEvent e) {
                        dispose();
                        System.exit(0);
                    }
                });
        //inicializaci�n de elementos de la ventana	
        operando1 = new Label("Operando 1 = ");
        operando2 = new Label("Operando 2 = ");
        operando1Re = new TextField("0", 3);
        operando1Im = new TextField("0", 3);
        operando2Re = new TextField("0", 3);
        operando2Im = new TextField("0", 3);
        resultado = new TextField(35);
        resultado.setEditable(false);
        sumar = new Button("Sumar");
        restar = new Button("Restar");
        multiplicar = new Button("Multiplicar");
        dividir = new Button("Dividir");

        // Incorporaci�n de elementos a la ventana 
        add(operando1);
        add(operando1Re);
        add(operando1Im);
        add(operando2);
        add(operando2Re);
        add(operando2Im);
        add(sumar);
        add(restar);
        add(multiplicar);
        add(dividir);
        add(resultado);
        setLayout(new FlowLayout());
    }
    public static void main(String args[]) {
        IUAritmeticaComplejos mainFrame = new IUAritmeticaComplejos();
        mainFrame.setSize(420, 200);
        mainFrame.setTitle("Aritm�tica de complejos");
        mainFrame.setVisible(true);
    }
    public boolean action(Event evento, Object o) {
        if (evento.target instanceof Button) {
            if (evento.target == sumar) { 
            	sumar();
            } else if (evento.target == restar) {  
            	restar();
            } else if (evento.target == multiplicar) {  
            	multiplicar();
            } else {  dividir();
            }
        }
        return true;
    }
    public void sumar() {
        inicializarOperandos();
        c3 = c1.sumar(c2);
        resultado.setText(c3.toString());
    }
    public void restar() {
        inicializarOperandos();
        c3 = c1.restar(c2);
        resultado.setText(c3.toString());
    }
    public void multiplicar() {
        inicializarOperandos();
        c3 = c1.multiplicar(c2);
        resultado.setText(c3.toString());
    }
    public void dividir() {
		inicializarOperandos();
		c3 = c1.dividir(c2);
		resultado.setText(c3.toString());
    }
    public void inicializarOperandos() {
        c1 = new Complejo(Double.parseDouble(operando1Re.getText()),
                Double.parseDouble(operando1Im.getText()));
        c1 = new Complejo(Double.parseDouble(operando2Re.getText()),
                Double.parseDouble(operando2Im.getText()));
    }
}























