package se.sunet.ati.ladok.atom.dto.utbildningsinformation;

import se.sunet.ati.ladok.atom.dto.Handelse;

public abstract class UtbildningsinformationsHandelse extends Handelse {

	@Override
	public String toString() {
		return "UtbildningsinformationsHandelse [getLinks()=" + getLinks()
				+ ", getHandelseUid()=" + getHandelseUid()
				+ ", getHandelseTid()=" + getHandelseTid() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
