package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆仪表盘信息识别
 *
 * @author auto create
 * @since 1.0, 2019-04-23 16:29:35
 */
public class AlipayIserviceCognitiveOcrVehicledashboardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8571137594528335173L;

	/**
	 * 自定义场景字段，通过biz_name明确是那个场景，仪表板写死为 dashboard
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 仪表盘图片base64编码后内容，大小限制在1.5M
	 */
	@ApiField("image_content")
	private String imageContent;

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

}
