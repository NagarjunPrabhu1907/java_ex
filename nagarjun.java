class nagarjun {
    public static void main(String args[]) {
        // rajesh rj = new rajesh();
        // System.out.println("hai nagarjun/are you going to " + rj.gotoMysore());
        Office office1 = new Office();
        System.out.println(office1.captureAttendance(false));

        office1.CheckIfBikeHasKickStarter(true, "Nagarjun Bullet");
        // System.out.println("--------");
        office1.CheckIfBikeHasKickStarter(false, "rajesh Activa");
        double ticketValue = office1.ReturnTicketPrice("Nanjungud", "Mysore");
        double ticketValue2 = office1.ReturnTicketPrice("Nanjungud", "blr");
        System.out.println(String.valueOf(ticketValue) + "   " + String.valueOf(ticketValue2));
    }
}

class rajesh {
    public String gotoMysore() {
        return "Mysore";
    }

    public String gotoMysore(int pin) {
        return "nothing";
    }
}

class Office {
    public boolean captureAttendance(boolean isPresent) {
        return isPresent;
    }

    public void CheckIfBikeHasKickStarter(boolean isKickStarterAvailable, String nameOfThePerson) {

        System.out.println("--------");
        System.out.println(nameOfThePerson + ":" + isKickStarterAvailable);
        System.out.println("--------");
    }

    public double ReturnTicketPrice(String fromLocation, String toLocation) {

        if (fromLocation == "Nanjungud" && toLocation == "Mysore") {
            return 35.00;
        } else {
            return 45.00;
        }

    }
}