package bigestNum;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class biggestNumFrame {

    /*
     * Ich möchte ein Fenster öffnen, wo dann ein text Steht oben mit "Bitte Gebe deine Zahl ein"
     * Dann werde ich ein Button unten haben mit "Berechne", wenn man drauf drückt, dann guckt das System welche Zahl die größte Zahl ist.
     * Wenn ich hinbekomme möchte ich so ein plus feld wo ich dann die Anzahl der zahlen vermehren möchte. 
     */

    JPanel _panel; 
    JFrame _frame; 
    JButton _berechneButton;

    public biggestNumFrame(JPanel panel, JFrame frame, JButton bButton){

        _frame = frame; 
        _panel = panel; 
        _berechneButton = bButton;
        fensterErstellen();

    }

    public void fensterErstellen(){

        _frame.add(_panel);
        _frame.setTitle("The Biggest Number");
        _frame.setSize(600, 600);
        _frame.setVisible(true);

    }

}
