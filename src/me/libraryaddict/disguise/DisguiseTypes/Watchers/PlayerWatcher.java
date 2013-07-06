package me.libraryaddict.disguise.DisguiseTypes.Watchers;

public class PlayerWatcher extends LivingWatcher {

    public PlayerWatcher(int entityId) {
        super(entityId);
        setValue(9, (byte) 0);
        setValue(18, 0);
    }

    public int getArrowsSticking() {
        return (Byte) getValue(9);
    }

    public void setArrowsSticking(int arrowsNo) {
        if (arrowsNo != getArrowsSticking()) {
            setValue(9, (byte) arrowsNo);
            sendData(9);
        }
    }

}