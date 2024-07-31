package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传物料元素
 *
 * @author auto create
 * @since 1.0, 2024-05-23 19:23:40
 */
public class UploadMaterial extends AlipayObject {

	private static final long serialVersionUID = 5617989896594638342L;

	/**
	 * 元素C端渲染关联位置key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 创意或交互动作图片/视频物料URL
	 */
	@ApiField("material")
	private String material;

	/**
	 * IMG-图片
VIDEO-视频
	 */
	@ApiField("type")
	private String type;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getMaterial() {
		return this.material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
