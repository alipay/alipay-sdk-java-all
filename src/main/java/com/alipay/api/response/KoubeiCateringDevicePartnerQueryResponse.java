package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopActivationInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.device.partner.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringDevicePartnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2822516264864248527L;

	/** 
	 * 请求中的request_id。拿到结果后最好做下请求ID和返回的结果请求ID是否一致，防止万一请求串掉。
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 店铺信息
	 */
	@ApiListField("shop_activation_info_response_list")
	@ApiField("shop_activation_info_response")
	private List<ShopActivationInfoResponse> shopActivationInfoResponseList;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setShopActivationInfoResponseList(List<ShopActivationInfoResponse> shopActivationInfoResponseList) {
		this.shopActivationInfoResponseList = shopActivationInfoResponseList;
	}
	public List<ShopActivationInfoResponse> getShopActivationInfoResponseList( ) {
		return this.shopActivationInfoResponseList;
	}

}
