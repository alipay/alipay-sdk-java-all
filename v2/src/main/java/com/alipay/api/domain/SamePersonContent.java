package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同人场景推送人群附属的下单页展示信息
 *
 * @author auto create
 * @since 1.0, 2025-12-01 10:29:39
 */
public class SamePersonContent extends AlipayObject {

	private static final long serialVersionUID = 5439593671898976719L;

	/**
	 * 用户当前脱敏登录账号
	 */
	@ApiField("cur_account_login_id")
	private String curAccountLoginId;

	/**
	 * 用户当前脱敏支付账号
	 */
	@ApiField("pay_account_login_id")
	private String payAccountLoginId;

	/**
	 * 用户当前脱敏支付账号名称
	 */
	@ApiField("pay_account_nick_name")
	private String payAccountNickName;

	public String getCurAccountLoginId() {
		return this.curAccountLoginId;
	}
	public void setCurAccountLoginId(String curAccountLoginId) {
		this.curAccountLoginId = curAccountLoginId;
	}

	public String getPayAccountLoginId() {
		return this.payAccountLoginId;
	}
	public void setPayAccountLoginId(String payAccountLoginId) {
		this.payAccountLoginId = payAccountLoginId;
	}

	public String getPayAccountNickName() {
		return this.payAccountNickName;
	}
	public void setPayAccountNickName(String payAccountNickName) {
		this.payAccountNickName = payAccountNickName;
	}

}
