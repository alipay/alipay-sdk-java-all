package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备风险检测事件订阅
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:18
 */
public class AlipayCommercePropertyRiskdetectEventSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 5573659689784377786L;

	/**
	 * 生效状态：
ON   上线
OFF  下线
	 */
	@ApiField("active_status")
	private String activeStatus;

	/**
	 * 外部设备id。说明：同一个对接方下不可重复
	 */
	@ApiField("out_device_id")
	private String outDeviceId;

	/**
	 * null
	 */
	@ApiListField("register_events")
	@ApiField("detect_event")
	private List<DetectEvent> registerEvents;

	public String getActiveStatus() {
		return this.activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getOutDeviceId() {
		return this.outDeviceId;
	}
	public void setOutDeviceId(String outDeviceId) {
		this.outDeviceId = outDeviceId;
	}

	public List<DetectEvent> getRegisterEvents() {
		return this.registerEvents;
	}
	public void setRegisterEvents(List<DetectEvent> registerEvents) {
		this.registerEvents = registerEvents;
	}

}
