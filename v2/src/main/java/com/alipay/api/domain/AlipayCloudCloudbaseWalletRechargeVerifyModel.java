package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户欠费冲正后核销欠费账单
 *
 * @author auto create
 * @since 1.0, 2025-03-07 17:52:25
 */
public class AlipayCloudCloudbaseWalletRechargeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7848377559517366881L;

	/**
	 * 小程序AppID
	 */
	@ApiField("recharge_app_id")
	private String rechargeAppId;

	public String getRechargeAppId() {
		return this.rechargeAppId;
	}
	public void setRechargeAppId(String rechargeAppId) {
		this.rechargeAppId = rechargeAppId;
	}

}
