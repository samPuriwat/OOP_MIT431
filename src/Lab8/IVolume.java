package Lab8;

public interface IVolume {

    public void increaseVolume();
    public void decreaseVolume();
}

interface IChanel extends IVolume{
    public void nextChanel();
    public void previousChanel();
}
