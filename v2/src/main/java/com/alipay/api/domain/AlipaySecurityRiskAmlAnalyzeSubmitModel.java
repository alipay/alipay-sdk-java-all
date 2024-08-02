package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反洗钱制裁扫描
 *
 * @author auto create
 * @since 1.0, 2020-05-07 13:30:49
 */
public class AlipaySecurityRiskAmlAnalyzeSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7712453111125852633L;

	/**
	 * 唯一事件码，区分事件
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务扩展字段，将业务需要扫描的参数配置在此，hash表的json字符串形式
	 */
	@ApiField("extend_data")
	private String extendData;

	/**
	 * 事件发生时间，日期的毫秒数
	 */
	@ApiField("gmt_occur")
	private Date gmtOccur;

	/**
	 * 请求的唯一编号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 租户编号
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 站点ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * sofaid
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getExtendData() {
		return this.extendData;
	}
	public void setExtendData(String extendData) {
		this.extendData = extendData;
	}

	public Date getGmtOccur() {
		return this.gmtOccur;
	}
	public void setGmtOccur(Date gmtOccur) {
		this.gmtOccur = gmtOccur;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
