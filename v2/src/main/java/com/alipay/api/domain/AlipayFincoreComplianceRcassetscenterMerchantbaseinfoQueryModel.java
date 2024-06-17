package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业商户基础信息
 *
 * @author auto create
 * @since 1.0, 2023-11-16 10:32:04
 */
public class AlipayFincoreComplianceRcassetscenterMerchantbaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6531881261956934795L;

	/**
	 * 企业名称
	 */
	@ApiField("corp_name")
	private String corpName;

	/**
	 * 组织机构代码
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 页号，从1开始，默认1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页面大小，默认10 最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUnifiedSocialCreditCode() {
		return this.unifiedSocialCreditCode;
	}
	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

}
