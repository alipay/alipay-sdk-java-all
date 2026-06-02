package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于服务商查询碰链接内容
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:28:05
 */
public class TagSnInfoListRequest extends AlipayObject {

	private static final long serialVersionUID = 3268635164454934749L;

	/**
	 * 线圈生成的id
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 厂商线圈sn信息
	 */
	@ApiField("tag_sn")
	private String tagSn;

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagSn() {
		return this.tagSn;
	}
	public void setTagSn(String tagSn) {
		this.tagSn = tagSn;
	}

}
