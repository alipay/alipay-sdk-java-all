package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2019-01-31 16:18:37
 */
public class KoubeiMallScanpurchasePreorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6463774968924943351L;

	/**
	 * 预订单编号
	 */
	@ApiField("advance_order_id")
	private String advanceOrderId;

	public String getAdvanceOrderId() {
		return this.advanceOrderId;
	}
	public void setAdvanceOrderId(String advanceOrderId) {
		this.advanceOrderId = advanceOrderId;
	}

}
