package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款变更通知来报
 *
 * @author auto create
 * @since 1.0, 2026-09-10 14:32:52
 */
public class XingheLendassistCarfinRepaymentNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5598314952587836959L;

	/**
	 * 星河侧唯一业务编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 还款银行卡信息
	 */
	@ApiField("bank_card")
	private BankCardSimpleInfo bankCard;

	/**
	 * null
	 */
	@ApiListField("drawdown_info_list")
	@ApiField("drawdown_info")
	private List<DrawdownInfo> drawdownInfoList;

	/**
	 * 还款失败code
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 还款失败描述
	 */
	@ApiField("fail_msg")
	private String failMsg;

	/**
	 * 通知类型  1 状态通知 2 机构侧还款通知
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * null
	 */
	@ApiListField("org_drawdown_no_list")
	@ApiField("string")
	private List<String> orgDrawdownNoList;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 机构侧外部还款单号
	 */
	@ApiField("out_repayment_no")
	private String outRepaymentNo;

	/**
	 * 退款状态。REFUNDING：退款中；REFUND_SUCCESS：退款成功
NOT_DEDUCTED：未扣款
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 星河侧还款单号
	 */
	@ApiField("repayment_no")
	private String repaymentNo;

	/**
	 * 还款状态
	 */
	@ApiField("repayment_status")
	private String repaymentStatus;

	/**
	 * 还款时间
	 */
	@ApiField("repayment_time")
	private String repaymentTime;

	/**
	 * 总还款金额 单位元
notify_type=2等于借据列表总金额相加
	 */
	@ApiField("repayment_total_amt")
	private String repaymentTotalAmt;

	/**
	 * 还款类型
	 */
	@ApiField("repayment_type")
	private String repaymentType;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public BankCardSimpleInfo getBankCard() {
		return this.bankCard;
	}
	public void setBankCard(BankCardSimpleInfo bankCard) {
		this.bankCard = bankCard;
	}

	public List<DrawdownInfo> getDrawdownInfoList() {
		return this.drawdownInfoList;
	}
	public void setDrawdownInfoList(List<DrawdownInfo> drawdownInfoList) {
		this.drawdownInfoList = drawdownInfoList;
	}

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getFailMsg() {
		return this.failMsg;
	}
	public void setFailMsg(String failMsg) {
		this.failMsg = failMsg;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public List<String> getOrgDrawdownNoList() {
		return this.orgDrawdownNoList;
	}
	public void setOrgDrawdownNoList(List<String> orgDrawdownNoList) {
		this.orgDrawdownNoList = orgDrawdownNoList;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getOutRepaymentNo() {
		return this.outRepaymentNo;
	}
	public void setOutRepaymentNo(String outRepaymentNo) {
		this.outRepaymentNo = outRepaymentNo;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRepaymentNo() {
		return this.repaymentNo;
	}
	public void setRepaymentNo(String repaymentNo) {
		this.repaymentNo = repaymentNo;
	}

	public String getRepaymentStatus() {
		return this.repaymentStatus;
	}
	public void setRepaymentStatus(String repaymentStatus) {
		this.repaymentStatus = repaymentStatus;
	}

	public String getRepaymentTime() {
		return this.repaymentTime;
	}
	public void setRepaymentTime(String repaymentTime) {
		this.repaymentTime = repaymentTime;
	}

	public String getRepaymentTotalAmt() {
		return this.repaymentTotalAmt;
	}
	public void setRepaymentTotalAmt(String repaymentTotalAmt) {
		this.repaymentTotalAmt = repaymentTotalAmt;
	}

	public String getRepaymentType() {
		return this.repaymentType;
	}
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}

}
