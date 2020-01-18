

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Worker worker1 = new Worker("Ania", "Luty");
            Worker worker2 = new Worker("Piotr", "Luty");
            Worker worker3 = new Worker("Ola", "Marzec");
            Worker worker4 = new Worker("Ola", "Kwiecien");
            Worker worker5 = new Worker("Karol", "Maj");

            Worker[] workers = {worker1, worker2, worker3, worker4, worker5};

            System.out.println("Podaj imie albo miesiac urodzenia, osob ktore chcesz wyszukac: ");

            Scanner in = new Scanner(System.in);
            String text = in.next();
            System.out.println("Szukasz : " + text);
            in.close();

            for (Worker pracownik : workers) {
                if( text.equals(pracownik.getName()) || text.equals(pracownik.getMonthOfBirth())){
                    System.out.println("Znalazlem pracownika o imieniu: " + pracownik.getName() + " urodzonego w miesiacu: " + pracownik.getMonthOfBirth());
                }
            }
        }

    }

