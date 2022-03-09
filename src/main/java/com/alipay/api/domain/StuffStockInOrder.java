package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑物料供应商仓库入库单
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:21
 */
public class StuffStockInOrder extends AlipayObject {

	private static final long serialVersionUID = 4821956465399558745L;

	/**
	 * 口碑物料平台商品入库ERP号
	 */
	@ApiField("erp_order")
	private String erpOrder;

	/**
	 * ERP订单类型
	 */
	@ApiField("erp_order_type")
	private String erpOrderType;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 入库单明细
	 */
	@ApiListField("order_items")
	@ApiField("stuff_stock_in_order_item")
	private List<StuffStockInOrderItem> orderItems;

	/**
	 * 预计收货时间(YYYY-MM-DD HH:mm:ss)
	 */
	@ApiField("scheduled_receipt_date")
	private String scheduledReceiptDate;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

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

	public List<StuffStockInOrderItem> getOrderItems() {
		return this.orderItems;
	}
	public void setOrderItems(List<StuffStockInOrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getScheduledReceiptDate() {
		return this.scheduledReceiptDate;
	}
	public void setScheduledReceiptDate(String scheduledReceiptDate) {
		this.scheduledReceiptDate = scheduledReceiptDate;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
