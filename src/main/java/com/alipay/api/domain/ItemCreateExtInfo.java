package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-05-19 20:32:47
 */
public class ItemCreateExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4728648818222462748L;

	/**
	 * 小程序跳转链接
	 */
	@ApiField("action_link")
	private String actionLink;

	/**
	 * 业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 服务描述
	 */
	@ApiField("ext_desc")
	private String extDesc;

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

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getExtDesc() {
		return this.extDesc;
	}
	public void setExtDesc(String extDesc) {
		this.extDesc = extDesc;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
