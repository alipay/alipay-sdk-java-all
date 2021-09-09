package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合约列表
 *
 * @author auto create
 * @since 1.0, 2020-12-24 20:46:36
 */
public class ContractStartInfoOpenApiVO extends AlipayObject {

	private static final long serialVersionUID = 8549391662677888166L;

	/**
	 * 是否接受了差于与独立第三方公司的类似合作条款
	 */
	@ApiField("accept_diff_others")
	private Boolean acceptDiffOthers;

	/**
	 * 是否接受了差于与独立第三方公司的类似合作条款说明
	 */
	@ApiField("accept_diff_others_explain")
	private String acceptDiffOthersExplain;

	/**
	 * 金额类型
	 */
	@ApiField("amount_type")
	private String amountType;

	/**
	 * 合约对手方
	 */
	@ApiListField("anti_participants")
	@ApiField("participant_info_v_o")
	private List<ParticipantInfoVO> antiParticipants;

	/**
	 * 申请日期
	 */
	@ApiField("applicant_date")
	private Date applicantDate;

	/**
	 * 倒签报备附件
	 */
	@ApiListField("backdate_report_file")
	@ApiField("inter_trade_file_info_v_o")
	private List<InterTradeFileInfoVO> backdateReportFile;

	/**
	 * 提交人
	 */
	@ApiField("committer")
	private String committer;

	/**
	 * 合约金额 单位：分
	 */
	@ApiField("contract_amount_cent")
	private String contractAmountCent;

	/**
	 * 合约金额 币种
	 */
	@ApiField("contract_amount_currency")
	private String contractAmountCurrency;

	/**
	 * 合约金额描述
	 */
	@ApiField("contract_amount_extra")
	private String contractAmountExtra;

	/**
	 * 合约金额折合人民币
	 */
	@ApiField("contract_amount_to_cny")
	private String contractAmountToCny;

	/**
	 * 合同分类
	 */
	@ApiField("contract_category")
	private String contractCategory;

	/**
	 * 合约名称
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合同状态
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 合同有效期类型
	 */
	@ApiField("contract_valid_type")
	private String contractValidType;

	/**
	 * 提交人部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 合同结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 合约文件列表
	 */
	@ApiListField("files")
	@ApiField("inter_trade_file_info_v_o")
	private List<InterTradeFileInfoVO> files;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 是否为框架合同,默认False
	 */
	@ApiField("is_frame_contract")
	private Boolean isFrameContract;

	/**
	 * 是否有限制我方业务范畴、业务地域的非竞争条款
	 */
	@ApiField("limit_business_area")
	private Boolean limitBusinessArea;

	/**
	 * 是否有限制我方业务范畴、业务地域的非竞争条款说明
	 */
	@ApiField("limit_business_area_explain")
	private String limitBusinessAreaExplain;

	/**
	 * 是否有限制我方与其他第三方合作的独家/排他条款
	 */
	@ApiField("limit_cooperate")
	private Boolean limitCooperate;

	/**
	 * 是否有限制我方与其他第三方合作的独家/排他条款说明
	 */
	@ApiField("limit_cooperate_explain")
	private String limitCooperateExplain;

	/**
	 * 合同约定失效方式
	 */
	@ApiField("lose_effect_method")
	private String loseEffectMethod;

	/**
	 * 主合同编号
	 */
	@ApiField("main_contract_no")
	private String mainContractNo;

	/**
	 * 付款方
	 */
	@ApiField("payment_party")
	private String paymentParty;

	/**
	 * 签约一年内的预估发生额 单位：分
	 */
	@ApiField("predict_amount_in_year_cent")
	private String predictAmountInYearCent;

	/**
	 * 签约一年内的预估发生额 币种
	 */
	@ApiField("predict_amount_in_year_currency")
	private String predictAmountInYearCurrency;

	/**
	 * 签约一年内的预估发生额描述
	 */
	@ApiField("predict_amount_in_year_extra")
	private String predictAmountInYearExtra;

