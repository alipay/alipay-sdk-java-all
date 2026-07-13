package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-04 14:21:55
 */
public class KeyInfo extends AlipayObject {

	private static final long serialVersionUID = 3138148925262498546L;

	/**
	 * 条件是否变更
	 */
	@ApiField("filter_change")
	private Boolean filterChange;

	/**
	 * tab页数据缓存key
	 */
	@ApiField("page_key")
	private String pageKey;

	/**
	 * 缓存数据类型
	 */
	@ApiField("search_type")
	private String searchType;

	/**
	 * 二级缓存
	 */
	@ApiField("second_page_key")
	private String secondPageKey;

	public Boolean getFilterChange() {
		return this.filterChange;
	}
	public void setFilterChange(Boolean filterChange) {
		this.filterChange = filterChange;
	}

	public String getPageKey() {
		return this.pageKey;
	}
	public void setPageKey(String pageKey) {
		this.pageKey = pageKey;
	}

	public String getSearchType() {
		return this.searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSecondPageKey() {
		return this.secondPageKey;
	}
	public void setSecondPageKey(String secondPageKey) {
		this.secondPageKey = secondPageKey;
	}

}
