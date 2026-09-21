package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FulfillmentInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fulfillment.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 13:47:55
 */
public class AlipayCommerceMedicalFulfillmentListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1271344371755878166L;

	/** 
	 * null
	 */
	@ApiListField("fulfillment_info_list")
	@ApiField("fulfillment_info_v_o")
	private List<FulfillmentInfoVO> fulfillmentInfoList;

	public void setFulfillmentInfoList(List<FulfillmentInfoVO> fulfillmentInfoList) {
		this.fulfillmentInfoList = fulfillmentInfoList;
	}
	public List<FulfillmentInfoVO> getFulfillmentInfoList( ) {
		return this.fulfillmentInfoList;
	}

}
