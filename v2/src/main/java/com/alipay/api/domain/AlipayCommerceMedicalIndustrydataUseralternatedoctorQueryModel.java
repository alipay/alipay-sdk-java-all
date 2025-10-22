package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询域内用户已备选好大夫医生
 *
 * @author auto create
 * @since 1.0, 2025-03-26 14:29:47
 */
public class AlipayCommerceMedicalIndustrydataUseralternatedoctorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3339543921257974759L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id_open_id")
	private String userIdOpenId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getUserIdOpenId() {
		return this.userIdOpenId;
	}
	public void setUserIdOpenId(String userIdOpenId) {
		this.userIdOpenId = userIdOpenId;
	}

}
