package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品分类数据同步
 *
 * @author auto create
 * @since 1.0, 2026-04-09 09:16:49
 */
public class AlipayDigitalmgmtDcmealMightydishcategoryInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5516735276371227255L;

	/**
	 * 菜品分类数组
	 */
	@ApiListField("dish_category_list")
	@ApiField("dcmeal_dish_category_detail")
	private List<DcmealDishCategoryDetail> dishCategoryList;

	public List<DcmealDishCategoryDetail> getDishCategoryList() {
		return this.dishCategoryList;
	}
	public void setDishCategoryList(List<DcmealDishCategoryDetail> dishCategoryList) {
		this.dishCategoryList = dishCategoryList;
	}

}
