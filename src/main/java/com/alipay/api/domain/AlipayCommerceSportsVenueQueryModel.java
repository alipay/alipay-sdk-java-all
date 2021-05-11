package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场馆信息查询
 *
 * @author auto create
 * @since 1.0, 2021-04-13 22:41:18
 */
public class AlipayCommerceSportsVenueQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7841787274194855215L;

	/**
	 * 服务商场馆ID
	 */
	@ApiField("out_venue_id")
	private String outVenueId;

	/**
	 * 支付宝场馆ID
	 */
	@ApiField("venue_id")
	private String venueId;

	public String getOutVenueId() {
		return this.outVenueId;
	}
	public void setOutVenueId(String outVenueId) {
		this.outVenueId = outVenueId;
	}

	public String getVenueId() {
		return this.venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

}
