package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品抽拥比例
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:56:56
 */
public class ItemModeCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 2216638258454773766L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 抽佣比例，无单位。如0.0400表示4%的抽佣比例。
	 */
	@ApiField("item_rate")
	private String itemRate;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemRate() {
		return this.itemRate;
	}
	public void setItemRate(String itemRate) {
		this.itemRate = itemRate;
	}

}
