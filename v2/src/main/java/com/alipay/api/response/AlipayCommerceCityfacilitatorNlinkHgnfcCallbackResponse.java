package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.nlink.hgnfc.callback response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 22:12:21
 */
public class AlipayCommerceCityfacilitatorNlinkHgnfcCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 6834349643386673672L;

	/** 
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 是否可以重试
	 */
	@ApiField("can_retry")
	private Boolean canRetry;

	/** 
	 * 耗时单位毫秒
	 */
	@ApiField("cost_time")
	private Long costTime;

	/** 
	 * 返回业务数据
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 设备端请求标识
	 */
	@ApiField("req_id")
	private String reqId;

	/** 
	 * 结果码
	 */
	@ApiField("ret_code")
	private String retCode;

	/** 
	 * 结果信息
	 */
	@ApiField("ret_message")
	private String retMessage;

	/** 
	 * 业务服务标识
	 */
	@ApiField("service_id")
	private String serviceId;

	/** 
	 * 子结果码
	 */
	@ApiField("sub_ret_code")
	private String subRetCode;

	/** 
	 * 子结果信息
	 */
	@ApiField("sub_ret_message")
	private String subRetMessage;

	/** 
	 * 查询服务端日志使用
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCanRetry(Boolean canRetry) {
		this.canRetry = canRetry;
	}
	public Boolean getCanRetry( ) {
		return this.canRetry;
	}

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}
	public Long getCostTime( ) {
		return this.costTime;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getReqId( ) {
		return this.reqId;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetCode( ) {
		return this.retCode;
	}

	public void setRetMessage(String retMessage) {
		this.retMessage = retMessage;
	}
	public String getRetMessage( ) {
		return this.retMessage;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceId( ) {
		return this.serviceId;
	}

	public void setSubRetCode(String subRetCode) {
		this.subRetCode = subRetCode;
	}
	public String getSubRetCode( ) {
		return this.subRetCode;
	}

	public void setSubRetMessage(String subRetMessage) {
		this.subRetMessage = subRetMessage;
	}
	public String getSubRetMessage( ) {
		return this.subRetMessage;
	}

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

}
