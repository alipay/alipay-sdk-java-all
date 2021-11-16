package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApproveCreditResult;
import com.alipay.api.domain.InvestigCategoryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.apply.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:15
 */
public class MybankCreditLoanapplyApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6616877968519467698L;

	/** 
	 * 申请贷款额度
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/** 
	 * 申请日期
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/** 
	 * 申请单编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/** 
	 * 审批结论，审批通过或者拒绝
	 */
	@ApiField("approve_conclu")
	private String approveConclu;

	/** 
	 * 审批通过后返回的授信信息
	 */
	@ApiField("approve_credit_result")
	private ApproveCreditResult approveCreditResult;

	/** 
	 * 审批完成时间
	 */
	@ApiField("approve_finish_date")
	private Date approveFinishDate;

	/** 
	 * 客户机构ISV ipRoleId
	 */
	@ApiField("cust_inst_appid")
	private String custInstAppid;

	/** 
	 * 客户机构ipRoleId
	 */
	@ApiField("cust_inst_code")
	private String custInstCode;

	/** 
	 * 返回的扩展字段，预留
	 */
	@ApiField("ext_json")
	private String extJson;

	/** 
	 * 数据项的采集结果
	 */
	@ApiListField("investig_category_result")
	@ApiField("investig_category_result")
	private List<InvestigCategoryResult> investigCategoryResult;

	/** 
	 * 参与者角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 申贷类型
	 */
	@ApiField("loan_type")
	private String loanType;

	/** 
	 * 运营产品CODE
	 */
	@ApiField("op_prod_code")
	private String opProdCode;

	/** 
	 * 运营产品CODE版本
	 */
	@ApiField("op_prod_code_version")
	private String opProdCodeVersion;

	/** 
	 * 审批拒绝原因CODE，多个以逗号分隔，默认为null
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 调查结果
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 任务状态
	 */
	@ApiField("state")
	private String state;

	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}
	public String getApplyAmt( ) {
		return this.applyAmt;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public Date getApplyDate( ) {
		return this.applyDate;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

	public void setApproveConclu(String approveConclu) {
		this.approveConclu = approveConclu;
	}
	public String getApproveConclu( ) {
		return this.approveConclu;
	}

	public void setApproveCreditResult(ApproveCreditResult approveCreditResult) {
		this.approveCreditResult = approveCreditResult;
	}
	public ApproveCreditResult getApproveCreditResult( ) {
		return this.approveCreditResult;
	}

	public void setApproveFinishDate(Date approveFinishDate) {
		this.approveFinishDate = approveFinishDate;
	}
	public Date getApproveFinishDate( ) {
		return this.approveFinishDate;
	}

	public void setCustInstAppid(String custInstAppid) {
		this.custInstAppid = custInstAppid;
	}
	public String getCustInstAppid( ) {
		return this.custInstAppid;
	}

	public void setCustInstCode(String custInstCode) {
		this.custInstCode = custInstCode;
	}
	public String getCustInstCode( ) {
		return this.custInstCode;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}
	public String getExtJson( ) {
		return this.extJson;
	}

	public void setInvestigCategoryResult(List<InvestigCategoryResult> investigCategoryResult) {
		this.investigCategoryResult = investigCategoryResult;
	}
	public List<InvestigCategoryResult> getInvestigCategoryResult( ) {
		return this.investigCategoryResult;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanType( ) {
		return this.loanType;
	}

	public void setOpProdCode(String opProdCode) {
		this.opProdCode = opProdCode;
	}
	public String getOpProdCode( ) {
		return this.opProdCode;
	}

	public void setOpProdCodeVersion(String opProdCodeVersion) {
		this.opProdCodeVersion = opProdCodeVersion;
	}
	public String getOpProdCodeVersion( ) {
		return this.opProdCodeVersion;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
