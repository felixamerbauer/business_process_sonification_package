package sonification.plugins;

import org.deckfour.xes.model.XLog;
import org.processmining.contexts.uitopia.annotations.Visualizer;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;
import org.processmining.framework.plugin.annotations.PluginVariant;

import sonification.controller.Controller;
import sonification.controller.Settings;
import sonification.controller.SettingsUtil;
import sonification.ui.View;

public class SonificationVisualization {
	@Plugin(name = "Show Sonification UI", parameterLabels = { "SonificationData" }, returnLabels = { "Sonification" }, returnTypes = { View.class }, userAccessible = true)
	@Visualizer
	@PluginVariant(requiredParameterLabels = { 0 })
	public static View visualize(final PluginContext context, final XLog log) {
		System.out.println("invokeSNA");
		// TODO accurate size value
		Settings settings = SettingsUtil.defaultSettings(log);
		return new View(new Controller(log, settings));
	}
}