package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销优惠卷查询
 *
 * @author auto create
 * @since 1.0, 2024-07-11 10:51:30
 */
public class AlipayCommerceMedicalIndustrydataCouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4634376299495687932L;

	/**
	 * 商家的商户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
