package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 布局id关联的风格信息
 *
 * @author auto create
 * @since 1.0, 2023-10-12 15:21:13
 */
public class CreativeDesignRelationStyle extends AlipayObject {

	private static final long serialVersionUID = 1871412295554611484L;

	/**
	 * 合成图片所需要的模版id
	 */
	@ApiField("pic_template_id")
	private String picTemplateId;

	/**
	 * style_design_content_url风格和布局唯一确定的背景图，返回的两者结合的图片地址。
	 */
	@ApiField("style_design_relation_mock_img")
	private String styleDesignRelationMockImg;

	/**
	 * style_id风格id，唯一
	 */
	@ApiField("style_id")
	private String styleId;

	/**
	 * style_content_url风格的背景图，唯一，返回的风格地址
	 */
	@ApiField("style_mock_img")
	private String styleMockImg;

	public String getPicTemplateId() {
		return this.picTemplateId;
	}
	public void setPicTemplateId(String picTemplateId) {
		this.picTemplateId = picTemplateId;
	}

	public String getStyleDesignRelationMockImg() {
		return this.styleDesignRelationMockImg;
	}
	public void setStyleDesignRelationMockImg(String styleDesignRelationMockImg) {
		this.styleDesignRelationMockImg = styleDesignRelationMockImg;
	}

	public String getStyleId() {
		return this.styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getStyleMockImg() {
		return this.styleMockImg;
	}
	public void setStyleMockImg(String styleMockImg) {
		this.styleMockImg = styleMockImg;
	}

}
