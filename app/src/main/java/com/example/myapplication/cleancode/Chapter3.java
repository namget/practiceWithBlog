package com.example.myapplication.cleancode;

public class Chapter3 {

   /* // 함수를 작게 만들어라
    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData, boolean isSuite) throws Exception {
        if (isTestPage(pageData))
            includeSetupAndTeardownPages(pageDataf isSuite);
        return pageData.getHtml();
    }

    //
    public Money calculatePay(Employee e)
            throws InvalidEmplᄋyeeType {
        switch (e.type) {
            case COMMISSIONED:
                return caleulateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }

    public abstract class Employee {
        public abstract boolean isPayday();
        public abstract Money calculatePay();
        public abstract void deliverPay(Money pay);
    }

    public interface EmployeeFactory {
        public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
    }

    public class EmployeeFactorylmpl implements EmployeeFactory {
        public Employee makeEmployee(EmployeeReco rd r) throws InvalidEmployeeType {
            switch (r.type) {
                case COMMISSIONED:
                    return new CommissionedEmployee(r);
                case HOURLY:
                    return new HourlyEmployee(r);
                case SALARIED:
                    ret니rn new SalariedEmployee(r);
                default:
                    throw new InvalidEmp 'LoyeeType! r.type);
            }
        }
    }

    Circle makeCircle(double x, double y, double radius);
    Circle makeCirele(Point center, double radius);


    public class UserValidator {
        private Cryptographer cryptographer;
        public boolean checkPassword(St ring userName, String password) {
            User user = UserGateway.findByName(userName);
            if (user != User.NULL) {
                String codedPhrase = user.getPhraseEncodedByPasswᄋrd();
                String phrase = cryptographer.decrypt(codedPhrase, password);
                if ("Valid Password" .equals(phrase)) {
                    Session.initialize();
                    return true;
                }
            }
            return false;
        }
    }


    public enum Error {
        OK,
        INVALID,
        N0_SUCH,
        LOCKED,
        0UT_0F_RES0URCES,
        WAITING_FOR_EVENT;
    }
*/
}


