package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 磋商成员列表
 *
 * @author auto create
 * @since 1.0, 2022-01-07 10:42:51
 */
public class OpenApiMatterMemberDTO extends AlipayObject {

	private static final long serialVersionUID = 7788128497567686885L;

	/**
	 * 事项编码
	 */
	@ApiField("matter_code")
	private String matterCode;

	/**
	 * 事项类型
	 */
	@ApiField("matter_type")
	private String matterType;

	/**
	 * 参与人工号
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 人员角色
	 */
	@ApiField("member_role_enum")
	private String memberRoleEnum;

	/**
	 * 真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 事项子类型
	 */
	@ApiField("sub_matter_type")
	private String subMatterType;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getMatterCode() {
		return this.matterCode;
	}
	public void setMatterCode(String matterCode) {
		this.matterCode = matterCode;
	}

	public String getMatterType() {
		return this.matterType;
	}
	public void setMatterType(String matterType) {
		this.matterType = matterType;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberRoleEnum() {
		return this.memberRoleEnum;
	}
	public void setMemberRoleEnum(String memberRoleEnum) {
		this.memberRoleEnum = memberRoleEnum;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSubMatterType() {
		return this.subMatterType;
	}
	public void setSubMatterType(String subMatterType) {
		this.subMatterType = subMatterType;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
