package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新服务单
 *
 * @author auto create
 * @since 1.0, 2024-04-28 20:02:18
 */
public class AlipayIserviceIcontrolServiceorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6197842259284611447L;

	/**
	 * 阿里云呼入任务更新模型
	 */
	@ApiField("csi_payload")
	private CustomeServiceInboundUpdateDTO csiPayload;

	/**
	 * 是否调度模式
	 */
	@ApiField("dispatch_mode")
	private Boolean dispatchMode;

	/**
	 * 收单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 上一次服务唯一码
	 */
	@ApiField("origin_service_uniq_code")
	private String originServiceUniqCode;

	/**
	 * 服务唯一码
	 */
	@ApiField("service_uniq_code")
	private String serviceUniqCode;

	/**
	 * 源头id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 来源系统名称
	 */
	@ApiField("source_sys")
	private String sourceSys;

	/**
	 * 服务工单任务更新模型
	 */
	@ApiField("st_payload")
	private ServiceTicketUpdateDTO stPayload;

	/**
	 * 请求来源的租户
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public CustomeServiceInboundUpdateDTO getCsiPayload() {
		return this.csiPayload;
	}
	public void setCsiPayload(CustomeServiceInboundUpdateDTO csiPayload) {
		this.csiPayload = csiPayload;
	}

	public Boolean getDispatchMode() {
		return this.dispatchMode;
	}
	public void setDispatchMode(Boolean dispatchMode) {
		this.dispatchMode = dispatchMode;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOriginServiceUniqCode() {
		return this.originServiceUniqCode;
	}
	public void setOriginServiceUniqCode(String originServiceUniqCode) {
		this.originServiceUniqCode = originServiceUniqCode;
	}

	public String getServiceUniqCode() {
		return this.serviceUniqCode;
	}
	public void setServiceUniqCode(String serviceUniqCode) {
		this.serviceUniqCode = serviceUniqCode;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceSys() {
		return this.sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}

	public ServiceTicketUpdateDTO getStPayload() {
		return this.stPayload;
	}
	public void setStPayload(ServiceTicketUpdateDTO stPayload) {
		this.stPayload = stPayload;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
