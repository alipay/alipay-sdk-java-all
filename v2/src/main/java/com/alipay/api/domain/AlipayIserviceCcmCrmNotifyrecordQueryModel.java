package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知记录查询
 *
 * @author auto create
 * @since 1.0, 2025-10-23 09:43:17
 */
public class AlipayIserviceCcmCrmNotifyrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7732284885562439674L;

	/**
	 * 允许为空，为空时默认为1
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 查询id,可传入线索id或客户id或联系人id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 表单code，仅允许传入DING_CUE，DING_CUSTOMER，DING_CONTACT之一
	 */
	@ApiField("form_code")
	private String formCode;

	/**
	 * 每页条数,允许为空，为空时默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 租户Id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getFormCode() {
		return this.formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
