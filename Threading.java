
//Thread Class
// public class Threading extends Thread{
//     public void run(){
//         System.out.println("Eduraka Thread...");
//     }
//     public static void main(String[] args) {
//         Threading obj = new Threading();
//         obj.start();
//     }
// }

//Runnable Interface
// public class Threading implements Runnable{
//     public void run(){
//         System.out.println("Edureka Thread...");
//     }
//     //main method represent main thread
//     public static void main(String[] args) {
//         //whatever we write in here will be executed by main thread
//         //threds always execute the jobs in a sequence

//         Thread obj = new Thread(new Threading());
//         obj.start();
//     }
// }

// class Task extends Thread{
//     @Override
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("@@printing document #"+(i+1));
//     }
// }
// }

class CA{

}

// class Task extends CA, Thread{ ->Error | Multiple inheritance is not supported in java
class Task extends CA implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(
                "@@printing document %"+(i+1)
            );
        }
    }
}

class Threading{
    public static void main(String[] args) {
        System.out.println("System Started");
        // Task task = new Task();//child thread / worker thread
        // task.start();//start shall internally execute run method
        
        //Runnable thread implementation
        Runnable r = new Task();
        Thread task = new Thread(r);
        task.start();

        for(int i=0;i<10;i++){
            System.out.println("@@printing documents $"+(i+1));
        }
        //demon thread is thread that jvm execute
        //Now main and task are executing parallelly or concurrently
    }
}