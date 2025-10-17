package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 续费询券
 *
 * @author auto create
 * @since 1.0, 2025-08-04 11:10:24
 */
public class AlipayCloudCloudbaseCouponsRenewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3394927776459949913L;

	/**
	 * 应用ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 购买时长(月)
	 */
	@ApiField("purchase_month")
	private String purchaseMonth;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getPurchaseMonth() {
		return this.purchaseMonth;
	}
	public void setPurchaseMonth(String purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}

}
