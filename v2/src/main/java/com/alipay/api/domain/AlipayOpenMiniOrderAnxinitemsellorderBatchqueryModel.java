package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心卡售卖账单信息
 *
 * @author auto create
 * @since 1.0, 2024-05-28 11:04:34
 */
public class AlipayOpenMiniOrderAnxinitemsellorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3475673285719458294L;

	/**
	 * 订单创建日期，格式为yyyy-MM-dd
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 分页标识，第一页无须传入，上一页返回会给出
	 */
	@ApiField("page_token")
	private String pageToken;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageToken() {
		return this.pageToken;
	}
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
