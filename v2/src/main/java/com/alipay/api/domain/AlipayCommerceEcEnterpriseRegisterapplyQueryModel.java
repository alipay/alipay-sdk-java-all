package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业注册结果查询
 *
 * @author auto create
 * @since 1.0, 2023-08-17 11:05:17
 */
public class AlipayCommerceEcEnterpriseRegisterapplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7482167668412282933L;

	/**
	 * 注册申请id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 企业邮箱
	 */
	@ApiField("enterprise_email")
	private String enterpriseEmail;

	/**
	 * 企业名称模糊搜索
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页容量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getEnterpriseEmail() {
		return this.enterpriseEmail;
	}
	public void setEnterpriseEmail(String enterpriseEmail) {
		this.enterpriseEmail = enterpriseEmail;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
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
