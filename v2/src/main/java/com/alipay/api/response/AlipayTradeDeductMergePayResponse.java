package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubOrderResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.deduct.merge.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-11 11:10:37
 */
public class AlipayTradeDeductMergePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3392878589878582586L;

	/** 
	 * 用户userId，2088开头
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 子单明细
	 */
	@ApiListField("order_detail_results")
	@ApiField("sub_order_result")
	private List<SubOrderResult> orderDetailResults;

	/** 
	 * 外部合并请求号
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setOrderDetailResults(List<SubOrderResult> orderDetailResults) {
		this.orderDetailResults = orderDetailResults;
	}
	public List<SubOrderResult> getOrderDetailResults( ) {
		return this.orderDetailResults;
	}

	public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}
	public String getOutMergeNo( ) {
		return this.outMergeNo;
	}

}
