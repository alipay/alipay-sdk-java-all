package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化家庭芝麻GO共享组件
 *
 * @author auto create
 * @since 1.0, 2021-01-20 11:00:51
 */
public class AlipayUserFamilyShareZmgoInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2583553934759472629L;

	/**
	 * 商户订单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
