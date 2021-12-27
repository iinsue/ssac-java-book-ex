public class Earth {
    //This is Java chap06 247p
    // 상수(Constant) 선언

    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    // Math.PI는 자바에서 제공하는 상수
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
