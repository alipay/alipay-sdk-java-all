package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易卖家可赊账额度初始化
 *
 * @author auto create
 * @since 1.0, 2024-01-29 11:11:35
 */
public class AlipayTradeMerchantCreditInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7182547145366264522L;

	/**
	 * 卖家可授信分配的额度单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("credit_quota")
	private String creditQuota;

	/**
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 标识商家授信额度的来源，具体的值由支付宝定义
	 */
	@ApiField("merchant_credit_source")
	private String merchantCreditSource;

	/**
	 * 卖家用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	public String getCreditQuota() {
		return this.creditQuota;
	}
	public void setCreditQuota(String creditQuota) {
		this.creditQuota = creditQuota;
	}

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getMerchantCreditSource() {
		return this.merchantCreditSource;
	}
	public void setMerchantCreditSource(String merchantCreditSource) {
		this.merchantCreditSource = merchantCreditSource;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

}
