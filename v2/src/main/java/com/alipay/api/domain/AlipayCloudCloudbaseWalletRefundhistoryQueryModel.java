package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现记录查询
 *
 * @author auto create
 * @since 1.0, 2025-08-08 10:17:15
 */
public class AlipayCloudCloudbaseWalletRefundhistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6745782849981255892L;

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
