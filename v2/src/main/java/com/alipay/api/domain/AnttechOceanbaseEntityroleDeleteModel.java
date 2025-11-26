package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除实体角色
 *
 * @author auto create
 * @since 1.0, 2025-11-10 14:51:53
 */
public class AnttechOceanbaseEntityroleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2344122383398478817L;

	/**
	 * OceanBase Cloud的用户Id，可从个人中心获取
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 见枚举类型EntityRoleTypeEnum，目前只支持删除阿里云的
	 */
	@ApiField("role_type")
	private String roleType;

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
