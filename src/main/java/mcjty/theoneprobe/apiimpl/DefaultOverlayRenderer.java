package mcjty.theoneprobe.apiimpl;

import mcjty.theoneprobe.TheOneProbe;
import mcjty.theoneprobe.api.IOverlayRenderer;
import mcjty.theoneprobe.api.IOverlayStyle;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.config.Config;
import mcjty.theoneprobe.rendering.OverlayRenderer;
import net.minecraft.client.gui.GuiGraphics;

public class DefaultOverlayRenderer implements IOverlayRenderer {

    @Override
    public IOverlayStyle createDefaultStyle() {
        return Config.getDefaultOverlayStyle().copy();
    }

    @Override
    public IProbeInfo createProbeInfo() {
        return TheOneProbe.theOneProbeImp.create();
    }

    @Override
    public void render(IOverlayStyle style, IProbeInfo probeInfo, GuiGraphics graphics) {
        OverlayRenderer.renderOverlay(style, probeInfo, graphics);
    }
}
