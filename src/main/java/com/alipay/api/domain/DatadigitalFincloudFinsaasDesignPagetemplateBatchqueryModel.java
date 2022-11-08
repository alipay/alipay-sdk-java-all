package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设计saas的页面模版列表
 *
 * @author auto create
 * @since 1.0, 2022-10-09 11:32:13
 */
public class DatadigitalFincloudFinsaasDesignPagetemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6629415684572337216L;

	/**
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建人名字
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 不传即查询所有类型活动
	 */
	@ApiField("operation_task_type")
	private String operationTaskType;

	/**
	 * 页面名字
	 */
	@ApiField("page_name")
	private String pageName;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 单页查询数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 页面状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getOperationTaskType() {
		return this.operationTaskType;
	}
	public void setOperationTaskType(String operationTaskType) {
		this.operationTaskType = operationTaskType;
	}

	public String getPageName() {
		return this.pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
