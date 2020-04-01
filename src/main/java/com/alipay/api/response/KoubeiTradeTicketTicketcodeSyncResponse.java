package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.ticketcode.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-19 16:08:21
 */
public class KoubeiTradeTicketTicketcodeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7789995866198383586L;

	/** 
	 * 该字段用于描述本次返回中的业务属性，现有：BIZ_ALREADY_SUCCESS（幂等业务码）
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 凭证码所属的订单id
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiListField("request_id")
	@ApiField("string")
	private List<String> requestId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setRequestId(List<String> requestId) {
		this.requestId = requestId;
	}
	public List<String> getRequestId( ) {
		return this.requestId;
	}

}
