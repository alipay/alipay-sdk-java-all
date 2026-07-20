package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubscriptionPaymentDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.payment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-15 10:12:54
 */
public class AlipayTradeSubscriptionPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7718569413396345526L;

	/** 
	 * 筛选支付流水的截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 分页页数
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * null
	 */
	@ApiListField("payment_details")
	@ApiField("subscription_payment_detail")
	private List<SubscriptionPaymentDetail> paymentDetails;

	/** 
	 * 筛选支付流水的开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 需要查询的支付流水对应的订阅ID
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/** 
	 * 筛选范围内支付明细总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setPaymentDetails(List<SubscriptionPaymentDetail> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public List<SubscriptionPaymentDetail> getPaymentDetails( ) {
		return this.paymentDetails;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
