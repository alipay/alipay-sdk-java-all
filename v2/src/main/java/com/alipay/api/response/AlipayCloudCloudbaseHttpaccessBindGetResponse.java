package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.bind.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:18
 */
public class AlipayCloudCloudbaseHttpaccessBindGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8443488271944633416L;

	/** 
	 * 路由绑定ID
	 */
	@ApiField("bind_id")
	private String bindId;

	/** 
	 * 域名
	 */
	@ApiField("domain_name")
	private String domainName;

	/** 
	 * 函数名称
	 */
	@ApiField("function_name")
	private String functionName;

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
	 * 是否自定义域名
	 */
	@ApiField("is_custom")
	private Boolean isCustom;

	/** 
	 * 是否需要签名
	 */
	@ApiField("need_sign")
	private Boolean needSign;

	/** 
	 * 触发路径
	 */
	@ApiField("path")
	private String path;

	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	public String getBindId( ) {
		return this.bindId;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public String getDomainName( ) {
		return this.domainName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getFunctionName( ) {
		return this.functionName;
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

	public void setIsCustom(Boolean isCustom) {
		this.isCustom = isCustom;
	}
	public Boolean getIsCustom( ) {
		return this.isCustom;
	}

	public void setNeedSign(Boolean needSign) {
		this.needSign = needSign;
	}
	public Boolean getNeedSign( ) {
		return this.needSign;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getPath( ) {
		return this.path;
	}

}
