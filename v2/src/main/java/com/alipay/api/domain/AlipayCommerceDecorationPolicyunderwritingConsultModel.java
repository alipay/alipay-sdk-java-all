package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投保接口
 *
 * @author auto create
 * @since 1.0, 2025-11-20 13:12:46
 */
public class AlipayCommerceDecorationPolicyunderwritingConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3214931982859281451L;

	/**
	 * 投保申请时间,格式：yyyy-MM-dd HH24:mm:ss,一般是系统当前时间,不传默认系统当前时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 支持的保司编码
	 */
	@ApiField("insurance_company_code")
	private String insuranceCompanyCode;

	/**
	 * 被保人列表
	 */
	@ApiListField("insured_list")
	@ApiField("insured_v_o")
	private List<InsuredVO> insuredList;

	/**
	 * 订单金额,分为单位
	 */
	@ApiField("order_amount")
	private Long orderAmount;

	/**
	 * 不可重复,幂等字段
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 格式：yyyy-MM-dd HH:mm:ss
不同产品止期不同，一般时分秒为23点59分59秒
	 */
	@ApiField("policy_end_date")
	private Date policyEndDate;

	/**
	 * 投保单位对象
	 */
	@ApiField("policy_org_holder")
	private PolicyOrgHolderVO policyOrgHolder;

	/**
	 * Y	格式：yyyy-MM-dd HH:mm:ss
一般为投保次日零时
示例：2025-11-02 00:00:00
	 */
	@ApiField("policy_start_date")
	private Date policyStartDate;

	/**
	 * 家财: JiaCai 团意1:TuanYi1 团意2:TuanYi2
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 项目编号或合同编号
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 保险标的
	 */
	@ApiListField("subject_matter")
	@ApiField("subject_matter_v_o")
	private List<SubjectMatterVO> subjectMatter;

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getInsuranceCompanyCode() {
		return this.insuranceCompanyCode;
	}
	public void setInsuranceCompanyCode(String insuranceCompanyCode) {
		this.insuranceCompanyCode = insuranceCompanyCode;
	}

	public List<InsuredVO> getInsuredList() {
		return this.insuredList;
	}
	public void setInsuredList(List<InsuredVO> insuredList) {
		this.insuredList = insuredList;
	}

	public Long getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Date getPolicyEndDate() {
		return this.policyEndDate;
	}
	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public PolicyOrgHolderVO getPolicyOrgHolder() {
		return this.policyOrgHolder;
	}
	public void setPolicyOrgHolder(PolicyOrgHolderVO policyOrgHolder) {
		this.policyOrgHolder = policyOrgHolder;
	}

	public Date getPolicyStartDate() {
		return this.policyStartDate;
	}
	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<SubjectMatterVO> getSubjectMatter() {
		return this.subjectMatter;
	}
	public void setSubjectMatter(List<SubjectMatterVO> subjectMatter) {
		this.subjectMatter = subjectMatter;
	}

}
