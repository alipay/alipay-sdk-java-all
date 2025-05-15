package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地震预警信息同步
 *
 * @author auto create
 * @since 1.0, 2025-04-22 00:52:27
 */
public class AlipayEbppIndustryEarthquakeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7869762735765856567L;

	/**
	 * 六位adcode
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 震中深度(千米)
	 */
	@ApiField("epi_depth")
	private String epiDepth;

	/**
	 * 震中烈度,单位度
	 */
	@ApiField("epi_intensity")
	private String epiIntensity;

	/**
	 * 震中纬度
	 */
	@ApiField("epi_lat")
	private String epiLat;

	/**
	 * 震中经度
	 */
	@ApiField("epi_lon")
	private String epiLon;

	/**
	 * alert:预警消息
exercise:演习
test:测试
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 震中地名
	 */
	@ApiField("loc_name")
	private String locName;

	/**
	 * 地震等级
	 */
	@ApiField("magnitude")
	private String magnitude;

	/**
	 * null
	 */
	@ApiListField("mqtt_header")
	@ApiField("m_q_t_t_header_param")
	private List<MQTTHeaderParam> mqttHeader;

	/**
	 * 地震发生时间
	 */
	@ApiField("ori_time")
	private Date oriTime;

	/**
	 * 来源平台
	 */
	@ApiField("source")
	private String source;

	/**
	 * 地震事件唯一id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * red:红色预警
orange:橙色预警
yellow:黄色预警
blue:蓝色预警
	 */
	@ApiField("warning_level")
	private String warningLevel;

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getEpiDepth() {
		return this.epiDepth;
	}
	public void setEpiDepth(String epiDepth) {
		this.epiDepth = epiDepth;
	}

	public String getEpiIntensity() {
		return this.epiIntensity;
	}
	public void setEpiIntensity(String epiIntensity) {
		this.epiIntensity = epiIntensity;
	}

	public String getEpiLat() {
		return this.epiLat;
	}
	public void setEpiLat(String epiLat) {
		this.epiLat = epiLat;
	}

	public String getEpiLon() {
		return this.epiLon;
	}
	public void setEpiLon(String epiLon) {
		this.epiLon = epiLon;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getLocName() {
		return this.locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}

	public String getMagnitude() {
		return this.magnitude;
	}
	public void setMagnitude(String magnitude) {
		this.magnitude = magnitude;
	}

	public List<MQTTHeaderParam> getMqttHeader() {
		return this.mqttHeader;
	}
	public void setMqttHeader(List<MQTTHeaderParam> mqttHeader) {
		this.mqttHeader = mqttHeader;
	}

	public Date getOriTime() {
		return this.oriTime;
	}
	public void setOriTime(Date oriTime) {
		this.oriTime = oriTime;
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

	public String getWarningLevel() {
		return this.warningLevel;
	}
	public void setWarningLevel(String warningLevel) {
		this.warningLevel = warningLevel;
	}

}
