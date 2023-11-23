package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签取值查询
 *
 * @author auto create
 * @since 1.0, 2023-07-18 21:46:19
 */
public class DatadigitalFincloudFinsaasTagDistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6739139293233371754L;

	/**
	 * 标签展示类型
	 */
	@ApiField("show_type")
	private String showType;

	/**
	 * 标签编码+唯一
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签版本
	 */
	@ApiField("tag_version")
	private Long tagVersion;

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public Long getTagVersion() {
		return this.tagVersion;
	}
	public void setTagVersion(Long tagVersion) {
		this.tagVersion = tagVersion;
	}

}
