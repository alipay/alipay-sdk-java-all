package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备子单model
 *
 * @author auto create
 * @since 1.0, 2019-06-14 20:51:26
 */
public class DeviceApplyOrderItemModel extends AlipayObject {

	private static final long serialVersionUID = 5315386796427549754L;

	/**
	 * 申请数量，和sn数量保持一致
	 */
	@ApiField("apply_amount")
	private Long applyAmount;

	/**
	 * 设备编号
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 设备型号
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 设备型号
	 */
	@ApiField("model_number")
	private String modelNumber;

	public Long getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(Long applyAmount) {
		this.applyAmount = applyAmount;
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

	public String getModelNumber() {
		return this.modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

}
