package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ConsultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.agent.ticket.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-22 10:17:56
 */
public class AlipayCommerceRentAgentTicketConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5164399964219945554L;

	/** 
	 * 用户咨询详情，由智能体在咨询过程中提取的结构化数据，各行业按 sub_biz_type 约定内部结构
	 */
	@ApiField("consult_detail")
	private ConsultDetail consultDetail;

	public void setConsultDetail(ConsultDetail consultDetail) {
		this.consultDetail = consultDetail;
	}
	public ConsultDetail getConsultDetail( ) {
		return this.consultDetail;
	}

}
