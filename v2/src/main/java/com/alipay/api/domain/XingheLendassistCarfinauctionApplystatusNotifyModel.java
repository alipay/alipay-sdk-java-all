package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 拍卖分期申请单状态通知来报
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:52:53
 */
public class XingheLendassistCarfinauctionApplystatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8385622526714617836L;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * null
	 */
	@ApiListField("credit_list")
	@ApiField("auc_credit")
	private List<AucCredit> creditList;

	/**
	 * 放款信息
	 */
	@ApiField("loan_info")
	private AucLoanInfo loanInfo;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 拒绝码
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 拒绝原因
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/**
	 * 客户申请状态
	 */
	@ApiField("status")
	private String status;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public List<AucCredit> getCreditList() {
		return this.creditList;
	}
	public void setCreditList(List<AucCredit> creditList) {
		this.creditList = creditList;
	}

	public AucLoanInfo getLoanInfo() {
		return this.loanInfo;
	}
	public void setLoanInfo(AucLoanInfo loanInfo) {
		this.loanInfo = loanInfo;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
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

}
