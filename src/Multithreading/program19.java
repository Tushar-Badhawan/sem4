class MyThread extends Thread
{
    String threadname;

    MyThread(String name)
    {
        this.threadname=name;
    }

    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Name: "+this.threadname);
            try
            {
                Thread.sleep(500);
            } 
            catch (Exception e) 
            {
                System.err.println(e.getMessage());
            }
        }

        System.out.println(threadname+" thread ended");
    }

}

class Program19
{
    public static void main(String args[])
    {
        MyThread CSthread=new MyThread("CSthread");
        MyThread ITthread=new MyThread("ITthread");

        CSthread.start();
        ITthread.start();
    }
}