
public class StoreFactory {
	public Store createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
        case "SMS":
            return new StoreCheckIn();
        case "EMAIL":
            return new StoreHelp();
        case "PUSH":
            return new StoreOnline();
        default:
            throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
