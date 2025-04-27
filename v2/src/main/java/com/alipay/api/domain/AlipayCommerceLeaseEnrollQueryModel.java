package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁报名计划查询
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:07:17
 */
public class AlipayCommerceLeaseEnrollQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4523556116242486694L;

	/**
	 * 关联品牌方标签
	 */
	@ApiListField("brand_tags")
	@ApiField("string")
	private List<String> brandTags;

	/**
	 * 计划名称，支持搜索
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分页页数，默认1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页每页数量，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public List<String> getBrandTags() {
		return this.brandTags;
	}
	public void setBrandTags(List<String> brandTags) {
		this.brandTags = brandTags;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