	/**
	 * 签约一年内的预估发生额折合人民币
	 */
	@ApiField("predict_amount_in_year_to_cny")
	private String predictAmountInYearToCny;

	/**
	 * 定价策略
	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * 定价政策说明
	 */
	@ApiField("price_type_explain")
	private String priceTypeExplain;

	/**
	 * 税率
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 合约本方
	 */
	@ApiListField("self_participants")
	@ApiField("participant_info_v_o")
	private List<ParticipantInfoVO> selfParticipants;

	/**
	 * 合同开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 合同约定生效方式
	 */
	@ApiField("take_effect_method")
	private String takeEffectMethod;

	/**
	 * 是否模版协议
	 */
	@ApiField("template_protocol")
	private Boolean templateProtocol;

	/**
	 * 是否模版协议说明
	 */
	@ApiField("template_protocol_explain")
	private String templateProtocolExplain;

	/**
	 * 交易类型
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 历史审批信息
	 */
	@ApiListField("workflow_log_list")
	@ApiField("inter_trade_approval_workflow_operate_log_v_o")
	private List<InterTradeApprovalWorkflowOperateLogVO> workflowLogList;

	public Boolean getAcceptDiffOthers() {
		return this.acceptDiffOthers;
	}
	public void setAcceptDiffOthers(Boolean acceptDiffOthers) {
		this.acceptDiffOthers = acceptDiffOthers;
	}

	public String getAcceptDiffOthersExplain() {
		return this.acceptDiffOthersExplain;
	}
	public void setAcceptDiffOthersExplain(String acceptDiffOthersExplain) {
		this.acceptDiffOthersExplain = acceptDiffOthersExplain;
	}

