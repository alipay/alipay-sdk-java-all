package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付子账户实时查余
 *
 * @author auto create
 * @since 1.0, 2025-05-07 10:08:30
 */
public class AlipayCommerceLogisticsFreightflowSubaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3318844438251998434L;

	/**
	 * 物流公司编码，由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。 本期： ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 子户卡号
	 */
	@ApiField("sub_bank_card_no")
	private String subBankCardNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSubBankCardNo() {
		return this.subBankCardNo;
	}
	public void setSubBankCardNo(String subBankCardNo) {
		this.subBankCardNo = subBankCardNo;
	}

}
