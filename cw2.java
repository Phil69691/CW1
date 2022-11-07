import java.util.ArrayList;
import java.util.Scanner;

public class cw2 {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Type a song, artist and then the amount of plays that song has to add to your playlist!");
        String song1 = scan.nextLine();
        String play1 = scan.nextLine();
        String artist1 = scan.nextLine();
    
        
        String song2 = scan.nextLine();
        String play2 = scan.nextLine();
        String artist2 = scan.nextLine();
        

        String song3 = scan.nextLine();
        String play3 = scan.nextLine();
        String artist3 = scan.nextLine();
        System.out.println("----------------------------------------------------");
        System.out.println(song1 +  " - " + artist1 + " - " + play1);
        System.out.println(song2 +  " - " + artist2 + " - " + play2);
        System.out.println(song3 +  " - " + artist3 + " - " + play3);
        System.out.println("----------------------------------------------------");
        
        System.out.println("Above are your new songs that you just added to the playlist and below are your already existing songs in the playlist");
        
        ArrayList songList = new ArrayList();
        songList.add("Violent Crimes - Kanye West - 299,361,206 plays ///");
        songList.add("Ghost Town - Kanye West, PARTYNEXTDOOR - 330,109,779 plays ///");
        songList.add("Best Day Ever - Mac Miller - 69,680,239 play s///");
        songList.add("STARGAZING - Travis Scott - 612,742,151 plays ///");
        songList.add("Lord Knows - Drake, Rick Ross - 470,718,534 plays ///");
        songList.add("Dont Matter to Me - Drake, Michael Jackson - 443,398,691 plays ///");
        songList.add("Family ties - Baby Keem, Kendrick Lamar - 358,519,412 ///");
        songList.add("Ball w/o you - 21 Savage - 291,497,640 plays ///");
        songList.add("pad lock - 21 Savage - 39,846,366 plays ///");
        songList.add("a lot - 21 Savage - 663,020,485 plays ///");
        

        
        
        

        System.out.println(songList);

     
           
 



        



    }
    
}

