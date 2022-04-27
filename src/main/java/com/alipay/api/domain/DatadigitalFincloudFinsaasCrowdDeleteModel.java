package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除人群
 *
 * @author auto create
 * @since 1.0, 2022-04-27 16:50:11
 */
public class DatadigitalFincloudFinsaasCrowdDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8262192964882854826L;

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
