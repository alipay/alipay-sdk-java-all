package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TicketDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-10 16:31:37
 */
public class AlipayCommerceCityfacilitatorVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4825888833355365341L;

	/** 
	 * 查询到的订单信息列表
	 */
	@ApiListField("tickets")
	@ApiField("ticket_detail_info")
	private List<TicketDetailInfo> tickets;

	public void setTickets(List<TicketDetailInfo> tickets) {
		this.tickets = tickets;
	}
	public List<TicketDetailInfo> getTickets( ) {
		return this.tickets;
	}

}
