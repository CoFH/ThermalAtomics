package cofh.thermal.atomics;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static cofh.lib.util.constants.Constants.ID_THERMAL_ATOMICS;
import static cofh.thermal.lib.common.ThermalFlags.FLAG_NUCLEAR_EXPLOSIVES;
import static cofh.thermal.lib.common.ThermalFlags.setFlag;

@Mod(ID_THERMAL_ATOMICS)
public class ThermalAtomics {

    public ThermalAtomics() {

        setFeatureFlags();

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }

    private void setFeatureFlags() {

        setFlag(FLAG_NUCLEAR_EXPLOSIVES, true);
    }

}
