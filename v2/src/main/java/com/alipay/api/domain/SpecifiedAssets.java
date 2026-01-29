package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户签约指定可用渠道
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:40
 */
public class SpecifiedAssets extends AlipayObject {

	private static final long serialVersionUID = 4517882518272261731L;

	/**
	 * 指定银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 机构编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 资产类型，用以标识资产大类。
	 */
	@ApiField("pay_tool_type")
	private String payToolType;

	/**
	 * 限定支付渠道的原因类型
	 */
	@ApiField("specified_reason_code")
	private String specifiedReasonCode;

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getPayToolType() {
		return this.payToolType;
	}
	public void setPayToolType(String payToolType) {
		this.payToolType = payToolType;
	}

	public String getSpecifiedReasonCode() {
		return this.specifiedReasonCode;
	}
	public void setSpecifiedReasonCode(String specifiedReasonCode) {
		this.specifiedReasonCode = specifiedReasonCode;
	}

}
