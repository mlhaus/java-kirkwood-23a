package ch3;

public class IfvsSwitch {
    public static void main(String[] args) {
        int annualIncome = 65000;
        double taxBracket = 0;
        String maritalStatus = "married";
        if(maritalStatus.equals("single")) {
            if(annualIncome < 9875) {
                taxBracket = .1;
            } else if(annualIncome < 40125) {
                taxBracket = .12;
            } else if(annualIncome < 85525) {
                taxBracket = .22;
            } else if(annualIncome < 163300) {
                taxBracket = .24;
            } else if(annualIncome < 207350) {
                taxBracket = .32;
            } else if(annualIncome < 518400) {
                taxBracket = .35;
            } else {
                taxBracket = .37;
            }
        } else if(maritalStatus.equals("married")) {
            if(annualIncome < 19750) {
                taxBracket = .1;
            } else if(annualIncome < 80250) {
                taxBracket = .12;
            } else if(annualIncome < 171050) {
                taxBracket = .22;
            } else if(annualIncome < 326600) {
                taxBracket = .24;
            } else if(annualIncome < 414700) {
                taxBracket = .32;
            } else if(annualIncome < 622050) {
                taxBracket = .35;
            } else {
                taxBracket = .37;
            }
        }
        System.out.printf("You owe $%,.2f in taxes\n", annualIncome * taxBracket);

        // Use switch statements only with values that are equal
        switch(maritalStatus) {
            case "single":
                if(annualIncome < 9875) {
                    taxBracket = .1;
                } else if(annualIncome < 40125) {
                    taxBracket = .12;
                } else if(annualIncome < 85525) {
                    taxBracket = .22;
                } else if(annualIncome < 163300) {
                    taxBracket = .24;
                } else if(annualIncome < 207350) {
                    taxBracket = .32;
                } else if(annualIncome < 518400) {
                    taxBracket = .35;
                } else {
                    taxBracket = .37;
                }
                break;
            case "married":
                if(annualIncome < 19750) {
                    taxBracket = .1;
                } else if(annualIncome < 80250) {
                    taxBracket = .12;
                } else if(annualIncome < 171050) {
                    taxBracket = .22;
                } else if(annualIncome < 326600) {
                    taxBracket = .24;
                } else if(annualIncome < 414700) {
                    taxBracket = .32;
                } else if(annualIncome < 622050) {
                    taxBracket = .35;
                } else {
                    taxBracket = .37;
                }
                break;
        }
        System.out.printf("You owe $%,.2f in taxes\n", annualIncome * taxBracket);

    }
}
