package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 页面文案描述
 *
 * @author auto create
 * @since 1.0, 2023-09-06 10:03:03
 */
public class ShowText extends AlipayObject {

	private static final long serialVersionUID = 7671335862811373259L;

	/**
	 * 订单对应的菜品档口信息，用于小程序页面文案展示，如：早餐/午餐/晚餐/夜宵
	 */
	@ApiField("meal_desc")
	private String mealDesc;

	public String getMealDesc() {
		return this.mealDesc;
	}
	public void setMealDesc(String mealDesc) {
		this.mealDesc = mealDesc;
	}

}
