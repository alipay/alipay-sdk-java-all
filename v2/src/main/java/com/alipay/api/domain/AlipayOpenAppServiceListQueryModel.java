package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务批量查询
 *
 * @author auto create
 * @since 1.0, 2022-06-28 20:11:18
 */
public class AlipayOpenAppServiceListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8738135411234146251L;

	/**
	 * 类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

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

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
