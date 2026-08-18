package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动打卡白名单列表查询
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:50
 */
public class AlipayCommerceEducateSportsWhiteBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3846337371579247473L;

	/**
	 * 部门编码
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 页码，不传默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，不传默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 白名单类型
	 */
	@ApiField("white_type")
	private String whiteType;

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
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

	public String getWhiteType() {
		return this.whiteType;
	}
	public void setWhiteType(String whiteType) {
		this.whiteType = whiteType;
	}

}
