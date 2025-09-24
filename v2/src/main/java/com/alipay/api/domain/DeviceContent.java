package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 每个设备的节目投放状态
 *
 * @author auto create
 * @since 1.0, 2021-09-03 09:53:56
 */
public class DeviceContent extends AlipayObject {

	private static final long serialVersionUID = 7361661417429897763L;

	/**
	 * 素材（节目）列表
	 */
	@ApiListField("content_list")
	@ApiField("string")
	private List<String> contentList;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	public List<String> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<String> contentList) {
		this.contentList = contentList;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

}
