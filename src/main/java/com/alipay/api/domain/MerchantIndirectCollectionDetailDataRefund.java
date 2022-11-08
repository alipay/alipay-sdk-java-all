package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询交易详情退款模型
 *
 * @author auto create
 * @since 1.0, 2022-09-16 10:16:06
 */
public class MerchantIndirectCollectionDetailDataRefund extends AlipayObject {

	private static final long serialVersionUID = 6433195138449633547L;

	/**
	 * 退款金额(如有退款 必填)
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退款时间（精确到秒）
	 */
	@ApiField("refund_time")
	private Date refundTime;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

}
