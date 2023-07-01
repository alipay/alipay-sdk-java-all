package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货计划详情
 *
 * @author auto create
 * @since 1.0, 2020-12-21 14:24:09
 */
public class AssetDeliveryProcessInfo extends AlipayObject {

	private static final long serialVersionUID = 8651697911817292194L;

	/**
	 * 调拨指令ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 对调拨指令的对应批次反馈
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 送货单编号
	 */
	@ApiField("delivery_process_no")
	private String deliveryProcessNo;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getDeliveryProcessNo() {
		return this.deliveryProcessNo;
	}
	public void setDeliveryProcessNo(String deliveryProcessNo) {
		this.deliveryProcessNo = deliveryProcessNo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
