package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人图片云渲染
 *
 * @author auto create
 * @since 1.0, 2023-06-02 19:37:54
 */
public class AlipayUserAccountAvatarPictureCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7273532433632632435L;

	/**
	 * 调用场景节点信息
	 */
	@ApiField("node_code")
	private String nodeCode;

	/**
	 * 调用场景信息
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 合照模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
