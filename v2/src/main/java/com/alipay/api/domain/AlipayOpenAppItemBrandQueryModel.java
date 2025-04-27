package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据类目id获取可选品牌
 *
 * @author auto create
 * @since 1.0, 2025-03-31 19:57:27
 */
public class AlipayOpenAppItemBrandQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1532239983748152369L;

	/**
	 * 类目ID，查询类目信息获取类目ID

	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 分页查询的页码。默认从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询的每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 品牌前缀（中文或者英文），根据前缀搜索品牌
	 */
	@ApiField("query")
	private String query;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
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

}
