public class main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // бонсуные мили

        System.out.println("Колличество миль, начисленных за купленный билет. составляет:");
        System.out.println(miles + " Бонусных миль");
    }
}
