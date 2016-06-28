/**
 * Created by davidstone on 6/28/16.
 */
public class Reptile extends Animal{

    private int mLifeSpan;
    private String mHabitat;
    private boolean mIsTopPredator;

    public Reptile (int mLifeSpan, String mHabitat, boolean mIsTopPredator, int mNumLegs, int mTopSpeed, boolean mIsEndangered, String mName) {
        super(mNumLegs, mLifeSpan, mIsEndangered, mName);

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

    public boolean ismIsTopPredator() {
        return mIsTopPredator;
    }

    public void setmIsTopPredator(boolean mIsTopPredator) {
        this.mIsTopPredator = mIsTopPredator;
    }
}
