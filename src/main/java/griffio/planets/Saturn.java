package griffio.planets;

public final class Saturn implements Planet {
    @Override
    public String names() {
        return "土星";
    }

    @Override
    public double au() {
        return 9.5;
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
