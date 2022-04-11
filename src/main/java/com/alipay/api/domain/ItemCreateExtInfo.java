package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-03-10 20:37:18
 */
public class ItemCreateExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3182473222446491282L;

	/**
	 * 小程序跳转链接
	 */
	@ApiField("action_link")
	private String actionLink;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getActionLink() {
		return this.actionLink;
	}
	public void setActionLink(String actionLink) {
		this.actionLink = actionLink;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
