package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人社用户银行卡实名标识接口
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:45:37
 */
public class AlipayCommerceMedicalBankcardCertificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4632658794856417397L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
