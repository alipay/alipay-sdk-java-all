package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链调出指令反馈
 *
 * @author auto create
 * @since 1.0, 2024-03-12 09:32:31
 */
public class AntProdpaasProductExitCompleteCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 8546571431579326525L;

	/**
	 * 实发商品数量
	 */
	@ApiField("actual_qty")
	private Long actualQty;

	/**
	 * 批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 支持出库单多次发货 0 表示入库单最终状态确认; 1 表示入库单中间状态确认；
	 */
	@ApiField("confirm_type")
	private Long confirmType;

	/**
	 * 出库单信息
	 */
	@ApiField("delivery_order_code")
	private String deliveryOrderCode;

	/**
	 * 过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 供应链商品属性集合
	 */
	@ApiListField("extend_pros")
	@ApiField("supplier_item_attr_field")
	private List<SupplierItemAttrField> extendPros;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_info")
	private SupplierLogisticsInfo logisticsInfo;

	/**
	 * 出库单类型,生产直发-DIRECT_PRODUCE,生产备货-PRODUCE_STOCK, 仓库发货- STOCK_DELIVERY, 仓仓调拨 - STOCK_TRANSFER
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 计划发货数量
	 */
	@ApiField("plan_qty")
	private Long planQty;

	/**
	 * 生产批号
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 出库单状态,(NEW-未开始处理, ACCEPT-仓库接单 , PARTDELIVERED-部分发货完成, DELIVERED-发货完成, EXCEPTION-异常, CANCELED-取消, CLOSED-关闭, REJECT-拒单, CANCELEDFAIL-取消失败) , (只传英文编码)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public Long getActualQty() {
		return this.actualQty;
	}
	public void setActualQty(Long actualQty) {
		this.actualQty = actualQty;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public Long getConfirmType() {
		return this.confirmType;
	}
	public void setConfirmType(Long confirmType) {
		this.confirmType = confirmType;
	}

	public String getDeliveryOrderCode() {
		return this.deliveryOrderCode;
	}
	public void setDeliveryOrderCode(String deliveryOrderCode) {
		this.deliveryOrderCode = deliveryOrderCode;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public List<SupplierItemAttrField> getExtendPros() {
		return this.extendPros;
	}
	public void setExtendPros(List<SupplierItemAttrField> extendPros) {
		this.extendPros = extendPros;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public SupplierLogisticsInfo getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(SupplierLogisticsInfo logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Long getPlanQty() {
		return this.planQty;
	}
	public void setPlanQty(Long planQty) {
		this.planQty = planQty;
	}

	public String getProduceCode() {
		return this.produceCode;
	}
	public void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

	public Date getProductDate() {
		return this.productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
