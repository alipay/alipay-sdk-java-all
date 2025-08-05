package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线索查询
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:01:51
 */
public class AlipayIserviceCcmCrmClueQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7125828484168386769L;

	/**
	 * 有三个字段field_code，field_operator_type，value，field_code：字段名
field_operator_type：查询条件
value:查询的值
	 */
	@ApiListField("condition")
	@ApiField("alipay_condition")
	private List<AlipayCondition> condition;

	/**
	 * 当前页码，可选参数，不选默认值为:1
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 查询参数条件，可选
	 */
	@ApiField("obj_code")
	private String objCode;

	/**
	 * 页大小，可选，默认:10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 租户实例id，必填，智能拓客平台分配
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public List<AlipayCondition> getCondition() {
		return this.condition;
	}
	public void setCondition(List<AlipayCondition> condition) {
		this.condition = condition;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getObjCode() {
		return this.objCode;
	}
	public void setObjCode(String objCode) {
		this.objCode = objCode;
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
