package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排菜数据同步
 *
 * @author auto create
 * @since 1.0, 2026-04-09 09:16:41
 */
public class AlipayDigitalmgmtDcmealMightydisharrangeInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3861658927437731726L;

	/**
	 * 排菜数据数组
	 */
	@ApiListField("dish_arrange_list")
	@ApiField("dcmeal_dish_arrange_detail")
	private List<DcmealDishArrangeDetail> dishArrangeList;

	public List<DcmealDishArrangeDetail> getDishArrangeList() {
		return this.dishArrangeList;
	}
	public void setDishArrangeList(List<DcmealDishArrangeDetail> dishArrangeList) {
		this.dishArrangeList = dishArrangeList;
	}

}
