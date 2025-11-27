package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderApplyStatusBriefDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.applystatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 20:21:49
 */
public class AlipayEbppInvoiceApplystatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7496657569266693785L;

	/** 
	 * 每笔交易开票状态
	 */
	@ApiListField("apply_status_brief_dtos")
	@ApiField("order_apply_status_brief_d_t_o")
	private List<OrderApplyStatusBriefDTO> applyStatusBriefDtos;

	public void setApplyStatusBriefDtos(List<OrderApplyStatusBriefDTO> applyStatusBriefDtos) {
		this.applyStatusBriefDtos = applyStatusBriefDtos;
	}
	public List<OrderApplyStatusBriefDTO> getApplyStatusBriefDtos( ) {
		return this.applyStatusBriefDtos;
	}

}
