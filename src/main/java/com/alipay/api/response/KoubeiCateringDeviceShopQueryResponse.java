package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceDynamicInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.device.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringDeviceShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2138149762315175556L;

	/** 
	 * 设备信息
	 */
	@ApiListField("device_dynamic_info_response_list")
	@ApiField("device_dynamic_info_response")
	private List<DeviceDynamicInfoResponse> deviceDynamicInfoResponseList;

	/** 
	 * 请求中的request_id。拿到结果后最好做下请求ID和返回的结果请求ID是否一致，防止万一请求串掉。
	 */
	@ApiField("request_id")
	private String requestId;

	public void setDeviceDynamicInfoResponseList(List<DeviceDynamicInfoResponse> deviceDynamicInfoResponseList) {
		this.deviceDynamicInfoResponseList = deviceDynamicInfoResponseList;
	}
	public List<DeviceDynamicInfoResponse> getDeviceDynamicInfoResponseList( ) {
		return this.deviceDynamicInfoResponseList;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
