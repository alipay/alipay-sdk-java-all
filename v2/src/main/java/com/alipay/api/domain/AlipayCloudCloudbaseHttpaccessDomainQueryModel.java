package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询HTTP访问服务域名列表
 *
 * @author auto create
 * @since 1.0, 2025-09-28 10:51:19
 */
public class AlipayCloudCloudbaseHttpaccessDomainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3682968254926611762L;

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
	 * 是否强制HTTPS
	 */
	@ApiField("force_https")
	private Boolean forceHttps;

	/**
	 * 是否自定义域名
	 */
	@ApiField("is_custom")
	private Boolean isCustom;

	/**
	 * 域名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public Boolean getForceHttps() {
		return this.forceHttps;
	}
	public void setForceHttps(Boolean forceHttps) {
		this.forceHttps = forceHttps;
	}

	public Boolean getIsCustom() {
		return this.isCustom;
	}
	public void setIsCustom(Boolean isCustom) {
		this.isCustom = isCustom;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

}
