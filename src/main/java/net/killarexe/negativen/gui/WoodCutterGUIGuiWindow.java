
package net.killarexe.negativen.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.killarexe.negativen.NegativeNMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WoodCutterGUIGuiWindow extends ContainerScreen<WoodCutterGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public WoodCutterGUIGuiWindow(WoodCutterGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 210;
		this.ySize = 200;
	}
	private static final ResourceLocation texture = new ResourceLocation("negative_n:textures/wood_cutter_gui.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("negative_n:textures/arrow.png"));
		this.blit(ms, this.guiLeft + 33, this.guiTop + 47, 0, 0, 22, 15, 22, 15);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "WoodCutter (StoneCutter-N)", 5, 1, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 73, 120, 20, new StringTextComponent("Cut/Stripped"), e -> {
			if (true) {
				NegativeNMod.PACKET_HANDLER.sendToServer(new WoodCutterGUIGui.ButtonPressedMessage(0, x, y, z));
				WoodCutterGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 113, this.guiTop + 46, 60, 20, new StringTextComponent("Stairs"), e -> {
			if (true) {
				NegativeNMod.PACKET_HANDLER.sendToServer(new WoodCutterGUIGui.ButtonPressedMessage(1, x, y, z));
				WoodCutterGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 122, this.guiTop + 19, 50, 20, new StringTextComponent("Fence"), e -> {
			if (true) {
				NegativeNMod.PACKET_HANDLER.sendToServer(new WoodCutterGUIGui.ButtonPressedMessage(2, x, y, z));
				WoodCutterGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
