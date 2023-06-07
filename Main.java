public class Main {
    static class Pokemon {
        private String name;
        private int level;

        public Pokemon(String name, int level) {
            this.name = name;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void eat() {
            System.out.println(name + " is eating.");
        }

        public void speak() {
            System.out.println(name + " says: <Pokémon sound>");
        }
    }

    static class FirePokemon extends Pokemon {
        private int attack;
        private int defence;

        public FirePokemon(String name, int level, int attack, int defence) {
            super(name, level);
            this.attack = attack;
            this.defence = defence;
        }

        @Override
        public void speak() {
            System.out.println(getName() + " says: Charizard!");
        }

        public void flameThrower() {
            System.out.println(getName() + " used Flame Thrower!");
        }
    }

    static class WaterPokemon extends Pokemon {
        private int hp;
        private int special;

        public WaterPokemon(String name, int level, int hp, int special) {
            super(name, level);
            this.hp = hp;
            this.special = special;
        }

        @Override
        public void speak() {
            System.out.println(getName() + " says: Squirtle!");
        }

        public void hydroPump() {
            System.out.println(getName() + " used Hydro Pump!");
        }
    }

    static class GrassPokemon extends Pokemon {
        private int xp;
        private int accuracy;

        public GrassPokemon(String name, int level, int xp, int accuracy) {
            super(name, level);
            this.xp = xp;
            this.accuracy = accuracy;
        }

        @Override
        public void speak() {
            System.out.println(getName() + " says: Bulbasaur!");
        }

        public void leafStorm() {
            System.out.println(getName() + " used Leaf Storm!");
        }
    }

    static class ElectricPokemon extends Pokemon {
        private int height;
        private int weight;

        public ElectricPokemon(String name, int level, int height, int weight) {
            super(name, level);
            this.height = height;
            this.weight = weight;
        }

        @Override
        public void speak() {
            System.out.println(getName() + " says: Pikachu!");git
        }

        public void thunderPunch() {
            System.out.println(getName() + " used Thunder Punch!");
        }
    }

    public static void main(String[] args) {
        FirePokemon firePokemon = new FirePokemon("Charizard", 50, 80, 70);
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 30, 100, 50);
        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 20, 60, 80);
        ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", 35, 40, 20);

        firePokemon.eat();
        firePokemon.speak();
        firePokemon.flameThrower();

        waterPokemon.eat();
        waterPokemon.speak();
        waterPokemon.hydroPump();

        grassPokemon.eat();
        grassPokemon.speak();
        grassPokemon.leafStorm();

        electricPokemon.eat();
        electricPokemon.speak();
        electricPokemon.thunderPunch();
    }
}
