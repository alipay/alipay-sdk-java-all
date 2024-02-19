package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品item信息
 *
 * @author auto create
 * @since 1.0, 2023-08-02 15:13:34
 */
public class DrugItemInfo extends AlipayObject {

	private static final long serialVersionUID = 1754846893785479816L;

	/**
	 * 数量
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 机构药品码
	 */
	@ApiField("item_id")
	private String itemId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
