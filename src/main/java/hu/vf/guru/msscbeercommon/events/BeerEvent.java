package hu.vf.guru.msscbeercommon.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable
{
	static final long serialVersionUID = 8553234097486377738L;

	private BeerDto beerDto;
}
