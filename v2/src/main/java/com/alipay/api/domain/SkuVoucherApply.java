package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品凭证申请列表
 *
 * @author auto create
 * @since 1.0, 2023-12-13 17:16:21
 */
public class SkuVoucherApply extends AlipayObject {

	private static final long serialVersionUID = 6429928841182179435L;

	/**
	 * 数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 支付宝商品id，全局唯一
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商户自己域内的商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
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
