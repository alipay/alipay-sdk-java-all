package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料bom明细
 *
 * @author auto create
 * @since 1.0, 2025-07-02 11:35:04
 */
public class AssetBomItem extends AlipayObject {

	private static final long serialVersionUID = 4365319564244768435L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 子物料数量
	 */
	@ApiField("count")
	private Long count;

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
	 * 物料版本号
	 */
	@ApiField("item_version")
	private Long itemVersion;

	/**
	 * 物料发布状态
	 */
	@ApiField("release_status")
	private String releaseStatus;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
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

	public Long getItemVersion() {
		return this.itemVersion;
	}
	public void setItemVersion(Long itemVersion) {
		this.itemVersion = itemVersion;
	}

	public String getReleaseStatus() {
		return this.releaseStatus;
	}
	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
