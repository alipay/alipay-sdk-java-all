package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告节目实时投放
 *
 * @author auto create
 * @since 1.0, 2021-08-24 09:34:57
 */
public class AlipayMarketingShowwindowContentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6226761526144399442L;

	/**
	 * 设备信息列表
	 */
	@ApiListField("device_info_list")
	@ApiField("iot_device_info")
	private List<IotDeviceInfo> deviceInfoList;

	/**
	 * 节目更新事件类型标记
	 */
	@ApiField("event_tag")
	private String eventTag;

	/**
	 * 接口请求源
	 */
	@ApiField("source")
	private String source;

	public List<IotDeviceInfo> getDeviceInfoList() {
		return this.deviceInfoList;
	}
	public void setDeviceInfoList(List<IotDeviceInfo> deviceInfoList) {
		this.deviceInfoList = deviceInfoList;
	}

	public String getEventTag() {
		return this.eventTag;
	}
	public void setEventTag(String eventTag) {
		this.eventTag = eventTag;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
