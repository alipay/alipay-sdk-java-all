package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商米广告投放状态拉取
 *
 * @author auto create
 * @since 1.0, 2021-09-04 13:34:44
 */
public class AlipayMarketingShowwindowContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5645714275192182159L;

	/**
	 * 设备信息列表
	 */
	@ApiListField("device_info_list")
	@ApiField("iot_query_device_info")
	private List<IotQueryDeviceInfo> deviceInfoList;

	/**
	 * 时间 YYYYMMDD（20210801）
	 */
	@ApiField("query_date")
	private String queryDate;

	/**
	 * 接口请求源，如商米为SM
	 */
	@ApiField("source")
	private String source;

	public List<IotQueryDeviceInfo> getDeviceInfoList() {
		return this.deviceInfoList;
	}
	public void setDeviceInfoList(List<IotQueryDeviceInfo> deviceInfoList) {
		this.deviceInfoList = deviceInfoList;
	}

	public String getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
