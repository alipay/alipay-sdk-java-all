package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环保回收营销活动权益信息同步
 *
 * @author auto create
 * @since 1.0, 2021-11-09 17:51:43
 */
public class AlipayCommerceOperationRecyclecampBenefitSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8493412539195868312L;

	/**
	 * 商户侧权益id，同一商户下不可重复
	 */
	@ApiField("outer_benefit_id")
	private String outerBenefitId;

	/**
	 * 权益剩余库存，不允许为负数，sync_type为inventory时必传
	 */
	@ApiField("remain_inventory")
	private String remainInventory;

	/**
	 * 毫秒级时间戳，用于避免同步到旧数据，服务端会记录最后一次请求的时间戳，若后续请求小于记录值，则静默丢弃。建议调用方传业务发生时间，如库存值的更新时间。
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	/**
	 * 同步类型，inventory：同步库存，offline：权益下架
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getOuterBenefitId() {
		return this.outerBenefitId;
	}
	public void setOuterBenefitId(String outerBenefitId) {
		this.outerBenefitId = outerBenefitId;
	}

	public String getRemainInventory() {
		return this.remainInventory;
	}
	public void setRemainInventory(String remainInventory) {
		this.remainInventory = remainInventory;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
