package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁采购单修改
 *
 * @author auto create
 * @since 1.0, 2026-08-05 14:07:52
 */
public class AlipayCommerceRentProcurementOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4839486328898846854L;

	/**
	 * 收货地址
	 */
	@ApiField("address_info")
	private RentProcurementAddressInfoVO addressInfo;

	/**
	 * 商家采购订单ID
	 */
	@ApiField("out_procurement_order_id")
	private String outProcurementOrderId;

	/**
	 * 平台采购订单ID
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	/**
	 * 修改类型
	 */
	@ApiField("type")
	private String type;

	public RentProcurementAddressInfoVO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RentProcurementAddressInfoVO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getOutProcurementOrderId() {
		return this.outProcurementOrderId;
	}
	public void setOutProcurementOrderId(String outProcurementOrderId) {
		this.outProcurementOrderId = outProcurementOrderId;
	}

	public String getProcurementOrderId() {
		return this.procurementOrderId;
	}
	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
