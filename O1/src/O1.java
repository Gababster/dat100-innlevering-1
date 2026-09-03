public class O1 {
    public static void main(String[] args) {
        int brutto = 1000000;
        double trinn1 = 0;
        double trinn2 = 0;
        double trinn3 = 0;
        double trinn4 = 0;
        double trinn5 = 0;
//Trinn 1
        if (brutto < 226101) {
            trinn1 = 0;
        } else {
            trinn1 = (brutto - 226100) * 0.017;
        }

        if (brutto > 318300) {
            trinn1 = (318300 - 226100) * 0.017;
//Trinn 2
            trinn2 = (brutto - 318300) * 0.04;}

            if (brutto > 725050) {
                trinn2 = (725050 - 318300) * 0.04;
//Trinn 3
                trinn3 = (brutto - 725050) * 0.137;
            }

                if (brutto > 980100) {
                    trinn3 = (980100 - 725050) * 0.137;
//Trinn 4
                    trinn4 = (brutto - 980100) * 0.168;
                }

                    if (brutto > 1467200) {
                        trinn4 = (1467200 - 980100) * 0.168;
//Trinn 5
                        trinn5 = (brutto - 1467200) * 0.178;
                    }
                System.out.println("Trinn 1 skatt er " + (float)trinn1 + "kr");
                System.out.println("Trinn 2 skatt er " + (float)trinn2 + "kr");
                System.out.println("Trinn 3 skatt er " + (float)trinn3 + "kr");
                System.out.println("Trinn 4 skatt er " + (float)trinn4 + "kr");
                System.out.println("Trinn 5 skatt er " + (float)trinn5 + "kr");
                double sum = trinn1 + trinn2 + trinn3 + trinn4 + trinn5;
                System.out.println("Sum Trinnskatt er " + (float)sum + "kr");
            }
        }


