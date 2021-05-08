
public class ThreadExample {

    public static void main(String[] args) throws InterruptedException{
    
        ThreadUsingRunnable runnableThread = new ThreadUsingRunnable();
        
        Thread textThread = new Thread(runnableThread, "text");
        textThread.start();
        textThread.join();;
       
       
        Thread wordThread = new Thread(runnableThread, "word1");
        wordThread.start();
        
        
        
        
        
    }
    
}
