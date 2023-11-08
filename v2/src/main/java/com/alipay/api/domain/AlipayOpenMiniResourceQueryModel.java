package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序运营查询流量位
 *
 * @author auto create
 * @since 1.0, 2021-04-13 17:16:51
 */
public class AlipayOpenMiniResourceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6193638735437188391L;

	/**
	 * 流量位名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 页码 默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量 默认10, 最大10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 流量位id
	 */
	@ApiField("resource_id")
	private String resourceId;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
