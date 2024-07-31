
package net.mcreator.glowroot.client.particle;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

@OnlyIn(Dist.CLIENT)
public class GlowrootLightPopParticle extends TextureSheetParticle {
	public static GlowrootLightPopParticleProvider provider(SpriteSet spriteSet) {
		return new GlowrootLightPopParticleProvider(spriteSet);
	}

	public static class GlowrootLightPopParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public GlowrootLightPopParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new GlowrootLightPopParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;
	private float angularVelocity;
	private float angularAcceleration;

	protected GlowrootLightPopParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.4f, 0.4f);
		this.quadSize *= 2f;
		this.lifetime = (int) Math.max(1, 29 + (this.random.nextInt(10) - 5));
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 0.95;
		this.yd = vy * 0.95;
		this.zd = vz * 0.95;
		this.angularVelocity = 0.31f;
		this.angularAcceleration = -0.005f;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@Override
	public void tick() {
		super.tick();
		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 5) % 7 + 1, 7));
		}
	}
}
