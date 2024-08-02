package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询出的风格数据列表
 *
 * @author auto create
 * @since 1.0, 2023-10-16 18:01:56
 */
public class CreativeStyle extends AlipayObject {

	private static final long serialVersionUID = 6843388832554147614L;

	/**
	 * 查询出的风格id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 查询出对应图片id的路径
	 */
	@ApiField("mock_img")
	private String mockImg;

	/**
	 * 合成图片所需要的模版id
	 */
	@ApiField("pic_template_id")
	private String picTemplateId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMockImg() {
		return this.mockImg;
	}
	public void setMockImg(String mockImg) {
		this.mockImg = mockImg;
	}

	public String getPicTemplateId() {
		return this.picTemplateId;
	}
	public void setPicTemplateId(String picTemplateId) {
		this.picTemplateId = picTemplateId;
	}

}
