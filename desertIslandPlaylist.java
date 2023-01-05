import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // created array list and added some values
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Song 1");
    desertIslandPlaylist.add("Song 2");
    desertIslandPlaylist.add("Song 3");
    desertIslandPlaylist.add("Song 4");
    desertIslandPlaylist.add("Song 5");
    desertIslandPlaylist.add("Song 6");
    
    // displayed the values of array list + removed last item
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(5);
    
    // displayed the values of array list after removal the last item
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);
    
    // switching the order of two songs (first and last);
    int temporaryIndexForSong1 = desertIslandPlaylist.indexOf("Song 1");
    int temporaryIndexForSong4 = desertIslandPlaylist.indexOf("Song 5");
    System.out.println(temporaryIndexForSong1);
    System.out.println(temporaryIndexForSong4);
    // storing value from array list in variable
    String tempA = desertIslandPlaylist.get(temporaryIndexForSong1);
    System.out.println(tempA);
    
    // switching b on the a position
    desertIslandPlaylist.set(temporaryIndexForSong1, desertIslandPlaylist.get(temporaryIndexForSong4));
    System.out.println(desertIslandPlaylist);
    
    // switching a on the b position
    desertIslandPlaylist.set(temporaryIndexForSong4, tempA);
   
   // printing out final value of array
   System.out.println(desertIslandPlaylist);
  }
  
}
