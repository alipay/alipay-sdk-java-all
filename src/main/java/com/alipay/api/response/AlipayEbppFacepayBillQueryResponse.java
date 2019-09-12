package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.facepay.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppFacepayBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4199452648582824258L;

	/** 
	 * 支付宝交易流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 仅缴税业务返回，业务状态
CLOSED: 已关闭
TO_PAY：待支付
PAID: 已支付
BIZ_SUC: 业务成功。对缴税来说，意味着银行已明确返回缴税成功。
BIZ_FAIL: 业务失败（用户支付的资金会原路退回）。对缴税来说，意味着缴税一定没有做成。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/** 
	 * 出账机构代码（缴税业务：指征收机关英文代码，例如南京玄武国税（NJXWGS））
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 机构账单ID（缴税业务：用外部申报号）
	 */
	@ApiField("inst_no")
	private String instNo;

	/** 
	 * ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * SUCCESS - 付款成功（只有明确得到此状态，才能认为付款成功）
FAIL - 付款失败（明确得到此状态，机构可认为本次支付失败，再次扫码）
WAIT_PAY - 等待用户输入密码支付（得到此状态，需轮询10次，每隔3s一次，若一直得不到明确结果需要调用撤销接口，认为支付失败）
UNKNOWN - 状态未知（得到此状态，需轮询2次，每隔5s一次，若一直得不到明确结果需要调用撤销接口，认为支付失败）
注1：缴费业务如果需要支付宝销账，则不支持撤销。
注2：缴税业务比较特殊，不能调用撤销。如果查询得到WAIT_PAY，就需要一定间隔后（建议3s）再次查询，直到拿到SUCCESS/FAIL为止；如果查询得到UNKNOWN，也要轮询下去（建议5s为间隔），若轮询超限（建议3次以上）仍未拿到确定结果，可尝试重新发起扣款。
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易付款日期
	 */
	@ApiField("trade_date")
	private String tradeDate;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getInstNo( ) {
		return this.instNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradeDate( ) {
		return this.tradeDate;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
