class Main {
  public static void main(String[] args) {
    int [][] m = new int [10][10];
    int maxd = 0;int maxp = 0;
    int x1 = 0; int y1 = 0;
    int x2 = 0; int y2 = 0;
    int s = 0;;
    String str = "";
    String st = "";
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        m[i][j] = (int)(Math.random()*100);
        if(i == j){
          if(maxd < m[i][j]){
            maxd = m[i][j];
            x1 = i;
            y1 = j;
          }
         
        } 
        int k = 10 - 1 - i;
        if(maxp < m[i][k]){
          maxp = m[i][10 - 1 - i];
          x2 = i;
          y2 = k;
        
        }
        System.out.print(m[i][j] + "  ");
      }
       System.out.println();    
    }
    
    for(int p = 0; p < 10; p++){
          s = 0;   
          for(int o = 0; o < 10;o++){
            s += m[o][p];
          }
          int g = p+1;
          str += "Столбец: " + g + " Сумма: " + s + "\n";  
      }
    System.out.print("Максимальный элемент в диагонали: " + maxd + "\nКаординаты: " + x1 + "," + y1);
    System.out.println();
    System.out.print("Максимальный элемент в побочной диагонали: " + maxp + "\nКаординаты: " + x2 + "," + y2 + " ");
    System.out.println(); 
    System.out.print(str);
  }
}