package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenIdOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.applyorder.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:41:44
 */
public class AlipayOpenAppOpenidApplyorderCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 6897116982775254594L;

	/** 
	 * 最近创建的10条工单状态信息
	 */
	@ApiListField("order_list")
	@ApiField("open_id_order")
	private List<OpenIdOrder> orderList;

	public void setOrderList(List<OpenIdOrder> orderList) {
		this.orderList = orderList;
	}
	public List<OpenIdOrder> getOrderList( ) {
		return this.orderList;
	}

}
