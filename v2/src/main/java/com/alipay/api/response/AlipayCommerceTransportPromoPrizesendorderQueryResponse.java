package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.promo.prizesendorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-04 20:47:09
 */
public class AlipayCommerceTransportPromoPrizesendorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6726493489255724364L;

	/** 
	 * 发奖列表信息
	 */
	@ApiListField("data")
	@ApiField("prize_order_detail")
	private List<PrizeOrderDetail> data;

	public void setData(List<PrizeOrderDetail> data) {
		this.data = data;
	}
	public List<PrizeOrderDetail> getData( ) {
		return this.data;
	}

}
