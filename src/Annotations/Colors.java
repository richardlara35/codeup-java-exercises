package Annotations;


class Red {
    public void showMyFavColor() {
        System.out.println("I am red");
    }
}

class Orange extends Red {
    @Override
    public void showMyFavColor() {
        System.out.println("I am orange");
    }
}


public class Colors {
    public static void main(String[] args) {
        Red redObj = new Red();
        Orange ornObj = new Orange();
        redObj.showMyFavColor();
        ornObj.showMyFavColor();
    }
}
