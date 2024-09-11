package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商品信息修改
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemModifyOutItemInfo extends AlipayObject {

	private static final long serialVersionUID = 8738657684479122234L;

	/**
	 * 商品小程序appId
	 */
	@ApiField("item_app_id")
	private String itemAppId;

	/**
	 * 需要查询优惠信息的商品商家侧ID
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
