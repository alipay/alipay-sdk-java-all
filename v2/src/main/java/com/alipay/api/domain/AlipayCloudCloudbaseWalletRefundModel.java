package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起提现
 *
 * @author auto create
 * @since 1.0, 2023-10-16 20:25:30
 */
public class AlipayCloudCloudbaseWalletRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5184153161935252487L;

	/**
	 * 提现金额(分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

}
