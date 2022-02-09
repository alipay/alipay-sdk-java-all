package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QrCodeRouteGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-18 09:46:02
 */
public class AlipayOpenMiniQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5281521958392981827L;

	/** 
	 * 规则路由数据
	 */
	@ApiField("qr_code_route_groups")
	private QrCodeRouteGroup qrCodeRouteGroups;

	/** 
	 * 数据总数
	 */
	@ApiField("total_items")
	private Long totalItems;

	public void setQrCodeRouteGroups(QrCodeRouteGroup qrCodeRouteGroups) {
		this.qrCodeRouteGroups = qrCodeRouteGroups;
	}
	public QrCodeRouteGroup getQrCodeRouteGroups( ) {
		return this.qrCodeRouteGroups;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

}
