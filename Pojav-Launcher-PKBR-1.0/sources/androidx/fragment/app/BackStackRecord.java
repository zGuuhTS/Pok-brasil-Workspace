package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {
    private static final String TAG = "FragmentManager";
    boolean mCommitted;
    int mIndex;
    final FragmentManager mManager;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    public void dump(String prefix, PrintWriter writer) {
        dump(prefix, writer, true);
    }

    public void dump(String prefix, PrintWriter writer, boolean full) {
        String cmdStr;
        if (full) {
            writer.print(prefix);
            writer.print("mName=");
            writer.print(this.mName);
            writer.print(" mIndex=");
            writer.print(this.mIndex);
            writer.print(" mCommitted=");
            writer.println(this.mCommitted);
            if (this.mTransition != 0) {
                writer.print(prefix);
                writer.print("mTransition=#");
                writer.print(Integer.toHexString(this.mTransition));
            }
            if (!(this.mEnterAnim == 0 && this.mExitAnim == 0)) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.mEnterAnim));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.mExitAnim));
            }
            if (!(this.mPopEnterAnim == 0 && this.mPopExitAnim == 0)) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.mPopEnterAnim));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (!(this.mBreadCrumbTitleRes == 0 && this.mBreadCrumbTitleText == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.mBreadCrumbTitleText);
            }
            if (!(this.mBreadCrumbShortTitleRes == 0 && this.mBreadCrumbShortTitleText == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbShortTitleRes=#");
                writer.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                writer.print(" mBreadCrumbShortTitleText=");
                writer.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (!this.mOps.isEmpty()) {
            writer.print(prefix);
            writer.println("Operations:");
            int numOps = this.mOps.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
                switch (op.mCmd) {
                    case 0:
                        cmdStr = "NULL";
                        break;
                    case 1:
                        cmdStr = "ADD";
                        break;
                    case 2:
                        cmdStr = "REPLACE";
                        break;
                    case 3:
                        cmdStr = "REMOVE";
                        break;
                    case 4:
                        cmdStr = "HIDE";
                        break;
                    case 5:
                        cmdStr = "SHOW";
                        break;
                    case 6:
                        cmdStr = "DETACH";
                        break;
                    case 7:
                        cmdStr = "ATTACH";
                        break;
                    case 8:
                        cmdStr = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        cmdStr = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        cmdStr = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        cmdStr = "cmd=" + op.mCmd;
                        break;
                }
                writer.print(prefix);
                writer.print("  Op #");
                writer.print(opNum);
                writer.print(": ");
                writer.print(cmdStr);
                writer.print(" ");
                writer.println(op.mFragment);
                if (full) {
                    if (!(op.mEnterAnim == 0 && op.mExitAnim == 0)) {
                        writer.print(prefix);
                        writer.print("enterAnim=#");
                        writer.print(Integer.toHexString(op.mEnterAnim));
                        writer.print(" exitAnim=#");
                        writer.println(Integer.toHexString(op.mExitAnim));
                    }
                    if (op.mPopEnterAnim != 0 || op.mPopExitAnim != 0) {
                        writer.print(prefix);
                        writer.print("popEnterAnim=#");
                        writer.print(Integer.toHexString(op.mPopEnterAnim));
                        writer.print(" popExitAnim=#");
                        writer.println(Integer.toHexString(op.mPopExitAnim));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    BackStackRecord(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.getFragmentFactory()
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r2.<init>(r0, r1)
            r0 = -1
            r2.mIndex = r0
            r2.mManager = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackRecord.<init>(androidx.fragment.app.FragmentManager):void");
    }

    public int getId() {
        return this.mIndex;
    }

    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    public CharSequence getBreadCrumbTitle() {
        if (this.mBreadCrumbTitleRes != 0) {
            return this.mManager.getHost().getContext().getText(this.mBreadCrumbTitleRes);
        }
        return this.mBreadCrumbTitleText;
    }

    public CharSequence getBreadCrumbShortTitle() {
        if (this.mBreadCrumbShortTitleRes != 0) {
            return this.mManager.getHost().getContext().getText(this.mBreadCrumbShortTitleRes);
        }
        return this.mBreadCrumbShortTitleText;
    }

    /* access modifiers changed from: package-private */
    public void doAddOp(int containerViewId, Fragment fragment, String tag, int opcmd) {
        super.doAddOp(containerViewId, fragment, tag, opcmd);
        fragment.mFragmentManager = this.mManager;
    }

    public FragmentTransaction remove(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.mManager) {
            return super.remove(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public FragmentTransaction hide(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.mManager) {
            return super.hide(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public FragmentTransaction show(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.mManager) {
            return super.show(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public FragmentTransaction detach(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.mManager) {
            return super.detach(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || fragment.mFragmentManager == null || fragment.mFragmentManager == this.mManager) {
            return super.setPrimaryNavigationFragment(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.mManager) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.mManager);
        } else if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        } else if (state != Lifecycle.State.DESTROYED) {
            return super.setMaxLifecycle(fragment, state);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* access modifiers changed from: package-private */
    public void bumpBackStackNesting(int amt) {
        if (this.mAddToBackStack) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(TAG, "Bump nesting in " + this + " by " + amt);
            }
            int numOps = this.mOps.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
                if (op.mFragment != null) {
                    op.mFragment.mBackStackNesting += amt;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(TAG, "Bump nesting of " + op.mFragment + " to " + op.mFragment.mBackStackNesting);
                    }
                }
            }
        }
    }

    public void runOnCommitRunnables() {
        if (this.mCommitRunnables != null) {
            for (int i = 0; i < this.mCommitRunnables.size(); i++) {
                ((Runnable) this.mCommitRunnables.get(i)).run();
            }
            this.mCommitRunnables = null;
        }
    }

    public int commit() {
        return commitInternal(false);
    }

    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    public void commitNow() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, false);
    }

    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, true);
    }

    /* access modifiers changed from: package-private */
    public int commitInternal(boolean allowStateLoss) {
        if (!this.mCommitted) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(TAG, "Commit: " + this);
                PrintWriter pw = new PrintWriter(new LogWriter(TAG));
                dump("  ", pw);
                pw.close();
            }
            this.mCommitted = true;
            if (this.mAddToBackStack) {
                this.mIndex = this.mManager.allocBackStackIndex();
            } else {
                this.mIndex = -1;
            }
            this.mManager.enqueueAction(this, allowStateLoss);
            return this.mIndex;
        }
        throw new IllegalStateException("commit already called");
    }

    public boolean generateOps(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(TAG, "Run: " + this);
        }
        records.add(this);
        isRecordPop.add(false);
        if (!this.mAddToBackStack) {
            return true;
        }
        this.mManager.addBackStackState(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean interactsWith(int containerId) {
        int numOps = this.mOps.size();
        int opNum = 0;
        while (true) {
            int fragContainer = 0;
            if (opNum >= numOps) {
                return false;
            }
            FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
            if (op.mFragment != null) {
                fragContainer = op.mFragment.mContainerId;
            }
            if (fragContainer != 0 && fragContainer == containerId) {
                return true;
            }
            opNum++;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean interactsWith(ArrayList<BackStackRecord> records, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.mOps.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
            int container = op.mFragment != null ? op.mFragment.mContainerId : 0;
            if (!(container == 0 || container == lastContainer)) {
                lastContainer = container;
                for (int i = startIndex; i < endIndex; i++) {
                    BackStackRecord record = records.get(i);
                    int numThoseOps = record.mOps.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        FragmentTransaction.C0449Op thatOp = (FragmentTransaction.C0449Op) record.mOps.get(thoseOpIndex);
                        if ((thatOp.mFragment != null ? thatOp.mFragment.mContainerId : 0) == container) {
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void executeOps() {
        int numOps = this.mOps.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
            Fragment f = op.mFragment;
            if (f != null) {
                f.setPopDirection(false);
                f.setNextTransition(this.mTransition);
                f.setSharedElementNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames);
            }
            switch (op.mCmd) {
                case 1:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(f, false);
                    this.mManager.addFragment(f);
                    break;
                case 3:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.removeFragment(f);
                    break;
                case 4:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.hideFragment(f);
                    break;
                case 5:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(f, false);
                    this.mManager.showFragment(f);
                    break;
                case 6:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.detachFragment(f);
                    break;
                case 7:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(f, false);
                    this.mManager.attachFragment(f);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(f);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment((Fragment) null);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(f, op.mCurrentMaxState);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.mCmd);
            }
            if (!this.mReorderingAllowed && op.mCmd != 1 && f != null && !FragmentManager.USE_STATE_MANAGER) {
                this.mManager.moveFragmentToExpectedState(f);
            }
        }
        if (this.mReorderingAllowed == 0 && !FragmentManager.USE_STATE_MANAGER) {
            FragmentManager fragmentManager = this.mManager;
            fragmentManager.moveToState(fragmentManager.mCurState, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void executePopOps(boolean moveToState) {
        for (int opNum = this.mOps.size() - 1; opNum >= 0; opNum--) {
            FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
            Fragment f = op.mFragment;
            if (f != null) {
                f.setPopDirection(true);
                f.setNextTransition(FragmentManager.reverseTransit(this.mTransition));
                f.setSharedElementNames(this.mSharedElementTargetNames, this.mSharedElementSourceNames);
            }
            switch (op.mCmd) {
                case 1:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(f, true);
                    this.mManager.removeFragment(f);
                    break;
                case 3:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.addFragment(f);
                    break;
                case 4:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.showFragment(f);
                    break;
                case 5:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(f, true);
                    this.mManager.hideFragment(f);
                    break;
                case 6:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.attachFragment(f);
                    break;
                case 7:
                    f.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(f, true);
                    this.mManager.detachFragment(f);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment((Fragment) null);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(f);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(f, op.mOldMaxState);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.mCmd);
            }
            if (!this.mReorderingAllowed && op.mCmd != 3 && f != null && !FragmentManager.USE_STATE_MANAGER) {
                this.mManager.moveFragmentToExpectedState(f);
            }
        }
        if (this.mReorderingAllowed == 0 && moveToState && !FragmentManager.USE_STATE_MANAGER) {
            FragmentManager fragmentManager = this.mManager;
            fragmentManager.moveToState(fragmentManager.mCurState, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment expandOps(ArrayList<Fragment> added, Fragment oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.mOps.size()) {
            FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
            switch (op.mCmd) {
                case 1:
                case 7:
                    added.add(op.mFragment);
                    break;
                case 2:
                    Fragment f = op.mFragment;
                    int containerId = f.mContainerId;
                    boolean alreadyAdded = false;
                    for (int i = added.size() - 1; i >= 0; i--) {
                        Fragment old = added.get(i);
                        if (old.mContainerId == containerId) {
                            if (old == f) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.mOps.add(opNum, new FragmentTransaction.C0449Op(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                FragmentTransaction.C0449Op removeOp = new FragmentTransaction.C0449Op(3, old);
                                removeOp.mEnterAnim = op.mEnterAnim;
                                removeOp.mPopEnterAnim = op.mPopEnterAnim;
                                removeOp.mExitAnim = op.mExitAnim;
                                removeOp.mPopExitAnim = op.mPopExitAnim;
                                this.mOps.add(opNum, removeOp);
                                added.remove(old);
                                opNum++;
                            }
                        }
                    }
                    if (!alreadyAdded) {
                        op.mCmd = 1;
                        added.add(f);
                        break;
                    } else {
                        this.mOps.remove(opNum);
                        opNum--;
                        break;
                    }
                case 3:
                case 6:
                    added.remove(op.mFragment);
                    if (op.mFragment != oldPrimaryNav) {
                        break;
                    } else {
                        this.mOps.add(opNum, new FragmentTransaction.C0449Op(9, op.mFragment));
                        opNum++;
                        oldPrimaryNav = null;
                        break;
                    }
                case 8:
                    this.mOps.add(opNum, new FragmentTransaction.C0449Op(9, oldPrimaryNav));
                    opNum++;
                    oldPrimaryNav = op.mFragment;
                    break;
            }
            opNum++;
        }
        return oldPrimaryNav;
    }

    /* access modifiers changed from: package-private */
    public Fragment trackAddedFragmentsInPop(ArrayList<Fragment> added, Fragment oldPrimaryNav) {
        for (int opNum = this.mOps.size() - 1; opNum >= 0; opNum--) {
            FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
            switch (op.mCmd) {
                case 1:
                case 7:
                    added.remove(op.mFragment);
                    break;
                case 3:
                case 6:
                    added.add(op.mFragment);
                    break;
                case 8:
                    oldPrimaryNav = null;
                    break;
                case 9:
                    oldPrimaryNav = op.mFragment;
                    break;
                case 10:
                    op.mCurrentMaxState = op.mOldMaxState;
                    break;
            }
        }
        return oldPrimaryNav;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        for (int opNum = 0; opNum < this.mOps.size(); opNum++) {
            if (isFragmentPostponed((FragmentTransaction.C0449Op) this.mOps.get(opNum))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void setOnStartPostponedListener(Fragment.OnStartEnterTransitionListener listener) {
        for (int opNum = 0; opNum < this.mOps.size(); opNum++) {
            FragmentTransaction.C0449Op op = (FragmentTransaction.C0449Op) this.mOps.get(opNum);
            if (isFragmentPostponed(op)) {
                op.mFragment.setOnStartEnterTransitionListener(listener);
            }
        }
    }

    private static boolean isFragmentPostponed(FragmentTransaction.C0449Op op) {
        Fragment fragment = op.mFragment;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    public String getName() {
        return this.mName;
    }

    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }
}
