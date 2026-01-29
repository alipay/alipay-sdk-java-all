package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品和预约资源绑定
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AlipayCommerceLifeserviceItembookingBindModel extends AlipayObject {

	private static final long serialVersionUID = 2792586362976365986L;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * null
	 */
	@ApiListField("room_ids")
	@ApiField("string")
	private List<String> roomIds;

	/**
	 * null
	 */
	@ApiListField("service_ids")
	@ApiField("string")
	private List<String> serviceIds;

	/**
	 * sku编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * null
	 */
	@ApiListField("technician_ids")
	@ApiField("string")
	private List<String> technicianIds;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public List<String> getRoomIds() {
		return this.roomIds;
	}
	public void setRoomIds(List<String> roomIds) {
		this.roomIds = roomIds;
	}

	public List<String> getServiceIds() {
		return this.serviceIds;
	}
	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public List<String> getTechnicianIds() {
		return this.technicianIds;
	}
	public void setTechnicianIds(List<String> technicianIds) {
		this.technicianIds = technicianIds;
	}

}
