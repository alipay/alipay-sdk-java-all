package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询路由绑定列表
 *
 * @author auto create
 * @since 1.0, 2023-08-21 20:59:16
 */
public class AlipayCloudCloudbaseHttpaccessBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8598969993659392572L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 是否逆序
	 */
	@ApiField("desc")
	private Boolean desc;

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
	 * 是否自定义域名
	 */
	@ApiField("is_custom")
	private Boolean isCustom;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页默认条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 触发路径查询
	 */
	@ApiField("path")
	private String path;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public Boolean getDesc() {
		return this.desc;
	}
	public void setDesc(Boolean desc) {
		this.desc = desc;
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

	public Boolean getIsCustom() {
		return this.isCustom;
	}
	public void setIsCustom(Boolean isCustom) {
		this.isCustom = isCustom;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
