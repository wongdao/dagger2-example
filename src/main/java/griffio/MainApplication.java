package griffio;

import griffio.components.DaggerSolarSystem;
import griffio.components.SolarSystem;
import griffio.planets.DwarfPlanets;
import griffio.planets.OuterPlanets;
import griffio.planets.Planet;
import griffio.planets.TerrestrialPlanets;

public class MainApplication {

    public static void main(String[] args) {

        SolarSystem solarSystem = DaggerSolarSystem.builder().build();

        TerrestrialPlanets terrestrialPlanets = solarSystem.terrestrial();
        for (Planet planet : terrestrialPlanets) {
            System.out.println(String.format("%s距太阳约 %.2f au", planet.names(), planet.au()));
        }

        OuterPlanets outerPlanets = solarSystem.outer();
        for (Planet planet : outerPlanets) {
            System.out.println(String.format("%s距太阳约 %.2f au", planet.names(), planet.au()));
        }

        DwarfPlanets dwarfPlanets = solarSystem.dwarf();
        for (Planet planet : dwarfPlanets) {
            System.out.println(String.format("%s距太阳约 %.2f au", planet.names(), planet.au()));
        }

        System.out.println("\n备注: au为天文单位, 曾以地球-太阳的平均距离定义, 现在改为1au=149,597,870,700米");
    }

}