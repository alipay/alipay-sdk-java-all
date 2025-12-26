package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服催监听antmcc标准外呼事件
 *
 * @author auto create
 * @since 1.0, 2025-12-04 10:42:38
 */
public class AlipayIserviceCsfufinanceAntmcceventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7663719241167872895L;

	/**
	 * 事件数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * im分配的环境id
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
	 * im分配的应用id
	 */
	@ApiField("im_app_id")
	private String imAppId;

	/**
	 * 服务渠道类型
	 */
	@ApiField("service_channel")
	private String serviceChannel;

	/**
	 * 来源系统，默认为ccmimplus
	 */
	@ApiField("source")
	private String source;

	/**
	 * im分配的租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 标准事件类型
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

	public String getServiceChannel() {
		return this.serviceChannel;
	}
	public void setServiceChannel(String serviceChannel) {
		this.serviceChannel = serviceChannel;
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
