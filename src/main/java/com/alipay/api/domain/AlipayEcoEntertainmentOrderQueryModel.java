package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值结果查询
 *
 * @author auto create
 * @since 1.0, 2017-08-03 15:46:31
 */
public class AlipayEcoEntertainmentOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7135683257853747794L;

	/**
	 * 业务扩展参数json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 订单号,对接方需保持唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 采购商代码,唯一确定采购商身份,由数娱平台分配
	 */
	@ApiField("purchaser_code")
	private String purchaserCode;

	/**
	 * unix 秒级时间戳
	 */
	@ApiField("transaction_time")
	private Long transactionTime;

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPurchaserCode() {
		return this.purchaserCode;
	}
	public void setPurchaserCode(String purchaserCode) {
		this.purchaserCode = purchaserCode;
	}

	public Long getTransactionTime() {
		return this.transactionTime;
	}
	public void setTransactionTime(Long transactionTime) {
		this.transactionTime = transactionTime;
	}

}
