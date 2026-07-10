package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.ordersn.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:18
 */
public class AlipayCommerceIotDapplyOrdersnQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6123111937375117579L;

	/** 
	 * 设备申请业务订单号，接口传入原样返回
	 */
	@ApiField("order_biz_id")
	private String orderBizId;

	/** 
	 * 订单发货的设备SN
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	public void setOrderBizId(String orderBizId) {
		this.orderBizId = orderBizId;
	}
	public String getOrderBizId( ) {
		return this.orderBizId;
	}

	public void setSnList(List<String> snList) {
		this.snList = snList;
	}
	public List<String> getSnList( ) {
		return this.snList;
	}

}
