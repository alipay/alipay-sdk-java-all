package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OutboundOrderLine;
import com.alipay.api.domain.OutboundOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class KoubeiRetailWmsOutboundorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5185945316824641512L;

	/** 
	 * 出库通知单明细列表
	 */
	@ApiListField("outbound_order_line_list")
	@ApiField("outbound_order_line")
	private List<OutboundOrderLine> outboundOrderLineList;

	/** 
	 * 出库通知单
	 */
	@ApiField("outbound_order_vo")
	private OutboundOrderVO outboundOrderVo;

	public void setOutboundOrderLineList(List<OutboundOrderLine> outboundOrderLineList) {
		this.outboundOrderLineList = outboundOrderLineList;
	}
	public List<OutboundOrderLine> getOutboundOrderLineList( ) {
		return this.outboundOrderLineList;
	}

	public void setOutboundOrderVo(OutboundOrderVO outboundOrderVo) {
		this.outboundOrderVo = outboundOrderVo;
	}
	public OutboundOrderVO getOutboundOrderVo( ) {
		return this.outboundOrderVo;
	}

}
