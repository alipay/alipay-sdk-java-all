package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InboundOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsInboundorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5193861319334344496L;

	/** 
	 * 入库通知单列表
	 */
	@ApiListField("inbound_order_vo_list")
	@ApiField("inbound_order_v_o")
	private List<InboundOrderVO> inboundOrderVoList;

	public void setInboundOrderVoList(List<InboundOrderVO> inboundOrderVoList) {
		this.inboundOrderVoList = inboundOrderVoList;
	}
	public List<InboundOrderVO> getInboundOrderVoList( ) {
		return this.inboundOrderVoList;
	}

}
