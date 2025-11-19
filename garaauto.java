
	static int classifica[] = new int [20];

    public static void main(String[] a){

        int numeroDiThread = 5,i;

        // Istanzia un array di thread
        Thread[] arrayDiThread = new Thread[numeroDiThread];



        for (Thread thread : arrayDiThread) {
            thread.start();
        }

		try{ 
			for (Thread thread : arrayDiThread) {
				thread.join();
			}
		} catch(InterruptedException e) {}


		// stampa arrai tempi
        System.out.println("Classifica");           
		
        for (i = 0; i < numeroDiThread; i++) {
            System.out.println("Auto "+i+" tempo "+garaauto.classifica[i]);           
        }

    }
}


public class ThreadAuto extends Thread {
    Random random = new Random();
    int numero;
   
   
    public void run(){
        int i,tempo;
        for(i=0;i<5;i++) {
            tempo = random.nextInt(200,1000);
			
			if(i==3 || i==7 || i==12) 	{
				tempo = random.nextInt(1000,3000);
			}

			garaauto.classifica[numero]+=tempo;
            try{ Thread.sleep(tempo); } catch(InterruptedException e) {}
            System.out.println("Auto numero "+numero+" giro: "+i);           

weorjg opew werg
ewrg 
ewrgewgewrg
ewr gtewr gtewr ewrttew


asdfqwfg
egewrge

        }
    }
}



serfgdfsg
dsfg
dfsg
dsfgdsfg
dsfg
