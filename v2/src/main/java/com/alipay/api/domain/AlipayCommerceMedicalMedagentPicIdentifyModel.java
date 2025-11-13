package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 图片脱敏坐标识别接口
 *
 * @author auto create
 * @since 1.0, 2025-04-15 19:37:27
 */
public class AlipayCommerceMedicalMedagentPicIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 3173396317363769583L;

	/**
	 * 图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 敏感信息目标列表
	 */
	@ApiListField("target_list")
	@ApiField("string")
	private List<String> targetList;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<String> getTargetList() {
		return this.targetList;
	}
	public void setTargetList(List<String> targetList) {
		this.targetList = targetList;
	}

}
