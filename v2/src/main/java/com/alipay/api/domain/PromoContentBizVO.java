package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务场景素材内容
 *
 * @author auto create
 * @since 1.0, 2021-07-16 11:34:51
 */
public class PromoContentBizVO extends AlipayObject {

	private static final long serialVersionUID = 1526879533145915935L;

	/**
	 * 具体内容信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容元数据ID
	 */
	@ApiField("meta_id")
	private String metaId;

	/**
	 * 内容的具体类型
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getMetaId() {
		return this.metaId;
	}
	public void setMetaId(String metaId) {
		this.metaId = metaId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
