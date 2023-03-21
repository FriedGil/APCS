package Unit5.HuggingBearLab;

//testing class built by Huo Chen; Last Update 2/13/2023
public class SortingBear
{
 public static void selectionSort(Bear[] args)
 {
    int min;
    Bear temp;
    for (int i = 0; i < args.length; i ++){
        min = i;
        for (int j = i + 1; j < args.length; j++){
            if (args[min].compareTo(args[j]) > 0){
                min = j;
            }
        }
        temp = args[i];
        args[i] = args[min];
        args[min] = temp;
    }

}

 public static void main(String[] args)
 {
  Bear m1 = new MommyBear();
  Bear m2 = new MommyBear();
  Bear d1 = new DaddyBear();
  Bear d2 = new DaddyBear();
  Bear b1 = new BabyBear();
  Bear b2 = new BabyBear();

  ((MommyBear)m1).hug(m2);
  ((MommyBear)m1).hug(b1);
  ((MommyBear)m1).hug(b2);
  ((DaddyBear)d1).hug(d2);
  ((DaddyBear)d1).hug(b2);
  ((DaddyBear)d2).hug(m2);
  ((DaddyBear)d2).hug(b2);

  Bear[] bearArr = {m1,m2,d1,d2,b1,b2};

  System.out.println("#####################");
  System.out.println("    Before Sorting   ");
  for(Bear b: bearArr)
  {
    System.out.println(b);
  }

  selectionSort(bearArr);

  System.out.println();
  System.out.println();
  System.out.println("#####################");
  System.out.println("    After Sorting   ");
  for(Bear b: bearArr)
  {
    System.out.println(b);
  }

  System.out.println("End Testing");
 }
}

