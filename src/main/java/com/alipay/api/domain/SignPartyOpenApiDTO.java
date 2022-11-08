package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署主体模型
 *
 * @author auto create
 * @since 1.0, 2021-12-27 15:02:48
 */
public class SignPartyOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 4438669883766393394L;

	/**
	 * 主体注册地址
	 */
	@ApiField("address")
	private AddressOpenApiDTO address;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 公司编码类型
	 */
	@ApiField("corp_type")
	private String corpType;

	/**
	 * 联系邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 身份标识id
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 主体名称（当partyType=CORPRATION时，不能为空）
	 */
	@ApiField("party_name")
	private String partyName;

	/**
	 * 主体类型
	 */
	@ApiField("party_type")
	private String partyType;

	/**
	 * 个人编码类型,（当partyType=PERSONAL时，不能为空）
	 */
	@ApiField("personal_type")
	private String personalType;

	public AddressOpenApiDTO getAddress() {
		return this.address;
	}
	public void setAddress(AddressOpenApiDTO address) {
		this.address = address;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getCorpType() {
		return this.corpType;
	}
	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getPartyName() {
		return this.partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyType() {
		return this.partyType;
	}
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public String getPersonalType() {
		return this.personalType;
	}
	public void setPersonalType(String personalType) {
		this.personalType = personalType;
	}

}
