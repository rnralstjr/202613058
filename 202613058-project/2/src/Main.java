void main() {
    Scanner keyword = new Scanner(System.in);
    int radius;
    int side;
    double boxArea;
    double circleArea;
    double result;

    System.out.print("원의 반지름 : ");
    radius=keyword.nextInt();

    side = radius*2;
    boxArea = side*side;
    circleArea = radius*radius*3.141592;
    result= boxArea - circleArea;


    System.out.printf("정사각형 면적 : %.0fcm² \n",boxArea);
    System.out.printf("원의 면적 : %.2fcm² \n",circleArea);
    System.out.printf("구하는 면적 : %.2fcm² \n",result);
}
