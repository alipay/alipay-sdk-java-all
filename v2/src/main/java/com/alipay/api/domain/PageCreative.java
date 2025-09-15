package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意分页查询结果
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:41:28
 */
public class PageCreative extends AlipayObject {

	private static final long serialVersionUID = 4539299955361188297L;

	/**
	 * 创意详情列表
	 */
	@ApiListField("list")
	@ApiField("creative_detail")
	private List<CreativeDetail> list;

	/**
	 * 创意分页信息
	 */
	@ApiField("pagination")
	private PageInfo pagination;

	public List<CreativeDetail> getList() {
		return this.list;
	}
	public void setList(List<CreativeDetail> list) {
		this.list = list;
	}

	public PageInfo getPagination() {
		return this.pagination;
	}
	public void setPagination(PageInfo pagination) {
		this.pagination = pagination;
	}

}
