package de.yjulian.merlyadditions;

import de.yjulian.merly.bot.MerlyBot;
import de.yjulian.merly.modules.JavaModule;
import de.yjulian.merlyadditions.audio.NasListener;

public class Main extends JavaModule {

    @Override
    public void onLoad() {
        MerlyBot.getInstance().getEventManager().addEventAdapter(new NasListener());
    }
}
