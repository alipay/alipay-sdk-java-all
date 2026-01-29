package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户信息查询
 *
 * @author auto create
 * @since 1.0, 2025-11-06 15:34:06
 */
public class AnttechOceanbaseObcustomercoreUserentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2878915738729142282L;

	/**
	 * 搜索类型：COMPANY-企业，PERSONAL-个人，INSTITUTION-机构
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 客户名称（支持企业名称和个人名称）
	 */
	@ApiField("eq_name")
	private String eqName;

	/**
	 * 用于传入查询的当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 用于设置查询的每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEqName() {
		return this.eqName;
	}
	public void setEqName(String eqName) {
		this.eqName = eqName;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
