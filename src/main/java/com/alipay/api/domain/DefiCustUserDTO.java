package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能科技同一客户平台用户模型
 *
 * @author auto create
 * @since 1.0, 2020-09-23 15:58:16
 */
public class DefiCustUserDTO extends AlipayObject {

	private static final long serialVersionUID = 1669298462139446936L;

	/**
	 * 会员信息
	 */
	@ApiField("member_info")
	private DefiCustMemberDTO memberInfo;

	/**
	 * ACTIVE("ACTIVE", "激活状态"), FROZEN("FROZEN", "冻结状态"), DISABLED("DISABLED", "禁用状态"),;
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * user id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户手机
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public DefiCustMemberDTO getMemberInfo() {
		return this.memberInfo;
	}
	public void setMemberInfo(DefiCustMemberDTO memberInfo) {
		this.memberInfo = memberInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserEmail() {
		return this.userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
