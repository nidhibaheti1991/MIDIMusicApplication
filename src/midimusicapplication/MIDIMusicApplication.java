/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midimusicapplication;

/**
 *
 * @author Nidhi
 */
public class MIDIMusicApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Code to test MiniMusicCmdLine.javas*/
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if(args.length<2){
            System.out.println("Don't forget the instrument and note args");
        }
        else{
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
        
    }
    
}
