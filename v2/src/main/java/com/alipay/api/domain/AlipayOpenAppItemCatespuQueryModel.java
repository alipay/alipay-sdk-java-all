package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询类目可关联spu信息
 *
 * @author auto create
 * @since 1.0, 2025-03-31 19:57:27
 */
public class AlipayOpenAppItemCatespuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4522628897291265936L;

	/**
	 * 类目ID，查询类目信息获取叶子类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * null
	 */
	@ApiListField("key_attrs")
	@ApiField("key_attribute_query_request")
	private List<KeyAttributeQueryRequest> keyAttrs;

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

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<KeyAttributeQueryRequest> getKeyAttrs() {
		return this.keyAttrs;
	}
	public void setKeyAttrs(List<KeyAttributeQueryRequest> keyAttrs) {
		this.keyAttrs = keyAttrs;
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

}
