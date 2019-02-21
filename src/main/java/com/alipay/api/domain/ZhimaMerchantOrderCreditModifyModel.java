package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用信用租订单信息修改
 *
 * @author auto create
 * @since 1.0, 2018-06-01 10:06:49
 */
public class ZhimaMerchantOrderCreditModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8192673533181931333L;

	/**
	 * 外部订单号, 用于定位需要修改的订单
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 逾期时间，不为空时将修改当前订单的逾期时间，入参不得早于系统当前时间
	 */
	@ApiField("overdue_time")
	private Date overdueTime;

	/**
	 * 芝麻订单号，用于定位要修改的订单
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Date getOverdueTime() {
		return this.overdueTime;
	}
	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
	}

	public String getZmOrderNo() {
		return this.zmOrderNo;
	}
	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}

}
