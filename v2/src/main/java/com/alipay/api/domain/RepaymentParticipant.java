package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工还款转账参与方
 *
 * @author auto create
 * @since 1.0, 2024-03-12 16:42:50
 */
public class RepaymentParticipant extends AlipayObject {

	private static final long serialVersionUID = 6154466875873886262L;

	/**
	 * 零工卡专用金还款到卡银行卡扩展参数
	 */
	@ApiField("bankcard_ext_info")
	private RepaymentBankcardExtInfo bankcardExtInfo;

	/**
	 * 参与方关联的扩展信息
	 */
	@ApiField("ext_info")
	private RepaymentParticipantExtInfo extInfo;

	/**
	 * 参与方标识，根据不同的标识类型填写对应的标识ID。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 参与方账号标识类型，支持：
1. ALIPAY_LOGON_ID
2. ALIPAY_USER_ID
3. ALIPAY_OPEN_ID
4. BANK_CARD_NO
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 参与方名称，默认可选。部分identity_type下name必须提供。
	 */
	@ApiField("name")
	private String name;

	public RepaymentBankcardExtInfo getBankcardExtInfo() {
		return this.bankcardExtInfo;
	}
	public void setBankcardExtInfo(RepaymentBankcardExtInfo bankcardExtInfo) {
		this.bankcardExtInfo = bankcardExtInfo;
	}

	public RepaymentParticipantExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(RepaymentParticipantExtInfo extInfo) {
		this.extInfo = extInfo;
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
