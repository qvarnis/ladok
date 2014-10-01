package se.uu.its.ladok.feeds.test;

import java.util.List;

import org.apache.abdera.model.Entry;
import org.junit.Test;

import se.sunet.ati.ladok.feeds.EventUtils;
import se.sunet.ati.ladok.feeds.FeedFetcher;

public class FeedFetcherTest {
	
	@Test
	public void testFetcher() throws Exception {
		FeedFetcher f1 = new FeedFetcher();	
		List<Entry> entries = f1.getEntries(0, 43);
		System.out.println("Found " + entries.size() + " entries");
		for(Entry e : entries) {
			System.out.println(e.getId());
		}
	}

}
