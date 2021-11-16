package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件图片数据模型
 *
 * @author auto create
 * @since 1.0, 2017-11-23 17:08:26
 */
public class OpenCertPic extends AlipayObject {

	private static final long serialVersionUID = 2578339413364778714L;

	/**
	 * 图片的base64字符串，不需要base64头(data:image/jpeg;base64,)
	 */
	@ApiField("data")
	private String data;

	/**
	 * DRIVING_LICENSE_HOME_PAGE:主页;
DRIVING_LICENSE_SUB_PAGE:副页;
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