	public String getAmountType() {
		return this.amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public List<ParticipantInfoVO> getAntiParticipants() {
		return this.antiParticipants;
	}
	public void setAntiParticipants(List<ParticipantInfoVO> antiParticipants) {
		this.antiParticipants = antiParticipants;
	}

	public Date getApplicantDate() {
		return this.applicantDate;
	}
	public void setApplicantDate(Date applicantDate) {
		this.applicantDate = applicantDate;
	}

	public List<InterTradeFileInfoVO> getBackdateReportFile() {
		return this.backdateReportFile;
	}
	public void setBackdateReportFile(List<InterTradeFileInfoVO> backdateReportFile) {
		this.backdateReportFile = backdateReportFile;
	}

	public String getCommitter() {
		return this.committer;
	}
	public void setCommitter(String committer) {
		this.committer = committer;
	}

	public String getContractAmountCent() {
		return this.contractAmountCent;
	}
	public void setContractAmountCent(String contractAmountCent) {
		this.contractAmountCent = contractAmountCent;
	}

	public String getContractAmountCurrency() {
		return this.contractAmountCurrency;
	}
	public void setContractAmountCurrency(String contractAmountCurrency) {
		this.contractAmountCurrency = contractAmountCurrency;
	}

	public String getContractAmountExtra() {
		return this.contractAmountExtra;
	}
	public void setContractAmountExtra(String contractAmountExtra) {
		this.contractAmountExtra = contractAmountExtra;
	}

	public String getContractAmountToCny() {
		return this.contractAmountToCny;
	}
	public void setContractAmountToCny(String contractAmountToCny) {
		this.contractAmountToCny = contractAmountToCny;
	}

	public String getContractCategory() {
		return this.contractCategory;
	}
	public void setContractCategory(String contractCategory) {
		this.contractCategory = contractCategory;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractValidType() {
		return this.contractValidType;
	}
	public void setContractValidType(String contractValidType) {
		this.contractValidType = contractValidType;
	}

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<InterTradeFileInfoVO> getFiles() {
		return this.files;
	}
	public void setFiles(List<InterTradeFileInfoVO> files) {
		this.files = files;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Boolean getIsFrameContract() {
		return this.isFrameContract;
	}
	public void setIsFrameContract(Boolean isFrameContract) {
		this.isFrameContract = isFrameContract;
	}

	public Boolean getLimitBusinessArea() {
		return this.limitBusinessArea;
	}
	public void setLimitBusinessArea(Boolean limitBusinessArea) {
		this.limitBusinessArea = limitBusinessArea;
	}

	public String getLimitBusinessAreaExplain() {
		return this.limitBusinessAreaExplain;
	}
	public void setLimitBusinessAreaExplain(String limitBusinessAreaExplain) {
		this.limitBusinessAreaExplain = limitBusinessAreaExplain;
	}

	public Boolean getLimitCooperate() {
		return this.limitCooperate;
	}
	public void setLimitCooperate(Boolean limitCooperate) {
		this.limitCooperate = limitCooperate;
	}

	public String getLimitCooperateExplain() {
		return this.limitCooperateExplain;
	}
	public void setLimitCooperateExplain(String limitCooperateExplain) {
		this.limitCooperateExplain = limitCooperateExplain;
	}

	public String getLoseEffectMethod() {
		return this.loseEffectMethod;
	}
	public void setLoseEffectMethod(String loseEffectMethod) {
		this.loseEffectMethod = loseEffectMethod;
	}

	public String getMainContractNo() {
		return this.mainContractNo;
	}
	public void setMainContractNo(String mainContractNo) {
		this.mainContractNo = mainContractNo;
	}

	public String getPaymentParty() {
		return this.paymentParty;
	}
	public void setPaymentParty(String paymentParty) {
		this.paymentParty = paymentParty;
	}

	public String getPredictAmountInYearCent() {
		return this.predictAmountInYearCent;
	}
	public void setPredictAmountInYearCent(String predictAmountInYearCent) {
		this.predictAmountInYearCent = predictAmountInYearCent;
	}

	public String getPredictAmountInYearCurrency() {
		return this.predictAmountInYearCurrency;
	}
	public void setPredictAmountInYearCurrency(String predictAmountInYearCurrency) {
		this.predictAmountInYearCurrency = predictAmountInYearCurrency;
	}

	public String getPredictAmountInYearExtra() {
		return this.predictAmountInYearExtra;
	}
	public void setPredictAmountInYearExtra(String predictAmountInYearExtra) {
		this.predictAmountInYearExtra = predictAmountInYearExtra;
	}

	public String getPredictAmountInYearToCny() {
		return this.predictAmountInYearToCny;
	}
	public void setPredictAmountInYearToCny(String predictAmountInYearToCny) {
		this.predictAmountInYearToCny = predictAmountInYearToCny;
	}

	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getPriceTypeExplain() {
		return this.priceTypeExplain;
	}
	public void setPriceTypeExplain(String priceTypeExplain) {
		this.priceTypeExplain = priceTypeExplain;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<ParticipantInfoVO> getSelfParticipants() {
		return this.selfParticipants;
	}
	public void setSelfParticipants(List<ParticipantInfoVO> selfParticipants) {
		this.selfParticipants = selfParticipants;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTakeEffectMethod() {
		return this.takeEffectMethod;
	}
	public void setTakeEffectMethod(String takeEffectMethod) {
		this.takeEffectMethod = takeEffectMethod;
	}

	public Boolean getTemplateProtocol() {
		return this.templateProtocol;
	}
	public void setTemplateProtocol(Boolean templateProtocol) {
		this.templateProtocol = templateProtocol;
	}

	public String getTemplateProtocolExplain() {
		return this.templateProtocolExplain;
	}
	public void setTemplateProtocolExplain(String templateProtocolExplain) {
		this.templateProtocolExplain = templateProtocolExplain;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public List<InterTradeApprovalWorkflowOperateLogVO> getWorkflowLogList() {
		return this.workflowLogList;
	}
	public void setWorkflowLogList(List<InterTradeApprovalWorkflowOperateLogVO> workflowLogList) {
		this.workflowLogList = workflowLogList;
	}

}
