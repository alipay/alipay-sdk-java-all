package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现资产主体模型
 *
 * @author auto create
 * @since 1.0, 2022-01-05 10:55:29
 */
public class WithdrawPrincipalDTO extends AlipayObject {

	private static final long serialVersionUID = 6233349288152856847L;

	/**
	 * 可变ID
	 */
	@ApiField("external_entity_id")
	private String externalEntityId;

	/**
	 * 商户定义的卡编号
	 */
	@ApiField("partner_card_no")
	private String partnerCardNo;

	/**
	 * 主体id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 主体类型
SUB_MERCHANT_ALIPAY_ACC:二级商家绑定的支付宝余额账户,
SUB_MERCHANT_BANKCARD:二级商家绑定的银行卡,
ALIPAY_ACC:普通支付宝余额账户,
BANKCARD:普通银行卡
	 */
	@ApiField("principal_type")
	private String principalType;

	public String getExternalEntityId() {
		return this.externalEntityId;
	}
	public void setExternalEntityId(String externalEntityId) {
		this.externalEntityId = externalEntityId;
	}

	public String getPartnerCardNo() {
		return this.partnerCardNo;
	}
	public void setPartnerCardNo(String partnerCardNo) {
		this.partnerCardNo = partnerCardNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}
