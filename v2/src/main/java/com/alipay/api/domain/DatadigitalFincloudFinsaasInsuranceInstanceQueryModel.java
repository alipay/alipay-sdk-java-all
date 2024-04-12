package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询实例列表
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:50:35
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1528753819446916221L;

	/**
	 * 外部系统用户ID
	 */
	@ApiField("out_tenant_id")
	private String outTenantId;

	/**
	 * 页码
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getOutTenantId() {
		return this.outTenantId;
	}
	public void setOutTenantId(String outTenantId) {
		this.outTenantId = outTenantId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
