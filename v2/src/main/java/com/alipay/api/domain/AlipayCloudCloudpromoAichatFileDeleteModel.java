package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答知识库删除
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:56:38
 */
public class AlipayCloudCloudpromoAichatFileDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6322588227154188484L;

	/**
	 * 客户唯一标识
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 文件唯一标识
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
