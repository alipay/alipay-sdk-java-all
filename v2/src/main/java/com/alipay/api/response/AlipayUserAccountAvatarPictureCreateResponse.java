package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.avatar.picture.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-02 19:41:49
 */
public class AlipayUserAccountAvatarPictureCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2467126115511524278L;

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
