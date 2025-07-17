package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户资产流水
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:13
 */
public class RecycleUserAssetRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 3751727192511979479L;

	/**
	 * 流水金额，单位：分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 用户资产类型，例如场景钱包
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 订单号，与交易相关
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 流水id，保证是唯一的
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 流水状态
	 */
	@ApiField("record_status")
	private String recordStatus;

	/**
	 * 流水类型
	 */
	@ApiField("record_type")
	private String recordType;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordStatus() {
		return this.recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

}
