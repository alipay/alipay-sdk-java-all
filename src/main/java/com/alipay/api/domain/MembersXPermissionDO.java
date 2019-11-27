package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户和权限关系
 *
 * @author auto create
 * @since 1.0, 2017-11-08 18:10:18
 */
public class MembersXPermissionDO extends AlipayObject {

	private static final long serialVersionUID = 4172511111797945982L;

	/**
	 * 客户ID
	 */
	@ApiField("memberid")
	private Long memberid;

	/**
	 * 权限id
	 */
	@ApiField("permissionid")
	private Long permissionid;

	public Long getMemberid() {
		return this.memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public Long getPermissionid() {
		return this.permissionid;
	}
	public void setPermissionid(Long permissionid) {
		this.permissionid = permissionid;
	}

}
