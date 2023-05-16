package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FulfillmentResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.fulfillmentlist.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:03:59
 */
public class ZhimaCreditEpSceneFulfillmentlistSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1719638711297295814L;

	/** 
	 * 履约同步结果列表
	 */
	@ApiListField("fulfillment_result_list")
	@ApiField("fulfillment_result")
	private List<FulfillmentResult> fulfillmentResultList;

	public void setFulfillmentResultList(List<FulfillmentResult> fulfillmentResultList) {
		this.fulfillmentResultList = fulfillmentResultList;
	}
	public List<FulfillmentResult> getFulfillmentResultList( ) {
		return this.fulfillmentResultList;
	}

}
