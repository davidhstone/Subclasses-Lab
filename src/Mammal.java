/**
 * Created by davidstone on 6/28/16.
 */
public class Mammal extends Animal{
    private int mLifeSpan;
    private String mHabitat;
    private boolean mIsMarsupial;

    public Mammal (int mLifeSpan, String mHabitat, boolean mIsTopPredator, int mNumLegs, int mTopSpeed, boolean mIsEndangered, String mName) {
        super(mNumLegs, mTopSpeed, mIsEndangered, mName);


    }

    public int getmLifeSpan() {
        return mLifeSpan;
    }

    public void setmLifeSpan(int mLifeSpan) {
        this.mLifeSpan = mLifeSpan;
    }

    public String getmHabitat() {
        return mHabitat;
    }

    public void setmHabitat(String mHabitat) {
        this.mHabitat = mHabitat;
    }

    public boolean ismIsMarsupial() {
        return mIsMarsupial;
    }

    public void setmIsMarsupial(boolean mIsMarsupial) {
        this.mIsMarsupial = mIsMarsupial;
    }
}
