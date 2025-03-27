package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N模块链路加签接口
 *
 * @author auto create
 * @since 1.0, 2025-03-06 20:16:40
 */
public class AlipayCommerceCityfacilitatorNlinkUrlsecuritySignModel extends AlipayObject {

	private static final long serialVersionUID = 8289731189177238728L;

	/**
	 * se设备uuid（16进制的字符串，没有0x前缀）
	 */
	@ApiField("se_uuid")
	private String seUuid;

	/**
	 * 设备的tagid
	 */
	@ApiField("tag_id")
	private String tagId;

	public String getSeUuid() {
		return this.seUuid;
	}
	public void setSeUuid(String seUuid) {
		this.seUuid = seUuid;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

}
