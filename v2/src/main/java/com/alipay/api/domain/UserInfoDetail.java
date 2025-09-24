package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商用户信息
 *
 * @author auto create
 * @since 1.0, 2021-08-27 11:11:51
 */
public class UserInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 5478396123585113133L;

	/**
	 * 网商会员ID，可选
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商会员角色ID，可选
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 平台端会员ID
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/**
	 * 账户ID，根据类型而不同
	 */
	@ApiField("user_info_id")
	private String userInfoId;

	/**
	 * 账户类型
	 */
	@ApiField("user_info_type")
	private String userInfoType;

	/**
	 * 账号名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getUserInfoId() {
		return this.userInfoId;
	}
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getUserInfoType() {
		return this.userInfoType;
	}
	public void setUserInfoType(String userInfoType) {
		this.userInfoType = userInfoType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
