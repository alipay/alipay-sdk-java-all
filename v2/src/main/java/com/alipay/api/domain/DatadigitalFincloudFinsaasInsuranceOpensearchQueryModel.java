package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全网通搜
 *
 * @author auto create
 * @since 1.0, 2025-02-28 17:31:59
 */
public class DatadigitalFincloudFinsaasInsuranceOpensearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7433319811132925794L;

	/**
	 * 搜索的领域值，默认为all 全网搜索
	 */
	@ApiField("domain")
	private String domain;

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

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
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
