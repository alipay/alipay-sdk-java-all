package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户卖出交易查询
 *
 * @author auto create
 * @since 1.0, 2019-10-11 10:56:15
 */
public class AlipayDataBillSellQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5543686842487244468L;

	/**
	 * 支付宝交易流水号。如果查询参数中指定流水号，则只查询流水号相关的记录
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 卖出交易流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商户交易号。如果查询参数中指定交易号，则只查询相关的记录
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
	 * 卖出交易流水创建时间的起始范围
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 门店编号，模糊搜索
	 */
	@ApiField("store_no")
	private String storeNo;

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

	public String getStoreNo() {
		return this.storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

}
