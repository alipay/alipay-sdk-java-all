package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易卖家可分配授信额度修改
 *
 * @author auto create
 * @since 1.0, 2020-07-10 19:41:54
 */
public class AlipayTradeMerchantCreditModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5899763861669315751L;

	/**
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 当前要修改的信用额度，绝对值

单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("current_credit_quota")
	private String currentCreditQuota;

	/**
	 * 标识商家授信额度的来源，具体的值由支付宝定义
	 */
	@ApiField("merchant_credit_source")
	private String merchantCreditSource;

	/**
	 * 商户的userId
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 未修改前的卖家授信分配的额度

单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("previous_credit_quota")
	private String previousCreditQuota;

	public String getCreditScene() {
		return this.creditScene;
	}
	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

	public String getCurrentCreditQuota() {
		return this.currentCreditQuota;
	}
	public void setCurrentCreditQuota(String currentCreditQuota) {
		this.currentCreditQuota = currentCreditQuota;
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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPreviousCreditQuota() {
		return this.previousCreditQuota;
	}
	public void setPreviousCreditQuota(String previousCreditQuota) {
		this.previousCreditQuota = previousCreditQuota;
	}

}
