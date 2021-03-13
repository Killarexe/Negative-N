// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsquid_n extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer tentacle1;
	private final ModelRenderer tentacle2;
	private final ModelRenderer tentacle3;
	private final ModelRenderer tentacle4;
	private final ModelRenderer tentacle5;
	private final ModelRenderer tentacle6;
	private final ModelRenderer tentacle7;
	private final ModelRenderer tentacle8;

	public Modelsquid_n() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, 0.0F, true);

		tentacle1 = new ModelRenderer(this);
		tentacle1.setRotationPoint(-5.0F, 31.0F, 0.0F);
		setRotationAngle(tentacle1, 0.0F, -1.5708F, 0.0F);
		tentacle1.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);

		tentacle2 = new ModelRenderer(this);
		tentacle2.setRotationPoint(-3.5F, 31.0F, 3.5F);
		setRotationAngle(tentacle2, 0.0F, -0.7854F, 0.0F);
		tentacle2.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);

		tentacle3 = new ModelRenderer(this);
		tentacle3.setRotationPoint(0.0F, 31.0F, 5.0F);
		tentacle3.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);

		tentacle4 = new ModelRenderer(this);
		tentacle4.setRotationPoint(3.5F, 31.0F, 3.5F);
		setRotationAngle(tentacle4, 0.0F, 0.7854F, 0.0F);
		tentacle4.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);

		tentacle5 = new ModelRenderer(this);
		tentacle5.setRotationPoint(5.0F, 31.0F, 0.0F);
		setRotationAngle(tentacle5, 0.0F, 1.5708F, 0.0F);
		tentacle5.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);

		tentacle6 = new ModelRenderer(this);
		tentacle6.setRotationPoint(3.5F, 31.0F, -3.5F);
		setRotationAngle(tentacle6, 0.0F, 2.3562F, 0.0F);
		tentacle6.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);

		tentacle7 = new ModelRenderer(this);
		tentacle7.setRotationPoint(0.0F, 31.0F, -5.0F);
		setRotationAngle(tentacle7, 0.0F, 3.1416F, 0.0F);
		tentacle7.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);

		tentacle8 = new ModelRenderer(this);
		tentacle8.setRotationPoint(-3.5F, 31.0F, -3.5F);
		setRotationAngle(tentacle8, 0.0F, 3.927F, 0.0F);
		tentacle8.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle1.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle2.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle3.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle4.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle5.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle6.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle7.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle8.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}