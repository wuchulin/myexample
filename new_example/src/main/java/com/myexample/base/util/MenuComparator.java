package com.myexample.base.util;

import java.util.Comparator;

import com.myexample.system.model.BaseMenu;

public class MenuComparator implements Comparator<BaseMenu> {
	public int compare(BaseMenu o1, BaseMenu o2) {
		int seq1 = 0;
		int seq2 = 0;
		try {
			seq1 = o1.getSequence().intValue();
			seq2 = o2.getSequence().intValue();
		} catch (Exception e) {
		}

		return seq1 - seq2;
	}
}
