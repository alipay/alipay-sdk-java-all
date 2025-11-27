package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2022-11-18 14:09:20
 */
public class AlipayOpenPublicAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4651452673546555951L;

	/**
	 * 账户添加成功，在支付宝与其对应的协议号。如果账户重复添加，接口保证幂等依然视为添加成功，返回此前该账户在支付宝对应的协议号。其他异常该字段不存在。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	/**
	 * 开发者期望在服务窗首页看到的关于该用户的显示信息，最长10个字符
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 要绑定的商户会员对应的支付宝userid，2088开头长度为16位的字符串
	 */
	@ApiField("from_user_id")
	private String fromUserId;

	/**
	 * 支付宝用户的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 要绑定的商户会员的真实姓名，最长10个汉字
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 备注信息，开发者可以通过该字段纪录其他的额外信息
	 */
	@ApiField("remark")
	private String remark;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
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

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
