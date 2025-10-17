package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抵押补充信息通知
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:04
 */
public class XingheLendassistCarfinMortgagesupplementNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3759681781154448334L;

	/**
	 * 金融机构补充协议列表
	 */
	@ApiListField("agreement_list")
	@ApiField("agreement_full_info")
	private List<AgreementFullInfo> agreementList;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 星河侧唯一支用申请单号
	 */
	@ApiField("lend_apply_no")
	private String lendApplyNo;

	/**
	 * 星河侧唯一抵押订单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	/**
	 * 机构侧唯一业务单号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 外部支用申请单号
	 */
	@ApiField("out_lend_apply_no")
	private String outLendApplyNo;

	/**
	 * 需要补充的文件资料
	 */
	@ApiListField("supple_file_list")
	@ApiField("string")
	private List<String> suppleFileList;

	/**
	 * 需要补充的资料列表
	 */
	@ApiListField("supplement_list")
	@ApiField("string")
	private List<String> supplementList;

	public List<AgreementFullInfo> getAgreementList() {
		return this.agreementList;
	}
	public void setAgreementList(List<AgreementFullInfo> agreementList) {
		this.agreementList = agreementList;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getLendApplyNo() {
		return this.lendApplyNo;
	}
	public void setLendApplyNo(String lendApplyNo) {
		this.lendApplyNo = lendApplyNo;
	}

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
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

	public List<String> getSuppleFileList() {
		return this.suppleFileList;
	}
	public void setSuppleFileList(List<String> suppleFileList) {
		this.suppleFileList = suppleFileList;
	}

	public List<String> getSupplementList() {
		return this.supplementList;
	}
	public void setSupplementList(List<String> supplementList) {
		this.supplementList = supplementList;
	}

}
