package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询租户规则列表
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:52:27
 */
public class DatadigitalFincloudFinsaasInsuranceHistoryruleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6851713216779983827L;

	/**
	 * 实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 外部租户id
	 */
	@ApiField("out_tenant_id")
	private String outTenantId;

	/**
	 * 分页页码
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

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
