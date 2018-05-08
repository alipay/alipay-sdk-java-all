package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料配送指令对象, 包括物料配送的相关信息: 订单明细ID, 申请单号, 模板ID, 物料名称, 数量, 收货人姓名,联系人电话,收货人地址等.
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:12:22
 */
public class AssetDeliveryItem extends AlipayObject {

	private static final long serialVersionUID = 4788391179664693699L;

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
	 * 物料渠道标识
	 */
	@ApiField("biz_tag")
	private String bizTag;

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
	 * 面单信息
	 */
	@ApiField("print_data")
	private String printData;

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

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
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

	public String getPrintData() {
		return this.printData;
	}
	public void setPrintData(String printData) {
		this.printData = printData;
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

}
