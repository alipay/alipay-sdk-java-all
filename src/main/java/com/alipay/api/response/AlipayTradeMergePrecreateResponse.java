package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PreOrderResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.merge.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-21 17:36:36
 */
public class AlipayTradeMergePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3489761897172778159L;

	/** 
	 * 合并子订单中所有订单的预创建结果
	 */
	@ApiListField("order_detail_results")
	@ApiField("pre_order_result")
	private List<PreOrderResult> orderDetailResults;

	/** 
	 * 如果和支付宝约定子订单必须同时支付成功或者同时失败并且请求时传递了out_merge_no时才存在。
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	/** 
	 * 如果预创建成功，支付宝返回该预下单号，后续商户使用该预下单号请求支付宝支付接口。
	 */
	@ApiField("pre_order_no")
	private String preOrderNo;

	public void setOrderDetailResults(List<PreOrderResult> orderDetailResults) {
		this.orderDetailResults = orderDetailResults;
	}
	public List<PreOrderResult> getOrderDetailResults( ) {
		return this.orderDetailResults;
	}

	public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}
	public String getOutMergeNo( ) {
		return this.outMergeNo;
	}

	public void setPreOrderNo(String preOrderNo) {
		this.preOrderNo = preOrderNo;
	}
	public String getPreOrderNo( ) {
		return this.preOrderNo;
	}

}
