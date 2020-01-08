package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InboundOrderLine;
import com.alipay.api.domain.InboundOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsInboundorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3881355685317314712L;

	/** 
	 * 入库通知单明细列表
	 */
	@ApiListField("inbound_order_line_list")
	@ApiField("inbound_order_line")
	private List<InboundOrderLine> inboundOrderLineList;

	/** 
	 * 入库通知单信息
	 */
	@ApiField("inbound_order_vo")
	private InboundOrderVO inboundOrderVo;

	public void setInboundOrderLineList(List<InboundOrderLine> inboundOrderLineList) {
		this.inboundOrderLineList = inboundOrderLineList;
	}
	public List<InboundOrderLine> getInboundOrderLineList( ) {
		return this.inboundOrderLineList;
	}

	public void setInboundOrderVo(InboundOrderVO inboundOrderVo) {
		this.inboundOrderVo = inboundOrderVo;
	}
	public InboundOrderVO getInboundOrderVo( ) {
		return this.inboundOrderVo;
	}

}
