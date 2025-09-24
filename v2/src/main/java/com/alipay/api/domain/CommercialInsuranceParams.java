package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商保支付参数
 *
 * @author auto create
 * @since 1.0, 2025-05-26 16:08:30
 */
public class CommercialInsuranceParams extends AlipayObject {

	private static final long serialVersionUID = 2351486433536894345L;

	/**
	 * 投保渠道编码，由平台方分配
	 */
	@ApiField("insure_channel_code")
	private String insureChannelCode;

	/**
	 * 投保产品名称
	 */
	@ApiField("insure_product_name")
	private String insureProductName;

	/**
	 * 支付商户号
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 支付终端号
	 */
	@ApiField("terminal_no")
	private String terminalNo;

	public String getInsureChannelCode() {
		return this.insureChannelCode;
	}
	public void setInsureChannelCode(String insureChannelCode) {
		this.insureChannelCode = insureChannelCode;
	}

	public String getInsureProductName() {
		return this.insureProductName;
	}
	public void setInsureProductName(String insureProductName) {
		this.insureProductName = insureProductName;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getTerminalNo() {
		return this.terminalNo;
	}
	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
	}

}
