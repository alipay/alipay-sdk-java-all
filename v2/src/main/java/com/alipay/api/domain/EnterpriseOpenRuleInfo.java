package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票规则信息
 *
 * @author auto create
 * @since 1.0, 2024-01-30 14:28:38
 */
public class EnterpriseOpenRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1625685993634593615L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 当前生效和下次生效的开票规则记录
	 */
	@ApiListField("enterprise_open_rule_record_info_list")
	@ApiField("enterprise_open_rule_record_info")
	private List<EnterpriseOpenRuleRecordInfo> enterpriseOpenRuleRecordInfoList;

	/**
	 * 开票规则绑定关系
	 */
	@ApiListField("enterprise_open_rule_relation_info_list")
	@ApiField("enterprise_open_rule_relation_info")
	private List<EnterpriseOpenRuleRelationInfo> enterpriseOpenRuleRelationInfoList;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 开票规则ID
	 */
	@ApiField("invoice_rule_id")
	private String invoiceRuleId;

	/**
	 * 开票规则名称
	 */
	@ApiField("invoice_rule_name")
	private String invoiceRuleName;

	/**
	 * 业共同账户ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 销方类型
	 */
	@ApiField("seller_type")
	private String sellerType;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<EnterpriseOpenRuleRecordInfo> getEnterpriseOpenRuleRecordInfoList() {
		return this.enterpriseOpenRuleRecordInfoList;
	}
	public void setEnterpriseOpenRuleRecordInfoList(List<EnterpriseOpenRuleRecordInfo> enterpriseOpenRuleRecordInfoList) {
		this.enterpriseOpenRuleRecordInfoList = enterpriseOpenRuleRecordInfoList;
	}

	public List<EnterpriseOpenRuleRelationInfo> getEnterpriseOpenRuleRelationInfoList() {
		return this.enterpriseOpenRuleRelationInfoList;
	}
	public void setEnterpriseOpenRuleRelationInfoList(List<EnterpriseOpenRuleRelationInfo> enterpriseOpenRuleRelationInfoList) {
		this.enterpriseOpenRuleRelationInfoList = enterpriseOpenRuleRelationInfoList;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInvoiceRuleId() {
		return this.invoiceRuleId;
	}
	public void setInvoiceRuleId(String invoiceRuleId) {
		this.invoiceRuleId = invoiceRuleId;
	}

	public String getInvoiceRuleName() {
		return this.invoiceRuleName;
	}
	public void setInvoiceRuleName(String invoiceRuleName) {
		this.invoiceRuleName = invoiceRuleName;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

}
