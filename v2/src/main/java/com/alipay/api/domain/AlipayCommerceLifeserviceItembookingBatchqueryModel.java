package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品和预约资源绑定关系查询
 *
 * @author auto create
 * @since 1.0, 2026-02-25 13:42:43
 */
public class AlipayCommerceLifeserviceItembookingBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6224912628446511728L;

	/**
	 * sku编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 房间id
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 服务项目id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * sku编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 手艺人id
	 */
	@ApiField("technician_id")
	private String technicianId;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getTechnicianId() {
		return this.technicianId;
	}
	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}

}
