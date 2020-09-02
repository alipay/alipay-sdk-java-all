package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.signin.submit response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-06 17:50:15
 */
public class AlipayMarketingToolSigninSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6879165796676797927L;

	/** 
	 * 发奖单据。
	 */
	@ApiListField("prize_orders")
	@ApiField("prize_order_v_o")
	private List<PrizeOrderVO> prizeOrders;

	public void setPrizeOrders(List<PrizeOrderVO> prizeOrders) {
		this.prizeOrders = prizeOrders;
	}
	public List<PrizeOrderVO> getPrizeOrders( ) {
		return this.prizeOrders;
	}

}
