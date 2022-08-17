package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TransOrderResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.app.merge.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-01 11:07:10
 */
public class AlipayFundTransAppMergeConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8326495878537466432L;

	/** 
	 * 合并付款单据号
	 */
	@ApiField("merge_order_id")
	private String mergeOrderId;

	/** 
	 * 转账结果列表。会列出该笔合并支付中所有的明细转账结果、状态基础信息。如果需要详情信息，请再请求单笔查询接口进行查询。
	 */
	@ApiListField("trans_order_results")
	@ApiField("trans_order_result")
	private List<TransOrderResult> transOrderResults;

	public void setMergeOrderId(String mergeOrderId) {
		this.mergeOrderId = mergeOrderId;
	}
	public String getMergeOrderId( ) {
		return this.mergeOrderId;
	}

	public void setTransOrderResults(List<TransOrderResult> transOrderResults) {
		this.transOrderResults = transOrderResults;
	}
	public List<TransOrderResult> getTransOrderResults( ) {
		return this.transOrderResults;
	}

}
