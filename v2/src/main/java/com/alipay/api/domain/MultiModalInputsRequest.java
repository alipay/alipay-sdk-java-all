package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝士饼对话多模态输入参数类
 *
 * @author auto create
 * @since 1.0, 2024-08-27 20:35:16
 */
public class MultiModalInputsRequest extends AlipayObject {

	private static final long serialVersionUID = 2836985316236338378L;

	/**
	 * 上传到atfs后的图片文件 ID 列表
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

}
