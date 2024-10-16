package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiTicket;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.ticket.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 11:37:01
 */
public class AlipayBossBaseProcessTicketQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2261963494261497757L;

	/** 
	 * 工单详情
	 */
	@ApiField("ticket")
	private BPOpenApiTicket ticket;

	public void setTicket(BPOpenApiTicket ticket) {
		this.ticket = ticket;
	}
	public BPOpenApiTicket getTicket( ) {
		return this.ticket;
	}

}
