package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款单状态查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:46:53
 */
public class XingheLendassistCarfinauctionApplystatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6536653385717155254L;

	/**
	 * 星河申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 外部订单号（阿里拍卖单号）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
