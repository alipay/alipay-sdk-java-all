package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QrCodeRouteGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:43:59
 */
public class AlipayOpenMiniQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7258149542215457166L;

	/** 
	 * 规则路由数据列表
	 */
	@ApiListField("qr_code_route_groups")
	@ApiField("qr_code_route_group")
	private List<QrCodeRouteGroup> qrCodeRouteGroups;

	/** 
	 * 数据总数
	 */
	@ApiField("total_items")
	private Long totalItems;

	public void setQrCodeRouteGroups(List<QrCodeRouteGroup> qrCodeRouteGroups) {
		this.qrCodeRouteGroups = qrCodeRouteGroups;
	}
	public List<QrCodeRouteGroup> getQrCodeRouteGroups( ) {
		return this.qrCodeRouteGroups;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

}
