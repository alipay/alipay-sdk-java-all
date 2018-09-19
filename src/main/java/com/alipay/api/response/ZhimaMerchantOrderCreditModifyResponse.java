package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.credit.modify response.
 * 
 * @author auto create
 * @since 1.0, 2018-06-01 10:10:00
 */
public class ZhimaMerchantOrderCreditModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8668893268846961315L;

	/** 
	 * 被修改订单的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 被修改订单的新逾期时间
	 */
	@ApiField("overdue_time")
	private Date overdueTime;

	/** 
	 * 被修改的订单的芝麻订单号
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
	}
	public Date getOverdueTime( ) {
		return this.overdueTime;
	}

	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}
	public String getZmOrderNo( ) {
		return this.zmOrderNo;
	}

}
