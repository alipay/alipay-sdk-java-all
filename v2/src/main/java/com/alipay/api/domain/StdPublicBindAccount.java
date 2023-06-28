package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全面开放下公众平台的绑定账户
 *
 * @author auto create
 * @since 1.0, 2022-11-16 10:44:14
 */
public class StdPublicBindAccount extends AlipayObject {

	private static final long serialVersionUID = 7178517273899416958L;

	/**
	 * 协议号是商户会员在支付宝公众账号中的唯一标识。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 公众账号ID
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 绑定的商户会员号
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	/**
	 * 公众账号期望支付宝用户在公众账号首页看到的关于该用户的显示信息，最长10个汉字。
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 绑定的商户会员对应的支付宝用户号，以2088 开头的16位数字。
	 */
	@ApiField("from_user_id")
	private String fromUserId;

	/**
	 * 1
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 绑定的商户会员的真实姓名，最长10个汉字。
	 */
	@ApiField("real_name")
	private String realName;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAppId() {
		return this.appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getBindAccountNo() {
		return this.bindAccountNo;
	}
	public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFromUserId() {
		return this.fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
