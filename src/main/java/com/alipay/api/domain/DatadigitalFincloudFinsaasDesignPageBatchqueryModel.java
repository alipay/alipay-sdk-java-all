package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas承载页列表查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:53:35
 */
public class DatadigitalFincloudFinsaasDesignPageBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4566213746594994759L;

	/**
	 * 创建人名字
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 名字
	 */
	@ApiField("page_name")
	private String pageName;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
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
