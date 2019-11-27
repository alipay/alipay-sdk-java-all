package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.page.merge.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-01 18:19:56
 */
public class AlipayTradePageMergePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2397435147838585793L;

	/** 
	 * 如果和支付宝约定子订单必须同时支付成功或者同时失败时此参数才存在，取值有以下两种：
1. SUCCESS：全部订单付款成功
2. FAIL：全部订单付款失败
注：只有同事务下返回该字段
	 */
	@ApiField("merge_pay_status")
	private String mergePayStatus;

	/** 
	 * 合并子订单中所有订单的支付状态
	 */
	@ApiListField("order_detail_results")
	@ApiField("order_detail_result")
	private List<OrderDetailResult> orderDetailResults;

	/** 
	 * 如果和支付宝约定子订单必须同时支付成功或者同时失败并且请求时传递了out_merge_no时才存在
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	public void setMergePayStatus(String mergePayStatus) {
		this.mergePayStatus = mergePayStatus;
	}
	public String getMergePayStatus( ) {
		return this.mergePayStatus;
	}

	public void setOrderDetailResults(List<OrderDetailResult> orderDetailResults) {
		this.orderDetailResults = orderDetailResults;
	}
	public List<OrderDetailResult> getOrderDetailResults( ) {
		return this.orderDetailResults;
	}

	public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}
	public String getOutMergeNo( ) {
		return this.outMergeNo;
	}

}
