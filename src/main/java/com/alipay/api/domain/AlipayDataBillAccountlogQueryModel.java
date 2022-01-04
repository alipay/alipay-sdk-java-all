package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户账务明细查询
 *
 * @author auto create
 * @since 1.0, 2021-11-30 10:00:35
 */
public class AlipayDataBillAccountlogQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8256553636243451919L;

	/**
	 * 支付宝订单号，通过支付宝订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 账务流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商户订单号，通过商户订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 分页号，从1开始
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小1000-2000，默认2000
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 账务流水创建时间的起始范围
	 */
	@ApiField("start_time")
	private String startTime;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
