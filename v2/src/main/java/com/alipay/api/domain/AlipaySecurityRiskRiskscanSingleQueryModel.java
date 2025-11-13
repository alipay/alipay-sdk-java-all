package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁金服信息安全平台风险扫描接口
 *
 * @author auto create
 * @since 1.0, 2020-02-01 11:36:43
 */
public class AlipaySecurityRiskRiskscanSingleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1786133616776951456L;

	/**
	 * 蚂蚁信息安全平台为接入方分配的业务key，必须正确
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 业务风险判断的具体参数，该参数是JsonString，Json中具体的key在接入信息安全平台时约定。
	 */
	@ApiField("event_data")
	private String eventData;

	/**
	 * 蚂蚁信息安全平台为接入方分配的业务类型，业务类型标识了具体识别的风险内容，例如：识别入职员工的风险，识别供应商的舞弊风险等。
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 蚂蚁信息安全平台为业务方分配的业务密钥，必须正确。
	 */
	@ApiField("secret_key")
	private String secretKey;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getEventData() {
		return this.eventData;
	}
	public void setEventData(String eventData) {
		this.eventData = eventData;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getSecretKey() {
		return this.secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}
