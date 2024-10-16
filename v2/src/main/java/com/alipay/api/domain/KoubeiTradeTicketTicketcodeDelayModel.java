package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证延期接口
 *
 * @author auto create
 * @since 1.0, 2019-07-29 17:14:28
 */
public class KoubeiTradeTicketTicketcodeDelayModel extends AlipayObject {

	private static final long serialVersionUID = 2451993433395488441L;

	/**
	 * 券码类型。默认INTERNAL_CODE。枚举值如下：
* INTERNAL_CODE：券码。
* EXTERNAL_CODE：外部券码。
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 延至日期，时间格式为 yyyyMMdd HHmmss。
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求 id，唯一标识一次请求，由商家自定义。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 凭证码
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
