/**
 * Created by davidstone on 6/28/16.
 */
public class Animal {

    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

// properties mNumLegs, mTopSpeed, mIsEndangered, mName.
    public Animal (int numLegs, int topSpeed, boolean isEndangered, String name) {

        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public int getmNumLegs() {
        return mNumLegs;
    }

    public void setmNumLegs(int mNumLegs) {
        this.mNumLegs = mNumLegs;
    }

    public int getmTopSpeed() {
        return mTopSpeed;
    }

    public void setmTopSpeed(int mTopSpeed) {
        this.mTopSpeed = mTopSpeed;
    }

    public boolean ismIsEndangered() {
        return mIsEndangered;
    }

    public void setmIsEndangered(boolean mIsEndangered) {
        this.mIsEndangered = mIsEndangered;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

}
