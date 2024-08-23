package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动失败商品
 *
 * @author auto create
 * @since 1.0, 2023-12-10 18:13:25
 */
public class ItemPromoActivityFailVO extends AlipayObject {

	private static final long serialVersionUID = 6636494372938147212L;

	/**
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 商家侧 id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
