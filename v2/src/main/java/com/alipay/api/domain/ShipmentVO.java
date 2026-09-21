package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * B2C订单快递运单配送同步接口支持拆分订单，新增多物流信息
 *
 * @author auto create
 * @since 1.0, 2026-09-04 11:49:44
 */
public class ShipmentVO extends AlipayObject {

	private static final long serialVersionUID = 2293295527467545119L;

	/**
	 * 第三方配送商物流单号
	 */
	@ApiField("carrier_order_no")
	private String carrierOrderNo;

	/**
	 * 包裹关联全部的商品信息
	 */
	@ApiListField("items")
	@ApiField("waybill_item_v_o")
	private List<WaybillItemVO> items;

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

}
