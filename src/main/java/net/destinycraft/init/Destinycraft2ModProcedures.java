
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.destinycraft.procedures.WasteProcedure;
import net.destinycraft.procedures.CR4Procedure;
import net.destinycraft.procedures.CR3Procedure;
import net.destinycraft.procedures.CR2Procedure;
import net.destinycraft.procedures.CR1Procedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class Destinycraft2ModProcedures {
	public static void load() {
		new CR2Procedure();
		new CR1Procedure();
		new CR3Procedure();
		new CR4Procedure();
		new WasteProcedure();
	}
}
