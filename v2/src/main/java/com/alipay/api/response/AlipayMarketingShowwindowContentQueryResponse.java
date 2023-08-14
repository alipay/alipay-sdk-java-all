package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.showwindow.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:36:08
 */
public class AlipayMarketingShowwindowContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7157899815564275466L;

	/** 
	 * 每个设备的节目投放状态
	 */
	@ApiListField("device_content_list")
	@ApiField("device_content")
	private List<DeviceContent> deviceContentList;

	public void setDeviceContentList(List<DeviceContent> deviceContentList) {
		this.deviceContentList = deviceContentList;
	}
	public List<DeviceContent> getDeviceContentList( ) {
		return this.deviceContentList;
	}

}
