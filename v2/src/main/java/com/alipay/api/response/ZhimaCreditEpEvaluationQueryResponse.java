package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EvaluationOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.evaluation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 17:37:54
 */
public class ZhimaCreditEpEvaluationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7372187841825651122L;

	/** 
	 * 订单信息
	 */
	@ApiListField("order_list")
	@ApiField("evaluation_order_info")
	private List<EvaluationOrderInfo> orderList;

	public void setOrderList(List<EvaluationOrderInfo> orderList) {
		this.orderList = orderList;
	}
	public List<EvaluationOrderInfo> getOrderList( ) {
		return this.orderList;
	}

}
