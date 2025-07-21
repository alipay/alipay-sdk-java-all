package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NetFlowDeviceOfferInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.netflow.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-24 09:55:16
 */
public class AlipayCommerceIotNetflowInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5641334449315769335L;

	/** 
	 * 流量充值记录信息
	 */
	@ApiField("net_flow_device_offer_info_response")
	private NetFlowDeviceOfferInfoResponse netFlowDeviceOfferInfoResponse;

	public void setNetFlowDeviceOfferInfoResponse(NetFlowDeviceOfferInfoResponse netFlowDeviceOfferInfoResponse) {
		this.netFlowDeviceOfferInfoResponse = netFlowDeviceOfferInfoResponse;
	}
	public NetFlowDeviceOfferInfoResponse getNetFlowDeviceOfferInfoResponse( ) {
		return this.netFlowDeviceOfferInfoResponse;
	}

}
