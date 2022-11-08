package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能简历头像信息
 *
 * @author auto create
 * @since 1.0, 2022-11-03 17:53:00
 */
public class CloudResumeHeadPic extends AlipayObject {

	private static final long serialVersionUID = 7763947832963134827L;

	/**
	 * 头像连接url
	 */
	@ApiField("pic_url")
	private String picUrl;

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

}
