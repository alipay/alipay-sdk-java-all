package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单创建子单对象
 *
 * @author auto create
 * @since 1.0, 2019-06-14 20:50:40
 */
public class DeviceApplyOrderItemDto extends AlipayObject {

	private static final long serialVersionUID = 7663117348599325944L;

	/**
	 * 申请数量，和sn数量保持一致
	 */
	@ApiField("apply_amount")
	private Long applyAmount;

	/**
	 * itemId
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

	/**
	 * sn列表
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public List<String> getSnList() {
		return this.snList;
	}
	public void setSnList(List<String> snList) {
		this.snList = snList;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
