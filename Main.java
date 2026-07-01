public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        Pokemon pokemon1 =
                new Pokemon("Charmander", 30, 8, 10, true);

        Pokemon pokemon2 =
                new Pokemon("Squirtle", 35, 6, 10, true);

        while (pokemon1.isAlive() &&
               pokemon2.isAlive()) {



            if (pokemon1.useEnergy()) {

                System.out.println(pokemon1.name + " attacks!");

                pokemon2.takeDamage(pokemon1.attack);

                System.out.println(pokemon2.name +
                        " Defense: " + pokemon2.defense);

                System.out.println(pokemon1.name +
                        " Energy: " + pokemon1.energy);

            } else {

                System.out.println(pokemon1.name +
                        " does not have enough energy!");

            }

            Thread.sleep(2000);

            if (!pokemon2.isAlive()) {

                System.out.println();
                System.out.println(pokemon2.name +
                        " has no defense remaining!");
                System.out.println(pokemon1.name +
                        " wins!");

                break;
            }


            if (pokemon2.useEnergy()) {

                System.out.println(pokemon2.name + " attacks!");

                pokemon1.takeDamage(pokemon2.attack);

                System.out.println(pokemon1.name +
                        " Defense: " + pokemon1.defense);

                System.out.println(pokemon2.name +
                        " Energy: " + pokemon2.energy);

            } else {

                System.out.println(pokemon2.name +
                        " does not have enough energy!");

            }

            Thread.sleep(2000);
        }

        System.out.println();
        System.out.println("Battle Over!");

    }
}