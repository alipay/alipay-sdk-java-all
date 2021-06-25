package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板权益内容
 *
 * @author auto create
 * @since 1.0, 2020-04-10 12:11:47
 */
public class TemplateRightsContentDTO extends AlipayObject {

	private static final long serialVersionUID = 8636467598999454358L;

	/**
	 * 权益内容详情
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 权益icon图片Id（目前用于开卡授权页使用），通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("logo_id")
	private String logoId;

	/**
	 * 权益内容标题
	 */
	@ApiField("title")
	private String title;

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getLogoId() {
		return this.logoId;
	}
	public void setLogoId(String logoId) {
		this.logoId = logoId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
