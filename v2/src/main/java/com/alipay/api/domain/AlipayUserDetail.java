package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员信息详情
 *
 * @author auto create
 * @since 1.0, 2022-11-15 14:55:54
 */
public class AlipayUserDetail extends AlipayObject {

	private static final long serialVersionUID = 5298919245346765251L;

	/**
	 * 支付宝OpenId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 是否通过实名认证
	 */
	@ApiField("certified")
	private Boolean certified;

	/**
	 * 支付宝登录号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 性别。可选值:m(男),f(女)
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 用户状态。可选:normal(正常), supervise (监管),delete(注销)
	 */
	@ApiField("user_status")
	private String userStatus;

	/**
	 * 用户类型。可选：personal（个人），company（公司）
	 */
	@ApiField("user_type")
	private String userType;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Boolean getCertified() {
		return this.certified;
	}
	public void setCertified(Boolean certified) {
		this.certified = certified;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUserStatus() {
		return this.userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
