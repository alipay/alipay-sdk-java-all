package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单完结
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:49:19
 */
public class AlipayMerchantSolcreditserviceprodOrderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 6794744784165857955L;

	/**
	 * 扣款失败资金追回（继续扣款）：
FUNDS_RECOVERY
立即完结无需追回资金：
IMMEDIATELY_END
	 */
	@ApiField("end_mode")
	private String endMode;

	/**
	 * 系统生成订单唯一编号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getEndMode() {
		return this.endMode;
	}
	public void setEndMode(String endMode) {
		this.endMode = endMode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
