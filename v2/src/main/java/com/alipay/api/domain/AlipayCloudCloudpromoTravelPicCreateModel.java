package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 游历分享
 *
 * @author auto create
 * @since 1.0, 2025-06-27 10:32:28
 */
public class AlipayCloudCloudpromoTravelPicCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6455841564455368925L;

	/**
	 * 页脚标题
	 */
	@ApiField("footer_title")
	private String footerTitle;

	/**
	 * 头像链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * tab1图片
	 */
	@ApiField("pic_1")
	private String pic1;

	/**
	 * tab2图片
	 */
	@ApiField("pic_2")
	private String pic2;

	/**
	 * tab3图片
	 */
	@ApiField("pic_3")
	private String pic3;

	/**
	 * tab4图片
	 */
	@ApiField("pic_4")
	private String pic4;

	/**
	 * 页面标题
	 */
	@ApiField("share_desc")
	private String shareDesc;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 文案1
	 */
	@ApiField("text_1")
	private String text1;

	/**
	 * 文案2
	 */
	@ApiField("text_2")
	private String text2;

	/**
	 * 文案3
	 */
	@ApiField("text_3")
	private String text3;

	/**
	 * 文案4
	 */
	@ApiField("text_4")
	private String text4;

	public String getFooterTitle() {
		return this.footerTitle;
	}
	public void setFooterTitle(String footerTitle) {
		this.footerTitle = footerTitle;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getPic1() {
		return this.pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public String getPic2() {
		return this.pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getPic3() {
		return this.pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}

	public String getPic4() {
		return this.pic4;
	}
	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}

	public String getShareDesc() {
		return this.shareDesc;
	}
	public void setShareDesc(String shareDesc) {
		this.shareDesc = shareDesc;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getText1() {
		return this.text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return this.text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}

	public String getText3() {
		return this.text3;
	}
	public void setText3(String text3) {
		this.text3 = text3;
	}

	public String getText4() {
		return this.text4;
	}
	public void setText4(String text4) {
		this.text4 = text4;
	}

}
