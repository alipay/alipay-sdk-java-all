package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包参与者信息
 *
 * @author auto create
 * @since 1.0, 2022-08-01 11:51:20
 */
public class ParticipantForm extends AlipayObject {

	private static final long serialVersionUID = 4297969693482995211L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 参与者账号
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 参与者账号类型
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
