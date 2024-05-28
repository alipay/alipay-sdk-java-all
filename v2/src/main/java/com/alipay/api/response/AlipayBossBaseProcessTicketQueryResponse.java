package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiTicket;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.ticket.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-09 16:47:22
 */
public class AlipayBossBaseProcessTicketQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4247836542636174743L;

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
