package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主营销平台券核销结果通知
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:18:52
 */
public class AlipayEcoMycarPromoTicketPushModel extends AlipayObject {

	private static final long serialVersionUID = 2667141743442572561L;

	/**
	 * 核销流水
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 核销状态，0：成功，1：失败
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 对应TP活动码
	 */
	@ApiField("code_no")
	private String codeNo;

	/**
	 * 券ID
	 */
	@ApiField("ticket_id")
	private String ticketId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getCodeNo() {
		return this.codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public String getTicketId() {
		return this.ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

}
