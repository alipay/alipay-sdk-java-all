package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新做法
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:28:58
 */
public class KoubeiCateringPosPracticeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5337724696248746652L;

	/**
	 * 做法id
	 */
	@ApiField("practice_id")
	private String practiceId;

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

	public String getPracticeId() {
		return this.practiceId;
	}
	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

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
