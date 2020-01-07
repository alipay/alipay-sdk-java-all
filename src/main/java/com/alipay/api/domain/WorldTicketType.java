package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可选票种
 *
 * @author auto create
 * @since 1.0, 2019-12-18 19:54:54
 */
public class WorldTicketType extends AlipayObject {

	private static final long serialVersionUID = 6584637724192111466L;

	/**
	 * 票种代码
	 */
	@ApiField("ticket_type_code")
	private String ticketTypeCode;

	/**
	 * 票种描述
	 */
	@ApiField("ticket_type_desc")
	private String ticketTypeDesc;

	/**
	 * 票种名称
	 */
	@ApiField("ticket_type_name")
	private String ticketTypeName;

	public String getTicketTypeCode() {
		return this.ticketTypeCode;
	}
	public void setTicketTypeCode(String ticketTypeCode) {
		this.ticketTypeCode = ticketTypeCode;
	}

	public String getTicketTypeDesc() {
		return this.ticketTypeDesc;
	}
	public void setTicketTypeDesc(String ticketTypeDesc) {
		this.ticketTypeDesc = ticketTypeDesc;
	}

	public String getTicketTypeName() {
		return this.ticketTypeName;
	}
	public void setTicketTypeName(String ticketTypeName) {
		this.ticketTypeName = ticketTypeName;
	}

}
