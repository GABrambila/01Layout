import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutTXT extends JDialog{
    private JComboBox comboBOX;
    private JButton btnExibir;
    private JTextArea txtArea;
    public JPanel Jpanel;

    public LayoutTXT(Frame parent) {
        super(parent);
        setTitle("EX01");
        setContentPane(Jpanel);
        setMinimumSize(new Dimension(500, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    comboBOX.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         String valor = comboBOX.getSelectedItem().toString();


        }
    });
        btnExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = comboBOX.getSelectedItem().toString();
                if (comboBOX.equals ("1. Polimorfismo")) {
                    txtArea.setText(" Polimorfismo é um conceito na programação orientada a objetos que permite que um objeto possa ser tratado de várias formas diferentes, dependendo do contexto em que é usado. Isso significa que um objeto de uma classe específica pode ser referenciado usando um tipo mais genérico, e ainda assim chamar métodos específicos da sua classe original. O polimorfismo ajuda a criar um código mais flexível e reutilizável, permitindo que diferentes objetos possam responder de maneira adequada a uma mesma mensagem ou chamada de método. ");
                } else {
                    if (comboBOX.equals ("2. Herança")) {
                        txtArea.setText("Herança é um dos princípios fundamentais da programação orientada a objetos. Ela permite que uma classe herde características (atributos e métodos) de outra classe, chamada classe base ou superclasse. A classe que herda essas características é chamada de classe derivada ou subclasse. A herança permite a reutilização de código e estabelece uma relação de especialização entre as classes, onde a subclasse herda os atributos e comportamentos da superclasse e pode adicionar novos atributos e comportamentos específicos.");
                    } else {
                        if (comboBOX.equals ("3. Encapsulamento")) {
                            txtArea.setText("Encapsulamento é um princípio da programação orientada a objetos que combina dados e os métodos que operam nesses dados em uma única unidade, chamada classe. Ele busca esconder os detalhes internos da implementação de uma classe e expor apenas uma interface pública consistente para interagir com ela. Isso significa que os atributos de uma classe são declarados como privados, acessíveis apenas dentro da própria classe, e métodos públicos são fornecidos para interagir com esses atributos. O encapsulamento promove a segurança, a modularidade e a organização do código.");
                        } else {
                            if (comboBOX.equals ("3. Encapsulamento")) {
                                txtArea.setText("Sobrecarga, também conhecida como overload, refere-se à capacidade de uma classe ter vários métodos com o mesmo nome, mas com diferentes parâmetros. Isso permite que um método tenha comportamentos diferentes dependendo dos argumentos passados para ele. A sobrecarga de métodos permite que um programa trate diferentes situações ou tipos de dados de forma adequada, executando a versão correta do método com base nos argumentos fornecidos. A sobrecarga de operadores também é possível, onde operadores como +, -, * podem ser sobrecarregados para realizar diferentes ações com base nos operandos utilizados");
                            }
                        }
                    }
                }
            }
        });

        setVisible(true);
    }
}
