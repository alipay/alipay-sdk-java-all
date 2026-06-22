package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nopen.nlink.generate response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-07 10:37:44
 */
public class AlipayOpenSpNopenNlinkGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5395869785193812161L;

	/** 
	 * 耗时单位毫秒
	 */
	@ApiField("cost_time")
	private Long costTime;

	/** 
	 * 1绑定
0未绑定
	 */
	@ApiField("device_bind_status")
	private String deviceBindStatus;

	/** 
	 * N链接对应的链接id
	 */
	@ApiField("n_link_id")
	private String nLinkId;

	/** 
	 * N链接的对应类型
	 */
	@ApiField("n_link_type")
	private String nLinkType;

	/** 
	 * 碰一下链接
	 */
	@ApiField("n_link_url")
	private String nLinkUrl;

	/** 
	 * 查询服务端日志使用
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}
	public Long getCostTime( ) {
		return this.costTime;
	}

	public void setDeviceBindStatus(String deviceBindStatus) {
		this.deviceBindStatus = deviceBindStatus;
	}
	public String getDeviceBindStatus( ) {
		return this.deviceBindStatus;
	}

	public void setnLinkId(String nLinkId) {
		this.nLinkId = nLinkId;
	}
	public String getnLinkId( ) {
		return this.nLinkId;
	}

	public void setnLinkType(String nLinkType) {
		this.nLinkType = nLinkType;
	}
	public String getnLinkType( ) {
		return this.nLinkType;
	}

	public void setnLinkUrl(String nLinkUrl) {
		this.nLinkUrl = nLinkUrl;
	}
	public String getnLinkUrl( ) {
		return this.nLinkUrl;
	}

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

}
