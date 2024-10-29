package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人社用户银行卡实名标识接口
 *
 * @author auto create
 * @since 1.0, 2022-11-17 22:52:50
 */
public class AlipayCommerceMedicalBankcardCertificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2683418778764262811L;

	/**
	 * OpenId开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

}
