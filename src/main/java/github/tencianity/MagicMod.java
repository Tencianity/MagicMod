package github.tencianity;

import github.tencianity.Init.ModItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicMod implements ModInitializer {
	public static final String MOD_ID = "magicmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("MagicMod");

	public void onInitialize() {

		LOGGER.info("~~~ Initializing ~~~");
		ModItemInit.load();

	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
