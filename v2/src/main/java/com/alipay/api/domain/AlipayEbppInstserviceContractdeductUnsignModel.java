package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代扣合约版解约
 *
 * @author auto create
 * @since 1.0, 2022-12-20 12:12:50
 */
public class AlipayEbppInstserviceContractdeductUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 5841575861783662844L;

	/**
	 * 代扣签约协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 用户户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户签约的支付宝账号id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
