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
 * @since 1.0, 2024-07-04 15:51:39
 */
public class KoubeiSalesKbassetStuffOrdersresultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4314284582191176149L;

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
