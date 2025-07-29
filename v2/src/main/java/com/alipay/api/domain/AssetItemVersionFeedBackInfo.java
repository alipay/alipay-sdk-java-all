package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料版本反馈信息
 *
 * @author auto create
 * @since 1.0, 2025-07-15 17:28:02
 */
public class AssetItemVersionFeedBackInfo extends AlipayObject {

	private static final long serialVersionUID = 7162583845387364833L;

	/**
	 * 物料ID信息
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料版本号
	 */
	@ApiField("item_version")
	private Long itemVersion;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否可供应
	 */
	@ApiField("suppliable")
	private String suppliable;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getItemVersion() {
		return this.itemVersion;
	}
	public void setItemVersion(Long itemVersion) {
		this.itemVersion = itemVersion;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getSuppliable() {
		return this.suppliable;
	}
	public void setSuppliable(String suppliable) {
		this.suppliable = suppliable;
	}

}
