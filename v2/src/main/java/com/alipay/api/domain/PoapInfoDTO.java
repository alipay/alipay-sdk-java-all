package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 勋章信息类型
 *
 * @author auto create
 * @since 1.0, 2025-04-08 11:41:49
 */
public class PoapInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8664316829549872311L;

	/**
	 * 勋章id
	 */
	@ApiField("medal_id")
	private String medalId;

	/**
	 * 勋章meta信息编码
	 */
	@ApiField("medal_meta_id")
	private Long medalMetaId;

	/**
	 * 勋章名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 缩略图
	 */
	@ApiField("thumbnail_url")
	private String thumbnailUrl;

	public String getMedalId() {
		return this.medalId;
	}
	public void setMedalId(String medalId) {
		this.medalId = medalId;
	}

	public Long getMedalMetaId() {
		return this.medalMetaId;
	}
	public void setMedalMetaId(Long medalMetaId) {
		this.medalMetaId = medalMetaId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
