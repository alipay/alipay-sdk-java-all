package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消订单或者退货所需复杂类型。
 *
 * @author auto create
 * @since 1.0, 2020-12-21 14:25:16
 */
public class AssetReverseItem extends AlipayObject {

	private static final long serialVersionUID = 7821597392551377737L;

	/**
	 * 行为类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 逆向申请单ID
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 逆向申请单明细ID
	 */
	@ApiField("apply_order_item_id")
	private String applyOrderItemId;

	/**
	 * returning goods info
	 */
	@ApiField("asset_reverse_goods_items")
	private AssetReverseGoodsItem assetReverseGoodsItems;

	/**
	 * 取消订单或退货唯一Id
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 退货数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 出货地址
	 */
	@ApiField("from_address")
	private AssetDeliveryAddress fromAddress;

	/**
	 * 物料ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料名
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 原申请单ID
	 */
	@ApiField("original_apply_order_id")
	private String originalApplyOrderId;

	/**
	 * 原配送单明细ID
	 */
	@ApiField("original_apply_order_item_id")
	private String originalApplyOrderItemId;

	/**
	 * 原配送单id
	 */
	@ApiField("original_deliver_order_id")
	private String originalDeliverOrderId;

	/**
	 * 原配送明细id
	 */
	@ApiField("original_deliver_order_item_id")
	private String originalDeliverOrderItemId;

	/**
	 * 原配送单物料号
	 */
	@ApiField("original_delivery_assign_item_id")
	private String originalDeliveryAssignItemId;

	/**
	 * 用于标识该指令为中转或者配送至客户. 其他类型的配送指令为空值
	 */
	@ApiField("original_record_type")
	private String originalRecordType;

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
	 * 逆向申请单ID
	 */
	@ApiField("reverse_apply_order_id")
	private String reverseApplyOrderId;

	/**
	 * 逆向申请单明细ID
	 */
	@ApiField("reverse_apply_order_item_id")
	private String reverseApplyOrderItemId;

	/**
	 * 逆向类型
	 */
	@ApiField("reverse_type")
	private String reverseType;

	/**
	 * 目标地址
	 */
	@ApiField("to_address")
	private AssetDeliveryAddress toAddress;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

	public String getApplyOrderItemId() {
		return this.applyOrderItemId;
	}
	public void setApplyOrderItemId(String applyOrderItemId) {
		this.applyOrderItemId = applyOrderItemId;
	}

	public AssetReverseGoodsItem getAssetReverseGoodsItems() {
		return this.assetReverseGoodsItems;
	}
	public void setAssetReverseGoodsItems(AssetReverseGoodsItem assetReverseGoodsItems) {
		this.assetReverseGoodsItems = assetReverseGoodsItems;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public AssetDeliveryAddress getFromAddress() {
		return this.fromAddress;
	}
	public void setFromAddress(AssetDeliveryAddress fromAddress) {
		this.fromAddress = fromAddress;
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

	public String getOriginalApplyOrderId() {
		return this.originalApplyOrderId;
	}
	public void setOriginalApplyOrderId(String originalApplyOrderId) {
		this.originalApplyOrderId = originalApplyOrderId;
	}

	public String getOriginalApplyOrderItemId() {
		return this.originalApplyOrderItemId;
	}
	public void setOriginalApplyOrderItemId(String originalApplyOrderItemId) {
		this.originalApplyOrderItemId = originalApplyOrderItemId;
	}

	public String getOriginalDeliverOrderId() {
		return this.originalDeliverOrderId;
	}
	public void setOriginalDeliverOrderId(String originalDeliverOrderId) {
		this.originalDeliverOrderId = originalDeliverOrderId;
	}

	public String getOriginalDeliverOrderItemId() {
		return this.originalDeliverOrderItemId;
	}
	public void setOriginalDeliverOrderItemId(String originalDeliverOrderItemId) {
		this.originalDeliverOrderItemId = originalDeliverOrderItemId;
	}

	public String getOriginalDeliveryAssignItemId() {
		return this.originalDeliveryAssignItemId;
	}
	public void setOriginalDeliveryAssignItemId(String originalDeliveryAssignItemId) {
		this.originalDeliveryAssignItemId = originalDeliveryAssignItemId;
	}

	public String getOriginalRecordType() {
		return this.originalRecordType;
	}
	public void setOriginalRecordType(String originalRecordType) {
		this.originalRecordType = originalRecordType;
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

	public String getReverseApplyOrderId() {
		return this.reverseApplyOrderId;
	}
	public void setReverseApplyOrderId(String reverseApplyOrderId) {
		this.reverseApplyOrderId = reverseApplyOrderId;
	}

	public String getReverseApplyOrderItemId() {
		return this.reverseApplyOrderItemId;
	}
	public void setReverseApplyOrderItemId(String reverseApplyOrderItemId) {
		this.reverseApplyOrderItemId = reverseApplyOrderItemId;
	}

	public String getReverseType() {
		return this.reverseType;
	}
	public void setReverseType(String reverseType) {
		this.reverseType = reverseType;
	}

	public AssetDeliveryAddress getToAddress() {
		return this.toAddress;
	}
	public void setToAddress(AssetDeliveryAddress toAddress) {
		this.toAddress = toAddress;
	}

}
