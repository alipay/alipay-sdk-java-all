package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现记录查询
 *
 * @author auto create
 * @since 1.0, 2023-08-22 20:20:18
 */
public class AlipayCloudCloudbaseWalletRefundhistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7785793128196845165L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 提现日期
	 */
	@ApiField("refund_date")
	private String refundDate;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getRefundDate() {
		return this.refundDate;
	}
	public void setRefundDate(String refundDate) {
		this.refundDate = refundDate;
	}

}
