package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 路由绑定列表
 *
 * @author auto create
 * @since 1.0, 2023-08-21 20:59:16
 */
public class DomainBind extends AlipayObject {

	private static final long serialVersionUID = 4348338914536451469L;

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

	public String getBindId() {
		return this.bindId;
	}
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Boolean getIsCustom() {
		return this.isCustom;
	}
	public void setIsCustom(Boolean isCustom) {
		this.isCustom = isCustom;
	}

	public Boolean getNeedSign() {
		return this.needSign;
	}
	public void setNeedSign(Boolean needSign) {
		this.needSign = needSign;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
