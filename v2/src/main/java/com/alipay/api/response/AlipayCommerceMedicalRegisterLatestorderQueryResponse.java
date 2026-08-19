package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PlatformRegisterOrderList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.latestorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-27 10:42:52
 */
public class AlipayCommerceMedicalRegisterLatestorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2865177814716751437L;

	/** 
	 * 订单列表跳转链接
	 */
	@ApiField("order_list_url")
	private String orderListUrl;

	/** 
	 * null
	 */
	@ApiListField("register_order_list")
	@ApiField("platform_register_order_list")
	private List<PlatformRegisterOrderList> registerOrderList;

	public void setOrderListUrl(String orderListUrl) {
		this.orderListUrl = orderListUrl;
	}
	public String getOrderListUrl( ) {
		return this.orderListUrl;
	}

	public void setRegisterOrderList(List<PlatformRegisterOrderList> registerOrderList) {
		this.registerOrderList = registerOrderList;
	}
	public List<PlatformRegisterOrderList> getRegisterOrderList( ) {
		return this.registerOrderList;
	}

}
