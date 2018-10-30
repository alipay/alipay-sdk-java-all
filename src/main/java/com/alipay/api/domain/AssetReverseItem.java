package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消订单或者退货所需复杂类型。
 *
 * @author auto create
 * @since 1.0, 2018-09-19 14:05:16
 */
public class AssetReverseItem extends AlipayObject {

	private static final long serialVersionUID = 1765655383491468316L;

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
	 * 逆向类型
	 */
	@ApiField("reverse_type")
	private String reverseType;

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

	public String getReverseType() {
		return this.reverseType;
	}
	public void setReverseType(String reverseType) {
		this.reverseType = reverseType;
	}

}
