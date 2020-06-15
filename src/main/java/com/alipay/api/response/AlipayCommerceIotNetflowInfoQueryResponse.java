package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NetFlowDeviceOfferInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.netflow.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-12 17:12:27
 */
public class AlipayCommerceIotNetflowInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3178525915476479671L;

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
