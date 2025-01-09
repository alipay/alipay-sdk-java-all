package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构专户开户
 *
 * @author auto create
 * @since 1.0, 2024-06-17 11:02:34
 */
public class AlipayFinancialnetAuthSpaccountOpenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5311438599477688267L;

	/**
	 * 发卡行机构名称id
	 */
	@ApiField("bank_card_inst")
	private String bankCardInst;

	/**
	 * 用于开机构专户的银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 借记卡-DC
贷记卡-CC
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/**
	 * 业务标识ID
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 银行机构
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 签约产品ID
	 */
	@ApiField("sign_product_id")
	private String signProductId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBankCardInst() {
		return this.bankCardInst;
	}
	public void setBankCardInst(String bankCardInst) {
		this.bankCardInst = bankCardInst;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCardType() {
		return this.bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getSignProductId() {
		return this.signProductId;
	}
	public void setSignProductId(String signProductId) {
		this.signProductId = signProductId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
