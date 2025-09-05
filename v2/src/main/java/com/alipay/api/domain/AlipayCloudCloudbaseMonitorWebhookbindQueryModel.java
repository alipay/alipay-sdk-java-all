package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * webhook 绑定查询
 *
 * @author auto create
 * @since 1.0, 2024-05-08 14:34:32
 */
public class AlipayCloudCloudbaseMonitorWebhookbindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5786417685977613176L;

	/**
	 * 是否逆序
	 */
	@ApiField("desc")
	private Boolean desc;

	/**
	 * 绑定名称
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

	public Boolean getDesc() {
		return this.desc;
	}
	public void setDesc(Boolean desc) {
		this.desc = desc;
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
