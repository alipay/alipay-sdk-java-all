package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.linenetworkversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 13:30:03
 */
public class AlipayCommerceTransportIntelligentizeLinenetworkversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4361287773577372147L;

	/** 
	 * 扩展字段,双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 线网版本号
	 */
	@ApiField("linenet_version")
	private String linenetVersion;

	/** 
	 * 数据来源
	 */
	@ApiField("source")
	private String source;

	/** 
	 * 版本时间
	 */
	@ApiField("version_time")
	private String versionTime;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setLinenetVersion(String linenetVersion) {
		this.linenetVersion = linenetVersion;
	}
	public String getLinenetVersion( ) {
		return this.linenetVersion;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

	public void setVersionTime(String versionTime) {
		this.versionTime = versionTime;
	}
	public String getVersionTime( ) {
		return this.versionTime;
	}

}
