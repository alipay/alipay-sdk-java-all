package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库_知识点_生效失效
 *
 * @author auto create
 * @since 1.0, 2024-08-13 19:57:46
 */
public class AlipayIserviceCcmSwArticlePublishModel extends AlipayObject {

	private static final long serialVersionUID = 6286971258815187921L;

	/**
	 * 知识点id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 生效 PUBLISHED，失效 EXPIRED
	 */
	@ApiField("status")
	private String status;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
