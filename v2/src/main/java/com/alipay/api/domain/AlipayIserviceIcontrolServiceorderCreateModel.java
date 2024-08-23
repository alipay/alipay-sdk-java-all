package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建服务单
 *
 * @author auto create
 * @since 1.0, 2024-04-28 20:49:26
 */
public class AlipayIserviceIcontrolServiceorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8448988924859365524L;

	/**
	 * 阿里云呼入任务创建模型
	 */
	@ApiField("csi_order_data")
	private CustomeServiceInboundCreateDTO csiOrderData;

	/**
	 * 是否调试模式
	 */
	@ApiField("dispatch_mode")
	private Boolean dispatchMode;

	/**
	 * 服务单的创建时间
	 */
	@ApiField("order_time")
	private String orderTime;

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
	 * 服务工单任务创建模型
	 */
	@ApiField("st_order_data")
	private ServiceTicketCreateDTO stOrderData;

	/**
	 * 请求来源的租户
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public CustomeServiceInboundCreateDTO getCsiOrderData() {
		return this.csiOrderData;
	}
	public void setCsiOrderData(CustomeServiceInboundCreateDTO csiOrderData) {
		this.csiOrderData = csiOrderData;
	}

	public Boolean getDispatchMode() {
		return this.dispatchMode;
	}
	public void setDispatchMode(Boolean dispatchMode) {
		this.dispatchMode = dispatchMode;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
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

	public ServiceTicketCreateDTO getStOrderData() {
		return this.stOrderData;
	}
	public void setStOrderData(ServiceTicketCreateDTO stOrderData) {
		this.stOrderData = stOrderData;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
