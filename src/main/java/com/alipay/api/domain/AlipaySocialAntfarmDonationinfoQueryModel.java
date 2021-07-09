package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询蚂蚁庄园捐赠信息
 *
 * @author auto create
 * @since 1.0, 2021-07-05 19:54:19
 */
public class AlipaySocialAntfarmDonationinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4814266682745113919L;

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
