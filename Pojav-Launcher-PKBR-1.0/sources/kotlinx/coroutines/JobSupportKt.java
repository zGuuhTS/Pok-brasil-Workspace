package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

@Metadata(mo11814d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0016H\u0000\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0016H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\t8\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"\u0016\u0010\u0010\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003\"\u0016\u0010\u0012\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003\"\u000e\u0010\u0014\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo11815d2 = {"COMPLETING_ALREADY", "Lkotlinx/coroutines/internal/Symbol;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_RETRY", "getCOMPLETING_RETRY$annotations", "COMPLETING_WAITING_CHILDREN", "getCOMPLETING_WAITING_CHILDREN$annotations", "EMPTY_ACTIVE", "Lkotlinx/coroutines/Empty;", "getEMPTY_ACTIVE$annotations", "EMPTY_NEW", "getEMPTY_NEW$annotations", "FALSE", "", "RETRY", "SEALED", "getSEALED$annotations", "TOO_LATE_TO_CANCEL", "getTOO_LATE_TO_CANCEL$annotations", "TRUE", "boxIncomplete", "", "unboxState", "kotlinx-coroutines-core"}, mo11816k = 2, mo11817mv = {1, 5, 1}, mo11819xi = 48)
/* compiled from: JobSupport.kt */
public final class JobSupportKt {
    /* access modifiers changed from: private */
    public static final Symbol COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY");
    /* access modifiers changed from: private */
    public static final Symbol COMPLETING_RETRY = new Symbol("COMPLETING_RETRY");
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */
    public static final Empty EMPTY_ACTIVE = new Empty(true);
    /* access modifiers changed from: private */
    public static final Empty EMPTY_NEW = new Empty(false);
    private static final int FALSE = 0;
    private static final int RETRY = -1;
    /* access modifiers changed from: private */
    public static final Symbol SEALED = new Symbol("SEALED");
    /* access modifiers changed from: private */
    public static final Symbol TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL");
    private static final int TRUE = 1;

    private static /* synthetic */ void getCOMPLETING_ALREADY$annotations() {
    }

    private static /* synthetic */ void getCOMPLETING_RETRY$annotations() {
    }

    public static /* synthetic */ void getCOMPLETING_WAITING_CHILDREN$annotations() {
    }

    private static /* synthetic */ void getEMPTY_ACTIVE$annotations() {
    }

    private static /* synthetic */ void getEMPTY_NEW$annotations() {
    }

    private static /* synthetic */ void getSEALED$annotations() {
    }

    private static /* synthetic */ void getTOO_LATE_TO_CANCEL$annotations() {
    }

    public static final Object boxIncomplete(Object $this$boxIncomplete) {
        return $this$boxIncomplete instanceof Incomplete ? new IncompleteStateBox((Incomplete) $this$boxIncomplete) : $this$boxIncomplete;
    }

    public static final Object unboxState(Object $this$unboxState) {
        IncompleteStateBox incompleteStateBox = $this$unboxState instanceof IncompleteStateBox ? (IncompleteStateBox) $this$unboxState : null;
        return incompleteStateBox == null ? $this$unboxState : incompleteStateBox.state;
    }
}
