package Base;

public interface Ringable {
    public default String ring() {
        return "ding...ding...ring...";
    };
    public default String unlock() {
        return "phone unlocked ";
    };
}
