package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算消息通知内容
 *
 * @author auto create
 * @since 1.0, 2023-07-27 13:59:07
 */
public class ConfirmSettleDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2343323829841416987L;

	/**
	 * 仅当trans_in_type为userId时，返回脱敏的支付宝登录号。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 本次确认结算的实际结算金额，单位为元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 结算主体标识。当结算主体类型为SecondMerchant时，为二级商户的SecondMerchantID
	 */
	@ApiField("settle_entity_id")
	private String settleEntityId;

	/**
	 * 结算主体类型。 
二级商户:SecondMerchant;
商户门店:Store;
直连商户:Partner
	 */
	@ApiField("settle_entity_type")
	private String settleEntityType;

	/**
	 * 当结算类型为cardAliasNo时返回结算卡编号； 当结算类型为userId时为脱敏的支付宝账号。
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 结算收款方的账户类型
cardAliasNo/userId。
cardAliasNo表示结算到银行卡；
userId表示结算到支付宝账号
	 */
	@ApiField("trans_in_type")
	private String transInType;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSettleEntityId() {
		return this.settleEntityId;
	}
	public void setSettleEntityId(String settleEntityId) {
		this.settleEntityId = settleEntityId;
	}

	public String getSettleEntityType() {
		return this.settleEntityType;
	}
	public void setSettleEntityType(String settleEntityType) {
		this.settleEntityType = settleEntityType;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

}
