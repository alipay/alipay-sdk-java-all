package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账角色身份信息
 *
 * @author auto create
 * @since 1.0, 2024-08-16 19:31:18
 */
public class TransParticipant extends AlipayObject {

	private static final long serialVersionUID = 6395359816716485671L;

	/**
	 * 银行卡信息
	 */
	@ApiField("bankcard_ext_info")
	private BankCardExtInfoDTO bankcardExtInfo;

	/**
	 * 身份唯一标识。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 支付宝余额户: ALIPAY_ACCOUNT；
银行卡：BANK_CARD；
资金专户：BOOK；
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 用户真实姓名，支付宝的用户姓名或银行账户名称
	 */
	@ApiField("name")
	private String name;

	public BankCardExtInfoDTO getBankcardExtInfo() {
		return this.bankcardExtInfo;
	}
	public void setBankcardExtInfo(BankCardExtInfoDTO bankcardExtInfo) {
		this.bankcardExtInfo = bankcardExtInfo;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
