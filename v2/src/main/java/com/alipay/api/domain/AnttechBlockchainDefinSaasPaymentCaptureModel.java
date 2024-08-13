package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权请款
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:51:58
 */
public class AnttechBlockchainDefinSaasPaymentCaptureModel extends AlipayObject {

	private static final long serialVersionUID = 6512358477971944726L;

	/**
	 * 请款金额，单位为元。支持预授权后全额请款、或预授权后先部分撤销再部分请款。精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("capture_amount")
	private String captureAmount;

	/**
	 * 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
	 */
	@ApiField("capture_currency")
	private String captureCurrency;

	/**
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 付款方外部业务平台会员ID
	 */
	@ApiField("out_payer_id")
	private ReferenceId outPayerId;

	/**
	 * 外部请求ID
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public String getCaptureAmount() {
		return this.captureAmount;
	}
	public void setCaptureAmount(String captureAmount) {
		this.captureAmount = captureAmount;
	}

	public String getCaptureCurrency() {
		return this.captureCurrency;
	}
	public void setCaptureCurrency(String captureCurrency) {
		this.captureCurrency = captureCurrency;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public ReferenceId getOutPayerId() {
		return this.outPayerId;
	}
	public void setOutPayerId(ReferenceId outPayerId) {
		this.outPayerId = outPayerId;
	}

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}
