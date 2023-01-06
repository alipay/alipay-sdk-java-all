package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessOrdersFeedBackResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.ordersresult.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-26 18:14:46
 */
public class KoubeiSalesKbassetStuffOrdersresultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7784728888771993829L;

	/** 
	 * 物料单据反馈结果
	 */
	@ApiListField("orders_feedback_result")
	@ApiField("access_orders_feed_back_result")
	private List<AccessOrdersFeedBackResult> ordersFeedbackResult;

	public void setOrdersFeedbackResult(List<AccessOrdersFeedBackResult> ordersFeedbackResult) {
		this.ordersFeedbackResult = ordersFeedbackResult;
	}
	public List<AccessOrdersFeedBackResult> getOrdersFeedbackResult( ) {
		return this.ordersFeedbackResult;
	}

}
