package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo11814d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo11815d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, mo11816k = 3, mo11817mv = {1, 6, 0}, mo11819xi = 48)
/* compiled from: SidecarAdapter.kt */
final class SidecarAdapter$translate$checkedFeature$1 extends Lambda implements Function1<SidecarDisplayFeature, Boolean> {
    public static final SidecarAdapter$translate$checkedFeature$1 INSTANCE = new SidecarAdapter$translate$checkedFeature$1();

    SidecarAdapter$translate$checkedFeature$1() {
        super(1);
    }

    public final Boolean invoke(SidecarDisplayFeature $this$require) {
        Intrinsics.checkNotNullParameter($this$require, "$this$require");
        boolean z = true;
        if (!($this$require.getType() == 1 || $this$require.getType() == 2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
