package net.sushiclient.client.handlers.forge;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.sushiclient.client.events.EventHandlers;
import net.sushiclient.client.events.EventTiming;
import net.sushiclient.client.events.tick.RenderTickEvent;

public class RenderTickHandler {

    @SubscribeEvent
    public void onTick(TickEvent.RenderTickEvent e) {
        EventTiming timing;
        if (e.phase == TickEvent.Phase.START)
            timing = EventTiming.PRE;
        else
            timing = EventTiming.POST;

        RenderTickEvent event = new RenderTickEvent(timing, e.renderTickTime);
        EventHandlers.callEvent(event);
    }
}
