package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当第三方平台接单，结束服务等，会调用此接口更新口碑到家的订单状态
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:15
 */
public class AlipayOfflineMarketOrderAmountUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 1163333488216513323L;

	/**
	 * 对修改价格的备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 修改后的应收金额
	 */
	@ApiField("real_amount")
	private String realAmount;

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

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

}
