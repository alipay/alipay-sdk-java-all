package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openApi支付宝消费信贷用户鉴权
 *
 * @author auto create
 * @since 1.0, 2017-03-06 14:31:59
 */
public class AlipayPcreditUserCreditauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5796348748148513215L;

	/**
	 * 所要鉴权的额度值，注意，单位是分；如传300，表示鉴权300分能不能过
	 */
	@ApiField("authamount")
	private String authamount;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthamount() {
		return this.authamount;
	}
	public void setAuthamount(String authamount) {
		this.authamount = authamount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
