package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.memberbuy.itemdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-09 17:42:45
 */
public class AlipayUserMemberbuyItemdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2687173292458442453L;

	/** 
	 * 会员购商品关联的商详URL
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/** 
	 * 会员购商品关联的会员服务配置ID
	 */
	@ApiField("service_id")
	private String serviceId;

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getDetailUrl( ) {
		return this.detailUrl;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceId( ) {
		return this.serviceId;
	}

}
