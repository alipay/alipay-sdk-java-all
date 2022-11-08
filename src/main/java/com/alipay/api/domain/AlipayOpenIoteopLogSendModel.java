package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * iot监控应急日志上传接口
 *
 * @author auto create
 * @since 1.0, 2022-10-21 15:09:55
 */
public class AlipayOpenIoteopLogSendModel extends AlipayObject {

	private static final long serialVersionUID = 7811245767429687419L;

	/**
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 支持秒s，毫秒ms，微秒ms,  纳秒ns，10.1ms，小数点后不能超过3位
	 */
	@ApiField("cost_time")
	private String costTime;

	/**
	 * 指标列表
	 */
	@ApiListField("index_list")
	@ApiField("iot_emergency_log_index_save_open_mq_request")
	private List<IotEmergencyLogIndexSaveOpenMqRequest> indexList;

	/**
	 * 序列图id
	 */
	@ApiField("sequence_diagram_id")
	private String sequenceDiagramId;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 链路id
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCostTime() {
		return this.costTime;
	}
	public void setCostTime(String costTime) {
		this.costTime = costTime;
	}

	public List<IotEmergencyLogIndexSaveOpenMqRequest> getIndexList() {
		return this.indexList;
	}
	public void setIndexList(List<IotEmergencyLogIndexSaveOpenMqRequest> indexList) {
		this.indexList = indexList;
	}

	public String getSequenceDiagramId() {
		return this.sequenceDiagramId;
	}
	public void setSequenceDiagramId(String sequenceDiagramId) {
		this.sequenceDiagramId = sequenceDiagramId;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
