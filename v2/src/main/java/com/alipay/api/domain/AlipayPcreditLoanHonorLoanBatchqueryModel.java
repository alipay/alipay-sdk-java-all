package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀借款记录列表查询
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:06:18
 */
public class AlipayPcreditLoanHonorLoanBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3171246996373959795L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 荣耀用户ID
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 当前页码，不传则全量返回
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部追踪ID
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 请求来源 CUSTOMER-C端对应用户发起、SCHEDULER-调度发起、BACKDOOR-小二对应后台用户调用
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 借款状态，1-申请中，2-正常还款中，3-已逾期，4-已结清，5-借款失败
	 */
	@ApiField("status")
	private Long status;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
