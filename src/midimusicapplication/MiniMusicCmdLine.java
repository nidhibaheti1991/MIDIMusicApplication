/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midimusicapplication;
import javax.sound.midi.*;
/**
 *
 * @author Nidhi
 */
public class MiniMusicCmdLine {
    public void play(int instrument, int note){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();
			
            Sequence seq = new Sequence(Sequence.PPQ, 4);
			
            Track track = seq.createTrack();
            MidiEvent event = null;
            /* Create change instrument instruction of type 192 */
            ShortMessage first = new ShortMessage();
            first.setMessage(192,1,instrument,0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);
            /* Create note on message type 144 */
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,note,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);
			
            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,note,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);
			
            player.setSequence(seq);
			
            player.start();
			
			
	}catch(Exception ex){
            ex.printStackTrace();
	}
    }
}
