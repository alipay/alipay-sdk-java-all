package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家补充凭证
 *
 * @author auto create
 * @since 1.0, 2022-04-01 19:49:28
 */
public class AlipayMerchantTradecomplainSupplementSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1712149269447586756L;

	/**
	 * 支付宝侧投诉单号
	 */
	@ApiField("complain_event_id")
	private String complainEventId;

	/**
	 * 回复内容，最多不超过200个字
	 */
	@ApiField("supplement_content")
	private String supplementContent;

	/**
	 * 商家补充凭证时的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
	 */
	@ApiField("supplement_images")
	private String supplementImages;

	public String getComplainEventId() {
		return this.complainEventId;
	}
	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
	}

	public String getSupplementContent() {
		return this.supplementContent;
	}
	public void setSupplementContent(String supplementContent) {
		this.supplementContent = supplementContent;
	}

	public String getSupplementImages() {
		return this.supplementImages;
	}
	public void setSupplementImages(String supplementImages) {
		this.supplementImages = supplementImages;
	}

}
