package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券的集合信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:40
 */
public class CodeNOList extends AlipayObject {

	private static final long serialVersionUID = 7898637233796811813L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 对应TP活动码
	 */
	@ApiField("code_no")
	private String codeNo;

	/**
	 * 如果ticket_type为油券，则该字段1:石化，2:石油
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 券类型,1:油券
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 有效期
	 */
	@ApiField("valid_date")
	private String validDate;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCodeNo() {
		return this.codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
