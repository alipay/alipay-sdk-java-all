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
 * @since 1.0, 2024-05-23 11:27:02
 */
public class AlipayTradeDeductMergePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6214272299546738657L;

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
