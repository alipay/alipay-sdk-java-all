package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手艺人删除
 *
 * @author auto create
 * @since 1.0, 2026-02-05 18:12:43
 */
public class AlipayCommerceLifeserviceTechnicianDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1662186655162245739L;

	/**
	 * 三方手艺人id【需保证唯一性】
	 */
	@ApiField("out_technician_id")
	private String outTechnicianId;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 手艺人id【和out_technician_id二选一】
	 */
	@ApiField("technician_id")
	private String technicianId;

	public String getOutTechnicianId() {
		return this.outTechnicianId;
	}
	public void setOutTechnicianId(String outTechnicianId) {
		this.outTechnicianId = outTechnicianId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTechnicianId() {
		return this.technicianId;
	}
	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}

}
