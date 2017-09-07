package ldh.facade.fee.utils;

import java.util.Comparator;

import ldh.facade.fee.entity.FeeFormula;


/**
 * 计费公式比较器
 * 
 * @author zws
 * 
 */
public class FormulaComparator implements Comparator<FeeFormula> {
	@Override
	public int compare(FeeFormula o1, FeeFormula o2) {
		if (o1.getMinLadderAmount().compareTo(o2.getMinLadderAmount()) != 1) {
			return -1;
		} else {
			return 1;
		}
	}

}
