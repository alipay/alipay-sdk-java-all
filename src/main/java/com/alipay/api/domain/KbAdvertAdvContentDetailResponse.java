package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告内容信息
 *
 * @author auto create
 * @since 1.0, 2017-07-04 17:36:04
 */
public class KbAdvertAdvContentDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 3736257376948245657L;

	/**
	 * 二维码连接地址
当content_type为codec时，该值有效
	 */
	@ApiField("content_codec_link")
	private String contentCodecLink;

	/**
	 * 红包口令
content_type为passwordRed时，该值有效；
用户输入该口令，领取红包
	 */
	@ApiField("content_password")
	private String contentPassword;

	/**
	 * 口令红包分享地址
当content_type=passwordRed时，该值有效
	 */
	@ApiField("content_password_share_page_link")
	private String contentPasswordSharePageLink;

	/**
	 * 吱口令口令内容
当content_type=shareCode时，该值有效
用户在手机端，复制content_share_code，打开钱包，就会弹出吱口令的领券页面
	 */
	@ApiField("content_share_code")
	private String contentShareCode;

	/**
	 * 短链接地址
当content_type=shortLink时，该值有效
	 */
	@ApiField("content_short_link")
	private String contentShortLink;

	/**
	 * 广告内容类型；
shortLink：短链接；
codec：二维码；
passwordRed：口令红包；
shareCode：吱口令；
	 */
	@ApiListField("content_type")
	@ApiField("string")
	private List<String> contentType;

	public String getContentCodecLink() {
		return this.contentCodecLink;
	}
	public void setContentCodecLink(String contentCodecLink) {
		this.contentCodecLink = contentCodecLink;
	}

	public String getContentPassword() {
		return this.contentPassword;
	}
	public void setContentPassword(String contentPassword) {
		this.contentPassword = contentPassword;
	}

	public String getContentPasswordSharePageLink() {
		return this.contentPasswordSharePageLink;
	}
	public void setContentPasswordSharePageLink(String contentPasswordSharePageLink) {
		this.contentPasswordSharePageLink = contentPasswordSharePageLink;
	}

	public String getContentShareCode() {
		return this.contentShareCode;
	}
	public void setContentShareCode(String contentShareCode) {
		this.contentShareCode = contentShareCode;
	}

	public String getContentShortLink() {
		return this.contentShortLink;
	}
	public void setContentShortLink(String contentShortLink) {
		this.contentShortLink = contentShortLink;
	}

	public List<String> getContentType() {
		return this.contentType;
	}
	public void setContentType(List<String> contentType) {
		this.contentType = contentType;
	}

}
