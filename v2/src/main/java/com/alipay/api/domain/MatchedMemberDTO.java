package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-27 15:56:19
 */
public class MatchedMemberDTO extends AlipayObject {

	private static final long serialVersionUID = 3219273678718465917L;

	/**
	 * 档案成员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 档案成员名称
	 */
	@ApiField("member_name")
	private String memberName;

	/**
	 * 档案成员角色
	 */
	@ApiField("member_role")
	private String memberRole;

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return this.memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberRole() {
		return this.memberRole;
	}
	public void setMemberRole(String memberRole) {
		this.memberRole = memberRole;
	}

}
