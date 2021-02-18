public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        Finance fin = new Finance();
        HrPromotions hr = new HrPromotions();

        fin.calcIncomeTaxForCurrentYear(emp);
        hr.isPromotionDueThisYear(emp);
    }
}
