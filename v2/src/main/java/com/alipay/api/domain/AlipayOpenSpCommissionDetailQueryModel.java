package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抽佣详情查询接口
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:28
 */
public class AlipayOpenSpCommissionDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4617193491618417211L;

	/**
	 * 抽佣场景
	 */
	@ApiField("commission_scene")
	private String commissionScene;

	/**
	 * 商家 id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户登录号
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	public String getCommissionScene() {
		return this.commissionScene;
	}
	public void setCommissionScene(String commissionScene) {
		this.commissionScene = commissionScene;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantLogonId() {
		return this.merchantLogonId;
	}
	public void setMerchantLogonId(String merchantLogonId) {
		this.merchantLogonId = merchantLogonId;
	}

}
