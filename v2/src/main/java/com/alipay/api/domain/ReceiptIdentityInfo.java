package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:17:56
 */
public class ReceiptIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 1814219181864713259L;

	/**
	 * 收单身份名称
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 商户PID/SMID（合作伙伴ID）
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 门店ID，不传则代表该商户下所有门店
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getIdentityName() {
		return this.identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
