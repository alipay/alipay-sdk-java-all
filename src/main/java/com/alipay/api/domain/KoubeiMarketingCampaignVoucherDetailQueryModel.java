package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑券详情查询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-03 14:54:26
 */
public class KoubeiMarketingCampaignVoucherDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2762327467633462243L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
