package griffio.planets;

public final class Jupiter implements Planet {
    @Override
    public String names() {
        return "木星";
    }

    @Override
    public double au() {
        return 5.2;
    }

    @Override
    public int hashCode() {
        return Planets.hash(names(), au());
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Planet && Planets.isEqual(this, (Planet) other);
    }
}
