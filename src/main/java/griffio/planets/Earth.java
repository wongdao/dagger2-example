package griffio.planets;

public final class Earth implements Planet {
    @Override
    public String names() {
        return "地球";
    }

    @Override
    public double au() {
        return 1.0;
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
