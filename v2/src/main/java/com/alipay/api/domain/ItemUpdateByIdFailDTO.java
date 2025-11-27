package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量更新商品, 执行失败信息-ById
 *
 * @author auto create
 * @since 1.0, 2025-05-20 16:54:19
 */
public class ItemUpdateByIdFailDTO extends AlipayObject {

	private static final long serialVersionUID = 7281376339559116319L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 支付宝内部商品编码ID
	 */
	@ApiField("item_id")
	private String itemId;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
