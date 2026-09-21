package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * B2C订单配送状态同步
 *
 * @author auto create
 * @since 1.0, 2026-09-16 10:37:36
 */
public class AlipayCommerceMedicalOrderWaybillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8767837267153177388L;

	/**
	 * 第三方配送商物流单号（整单使用）
	 */
	@ApiField("carrier_order_no")
	private String carrierOrderNo;

	/**
	 * 订单全部的商品信息（整单使用）
	 */
	@ApiListField("items")
	@ApiField("waybill_item_v_o")
	private List<WaybillItemVO> items;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 拆分订单的多物流信息列表（拆单使用）
	 */
	@ApiListField("shipment_list")
	@ApiField("shipment_v_o")
	private List<ShipmentVO> shipmentList;

	public String getCarrierOrderNo() {
		return this.carrierOrderNo;
	}
	public void setCarrierOrderNo(String carrierOrderNo) {
		this.carrierOrderNo = carrierOrderNo;
	}

	public List<WaybillItemVO> getItems() {
		return this.items;
	}
	public void setItems(List<WaybillItemVO> items) {
		this.items = items;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public List<ShipmentVO> getShipmentList() {
		return this.shipmentList;
	}
	public void setShipmentList(List<ShipmentVO> shipmentList) {
		this.shipmentList = shipmentList;
	}

}
