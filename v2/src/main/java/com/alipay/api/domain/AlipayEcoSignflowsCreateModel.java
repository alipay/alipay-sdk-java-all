package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建电子合同签署流程（E签宝）
 *
 * @author auto create
 * @since 1.0, 2022-09-21 16:31:27
 */
public class AlipayEcoSignflowsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7823155997651876539L;

	/**
	 * 附件信息（附件可作为合同的辅助证明材料，无需签署。需通过文件直传接口上传附件，获取文件id后添加）
	 */
	@ApiField("attachments")
	private Attachment attachments;

	/**
	 * 流程主题（简要概括合同的签署内容）
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 流程配置信息（可配置回调地址、物流单号等信息）
	 */
	@ApiField("config_info")
	private ConfigInfoBean configInfo;

	/**
	 * 模板信息（基于合同模板填充内容生成待签文件，并指定签署人）
	 */
	@ApiField("template_infos")
	private TemplateInfoBean templateInfos;

	public Attachment getAttachments() {
		return this.attachments;
	}
	public void setAttachments(Attachment attachments) {
		this.attachments = attachments;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public ConfigInfoBean getConfigInfo() {
		return this.configInfo;
	}
	public void setConfigInfo(ConfigInfoBean configInfo) {
		this.configInfo = configInfo;
	}

	public TemplateInfoBean getTemplateInfos() {
		return this.templateInfos;
	}
	public void setTemplateInfos(TemplateInfoBean templateInfos) {
		this.templateInfos = templateInfos;
	}

}
