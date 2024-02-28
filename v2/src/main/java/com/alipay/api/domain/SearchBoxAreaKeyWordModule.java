package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达地域关键词模块
 *
 * @author auto create
 * @since 1.0, 2023-01-06 10:42:57
 */
public class SearchBoxAreaKeyWordModule extends AlipayObject {

	private static final long serialVersionUID = 7518927259813127173L;

	/**
	 * 地域触发词信息 (最近一次审核内容)
	 */
	@ApiField("latest_audit_area_keyword_info")
	private SearchBoxKeywordInfo latestAuditAreaKeywordInfo;

	/**
	 * 模块配置ID
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * 搜索直达模块类型
	 */
	@ApiField("module_type")
	private String moduleType;

	/**
	 * 地域触发词信息 (审核通过内容)
	 */
	@ApiField("valid_area_keyword_info")
	private SearchBoxKeywordInfo validAreaKeywordInfo;

	public SearchBoxKeywordInfo getLatestAuditAreaKeywordInfo() {
		return this.latestAuditAreaKeywordInfo;
	}
	public void setLatestAuditAreaKeywordInfo(SearchBoxKeywordInfo latestAuditAreaKeywordInfo) {
		this.latestAuditAreaKeywordInfo = latestAuditAreaKeywordInfo;
	}

	public String getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleType() {
		return this.moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public SearchBoxKeywordInfo getValidAreaKeywordInfo() {
		return this.validAreaKeywordInfo;
	}
	public void setValidAreaKeywordInfo(SearchBoxKeywordInfo validAreaKeywordInfo) {
		this.validAreaKeywordInfo = validAreaKeywordInfo;
	}

}
