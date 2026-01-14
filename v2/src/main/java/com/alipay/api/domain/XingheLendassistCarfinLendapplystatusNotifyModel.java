package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支用状态通知
 *
 * @author auto create
 * @since 1.0, 2026-01-08 11:02:57
 */
public class XingheLendassistCarfinLendapplystatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1888383893427597945L;

	/**
	 * 协议文件列表
	 */
	@ApiListField("agreement_file_list")
	@ApiField("agreement_file")
	private List<AgreementFile> agreementFileList;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 授信信息列表
（支用审批未通过时可传）
	 */
	@ApiListField("credit_list")
	@ApiField("credit")
	private List<Credit> creditList;

	/**
	 * 放款信息
	 */
	@ApiListField("drawdown_list")
	@ApiField("lend_drawdown")
	private List<LendDrawdown> drawdownList;

	/**
	 * 担保机构信息
	 */
	@ApiField("guarantee_inst")
	private CarfinGuaranteeInst guaranteeInst;

	/**
	 * 支用申请单号
	 */
	@ApiField("lend_apply_no")
	private String lendApplyNo;

	/**
	 * 抵押办理渠道
1 - 专网
2 - 公安网
	 */
	@ApiField("mortgage_channel")
	private String mortgageChannel;

	/**
	 * 是否需要换绑卡，放款中断时可选
	 */
	@ApiField("need_change_bind_card")
	private Boolean needChangeBindCard;

	/**
	 * 是否需要加急办理
	 */
	@ApiField("need_urgent_processing")
	private Boolean needUrgentProcessing;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 外部支用申请单号
	 */
	@ApiField("out_lend_apply_no")
	private String outLendApplyNo;

	/**
	 * 拒绝码 见拒绝码文档
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 拒绝原因
见拒绝码文档
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/**
	 * 支用申请状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 需要补充的信息列表
	 */
	@ApiListField("supplement_category_list")
	@ApiField("supplement_category_info")
	private List<SupplementCategoryInfo> supplementCategoryList;

	/**
	 * 需要补充的原因
	 */
	@ApiField("supplement_reason")
	private String supplementReason;

	/**
	 * 是否支持先放后抵
	 */
	@ApiField("support_lend_before_mortgage")
	private Boolean supportLendBeforeMortgage;

	public List<AgreementFile> getAgreementFileList() {
		return this.agreementFileList;
	}
	public void setAgreementFileList(List<AgreementFile> agreementFileList) {
		this.agreementFileList = agreementFileList;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public List<Credit> getCreditList() {
		return this.creditList;
	}
	public void setCreditList(List<Credit> creditList) {
		this.creditList = creditList;
	}

	public List<LendDrawdown> getDrawdownList() {
		return this.drawdownList;
	}
	public void setDrawdownList(List<LendDrawdown> drawdownList) {
		this.drawdownList = drawdownList;
	}

	public CarfinGuaranteeInst getGuaranteeInst() {
		return this.guaranteeInst;
	}
	public void setGuaranteeInst(CarfinGuaranteeInst guaranteeInst) {
		this.guaranteeInst = guaranteeInst;
	}

	public String getLendApplyNo() {
		return this.lendApplyNo;
	}
	public void setLendApplyNo(String lendApplyNo) {
		this.lendApplyNo = lendApplyNo;
	}

	public String getMortgageChannel() {
		return this.mortgageChannel;
	}
	public void setMortgageChannel(String mortgageChannel) {
		this.mortgageChannel = mortgageChannel;
	}

	public Boolean getNeedChangeBindCard() {
		return this.needChangeBindCard;
	}
	public void setNeedChangeBindCard(Boolean needChangeBindCard) {
		this.needChangeBindCard = needChangeBindCard;
	}

	public Boolean getNeedUrgentProcessing() {
		return this.needUrgentProcessing;
	}
	public void setNeedUrgentProcessing(Boolean needUrgentProcessing) {
		this.needUrgentProcessing = needUrgentProcessing;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getOutLendApplyNo() {
		return this.outLendApplyNo;
	}
	public void setOutLendApplyNo(String outLendApplyNo) {
		this.outLendApplyNo = outLendApplyNo;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getRefuseMsg() {
		return this.refuseMsg;
	}
	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<SupplementCategoryInfo> getSupplementCategoryList() {
		return this.supplementCategoryList;
	}
	public void setSupplementCategoryList(List<SupplementCategoryInfo> supplementCategoryList) {
		this.supplementCategoryList = supplementCategoryList;
	}

	public String getSupplementReason() {
		return this.supplementReason;
	}
	public void setSupplementReason(String supplementReason) {
		this.supplementReason = supplementReason;
	}

	public Boolean getSupportLendBeforeMortgage() {
		return this.supportLendBeforeMortgage;
	}
	public void setSupportLendBeforeMortgage(Boolean supportLendBeforeMortgage) {
		this.supportLendBeforeMortgage = supportLendBeforeMortgage;
	}

}
