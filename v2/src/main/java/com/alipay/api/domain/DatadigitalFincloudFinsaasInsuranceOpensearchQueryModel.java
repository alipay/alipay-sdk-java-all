package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全网通搜
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:10:32
 */
public class DatadigitalFincloudFinsaasInsuranceOpensearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2393194485562823633L;

	/**
	 * 类型目前仅包括llmWholeImage和不传，传则代表文搜图，不传则默认搜索网页
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 搜索的领域值，默认为all 全网搜索
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 多站点"｜"分割，最大支持个数为3
	 */
	@ApiField("include_sites")
	private String includeSites;

	/**
	 * 不传默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 要搜索的问题
	 */
	@ApiField("query")
	private String query;

	/**
	 * 搜索使用方来源
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 是否开启调试模式
	 */
	@ApiField("search_mode")
	private String searchMode;

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getIncludeSites() {
		return this.includeSites;
	}
	public void setIncludeSites(String includeSites) {
		this.includeSites = includeSites;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSearchMode() {
		return this.searchMode;
	}
	public void setSearchMode(String searchMode) {
		this.searchMode = searchMode;
	}

}
