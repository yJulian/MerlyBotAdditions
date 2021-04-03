package de.yjulian.merlyadditions.audio;

import com.sedmelluq.discord.lavaplayer.jdaudp.NativeAudioSendFactory;
import de.yjulian.merly.events.EventAdapter;
import de.yjulian.merly.events.EventListener;
import de.yjulian.merly.events.JDABuildEvent;

public class NasListener implements EventAdapter {

    @EventListener
    public void onJDAInit(JDABuildEvent event) {
        event.getJDABuilder().setAudioSendFactory(new NativeAudioSendFactory());
    }

}
