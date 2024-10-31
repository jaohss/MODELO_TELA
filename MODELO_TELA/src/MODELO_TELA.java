//Importação das bibliotecas que foram usadas
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MODELO_TELA{
    public static void main(String[] agrs){
        //Definição das configurações do Frame
        JFrame frame = new JFrame("Futebol Top");//Instanciando o objeto
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new BorderLayout());

        //Definição das configurações do Label e TextField
        JLabel label1 = new JLabel("Digite o clube desejado");//Instanciando o objeto
        JTextField textfield1 = new JTextField(15);

        //Definição das configurações do Panel para colocar o TextField e o Label
        JPanel topPanel = new JPanel();//Instanciando o objeto
        topPanel.setLayout(new FlowLayout());
        topPanel.add(label1);
        topPanel.add(textfield1);

        //Instanciando os botões e seu conteúdo interno
        JButton botao1 = new JButton("Adicionar");
        JButton botao2 = new JButton("Remover");
        JButton botao3 = new JButton("Modificar");

        //Definição das configurações de outro Panel para colocar os botões
        JPanel buttonPanel = new JPanel();//Instanciando o objeto
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(botao1);
        buttonPanel.add(botao2);
        buttonPanel.add(botao3);

        //Adicionando todas as informações referentes do Panel dentro do frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}