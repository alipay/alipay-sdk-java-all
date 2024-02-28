package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商品信息
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:46:12
 */
public class VoucherAvailableOutItemInfo extends AlipayObject {

	private static final long serialVersionUID = 6561174735132785782L;

	/**
	 * 小程序ID
	 */
	@ApiField("item_app_id")
	private String itemAppId;

	/**
	 * 外部商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getItemAppId() {
		return this.itemAppId;
	}
	public void setItemAppId(String itemAppId) {
		this.itemAppId = itemAppId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
