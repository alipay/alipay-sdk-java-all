package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询收单身份组下收单身份列表
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:17:56
 */
public class AlipayCommerceEcReceiptidentityPageinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6224668933932627856L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 收单身份组id
	 */
	@ApiField("identity_group_id")
	private String identityGroupId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小，单位：条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getIdentityGroupId() {
		return this.identityGroupId;
	}
	public void setIdentityGroupId(String identityGroupId) {
		this.identityGroupId = identityGroupId;
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

}
