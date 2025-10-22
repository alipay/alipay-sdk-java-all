package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 协议状态通知
 *
 * @author auto create
 * @since 1.0, 2025-09-18 16:03:39
 */
public class XingheLendassistCarfinFinagreementNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2566255831157945339L;

	/**
	 * 协议列表
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
	 * 星河侧唯一支用订单号
	 */
	@ApiField("lend_apply_no")
	private String lendApplyNo;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 外部支用单号
	 */
	@ApiField("out_lend_apply_no")
	private String outLendApplyNo;

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

	public String getLendApplyNo() {
		return this.lendApplyNo;
	}
	public void setLendApplyNo(String lendApplyNo) {
		this.lendApplyNo = lendApplyNo;
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

}
