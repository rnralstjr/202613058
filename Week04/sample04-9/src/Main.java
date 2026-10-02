//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;    // data
    int height;  // data
    float area;  // information

    System.out.print("삼각형의 밑변은 ? ");
    base = keyboard.nextInt();
    System.out.print("삼각형의 높이는 ? ");
    height = keyboard.nextInt();

    area = base * height / 2.0f;
    System.out.printf("**** 삼각형의 넓이 구하기 **** \n");
    System.out.printf("\t 밑변 : %d cm \n",base);
    System.out.printf("\t 높이 : %d cm \n",height);

    System.out.printf("\n\t 넓이 : %.2f cm²",area); // <-소수 2자리까지 출력


}
