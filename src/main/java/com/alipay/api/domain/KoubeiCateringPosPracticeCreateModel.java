package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增做法
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:22:52
 */
public class KoubeiCateringPosPracticeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1669464846657378147L;

	/**
	 * 做法名称
	 */
	@ApiField("practice_name")
	private String practiceName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getPracticeName() {
		return this.practiceName;
	}
	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
