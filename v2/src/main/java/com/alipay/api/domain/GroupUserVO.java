package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群用户信息openapi模型,用于编辑商家群群组的群主和群管理员信息
 *
 * @author auto create
 * @since 1.0, 2024-04-16 19:58:35
 */
public class GroupUserVO extends AlipayObject {

	private static final long serialVersionUID = 1112561834227253414L;

	/**
	 * 身份证后4位，后台会进行校验。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户openid，2088开头的16位数字。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户user_id，2088开头的16位数字。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称（花名 or  昵称），后台会校验是否是真实姓名。
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
