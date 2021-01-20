package com.hydratereminder;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class HydrateReminderChatMessageTypeTest
{

    @Test
    public void testToString()
    {
        final String chatType = HydrateReminderChatMessageType.GAMEMESSAGE.toString();
        assertEquals("Game Message", chatType);
    }
}
