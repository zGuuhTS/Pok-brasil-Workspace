package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo11813bv = {1, 0, 3}, mo11814d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo11815d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, mo11816k = 3, mo11817mv = {1, 1, 15})
/* compiled from: Transition.kt */
public final class TransitionKt$addListener$1 extends Lambda implements Function1<Transition, Unit> {
    public static final TransitionKt$addListener$1 INSTANCE = new TransitionKt$addListener$1();

    public TransitionKt$addListener$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Transition) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Transition it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
    }
}
