package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链发货指令反馈
 *
 * @author auto create
 * @since 1.0, 2024-10-11 13:48:51
 */
public class AntProdpaasProductDeliveryCompleteCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 5761769693463332919L;

	/**
	 * 是否异常反馈，如果该字段为 Y , 则其余必填字段可不填.如果供应商由于客关原因，认为该任务无法正常完成, 则可以通过完成反馈接口异常完结。
	 */
	@ApiField("abnormal_feedback")
	private String abnormalFeedback;

	/**
	 * 异常完结反馈原因
	 */
	@ApiField("abnormal_reason")
	private String abnormalReason;

	/**
	 * 实发商品数量
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * 批次编号，批次号和批次列表不可同时为空。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 批次列表信息，批次号和批次列表不可同时为空。
	 */
	@ApiListField("batchs")
	@ApiField("supplier_delivery_batch")
	private List<SupplierDeliveryBatch> batchs;

	/**
	 * 发货单号
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
	@ApiField("extend_pros")
	private SupplierItemAttrField extendPros;

	/**
	 * 物流信息
	 */
	@ApiListField("logistics_info")
	@ApiField("supplier_logistics_info")
	private List<SupplierLogisticsInfo> logisticsInfo;

	/**
	 * 计划发货数量
	 */
	@ApiField("plan_amount")
	private Long planAmount;

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
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getAbnormalFeedback() {
		return this.abnormalFeedback;
	}
	public void setAbnormalFeedback(String abnormalFeedback) {
		this.abnormalFeedback = abnormalFeedback;
	}

	public String getAbnormalReason() {
		return this.abnormalReason;
	}
	public void setAbnormalReason(String abnormalReason) {
		this.abnormalReason = abnormalReason;
	}

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<SupplierDeliveryBatch> getBatchs() {
		return this.batchs;
	}
	public void setBatchs(List<SupplierDeliveryBatch> batchs) {
		this.batchs = batchs;
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

	public SupplierItemAttrField getExtendPros() {
		return this.extendPros;
	}
	public void setExtendPros(SupplierItemAttrField extendPros) {
		this.extendPros = extendPros;
	}

	public List<SupplierLogisticsInfo> getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(List<SupplierLogisticsInfo> logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

	public Long getPlanAmount() {
		return this.planAmount;
	}
	public void setPlanAmount(Long planAmount) {
		this.planAmount = planAmount;
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

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
