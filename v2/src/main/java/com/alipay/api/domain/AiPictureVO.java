package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI年画图片VO 
 *
 * @author auto create
 * @since 1.0, 2022-12-02 16:25:15
 */
public class AiPictureVO extends AlipayObject {

	private static final long serialVersionUID = 1661944435484758545L;

	/**
	 * 图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 安全状态
	 */
	@ApiField("sec_status")
	private String secStatus;

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getSecStatus() {
		return this.secStatus;
	}
	public void setSecStatus(String secStatus) {
		this.secStatus = secStatus;
	}

}
