class Exercise6_6 {
    static double getDistance(int x, int y, int x1, int y1){

        double a= (Math.pow((x1-x),2) + Math.pow((y1-y),2));
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));

        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }
}

class MyPoint {
    int x2;
    int y2;

    MyPoint(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    double getDistance(int x3, int y3) {
        double a = (Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2));
        return Math.sqrt(a);
    }
}