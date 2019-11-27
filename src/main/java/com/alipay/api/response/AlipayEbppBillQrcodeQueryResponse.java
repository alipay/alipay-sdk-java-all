package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppBillQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4215556636928465343L;

	/** 
	 * 支付宝流水号。
仅在用户扫码后产生，对于给定的一个out_order_no，最终只能有一笔支付宝流水（以alipay_bill_no为标识）完成支付并把业务做成功。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/** 
	 * 业务状态。
INIT: 初始状态（一个码只能扫一次，此状态代表该二维码从未被用户扫过）
CLOSED: 已关闭（由于用户扫码后未付款、超时等原因，单据关闭作废）
TO_PAY: 待支付（用户已扫码，但尚未确认支付）
PAID: 已支付（服务受理中，对于缴税来说，是银行正在处理缴税请求）
BIZ_SUC: 业务成功（对缴税来说，意味着银行已明确返回缴税成功）
BIZ_FAIL: 业务失败，用户支付的资金会原路退回（对缴税来说，意味着缴税一定没有做成）
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/** 
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 回传ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}
	public String getAlipayBillNo( ) {
		return this.alipayBillNo;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
