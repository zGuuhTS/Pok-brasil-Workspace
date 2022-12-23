package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

@Metadata(mo11814d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, mo11815d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo11816k = 1, mo11817mv = {1, 5, 1}, mo11819xi = 48)
/* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C0789x6e5ea3bc implements FlowCollector<T> {
    final /* synthetic */ CoroutineScope $$this$launch$inlined;
    final /* synthetic */ CompletableDeferred $result$inlined;
    final /* synthetic */ Ref.ObjectRef $state$inlined;

    public C0789x6e5ea3bc(Ref.ObjectRef objectRef, CoroutineScope coroutineScope, CompletableDeferred completableDeferred) {
        this.$state$inlined = objectRef;
        this.$$this$launch$inlined = coroutineScope;
        this.$result$inlined = completableDeferred;
    }

    public Object emit(T value, Continuation<? super Unit> $completion) {
        Unit unit;
        Object value2 = value;
        Continuation<? super Unit> continuation = $completion;
        MutableStateFlow it = (MutableStateFlow) this.$state$inlined.element;
        if (it == null) {
            unit = null;
        } else {
            it.setValue(value2);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            CoroutineScope $this$invokeSuspend_u24lambda_u2d3_u24lambda_u2d2 = this.$$this$launch$inlined;
            Ref.ObjectRef objectRef = this.$state$inlined;
            MutableStateFlow it2 = StateFlowKt.MutableStateFlow(value2);
            this.$result$inlined.complete(new ReadonlyStateFlow(it2, JobKt.getJob($this$invokeSuspend_u24lambda_u2d3_u24lambda_u2d2.getCoroutineContext())));
            Unit unit2 = Unit.INSTANCE;
            objectRef.element = it2;
        }
        return Unit.INSTANCE;
    }
}
