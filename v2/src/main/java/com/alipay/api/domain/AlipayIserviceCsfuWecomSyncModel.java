package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能服务服催平台对外接口_企微回调
 *
 * @author auto create
 * @since 1.0, 2025-09-17 17:58:43
 */
public class AlipayIserviceCsfuWecomSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2159237119252837168L;

	/**
	 * 业务数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * envId
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 时间戳
	 */
	@ApiField("event_timestamp")
	private Long eventTimestamp;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * appId
	 */
	@ApiField("im_app_id")
	private String imAppId;

	/**
	 * source
	 */
	@ApiField("source")
	private String source;

	/**
	 * tntInst_id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * type
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public Long getEventTimestamp() {
		return this.eventTimestamp;
	}
	public void setEventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getImAppId() {
		return this.imAppId;
	}
	public void setImAppId(String imAppId) {
		this.imAppId = imAppId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
