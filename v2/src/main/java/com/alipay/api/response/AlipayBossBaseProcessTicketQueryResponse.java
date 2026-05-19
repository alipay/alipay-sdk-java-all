package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiTicket;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.ticket.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-16 00:04:57
 */
public class AlipayBossBaseProcessTicketQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8853947328786917685L;

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
