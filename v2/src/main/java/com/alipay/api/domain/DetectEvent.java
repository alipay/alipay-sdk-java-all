package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:18
 */
public class DetectEvent extends AlipayObject {

	private static final long serialVersionUID = 2355941947313974112L;

	/**
	 * null
	 */
	@ApiListField("event_attrs")
	@ApiField("event_attr_d_t_o")
	private List<EventAttrDTO> eventAttrs;

	/**
	 * 事件编码：
1. 消控室离岗识别: FMC_ABSENCE_DETECTION
2. 消控室睡岗识别: FMC_SLEEP_DETECTION
3. 消防通道占用识别: FIRE_LANE_OCCUPANCY_DETECTION
	 */
	@ApiField("event_code")
	private String eventCode;

	public List<EventAttrDTO> getEventAttrs() {
		return this.eventAttrs;
	}
	public void setEventAttrs(List<EventAttrDTO> eventAttrs) {
		this.eventAttrs = eventAttrs;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

}
