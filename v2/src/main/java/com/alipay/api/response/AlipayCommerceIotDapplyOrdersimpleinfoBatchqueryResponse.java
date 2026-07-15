package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.ordersimpleinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:32:57
 */
public class AlipayCommerceIotDapplyOrdersimpleinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8654431946771695461L;

	/** 
	 * 批量下单后系统会根据批量文件每行生成一个设备申请单，该单号对应这个申请单的业务订单号(业务主键)。
	 */
	@ApiListField("order_biz_ids")
	@ApiField("string")
	private List<String> orderBizIds;

	public void setOrderBizIds(List<String> orderBizIds) {
		this.orderBizIds = orderBizIds;
	}
	public List<String> getOrderBizIds( ) {
		return this.orderBizIds;
	}

}
