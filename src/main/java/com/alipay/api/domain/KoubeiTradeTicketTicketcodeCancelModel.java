package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证码撤销核销
 *
 * @author auto create
 * @since 1.0, 2018-04-27 22:32:02
 */
public class KoubeiTradeTicketTicketcodeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4721185171449684159L;

	/**
	 * INTERNAL_CODE(券码),EXTERNAL_CODE(外部券码),默认INTERNAL_CODE
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 口碑订单号，使用外部券码取消时必填
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 冲正份数，目前仅次卡业务使用，用于校验正反向份数相同
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 业务请求号,一般为正向核销时使用的外部请求号
	 */
	@ApiField("request_biz_no")
	private String requestBizNo;

	/**
	 * 核销的外部请求号，指定撤销某一次的核销动作
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * request_id对应核销的券码
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRequestBizNo() {
		return this.requestBizNo;
	}
	public void setRequestBizNo(String requestBizNo) {
		this.requestBizNo = requestBizNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

}
