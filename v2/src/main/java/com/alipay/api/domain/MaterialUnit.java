package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意关联物料元素
 *
 * @author auto create
 * @since 1.0, 2024-05-23 20:37:50
 */
public class MaterialUnit extends AlipayObject {

	private static final long serialVersionUID = 5122555886521817547L;

	/**
	 * 创意元素C端渲染关联位置key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 创意图片/视频物料URL；标题/描述文本值
	 */
	@ApiField("material")
	private String material;

	/**
	 * 广告投放平台生成的物料实例ID
	 */
	@ApiField("material_instance_id")
	private Long materialInstanceId;

	/**
	 * 播放次数
	 */
	@ApiField("play_frequency")
	private Long playFrequency;

	/**
	 * 播放时长，单位/s
	 */
	@ApiField("play_time")
	private Long playTime;

	/**
	 * 创意元素类型，IMG-图片；VIDEO-视频；TITLE-标题；DESC-描述
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

	public Long getMaterialInstanceId() {
		return this.materialInstanceId;
	}
	public void setMaterialInstanceId(Long materialInstanceId) {
		this.materialInstanceId = materialInstanceId;
	}

	public Long getPlayFrequency() {
		return this.playFrequency;
	}
	public void setPlayFrequency(Long playFrequency) {
		this.playFrequency = playFrequency;
	}

	public Long getPlayTime() {
		return this.playTime;
	}
	public void setPlayTime(Long playTime) {
		this.playTime = playTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
