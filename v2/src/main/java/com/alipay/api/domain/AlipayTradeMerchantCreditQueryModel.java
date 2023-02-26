package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易卖家可赊账额度查询
 *
 * @author auto create
 * @since 1.0, 2020-07-10 19:41:23
 */
public class AlipayTradeMerchantCreditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6761719499944517162L;

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
	 * 商家授权开通账期的卖家userid
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

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
