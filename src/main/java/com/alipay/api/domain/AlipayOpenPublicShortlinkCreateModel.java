package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务窗短链自主生成接口
 *
 * @author auto create
 * @since 1.0, 2020-07-15 17:50:25
 */
public class AlipayOpenPublicShortlinkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4368867154121483247L;

	/**
	 * 对于场景 ID 的描述，由商户自定义。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 短链接对应的场景 ID。由商户自定义，仅支持数字、字母及下划线。
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
