package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现记录查询
 *
 * @author auto create
 * @since 1.0, 2023-09-01 16:01:56
 */
public class AlipayCloudCloudbaseWalletRefundhistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6322723372539728786L;

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
