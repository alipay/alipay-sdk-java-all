package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除人群
 *
 * @author auto create
 * @since 1.0, 2022-05-26 13:36:21
 */
public class DatadigitalFincloudFinsaasCrowdDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3533569794112328285L;

	/**
	 * 人群ID+唯一+删除人群
	 */
	@ApiField("id")
	private Long id;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
