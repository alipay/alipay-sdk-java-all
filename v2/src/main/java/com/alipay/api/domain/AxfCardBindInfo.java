package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付绑卡信息
 *
 * @author auto create
 * @since 1.0, 2024-09-27 10:58:16
 */
public class AxfCardBindInfo extends AlipayObject {

	private static final long serialVersionUID = 2515767165121887456L;

	/**
	 * 绑卡状态
	 */
	@ApiField("bind_card_status")
	private Boolean bindCardStatus;

	/**
	 * 商户绑卡时传入的用户名称
	 */
	@ApiField("bind_user_name")
	private String bindUserName;

	/**
	 * 商户绑卡时传入的手机号
	 */
	@ApiField("bind_user_phone")
	private String bindUserPhone;

	public Boolean getBindCardStatus() {
		return this.bindCardStatus;
	}
	public void setBindCardStatus(Boolean bindCardStatus) {
		this.bindCardStatus = bindCardStatus;
	}

	public String getBindUserName() {
		return this.bindUserName;
	}
	public void setBindUserName(String bindUserName) {
		this.bindUserName = bindUserName;
	}

	public String getBindUserPhone() {
		return this.bindUserPhone;
	}
	public void setBindUserPhone(String bindUserPhone) {
		this.bindUserPhone = bindUserPhone;
	}

}
