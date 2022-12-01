package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料配送指令对象, 包括物料配送的相关信息: 订单明细ID, 申请单号, 模板ID, 物料名称, 数量, 收货人姓名,联系人电话,收货人地址等.
 *
 * @author auto create
 * @since 1.0, 2022-11-28 16:03:26
 */
public class AssetDeliveryItem extends AlipayObject {

	private static final long serialVersionUID = 8544742297895572527L;

	/**
	 * SEND - 发货指令(执行向目的地进行发货动作) , RECEIVE - 收货指令(执行从来源地进行收货动作)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 配送数量
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 订单申请日期, 格式:
yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("apply_order_date")
	private String applyOrderDate;

	/**
	 * 申请单id
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 配送订单唯一Id
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 支付宝内部的配送流水号, 可供物料商和物流商用于对账.
	 */
	@ApiField("assign_out_order_id")
	private String assignOutOrderId;

	/**
	 * 业务线
	 */
	@ApiField("biz_line")
	private String bizLine;

	/**
	 * 物料渠道标识
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 用于线下供应商区分业务流程，目前采用双方约定方
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 提供给物流商清关所用信息
	 */
	@ApiField("custom_clearance")
	private CCInfo customClearance;

	/**
	 * 配送指令单据明细ID
	 */
	@ApiField("delivery_assign_order_item_id")
	private String deliveryAssignOrderItemId;

	/**
	 * 送货单号
	 */
	@ApiField("delivery_process_no")
	private String deliveryProcessNo;

	/**
	 * 调拨指令承运方pid
	 */
	@ApiField("delivery_process_supplier_id")
	private String deliveryProcessSupplierId;

	/**
	 * 调拨承运方供应商名称
	 */
	@ApiField("delivery_process_supplier_name")
	private String deliveryProcessSupplierName;

	/**
	 * 物流商全称
	 */
	@ApiField("delivery_supplier_full_name")
	private String deliverySupplierFullName;

	/**
	 * 物流商ID
	 */
	@ApiField("delivery_supplier_id")
	private String deliverySupplierId;

	/**
	 * 物流商名称
	 */
	@ApiField("delivery_supplier_name")
	private String deliverySupplierName;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发送地址
	 */
	@ApiField("from_address")
	private AssetDeliveryAddress fromAddress;

	/**
	 * 配送指令生成日期, 格式:yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("gmt_assign")
	private String gmtAssign;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 物流单信息
	 */
	@ApiField("logistics_info")
	private LogisticsInfo logisticsInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否走产包一体, IS_PRODUCE_ASSEBLE, 如果是Y，则是
	 */
	@ApiField("operate_info")
	private String operateInfo;

	/**
	 * 公司主体代码
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 公司主体名
	 */
	@ApiField("ou_name")
	private String ouName;

	/**
	 * 外部业务单号，例如淘宝订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 1. 如果该物料是套组的子物料, 那么该值为套组物料id;
2, 其他情况和物料id(即, item_id)一致或者为空.
	 */
	@ApiField("parent_item_id")
	private String parentItemId;

	/**
	 * 面单信息
	 */
	@ApiField("print_data")
	private String printData;

	/**
	 * 生产调拨对应的生产指令.
	 */
	@ApiField("produce_order_item_id")
	private String produceOrderItemId;

	/**
	 * TO_CUSTOMER : 到客户的配送指令; INTERIM : 中转配送指令. 可选值详见openApi文档.
	 */
	@ApiField("record_type")
	private String recordType;

	/**
	 * 对应供应商pid
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 对应供应商名称
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 接收地址(目的地址)
	 */
	@ApiField("to_address")
	private AssetDeliveryAddress toAddress;

	/**
	 * 动作
	 */
	@ApiField("work_process")
	private String workProcess;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getApplyOrderDate() {
		return this.applyOrderDate;
	}
	public void setApplyOrderDate(String applyOrderDate) {
		this.applyOrderDate = applyOrderDate;
	}

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getAssignOutOrderId() {
		return this.assignOutOrderId;
	}
	public void setAssignOutOrderId(String assignOutOrderId) {
		this.assignOutOrderId = assignOutOrderId;
	}

	public String getBizLine() {
		return this.bizLine;
	}
	public void setBizLine(String bizLine) {
		this.bizLine = bizLine;
	}

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public CCInfo getCustomClearance() {
		return this.customClearance;
	}
	public void setCustomClearance(CCInfo customClearance) {
		this.customClearance = customClearance;
	}

	public String getDeliveryAssignOrderItemId() {
		return this.deliveryAssignOrderItemId;
	}
	public void setDeliveryAssignOrderItemId(String deliveryAssignOrderItemId) {
		this.deliveryAssignOrderItemId = deliveryAssignOrderItemId;
	}

	public String getDeliveryProcessNo() {
		return this.deliveryProcessNo;
	}
	public void setDeliveryProcessNo(String deliveryProcessNo) {
		this.deliveryProcessNo = deliveryProcessNo;
	}

	public String getDeliveryProcessSupplierId() {
		return this.deliveryProcessSupplierId;
	}
	public void setDeliveryProcessSupplierId(String deliveryProcessSupplierId) {
		this.deliveryProcessSupplierId = deliveryProcessSupplierId;
	}

	public String getDeliveryProcessSupplierName() {
		return this.deliveryProcessSupplierName;
	}
	public void setDeliveryProcessSupplierName(String deliveryProcessSupplierName) {
		this.deliveryProcessSupplierName = deliveryProcessSupplierName;
	}

	public String getDeliverySupplierFullName() {
		return this.deliverySupplierFullName;
	}
	public void setDeliverySupplierFullName(String deliverySupplierFullName) {
		this.deliverySupplierFullName = deliverySupplierFullName;
	}

	public String getDeliverySupplierId() {
		return this.deliverySupplierId;
	}
	public void setDeliverySupplierId(String deliverySupplierId) {
		this.deliverySupplierId = deliverySupplierId;
	}

	public String getDeliverySupplierName() {
		return this.deliverySupplierName;
	}
	public void setDeliverySupplierName(String deliverySupplierName) {
		this.deliverySupplierName = deliverySupplierName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public AssetDeliveryAddress getFromAddress() {
		return this.fromAddress;
	}
	public void setFromAddress(AssetDeliveryAddress fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getGmtAssign() {
		return this.gmtAssign;
	}
	public void setGmtAssign(String gmtAssign) {
		this.gmtAssign = gmtAssign;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public LogisticsInfo getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(LogisticsInfo logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperateInfo() {
		return this.operateInfo;
	}
	public void setOperateInfo(String operateInfo) {
		this.operateInfo = operateInfo;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getOuName() {
		return this.ouName;
	}
	public void setOuName(String ouName) {
		this.ouName = ouName;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParentItemId() {
		return this.parentItemId;
	}
	public void setParentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
	}

	public String getPrintData() {
		return this.printData;
	}
	public void setPrintData(String printData) {
		this.printData = printData;
	}

	public String getProduceOrderItemId() {
		return this.produceOrderItemId;
	}
	public void setProduceOrderItemId(String produceOrderItemId) {
		this.produceOrderItemId = produceOrderItemId;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public AssetDeliveryAddress getToAddress() {
		return this.toAddress;
	}
	public void setToAddress(AssetDeliveryAddress toAddress) {
		this.toAddress = toAddress;
	}

	public String getWorkProcess() {
		return this.workProcess;
	}
	public void setWorkProcess(String workProcess) {
		this.workProcess = workProcess;
	}

}
