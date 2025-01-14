package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.AbstractList;
import top.defaults.checkerboarddrawable.BuildConfig;

@Metadata(mo11814d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo11815d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"}, mo11816k = 1, mo11817mv = {1, 7, 1}, mo11819xi = 48)
/* compiled from: Regex.kt */
public final class MatcherMatchResult$groupValues$1 extends AbstractList<String> {
    final /* synthetic */ MatcherMatchResult this$0;

    MatcherMatchResult$groupValues$1(MatcherMatchResult $receiver) {
        this.this$0 = $receiver;
    }

    public final /* bridge */ boolean contains(Object element) {
        if (!(element instanceof String)) {
            return false;
        }
        return contains((String) element);
    }

    public /* bridge */ boolean contains(String element) {
        return super.contains(element);
    }

    public final /* bridge */ int indexOf(Object element) {
        if (!(element instanceof String)) {
            return -1;
        }
        return indexOf((String) element);
    }

    public /* bridge */ int indexOf(String element) {
        return super.indexOf(element);
    }

    public final /* bridge */ int lastIndexOf(Object element) {
        if (!(element instanceof String)) {
            return -1;
        }
        return lastIndexOf((String) element);
    }

    public /* bridge */ int lastIndexOf(String element) {
        return super.lastIndexOf(element);
    }

    public int getSize() {
        return this.this$0.getMatchResult().groupCount() + 1;
    }

    public String get(int index) {
        String group = this.this$0.getMatchResult().group(index);
        return group == null ? BuildConfig.FLAVOR : group;
    }
}
