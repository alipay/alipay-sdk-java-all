package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账参与方信息
 *
 * @author auto create
 * @since 1.0, 2024-09-14 15:22:04
 */
public class TransferParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 5319897948547984545L;

	/**
	 * 参与方扩展信息
	 */
	@ApiField("ext_info")
	private ParticipantExtInfo extInfo;

	/**
	 * 参与方的身份标识，具体的取值需要和identity_type制定的类型对应的取值匹配。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 参与方的身份类型，有限枚举，指定说明参与方身份标识具体的取值类型。
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 参与方主体真实姓名，如果非空，将校验收款支付宝账号姓名一致性。当identity_type=ALIPAY_LOGON_ID时，本字段必填。
	 */
	@ApiField("name")
	private String name;

	public ParticipantExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ParticipantExtInfo extInfo) {
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
