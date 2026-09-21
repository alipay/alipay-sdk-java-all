package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单退款状态变更信
 *
 * @author auto create
 * @since 1.0, 2026-08-26 12:37:47
 */
public class DistributionOrderRefundStatusInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5697463285911972592L;

	/**
	 * 退款单状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

}
