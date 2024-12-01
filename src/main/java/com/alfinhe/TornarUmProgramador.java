package com.alfinhe;

public class TornarUmProgramador< Motivacao > {
    int exercicios;
    int horasDeEstudo;
    int linguagensDeProgramacao;
    int projetos;


    public void estudaTornarUmProgramador( ) {
        exercicios = 10;
        horasDeEstudo = 100;
        linguagensDeProgramacao = 3;
        if (exercicios > 5 && horasDeEstudo > 50 && linguagensDeProgramacao > 2 && projetos > 3) {
            System.out.println ( "Estou pronto para tornar um programador" );
        } else {
            System.out.println ( "Não estou pronto para tornar um programador" );
        }

    }

    protected void mantrFocu( int i ) {
        for (int j = 0; j < i; j++) {
            System.out.println ( "Estou focado!" );
            if (j > 5) {
                System.out.println ( "Estou muito focado!" );
            }
        }
    }

    protected void dormir( ) {
        System.out.println ( "Estou dormindo" );
        if (horasDeEstudo > 50) {
            System.out.println ( "Estou cansado" );
        } else {
            System.out.println ( "Estou descansado" );
        }


    }

    protected void terVontadedeAprenderAslinguages( ) {
        if (linguagensDeProgramacao > 2) {
            System.out.println ( "Tenho vontade de aprender mais linguagens" );
        } else {
            System.out.println ( "Não tenho vontade de aprender mais linguagens" );


    }
}





    public void motivacao( ) {
        TornarUmProgramador tornarUmProgramador = new TornarUmProgramador ( );
        System.out.println ( "Escolha uma opção: " );
        System.out.println ( "1 - Estudar" );
        System.out.println ( "2 - Fazer projetos" );
        System.out.println ( "3 - Dormir" );
        System.out.println ( "4 - Buscar participar nos projeto e evento" );
        }
        public void main( String[] args ) {
            TornarUmProgramador tornarUmProgramador = new TornarUmProgramador ( );
            tornarUmProgramador.estudaTornarUmProgramador ( );
            tornarUmProgramador.mantrFocu ( 10 );
            tornarUmProgramador.dormir ( );
            tornarUmProgramador.terVontadedeAprenderAslinguages ( );
            tornarUmProgramador.motivacao ( );


        }
    }
