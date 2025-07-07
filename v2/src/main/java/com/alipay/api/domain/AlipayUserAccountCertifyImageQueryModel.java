package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取用户证件图片数据接口
 *
 * @author auto create
 * @since 1.0, 2025-05-12 10:18:22
 */
public class AlipayUserAccountCertifyImageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1835255875315357443L;

	/**
	 * 图片链接
	 */
	@ApiListField("picture_url")
	@ApiField("string")
	private List<String> pictureUrl;

	public List<String> getPictureUrl() {
		return this.pictureUrl;
	}
	public void setPictureUrl(List<String> pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
