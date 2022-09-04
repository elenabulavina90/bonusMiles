public class BonusMilesService {

    public int calculate(int cost) {
        cost = 10_000;
        int RUB = 20;

        int bonusRUB = cost / RUB;

        return bonusRUB;
    }
}
