package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证码查询
 *
 * @author auto create
 * @since 1.0, 2021-09-03 17:21:15
 */
public class KoubeiTradeTicketTicketcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2327676679358826542L;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 券码值，12位纯数字券码，且唯一不重复。
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

}
