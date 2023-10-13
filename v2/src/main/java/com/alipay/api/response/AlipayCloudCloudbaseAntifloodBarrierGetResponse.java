package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.barrier.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:46:44
 */
public class AlipayCloudCloudbaseAntifloodBarrierGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2421475841892354571L;

	/** 
	 * 封禁时长（秒） [60, 3*86400]
	 */
	@ApiField("ban_duration")
	private Long banDuration;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 请求量上限 [100, 1000000000]
	 */
	@ApiField("request_limit")
	private Long requestLimit;

	/** 
	 * 时间窗口（秒） [60, 86400]
	 */
	@ApiField("time_window")
	private Long timeWindow;

	public void setBanDuration(Long banDuration) {
		this.banDuration = banDuration;
	}
	public Long getBanDuration( ) {
		return this.banDuration;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setRequestLimit(Long requestLimit) {
		this.requestLimit = requestLimit;
	}
	public Long getRequestLimit( ) {
		return this.requestLimit;
	}

	public void setTimeWindow(Long timeWindow) {
		this.timeWindow = timeWindow;
	}
	public Long getTimeWindow( ) {
		return this.timeWindow;
	}

}
