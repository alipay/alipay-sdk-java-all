package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国外向国内汇入汇款时候，对汇款的基本数据做验证。该接口只做验证，正在落单是另外一个接口。
 *
 * @author auto create
 * @since 1.0, 2016-02-17 13:16:28
 */
public class AlipayOverseasInremitRemittanceValidateModel extends AlipayObject {

	private static final long serialVersionUID = 2592267379998614765L;

	/**
	 * partnerId
	 */
	@ApiField("partner")
	private String partner;

	/**
	 * 接受方期望接受到的钱数值，两位小数
	 */
	@ApiField("receiving_amount")
	private String receivingAmount;

	/**
	 * 接受币种
	 */
	@ApiField("receiving_amount_currency")
	private String receivingAmountCurrency;

	/**
	 * 接受人，包括名，姓和账号的logonId
	 */
	@ApiField("recipient")
	private String recipient;

	/**
	 * 表明验证模式，可以是全名，不需要验证，或者姓验证
	 */
	@ApiField("validate_type")
	private String validateType;

	public String getPartner() {
		return this.partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getReceivingAmount() {
		return this.receivingAmount;
	}
	public void setReceivingAmount(String receivingAmount) {
		this.receivingAmount = receivingAmount;
	}

	public String getReceivingAmountCurrency() {
		return this.receivingAmountCurrency;
	}
	public void setReceivingAmountCurrency(String receivingAmountCurrency) {
		this.receivingAmountCurrency = receivingAmountCurrency;
	}

	public String getRecipient() {
		return this.recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getValidateType() {
		return this.validateType;
	}
	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

}
