package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.advanced.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:07:00
 */
public class AlipayOverseasTaxAdvancedStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7177951615867542699L;

	/** 
	 * 用付款码下单并冻结成功后会返回支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 用付款码下单并冻结成功后会返回支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 退税机构业务流水号
	 */
	@ApiField("out_tax_refund_no")
	private String outTaxRefundNo;

	/** 
	 * 当前订单状态，新建（INIT），预授权退税处理中（ADVANCED_PROCESSING），预授权退税成功（ADVANCED_SUCCESS），预授权退税失败（ADVANCED_FAIL），解冻成功退税完成（FINISH），转交易成功（TRADE_PAY_SUCCESS），转交易失败（TRADE_PAY_FAIL），退款成功（TRADE_REFUND_SUCCESS），退款失败（TRADE_REFUND_FAIL）
各状态下机构对应处理：ADVANCED_PROCESSING继续轮询，ADVANCED_FAIL更换out_tax_refund_no重新调用下单接口，TRADE_PAY_FAIL更新out_request_no重新调用转支付接口，TRADE_REFUND_FAIL已经无法退款，请联系技术支持
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 状态变更时间，时间格式：YYYY-MM-DD HH:MM:SS，北京时间24小时制，时区东八区
	 */
	@ApiField("status_change_time")
	private Date statusChangeTime;

	/** 
	 * 状态描述信息，冻结处理中（FREEZE_PROCESSING），冻结失败（FREEZE_FAIL），退税放款处理中（PAYMENT_PROCESSING），退税放款失败解冻中（PAYMENT_FAIL_AND_UNFREEZE_PROCESSING），退税放款失败解冻完成（PAYMENT_FAIL_AND_UNFREEZE_DONE）
	 */
	@ApiField("status_msg")
	private String statusMsg;

	/** 
	 * 支付宝退税资金订单号
	 */
	@ApiField("tax_refund_no")
	private String taxRefundNo;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutTaxRefundNo(String outTaxRefundNo) {
		this.outTaxRefundNo = outTaxRefundNo;
	}
	public String getOutTaxRefundNo( ) {
		return this.outTaxRefundNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusChangeTime(Date statusChangeTime) {
		this.statusChangeTime = statusChangeTime;
	}
	public Date getStatusChangeTime( ) {
		return this.statusChangeTime;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	public String getStatusMsg( ) {
		return this.statusMsg;
	}

	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}
	public String getTaxRefundNo( ) {
		return this.taxRefundNo;
	}

}
