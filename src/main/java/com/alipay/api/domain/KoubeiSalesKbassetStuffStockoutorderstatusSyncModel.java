package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出库单同步状态信息
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:28
 */
public class KoubeiSalesKbassetStuffStockoutorderstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5383317694484129213L;

	/**
	 * erp订单号
	 */
	@ApiField("erp_order")
	private String erpOrder;

	/**
	 * ERP 订单类型
	 */
	@ApiField("erp_order_type")
	private String erpOrderType;

	/**
	 * 扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 订单状态
	 */
	@ApiListField("steps")
	@ApiField("stock_shipping_step_info")
	private List<StockShippingStepInfo> steps;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 运单号
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

	public String getErpOrder() {
		return this.erpOrder;
	}
	public void setErpOrder(String erpOrder) {
		this.erpOrder = erpOrder;
	}

	public String getErpOrderType() {
		return this.erpOrderType;
	}
	public void setErpOrderType(String erpOrderType) {
		this.erpOrderType = erpOrderType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<StockShippingStepInfo> getSteps() {
		return this.steps;
	}
	public void setSteps(List<StockShippingStepInfo> steps) {
		this.steps = steps;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWayBillNo() {
		return this.wayBillNo;
	}
	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}

}
