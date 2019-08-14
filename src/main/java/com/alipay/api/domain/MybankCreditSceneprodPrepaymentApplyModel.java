package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融银行直投提前还款
 *
 * @author auto create
 * @since 1.0, 2019-03-27 10:04:04
 */
public class MybankCreditSceneprodPrepaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4169154191567465748L;

	/**
	 * 网商申请单号(必须S结尾)
	 */
	@ApiField("app_seq_no")
	private String appSeqNo;

	/**
	 * 枚举值
a.退车 loanCancel
b.机构主动回购 activeRefund
c.客户主动结清 repayByCust
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 借款人姓名
	 */
	@ApiField("cust_name")
	private String custName;

	/**
	 * 网商支用号（必须V结尾）
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/**
	 * 借款人身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * operate_mode操作类型代表当前接口的调用形态，是一个枚举值，目前分为以下三个值：
a.提前还款试算查询 prepaymentBudgetQuery
b.提前还款申请 prepaymentApply
c.提前还款结果查询 prepaymentResultQuery
	 */
	@ApiField("operate_mode")
	private String operateMode;

	/**
	 * 提前还款总金额（单位分）
提前还款申请时必填 prepayment_amt=print_amt + int_amt + pen_amt
	 */
	@ApiField("prepayment_amt")
	private String prepaymentAmt;

	/**
	 * 提前还款申请单号(提前还款查询时必须传)
提前还款申请单号是提前还款受理阶段的网商侧返回的提前还款申请单号。
	 */
	@ApiField("prepayment_apply_no")
	private String prepaymentApplyNo;

	/**
	 * 提前还款利息（单位分）
提前还款申请时必填
	 */
	@ApiField("prepayment_int_amt")
	private String prepaymentIntAmt;

	/**
	 * 提前还款罚金（单位分）
提前还款申请时必填
	 */
	@ApiField("prepayment_pen_amt")
	private String prepaymentPenAmt;

	/**
	 * 前还款本金（单位分）
提前还款申请时必填
	 */
	@ApiField("prepayment_prin_amt")
	private String prepaymentPrinAmt;

	/**
	 * 还款方式，目前固定为 Clear（全额还款结清）
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * request_id是一个请求幂等号，在网络抖动/超时情况下，使用相同的requestId可幂等获取原有值
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAppSeqNo() {
		return this.appSeqNo;
	}
	public void setAppSeqNo(String appSeqNo) {
		this.appSeqNo = appSeqNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCustName() {
		return this.custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getDrawdownNo() {
		return this.drawdownNo;
	}
	public void setDrawdownNo(String drawdownNo) {
		this.drawdownNo = drawdownNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getOperateMode() {
		return this.operateMode;
	}
	public void setOperateMode(String operateMode) {
		this.operateMode = operateMode;
	}

	public String getPrepaymentAmt() {
		return this.prepaymentAmt;
	}
	public void setPrepaymentAmt(String prepaymentAmt) {
		this.prepaymentAmt = prepaymentAmt;
	}

	public String getPrepaymentApplyNo() {
		return this.prepaymentApplyNo;
	}
	public void setPrepaymentApplyNo(String prepaymentApplyNo) {
		this.prepaymentApplyNo = prepaymentApplyNo;
	}

	public String getPrepaymentIntAmt() {
		return this.prepaymentIntAmt;
	}
	public void setPrepaymentIntAmt(String prepaymentIntAmt) {
		this.prepaymentIntAmt = prepaymentIntAmt;
	}

	public String getPrepaymentPenAmt() {
		return this.prepaymentPenAmt;
	}
	public void setPrepaymentPenAmt(String prepaymentPenAmt) {
		this.prepaymentPenAmt = prepaymentPenAmt;
	}

	public String getPrepaymentPrinAmt() {
		return this.prepaymentPrinAmt;
	}
	public void setPrepaymentPrinAmt(String prepaymentPrinAmt) {
		this.prepaymentPrinAmt = prepaymentPrinAmt;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
