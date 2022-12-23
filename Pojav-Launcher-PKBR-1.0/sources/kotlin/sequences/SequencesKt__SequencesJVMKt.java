package kotlin.sequences;

import java.util.Enumeration;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo11814d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\b¨\u0006\u0004"}, mo11815d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, mo11816k = 5, mo11817mv = {1, 7, 1}, mo11819xi = 49, mo11820xs = "kotlin/sequences/SequencesKt")
/* compiled from: SequencesJVM.kt */
class SequencesKt__SequencesJVMKt extends SequencesKt__SequenceBuilderKt {
    private static final <T> Sequence<T> asSequence(Enumeration<T> $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return SequencesKt.asSequence(CollectionsKt.iterator($this$asSequence));
    }
}