package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请流水撤销
 *
 * @author auto create
 * @since 1.0, 2020-06-09 15:10:24
 */
public class AlipayOfflineMarketShopApplyorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1288664541531179329L;

	/**
	 * 撤销申请流水的原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人ID，开店请求时候的操作人ID
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 要撤销的订单ID，当店铺创建、修改接口迁移至2.0时，同步返回的apply_id可以用作此接口的入参。
	 */
	@ApiField("order_id")
	private String orderId;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
