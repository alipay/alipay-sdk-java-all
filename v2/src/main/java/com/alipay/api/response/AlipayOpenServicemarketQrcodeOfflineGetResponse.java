package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.qrcode.offline.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:23
 */
public class AlipayOpenServicemarketQrcodeOfflineGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7278813251184832784L;

	/** 
	 * 服务logo，该字段是服务的logo，用于前端展示
	 */
	@ApiField("logo")
	private String logo;

	/** 
	 * 生成二维码后的url，该字段是调用当前api生成返回的二维码的url，用于服务商线下推广使用
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/** 
	 * 副标题，该字段是当前服务的副标题，不一定有，用于前端展示
	 */
	@ApiField("sub_title")
	private String subTitle;

	/** 
	 * 服务标题，该字段是当前服务的标题，用于前端展示
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 生成二维码前的url，该字段是将merchandise_id、ticket、callback、app_name这几个字段简单拼接后的url，用于服务商校验参数使用
	 */
	@ApiField("url")
	private String url;

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLogo( ) {
		return this.logo;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getSubTitle( ) {
		return this.subTitle;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
