import java.util.*;
class ArrayLists{
public static void main(String args[]){
ArrayList<String> al=new ArrayList<String>();
System.out.println("initial size of al:" + al.size());
al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
al.add("f");
al.add(1,"a2");
System.out.println("size of al after additions:" +al.size());
System.out.println("contetnts of al:" + al);
String str =al.get(2);
al.set(2,str+"updated");
System.out.println("contents of al after updation:" + al);
al.remove("d");
al.remove(2);
System.out.println("size of al after deletions:" + al.size());
System.out.println("contents of al:" + al);
}
}
