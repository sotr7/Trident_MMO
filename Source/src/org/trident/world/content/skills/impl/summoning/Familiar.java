package org.trident.world.content.skills.impl.summoning;

import org.trident.world.entity.npc.NPC;
import org.trident.world.entity.player.Player;

/**
 * This class model acts as an interface for a player's familiar.
 * Class auto generated by Eclipse
 * @author Gabbe
 */
public class Familiar {

	public Familiar(Player owner, NPC summonNpc, int deathTimer) {
		this.setOwner(owner);
		this.setSummonNpc(summonNpc);
		this.setDeathTimer(deathTimer);
	}
	
	public Player getOwner() {
		return owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public NPC getSummonNpc() {
		return summonNpc;
	}

	public void setSummonNpc(NPC summonNpc) {
		this.summonNpc = summonNpc;
	}

	public int getDeathTimer() {
		return deathTimer;
	}

	public void setDeathTimer(int deathTimer) {
		this.deathTimer = deathTimer;
	}

	public boolean isRespawnNeeded() {
		return respawnNeeded;
	}

	public void setRespawnNeeded(boolean respawnNeeded) {
		this.respawnNeeded = respawnNeeded;
	}


	private Player owner;
	private NPC summonNpc;
	private int deathTimer;
	private boolean respawnNeeded;
}
