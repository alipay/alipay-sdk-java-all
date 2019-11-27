package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 思蓝测试灰度Zone接口two
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:41:29
 */
public class AlipayOpenAppSilanApigraytwoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6827556223577958424L;

	/**
	 * test
	 */
	@ApiField("img_id")
	private String imgId;

	public String getImgId() {
		return this.imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

}
