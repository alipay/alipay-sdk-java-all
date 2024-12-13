package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据交易流水号查询设备信息
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:19
 */
public class AlipayCommerceIotMdeviceprodTradeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6814322952382671471L;

	/**
	 * 真实设备sn
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	/**
	 * 交易流水号，优先级最高，如果传入则根据流水号查询
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSupplierSn() {
		return this.supplierSn;
	}
	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
