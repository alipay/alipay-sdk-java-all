package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能选址充电桩订单信息同步
 *
 * @author auto create
 * @since 1.0, 2025-05-26 15:36:44
 */
public class AlipayCommerceTransportChargerOrderinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3422542473769877689L;

	/**
	 * 订单详情信息
	 */
	@ApiField("site_charger_order")
	private SiteChargerOrderDTO siteChargerOrder;

	public SiteChargerOrderDTO getSiteChargerOrder() {
		return this.siteChargerOrder;
	}
	public void setSiteChargerOrder(SiteChargerOrderDTO siteChargerOrder) {
		this.siteChargerOrder = siteChargerOrder;
	}

}
