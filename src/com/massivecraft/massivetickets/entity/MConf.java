package com.massivecraft.massivetickets.entity;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.bukkit.event.EventPriority;

import com.massivecraft.massivetickets.Level;
import com.massivecraft.massivetickets.Reaction;
import com.massivecraft.mcore.store.Entity;
import com.massivecraft.mcore.util.MUtil;

public class MConf extends Entity<MConf>
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //
	
	protected static transient MConf i;
	public static MConf get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	// Format
	
	private String prefix = "<pink><T> ";
	public String getPrefix() { return this.prefix; }
	public void setPrefix(String prefix) { this.prefix = prefix; this.changed(); }
	
	// Bump
	
	private boolean bumpOnJoinActive = true;
	public boolean isBumpOnJoinActive() { return this.bumpOnJoinActive; }
	public void setBumpOnJoinActive(boolean bumpOnJoinActive) { this.bumpOnJoinActive = bumpOnJoinActive; this.changed(); }
	
	private EventPriority bumpOnJoinPriority = EventPriority.HIGH;
	public EventPriority getBumpOnJoinPriority() { return this.bumpOnJoinPriority; }
	public void setBumpOnJoinPriority(EventPriority bumpOnJoinPriority) { this.bumpOnJoinPriority = bumpOnJoinPriority; this.changed(); }
	
	private double bumpEachMinutes = 10D;
	public double getBumpEachMinutes() { return this.bumpEachMinutes; }
	public void setBumpEachMinutes(double bumpEachMinutes) { this.bumpEachMinutes = bumpEachMinutes; this.changed(); }
	
	// Reactions
	
	private Reaction createReaction = Reaction.EMPTY;
	public Reaction getCreateReaction() { return this.createReaction; }
	public void setCreateReaction(Reaction createReaction) { this.createReaction = createReaction; this.changed(); }
	
	private Reaction updateReaction = Reaction.EMPTY;
	public Reaction getUpdateReaction() { return this.updateReaction; }
	public void setUpdateReaction(Reaction updateReaction) { this.updateReaction = updateReaction; this.changed(); }
	
	private Reaction doneReaction = Reaction.EMPTY;
	public Reaction getDoneReaction() { return this.doneReaction; }
	public void setDoneReaction(Reaction doneReaction) { this.doneReaction = doneReaction; this.changed(); }
	
	private Reaction pickReaction = Reaction.valueOf(
		MUtil.list(
			"msg {p}"
		),
		MUtil.list(
			"msg {m}"
		),
		null
	);
	public Reaction getPickReaction() { return this.pickReaction; }
	public void setPickReaction(Reaction pickReaction) { this.pickReaction = pickReaction; this.changed(); }
	
	private Reaction showReaction = Reaction.EMPTY;
	public Reaction getShowReaction() { return this.showReaction; }
	public void setShowReaction(Reaction showReaction) { this.showReaction = showReaction; this.changed(); }
	
	private Reaction workingOnReaction = Reaction.EMPTY;
	public Reaction getWorkingOnReaction() { return this.workingOnReaction; }
	public void setWorkingOnReaction(Reaction workingOnReaction) { this.workingOnReaction = workingOnReaction; this.changed(); }
	
	private Reaction workingOffReaction = Reaction.EMPTY;
	public Reaction getWorkingOffReaction() { return this.workingOffReaction; }
	public void setWorkingOffReaction(Reaction workingOffReaction) { this.workingOffReaction = workingOffReaction; this.changed(); }
	
	private Reaction yieldReaction = Reaction.EMPTY;
	public Reaction getYieldReaction() { return this.yieldReaction; }
	public void setYieldReaction(Reaction yieldReaction) { this.yieldReaction = yieldReaction; this.changed(); }
	
	// Levels
	private Map<Integer, Level> countToLevel = MUtil.map(
		0, Level.valueOf(
			"Not a big help",
			Reaction.EMPTY
		),
		1, Level.valueOf(
			"Almost nothing",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 297 1 name:Moldy_Bread",
					"give {m} 263 1 name:Tiny_Piece_of_Antimatter"
				)
			)
		),
		3, Level.valueOf(
			"It's Something",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 357 1 name:Cookie_of_Something"
				)
			)
		),
		5, Level.valueOf(
			"A poor twerksman blames his tools",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 261 1 name:Bow_of_the_Trendy_Twerker unbreaking:3 lore:Let_the_Twerking_Commence!"
				)
			)
		),
		7, Level.valueOf(
			"A ticket a day keeps the doctor away",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 373:8257 2"
				)
			)
		),
		10, Level.valueOf(
			"Over 9... it's... Dinner Time!!!",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 297 1 name:Dinner_Bread",
					"give {m} 260 1 name:Dinner_Apple",
					"give {m} 373:8258 1 name:Dinner_Lemonade"
				)
			)
		),
		20, Level.valueOf(
			"20 is Plenty!",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 371 20"
				)
			)
		),
		30, Level.valueOf(
			"Remember: Sharing is Caring",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 354 3 name:Cake_of_Compassion"
				)
			)
		),
		40, Level.valueOf(
			"Remember: Know thyself... you be fish?",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 349 1 name:{m}"
				)
			)
		),
		50, Level.valueOf(
			"Honorable Helper",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 347 1 name:Honorable_Helper_{y}_{w}",
					"give {m} 280 1 name:Pathetic_Pokingstick unbreaking:3 knockback:1 lore:What_an_outrageously_pathetic_poking_device!",
					"money give {m} 20"
				)
			)
		),
		60, Level.valueOf(
			"Sandals of the Trendy Twerker",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 301 1 name:Sandals_of_the_Trendy_Twerker color:255,0,230 unbreaking:3 featherfalling:4 lore:Trendy_Sneakin'_YO!"
				)
			)
		),
		70, Level.valueOf(
			"Pants of the Trendy Twerker",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 300 1 name:Pants_of_the_Trendy_Twerker color:255,0,230 unbreaking:3 lore:The_NO1_Dancefloor_Choice!"
				)
			)
		),
		80, Level.valueOf(
			"Vest of the Trendy Twerker",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 299 1 name:Vest_of_the_Trendy_Twerker color:255,0,230 unbreaking:3 lore:This_Vest_be_PHAT_and_makes_ya_curves_POP_YO!"
				)
			)
		),
		90, Level.valueOf(
			"Headband of the Trendy Twerker",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 147 1 name:Headband_of_the_Trendy_Twerker respiration:3 aquaaffinity:1 lore:You'll_se_nothn'_my_niqqa_but_it's_all_'bout_the_feeeel!"
				)
			)
		),
		99, Level.valueOf(
			"Close but no Cigarr",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 391 1 name:No_Cigarr!"
				)
			)
		),
		100, Level.valueOf(
			"Magnificent Moderator",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 399 1 name:Magnificent_Moderator_{y}_{w}",
					"give {m} 369 1 name:Powerful_Pokingstick unbreaking:3 knockback:3 lore:Quite_a_powerful_poking_device!",
					"give {m} 400 1 name:Pie_of_Prosperity",
					"money give {m} 50"
				)
			)
		),
		125, Level.valueOf(
			"Master of the Ticket Fondue",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 282 10 name:Ticket_Fondue"
				)
			)
		),
		150, Level.valueOf(
			"Potato Party with the Party Potatoes!",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 392 15 name:Party_Potatoe"
				)
			)
		),
		199, Level.valueOf(
			"Yes Cigarr!",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"give {m} 1 15 name:Yes_Cigarr!"
				)
			)
		),
		200, Level.valueOf(
			"Tip-Top-Ticketeer",
			Reaction.valueOf(
				null,
				null,
				MUtil.list(
					"money give {m} 70"
				)
			)
		)
	);
	public Map<Integer, Level> getCountToLevel()
	{
		return new TreeMap<Integer, Level>(this.countToLevel);
	}
	public void setCountToAchievement(Map<Integer, Level> countToLevel)
	{
		this.countToLevel = new TreeMap<Integer, Level>(countToLevel);
		this.changed();
	}
	
	public Level getLevelForCount(int count)
	{
		Level ret = null;
		for (Entry<Integer, Level> entry : this.getCountToLevel().entrySet())
		{
			if (entry.getKey() > count) break;
			ret = entry.getValue();
		}
		return ret;
	}

}
