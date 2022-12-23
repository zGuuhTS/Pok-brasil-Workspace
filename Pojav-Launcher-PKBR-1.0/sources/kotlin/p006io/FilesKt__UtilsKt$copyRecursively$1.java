package kotlin.p006io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo11814d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo11815d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "exception", "Ljava/io/IOException;", "invoke"}, mo11816k = 3, mo11817mv = {1, 7, 1}, mo11819xi = 48)
/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$1 */
/* compiled from: Utils.kt */
final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements Function2 {
    public static final FilesKt__UtilsKt$copyRecursively$1 INSTANCE = new FilesKt__UtilsKt$copyRecursively$1();

    FilesKt__UtilsKt$copyRecursively$1() {
        super(2);
    }

    public final Void invoke(File file, IOException exception) {
        Intrinsics.checkNotNullParameter(file, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        throw exception;
    }
}
