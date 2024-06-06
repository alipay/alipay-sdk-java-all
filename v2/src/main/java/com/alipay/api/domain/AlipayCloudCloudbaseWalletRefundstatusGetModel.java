package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现状态查询
 *
 * @author auto create
 * @since 1.0, 2023-10-16 20:24:47
 */
public class AlipayCloudCloudbaseWalletRefundstatusGetModel extends AlipayObject {

	private static final long serialVersionUID = 4193912474597564618L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 提现单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getRefundOrderNo() {
		return this.refundOrderNo;
	}
	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}

}
