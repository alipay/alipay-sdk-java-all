package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁健康服务平台服务单状态同步API接口
 *
 * @author auto create
 * @since 1.0, 2023-06-09 18:04:34
 */
public class AlipayInsServiceServicestatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4813716696738925374L;

	/**
	 * 因为不同的服务产品、不同的供应商都具有差异化的服务状态和流程，服务状态流转的流程在健康管理服务系统中都可以自定义设置。
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 服务单号
	 */
	@ApiField("service_no")
	private String serviceNo;

	/**
	 * 服务单的当前状态
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/**
	 * 服务状态更新时间
	 */
	@ApiField("status_update_time")
	private String statusUpdateTime;

	/**
	 * 本次请求的唯一标识
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getServiceNo() {
		return this.serviceNo;
	}
	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getStatusUpdateTime() {
		return this.statusUpdateTime;
	}
	public void setStatusUpdateTime(String statusUpdateTime) {
		this.statusUpdateTime = statusUpdateTime;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
