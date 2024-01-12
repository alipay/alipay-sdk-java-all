package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubOrderResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.merge.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-09 10:46:44
 */
public class AlipayTradeMergeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4155996141769991852L;

	/** 
	 * 合并交易号，用于后续唤起收银台使用，当所有子订单都下单成功后返回，2小时后失效。失效后需重新发起合并下单请求。
	 */
	@ApiField("merge_no")
	private String mergeNo;

	/** 
	 * 合并子订单中所有订单的创建结果
	 */
	@ApiListField("order_detail_results")
	@ApiField("sub_order_result")
	private List<SubOrderResult> orderDetailResults;

	/** 
	 * 外部合并单号
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	public void setMergeNo(String mergeNo) {
		this.mergeNo = mergeNo;
	}
	public String getMergeNo( ) {
		return this.mergeNo;
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
