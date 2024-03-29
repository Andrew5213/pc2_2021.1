package pc2.lab.aula09.controller;

import pc2.lab.aula09.model.*;
import pc2.lab.aula09.model.enums.OpcoesMenuEnum;
import pc2.lab.aula09.view.BasicConsole;
import pc2.lab.aula09.view.DesenhoBoard;

import java.util.ArrayList;

public class AlessioPaint {

    private FiguraGeometrica[] vetor;
    private BasicConsole tela;
    private DesenhoBoard canvas;

    public AlessioPaint(){
        vetor= new FiguraGeometrica[5];
        tela = new BasicConsole();
        canvas = new DesenhoBoard();
    }

    public void mostrarMenu(){
        testaArrayList();
        Ponto pont1 = new Ponto(0,0);
        Ponto pont2 = new Ponto(5,6);
        Ponto pont3 = new Ponto(2,8);
        Ponto pont4 = new Ponto(4,4);

        Quadrado quadradoNovo = new Quadrado();
        Quadrado quadrado1 = new Quadrado(1);
        Quadrado quadrado2 = new Quadrado(pont1, 5);

        Retangulo rect1 = new Retangulo(1,2);
        Retangulo rect3 = new Retangulo(4,2);
        //Quadrado quadrado2 = new Quadrado(pont1, pont2, pont3,pont4);

        OpcoesMenuEnum opcao = OpcoesMenuEnum.LISTAR;

        do{
            opcao = tela.askOpcaoMenuPrincial();

            tela.showMsg("escolhi: "+ opcao+"\n\n");

            switch (opcao){
                case QUADRADO:
                    Quadrado quad = tela.askQuadrado();
                    insertFiguraGeométrica(quad, 0);
                    break;
                case RETANGULO:
                    Retangulo retangulo = new Retangulo();
                    insertFiguraGeométrica(retangulo, 1);
                    break;
                case LISTAR:
                    //Retangulo retangulo = new Retangulo();
                    //insertFiguraGeométrica(retangulo, 1);
                    for (int i = 0; i < vetor.length; i++) {
                        if(vetor[i] != null) {
                            System.out.println(vetor[i].toString());
                        }
                    }
                    break;
                case DESENHAR:
                    canvas.desenhar(vetor);
                    break;
                case SAIR:


                    break;
                default:
            }


        }while (opcao != OpcoesMenuEnum.SAIR);
    }

    public boolean insertFiguraGeométrica(FiguraGeometrica fig, int i){
        vetor[i] = fig;
        //Aqui tem um for
        // procura posição vazia
        // Se está cheio retorna False
        return true;
    }

    public void testaArrayList(){
        ArrayList lista = new ArrayList();

        lista.add(1);
        lista.add("dsdsdsd");
        lista.add(new Ponto());
        lista.add(new ArrayList());

        //Ponto p = lista.get(2);
//        Ponto p2 = (Ponto) lista.get(1);
//        Object o = lista.get(2);
//        if( o instanceof Ponto){
//            Ponto p = (Ponto) o;
//        }

        tela.showMsg("------------TESTE parametrico---------------");

        ArrayList<FiguraGeometrica> listaFig = new ArrayList();
        listaFig.add(new Quadrado());

      //  listaFig.indexOf()

        tela.showMsg("------------FIM TESTE---------------");
    }

}
