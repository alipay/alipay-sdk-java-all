package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人传人短信模版类型和子类型定义
 *
 * @author auto create
 * @since 1.0, 2024-10-31 20:52:11
 */
public class UserSegmentationInfo extends AlipayObject {

	private static final long serialVersionUID = 3746181724576768111L;

	/**
	 * 商户圈选类型
	 */
	@ApiField("segmentation_code")
	private String segmentationCode;

	/**
	 * 商户圈选分类类型下的具体子类型，由服务商定义。
	 */
	@ApiField("sub_segmentation_code")
	private String subSegmentationCode;

	public String getSegmentationCode() {
		return this.segmentationCode;
	}
	public void setSegmentationCode(String segmentationCode) {
		this.segmentationCode = segmentationCode;
	}

	public String getSubSegmentationCode() {
		return this.subSegmentationCode;
	}
	public void setSubSegmentationCode(String subSegmentationCode) {
		this.subSegmentationCode = subSegmentationCode;
	}

}
