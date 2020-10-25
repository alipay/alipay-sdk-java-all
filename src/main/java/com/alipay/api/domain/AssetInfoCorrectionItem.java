package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料信息更正服务请求信息
 *
 * @author auto create
 * @since 1.0, 2020-06-11 20:04:19
 */
public class AssetInfoCorrectionItem extends AlipayObject {

	private static final long serialVersionUID = 5741761176336449812L;

	/**
	 * 配送, 生产指令id.
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 变更原因
	 */
	@ApiField("change_reason")
	private String changeReason;

	/**
	 * 变更类型
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 待更新物料信息
	 */
	@ApiField("new_asset_value")
	private String newAssetValue;

	/**
	 * 修改物料信息，新物料id
	 */
	@ApiField("new_item_id")
	private String newItemId;

	/**
	 * 原物料信息
	 */
	@ApiField("original_asset_value")
	private String originalAssetValue;

	/**
	 * 原物料生产或配送供应商 id
	 */
	@ApiField("original_supplier_id")
	private String originalSupplierId;

	/**
	 * 请求唯一id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getChangeReason() {
		return this.changeReason;
	}
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getNewAssetValue() {
		return this.newAssetValue;
	}
	public void setNewAssetValue(String newAssetValue) {
		this.newAssetValue = newAssetValue;
	}

	public String getNewItemId() {
		return this.newItemId;
	}
	public void setNewItemId(String newItemId) {
		this.newItemId = newItemId;
	}

	public String getOriginalAssetValue() {
		return this.originalAssetValue;
	}
	public void setOriginalAssetValue(String originalAssetValue) {
		this.originalAssetValue = originalAssetValue;
	}

	public String getOriginalSupplierId() {
		return this.originalSupplierId;
	}
	public void setOriginalSupplierId(String originalSupplierId) {
		this.originalSupplierId = originalSupplierId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
