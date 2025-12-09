package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易退款信息
 *
 * @author auto create
 * @since 1.0, 2025-09-22 10:55:08
 */
public class UnifiedSettleRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 2113157272715518513L;

	/**
	 * 表示退款同步的类型，比如用于标识退款时是否发生垫资
	 */
	@ApiField("refund_type")
	private String refundType;

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

}
