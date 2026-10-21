public class DummyPlay {
    public static void main(String[] args) {
        String username = "jason";
        int score = 1000;

        System.out.println("Bienvenue dans le lab Java !");
        System.out.println("Utilisatrice : " + username);
        System.out.println("Score : " + score);

        DemoUser user = new DemoUser("Alice", 28, "admin");
        System.out.println(user);

        int total = add(10, 32);
        System.out.println("10 + 32 = " + total);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    static class DemoUser {
        private final String name;
        private final int age;
        private final String role;

        public DemoUser(String name, int age, String role) {
            this.name = name;
            this.age = age;
            this.role = role;
        }

        @Override
        public String toString() {
            return "DemoUser{name='" + name + "', age=" + age + ", role='" + role + "'}";
        }
    }
}
