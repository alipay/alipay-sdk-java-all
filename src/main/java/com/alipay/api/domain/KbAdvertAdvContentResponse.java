package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统广告内容
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertAdvContentResponse extends AlipayObject {

	private static final long serialVersionUID = 1649587985358376671L;

	/**
	 * 二维码类型的内容模型（当content_type为codec时，返回该模型）
	 */
	@ApiField("content_codec")
	private KbAdvertContentCodec contentCodec;

	/**
	 * 口令红包类型的内容模型（当content_type为passwordRed时，返回该模型）
	 */
	@ApiField("content_password")
	private KbAdvertContentPassword contentPassword;

	/**
	 * 吱口令类型的内容模型（当content_type为shareCode时，返回该模型）
	 */
	@ApiListField("content_share_code")
	@ApiField("kb_advert_content_share_code")
	private List<KbAdvertContentShareCode> contentShareCode;

	/**
	 * 短链接类型的内容模型（当content_type为shortLink时，返回该模型）
	 */
	@ApiField("content_short_link")
	private KbAdvertContentShortLink contentShortLink;

	/**
	 * 广告内容类型；
shortLink：短链接；
codec：二维码；
passwordRed：口令红包；
shareCode：吱口令；
	 */
	@ApiField("content_type")
	private String contentType;

	public KbAdvertContentCodec getContentCodec() {
		return this.contentCodec;
	}
	public void setContentCodec(KbAdvertContentCodec contentCodec) {
		this.contentCodec = contentCodec;
	}

	public KbAdvertContentPassword getContentPassword() {
		return this.contentPassword;
	}
	public void setContentPassword(KbAdvertContentPassword contentPassword) {
		this.contentPassword = contentPassword;
	}

	public List<KbAdvertContentShareCode> getContentShareCode() {
		return this.contentShareCode;
	}
	public void setContentShareCode(List<KbAdvertContentShareCode> contentShareCode) {
		this.contentShareCode = contentShareCode;
	}

	public KbAdvertContentShortLink getContentShortLink() {
		return this.contentShortLink;
	}
	public void setContentShortLink(KbAdvertContentShortLink contentShortLink) {
		this.contentShortLink = contentShortLink;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
