package griffio.modules;

import dagger.Module;
import dagger.Provides;
import griffio.planets.Earth;
import griffio.planets.Mars;
import griffio.planets.Mercury;
import griffio.planets.Planet;
import griffio.planets.Venus;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * 类地行星: 又称地球型行星（telluric planet）或岩石行星（rocky planet）都是指以硅酸盐岩石为主要成分的行星。
 * 地球所在的太阳系有四颗类地行星：水星、金星、地球和火星，和一颗类地矮行星，谷神星。
 */
@Module
public class TerrestrialPlanetsModule {

    @Provides
    @Singleton
    @Named("Mercury")
    Planet first() {
        return new Mercury();
    }

    @Provides
    @Singleton
    @Named("Venus")
    Planet second() {
        return new Venus();
    }

    @Provides
    @Singleton
    @Named("Earth")
    Planet third() {
        return new Earth();
    }

    @Provides
    @Singleton
    @Named("Mars")
    Planet fourth() {
        return new Mars();
    }

}