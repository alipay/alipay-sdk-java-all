package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计数接口
 *
 * @author auto create
 * @since 1.0, 2019-03-15 10:29:27
 */
public class KoubeiContentContentcountSetModel extends AlipayObject {

	private static final long serialVersionUID = 4397884592148825166L;

	/**
	 * 口碑端内容唯一id，必填
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 数字
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
