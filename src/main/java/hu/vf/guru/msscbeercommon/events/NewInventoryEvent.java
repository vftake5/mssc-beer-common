package hu.vf.guru.msscbeercommon.events;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent
{
	public NewInventoryEvent(BeerDto beerDto)
	{
		super(beerDto);
	}
}
