package Arrays;

public class PassingArraysAsArgument {
    public static void update(int marks[],int nonChangable){
        for (int i=0;i< marks.length;i++){
            marks[i]=marks[i]+1;
            nonChangable=10;
        }
    }

    public static void main(String[] args) {
        int marks[]={96,97,98};
        int nonChangable=5;
        update(marks,nonChangable);
        System.out.println(nonChangable);
        for (int i=0;i< marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
