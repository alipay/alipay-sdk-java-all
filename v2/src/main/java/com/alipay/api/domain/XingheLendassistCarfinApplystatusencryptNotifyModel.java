package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车金融订单状态加密通知接口
 *
 * @author auto create
 * @since 1.0, 2024-08-08 21:02:51
 */
public class XingheLendassistCarfinApplystatusencryptNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8585782163414741967L;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 客户贷款列表
	 */
	@ApiListField("loan_list")
	@ApiField("org_loan_detail")
	private List<OrgLoanDetail> loanList;

	/**
	 * 机构侧状态码
	 */
	@ApiField("org_status")
	private String orgStatus;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 客户申请状态：
APPLIED：已申请；FOLLOWING：客服跟进中；WILLING：客户有意愿；NO_WILLING：客户无意愿；PRE_REJECT：预审拒绝；PRE_PASS：预审通过；APPROVING：审批中；APPROVE_REJECT：审批拒绝；APPROVE_PASS：审批通过；SIGNING：签约中；SIGN_FAIL：签约失败；SIGNED：合同已生效；LENDING：放款中；LEND_REJECT：放款拒绝；LEND_SUC：已放款
	 */
	@ApiField("status")
	private String status;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public List<OrgLoanDetail> getLoanList() {
		return this.loanList;
	}
	public void setLoanList(List<OrgLoanDetail> loanList) {
		this.loanList = loanList;
	}

	public String getOrgStatus() {
		return this.orgStatus;
	}
	public void setOrgStatus(String orgStatus) {
		this.orgStatus = orgStatus;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
