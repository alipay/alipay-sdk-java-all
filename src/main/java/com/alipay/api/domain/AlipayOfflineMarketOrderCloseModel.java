package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑到家业务，外部商户取消订单
 *
 * @author auto create
 * @since 1.0, 2015-12-07 10:33:57
 */
public class AlipayOfflineMarketOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6511182529269546245L;

	/**
	 * 取消订单的原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
