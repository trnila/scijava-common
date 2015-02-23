
package org.scijava.path;

import org.scijava.module.Module;
import org.scijava.plugin.Plugin;

@Plugin(type = Path.class, menuRoot = TroubleshootingPath.ROOT,
	menuPath = "ImageProblems>Black Image>" + TroubleshootingPath.TAIL)
public class SciJavaHelp implements TroubleshootingPath {

	public final static String[] descs = { "My image looks wrong",
		"My image is black", "Let's try running Brightness/Contrast" };

	@Override
	public Module getModule() {
		// TODO
//		return "run(\"Enhance Contrast...\", \"saturated=0.4\");";
		return null;
	}

	@Override
	public String[] getPathLabels() {
		return descs;
	}

}
