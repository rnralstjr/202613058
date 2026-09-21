void main() {
    Scanner keyword =  new Scanner(System.in);
    String name;
    String area;
    int family;

    System.out.print("당신의 이름은 ? ");
    name = keyword.nextLine();
    System.out.printf("%s님의 가족은 몇 명입니까 ? ",name);
    family = keyword.nextInt();
    keyword.nextLine(); //nextInt()는 입력 엔터를 읽지 못하기 때문에 다음 줄에 nextLine()를 해줘야 함.
    System.out.printf("%s님의 가족은 어디에서 살지요 ? ",name);
    area = keyword.nextLine();

    System.out.printf("\n%s님의 가족은 %d명 입니다.\n",name,family);
    System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n",name,area);
}
