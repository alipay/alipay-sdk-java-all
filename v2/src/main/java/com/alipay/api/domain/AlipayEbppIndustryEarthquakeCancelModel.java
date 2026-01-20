package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地震预警撤销接口
 *
 * @author auto create
 * @since 1.0, 2025-06-04 17:41:32
 */
public class AlipayEbppIndustryEarthquakeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7546146552231424828L;

	/**
	 * null
	 */
	@ApiListField("mqtt_header")
	@ApiField("m_q_t_t_header_param")
	private List<MQTTHeaderParam> mqttHeader;

	/**
	 * XX地震台
	 */
	@ApiField("source")
	private String source;

	/**
	 * 地震唯一id
	 */
	@ApiField("source_id")
	private String sourceId;

	public List<MQTTHeaderParam> getMqttHeader() {
		return this.mqttHeader;
	}
	public void setMqttHeader(List<MQTTHeaderParam> mqttHeader) {
		this.mqttHeader = mqttHeader;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
