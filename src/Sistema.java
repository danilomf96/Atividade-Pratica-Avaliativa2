public class Sistema {

    public static void menu() {

        System.out.println("\n----------Imoveis GDC----------");
        System.out.println("Selecione a opção:");
        System.out.println("1-Cadastrar casa.");
        System.out.println("2-Cadastrar apartamento.");
        System.out.println("3-Cadastrar terreno.");
        System.out.println("4-Listar Imoveis.");
        System.out.println("5-Excluir Imovel.");
        System.out.println("0-Sair");
        System.out.println("----INFORME A OPÇÃO----");
    }

    private static void verificarOP(int op) {
        int id;
        String proprietario;
        String local;
        int valor;
        String sobrado;
        String quintal;
        int andar;
        String face;
        String churrasqueira;
        int m2;
        
        switch (op) {
            case 1:
                cadastrarCasa();
                break;
            case 2:
                cadastrarAp();
                break;
            case 3:
                cadastrarTerreno();
                break;
            case 4:
                listarImovel();
                break;
            case 5:
                excluirImovel();
                break;
            case 0:
                System.out.println("----Programa finalizado----");
                break;
            default:
                System.out.println("Opção Invalida... \nTecle novamente.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            menu();
            op = Console.lerInt();
            verificarOP(op);
        } while (op != -0);
    }
}
