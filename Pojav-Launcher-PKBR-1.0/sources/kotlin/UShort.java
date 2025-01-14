package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;

@JvmInline
@Metadata(mo11814d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b@\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u0010J\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0013J\u001b\u0010H\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0010J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013J\u001b\u0010M\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020SH\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020WH\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0003H\b¢\u0006\u0004\be\u0010\u0005J\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020\u000eH\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010UJ\u0016\u0010l\u001a\u00020\u0011H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0014H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010cJ\u0016\u0010p\u001a\u00020\u0000H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010\u0005J\u001b\u0010r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0001\u0002\u0001\u00020\u0003ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, mo11815d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, mo11816k = 1, mo11817mv = {1, 7, 1}, mo11819xi = 48)
/* compiled from: UShort.kt */
public final class UShort implements Comparable<UShort> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UShort m336boximpl(short s) {
        return new UShort(s);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m342constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m348equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).m391unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m349equalsimpl0(short s, short s2) {
        return s == s2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m354hashCodeimpl(short s) {
        return s;
    }

    public boolean equals(Object obj) {
        return m348equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m354hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m391unboximpl() {
        return this.data;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object other) {
        return Intrinsics.compare((int) m391unboximpl() & MAX_VALUE, (int) ((UShort) other).m391unboximpl() & MAX_VALUE);
    }

    private /* synthetic */ UShort(short data2) {
        this.data = data2;
    }

    @Metadata(mo11814d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, mo11815d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, mo11816k = 1, mo11817mv = {1, 7, 1}, mo11819xi = 48)
    /* compiled from: UShort.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m337compareTo7apg3OU(short arg0, byte other) {
        return Intrinsics.compare((int) 65535 & arg0, (int) other & UByte.MAX_VALUE);
    }

    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private int m340compareToxj2QHRw(short other) {
        return Intrinsics.compare((int) m391unboximpl() & MAX_VALUE, (int) 65535 & other);
    }

    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static int m341compareToxj2QHRw(short arg0, short other) {
        return Intrinsics.compare((int) arg0 & MAX_VALUE, (int) 65535 & other);
    }

    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m339compareToWZ4Q5Ns(short arg0, int other) {
        return UnsignedKt.uintCompare(UInt.m158constructorimpl(65535 & arg0), other);
    }

    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m338compareToVKZWuLQ(short arg0, long other) {
        return UnsignedKt.ulongCompare(ULong.m236constructorimpl(((long) arg0) & 65535), other);
    }

    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m366plus7apg3OU(short arg0, byte other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(65535 & arg0) + UInt.m158constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m369plusxj2QHRw(short arg0, short other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(arg0 & MAX_VALUE) + UInt.m158constructorimpl(65535 & other));
    }

    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m368plusWZ4Q5Ns(short arg0, int other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(65535 & arg0) + other);
    }

    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m367plusVKZWuLQ(short arg0, long other) {
        return ULong.m236constructorimpl(ULong.m236constructorimpl(((long) arg0) & 65535) + other);
    }

    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m357minus7apg3OU(short arg0, byte other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(65535 & arg0) - UInt.m158constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m360minusxj2QHRw(short arg0, short other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(arg0 & MAX_VALUE) - UInt.m158constructorimpl(65535 & other));
    }

    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m359minusWZ4Q5Ns(short arg0, int other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(65535 & arg0) - other);
    }

    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m358minusVKZWuLQ(short arg0, long other) {
        return ULong.m236constructorimpl(ULong.m236constructorimpl(((long) arg0) & 65535) - other);
    }

    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m375times7apg3OU(short arg0, byte other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(65535 & arg0) * UInt.m158constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m378timesxj2QHRw(short arg0, short other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(arg0 & MAX_VALUE) * UInt.m158constructorimpl(65535 & other));
    }

    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m377timesWZ4Q5Ns(short arg0, int other) {
        return UInt.m158constructorimpl(UInt.m158constructorimpl(65535 & arg0) * other);
    }

    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m376timesVKZWuLQ(short arg0, long other) {
        return ULong.m236constructorimpl(ULong.m236constructorimpl(((long) arg0) & 65535) * other);
    }

    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m344div7apg3OU(short arg0, byte other) {
        return UnsignedKt.m411uintDivideJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), UInt.m158constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m347divxj2QHRw(short arg0, short other) {
        return UnsignedKt.m411uintDivideJ1ME1BU(UInt.m158constructorimpl(arg0 & MAX_VALUE), UInt.m158constructorimpl(65535 & other));
    }

    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m346divWZ4Q5Ns(short arg0, int other) {
        return UnsignedKt.m411uintDivideJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), other);
    }

    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m345divVKZWuLQ(short arg0, long other) {
        return UnsignedKt.m413ulongDivideeb3DHEI(ULong.m236constructorimpl(((long) arg0) & 65535), other);
    }

    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m371rem7apg3OU(short arg0, byte other) {
        return UnsignedKt.m412uintRemainderJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), UInt.m158constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m374remxj2QHRw(short arg0, short other) {
        return UnsignedKt.m412uintRemainderJ1ME1BU(UInt.m158constructorimpl(arg0 & MAX_VALUE), UInt.m158constructorimpl(65535 & other));
    }

    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m373remWZ4Q5Ns(short arg0, int other) {
        return UnsignedKt.m412uintRemainderJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), other);
    }

    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m372remVKZWuLQ(short arg0, long other) {
        return UnsignedKt.m414ulongRemaindereb3DHEI(ULong.m236constructorimpl(((long) arg0) & 65535), other);
    }

    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m350floorDiv7apg3OU(short arg0, byte other) {
        return UnsignedKt.m411uintDivideJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), UInt.m158constructorimpl(other & UByte.MAX_VALUE));
    }

    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m353floorDivxj2QHRw(short arg0, short other) {
        return UnsignedKt.m411uintDivideJ1ME1BU(UInt.m158constructorimpl(arg0 & MAX_VALUE), UInt.m158constructorimpl(65535 & other));
    }

    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m352floorDivWZ4Q5Ns(short arg0, int other) {
        return UnsignedKt.m411uintDivideJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), other);
    }

    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m351floorDivVKZWuLQ(short arg0, long other) {
        return UnsignedKt.m413ulongDivideeb3DHEI(ULong.m236constructorimpl(((long) arg0) & 65535), other);
    }

    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m361mod7apg3OU(short arg0, byte other) {
        return UByte.m82constructorimpl((byte) UnsignedKt.m412uintRemainderJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), UInt.m158constructorimpl(other & UByte.MAX_VALUE)));
    }

    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m364modxj2QHRw(short arg0, short other) {
        return m342constructorimpl((short) UnsignedKt.m412uintRemainderJ1ME1BU(UInt.m158constructorimpl(arg0 & MAX_VALUE), UInt.m158constructorimpl(65535 & other)));
    }

    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m363modWZ4Q5Ns(short arg0, int other) {
        return UnsignedKt.m412uintRemainderJ1ME1BU(UInt.m158constructorimpl(65535 & arg0), other);
    }

    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m362modVKZWuLQ(short arg0, long other) {
        return UnsignedKt.m414ulongRemaindereb3DHEI(ULong.m236constructorimpl(((long) arg0) & 65535), other);
    }

    /* renamed from: inc-Mh2AYeg  reason: not valid java name */
    private static final short m355incMh2AYeg(short arg0) {
        return m342constructorimpl((short) (arg0 + 1));
    }

    /* renamed from: dec-Mh2AYeg  reason: not valid java name */
    private static final short m343decMh2AYeg(short arg0) {
        return m342constructorimpl((short) (arg0 - 1));
    }

    /* renamed from: rangeTo-xj2QHRw  reason: not valid java name */
    private static final UIntRange m370rangeToxj2QHRw(short arg0, short other) {
        return new UIntRange(UInt.m158constructorimpl(arg0 & MAX_VALUE), UInt.m158constructorimpl(65535 & other), (DefaultConstructorMarker) null);
    }

    /* renamed from: and-xj2QHRw  reason: not valid java name */
    private static final short m335andxj2QHRw(short arg0, short other) {
        return m342constructorimpl((short) (arg0 & other));
    }

    /* renamed from: or-xj2QHRw  reason: not valid java name */
    private static final short m365orxj2QHRw(short arg0, short other) {
        return m342constructorimpl((short) (arg0 | other));
    }

    /* renamed from: xor-xj2QHRw  reason: not valid java name */
    private static final short m390xorxj2QHRw(short arg0, short other) {
        return m342constructorimpl((short) (arg0 ^ other));
    }

    /* renamed from: inv-Mh2AYeg  reason: not valid java name */
    private static final short m356invMh2AYeg(short arg0) {
        return m342constructorimpl((short) (~arg0));
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m379toByteimpl(short arg0) {
        return (byte) arg0;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m384toShortimpl(short arg0) {
        return arg0;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m382toIntimpl(short arg0) {
        return 65535 & arg0;
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m383toLongimpl(short arg0) {
        return ((long) arg0) & 65535;
    }

    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m386toUBytew2LRezQ(short arg0) {
        return UByte.m82constructorimpl((byte) arg0);
    }

    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m389toUShortMh2AYeg(short arg0) {
        return arg0;
    }

    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m387toUIntpVg5ArA(short arg0) {
        return UInt.m158constructorimpl(65535 & arg0);
    }

    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m388toULongsVKNKU(short arg0) {
        return ULong.m236constructorimpl(((long) arg0) & 65535);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m381toFloatimpl(short arg0) {
        return (float) (65535 & arg0);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m380toDoubleimpl(short arg0) {
        return (double) (65535 & arg0);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m385toStringimpl(short arg0) {
        return String.valueOf(65535 & arg0);
    }

    public String toString() {
        return m385toStringimpl(this.data);
    }
}
