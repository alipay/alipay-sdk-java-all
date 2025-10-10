package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N模块链路加签接口
 *
 * @author auto create
 * @since 1.0, 2025-04-29 10:34:19
 */
public class AlipayCommerceCityfacilitatorNlinkUrlsecuritySignModel extends AlipayObject {

	private static final long serialVersionUID = 6681681299684916381L;

	/**
	 * 模块item_id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * se设备uuid（16进制的字符串，没有0x前缀）
	 */
	@ApiField("se_uuid")
	private String seUuid;

	/**
	 * 模块sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 设备的tagid
	 */
	@ApiField("tag_id")
	private String tagId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSeUuid() {
		return this.seUuid;
	}
	public void setSeUuid(String seUuid) {
		this.seUuid = seUuid;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

}
