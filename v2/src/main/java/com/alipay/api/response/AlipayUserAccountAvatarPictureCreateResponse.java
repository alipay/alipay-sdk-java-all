package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.avatar.picture.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:21:41
 */
public class AlipayUserAccountAvatarPictureCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6352687643586899685L;

	/** 
	 * 云渲染生成图片url
	 */
	@ApiField("pic_url")
	private String picUrl;

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getPicUrl( ) {
		return this.picUrl;
	}

}
