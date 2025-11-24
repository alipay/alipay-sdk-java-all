package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增加openID映射
 *
 * @author auto create
 * @since 1.0, 2025-05-07 11:18:08
 */
public class ParticipantForm extends AlipayObject {

	private static final long serialVersionUID = 1288766965652984693L;

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

	/**
	 * 参与者账号
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/**
	 * 真实姓名,当登录号类型为ALIPAY_LOGON_ID，需传真实姓名，用于校验
	 */
	@ApiField("real_name")
	private String realName;

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

	public String getPrincipalOpenId() {
		return this.principalOpenId;
	}
	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
