package subsystem;

import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Allows users to check how many points they have, and increments the
 * amount points they have.
 */
public class PointManager extends ListenerAdapter {
    UserPointsDataStore upds = new UserPointsDataStore();
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        // We don't want to respond to other bot accounts, including ourself
        Message message = event.getMessage();
        String content = message.getContentRaw(); 
        String userId = event.getAuthor().getId();
        // getContentRaw() is an atomic getter
        // getContentDisplay() is a lazy getter which modifies the content for e.g. console view (strip discord formatting)
        
        if (upds.isUserInDataStore(userId)){
            upds.addPoints(userId.toString(), 1);
        } else {
            upds.setPoints(userId.toString(), 0);
        }
        switch (content){
            case "!points":
            MessageChannel channel = event.getChannel();
            channel.sendMessage(String.format("You have %d points!", upds.getPoints(userId))).queue();
        }
    }
}
