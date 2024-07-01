public class SubStringExample {
    public static void main(String[] args) {

        String text = "Ana are mere!";
        System.out.println(text.length());
        System.out.println(text.indexOf("m"));
        System.out.println(text.charAt(8));

        //afiseaza "Ana" din stringul de mai sus

        String ana = text.substring(0,3);
        System.out.println(ana);
        String mere = text.substring(8,12);
        System.out.println(mere);

        String message = "La Euro 2024, România a trecut doar pentru a doua oară în istoria sa fotbalistică de faza" +
                " grupelor la un turneu final de Campionat European. Acum, în duelul din optimi cu Olanda, trebuie să" +
                " bifăm o a doua performanță istorică, dacă vrem să prindem sferturile.";

        String olanda = message.substring(message.indexOf("O"), message.indexOf("O") + 6);
        System.out.println(olanda);
     //   String olanda2 = message.substring(message.indexOf("O"), message.lastIndexOf("a"));
     //   System.out.println(olanda2);
    }
}
