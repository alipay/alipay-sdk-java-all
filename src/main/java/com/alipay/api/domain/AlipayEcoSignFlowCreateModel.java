package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建流程（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-08-26 10:59:27
 */
public class AlipayEcoSignFlowCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3631293281996882327L;

	/**
	 * 附件信息
	 */
	@ApiListField("attachments")
	@ApiField("attachment")
	private List<Attachment> attachments;

	/**
	 * 流程主题
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 流程配置信息
	 */
	@ApiField("config_info")
	private ConfigInfo configInfo;

	/**
	 * 模板信息
	 */
	@ApiListField("template_infos")
	@ApiField("template_info")
	private List<TemplateInfo> templateInfos;

	public List<Attachment> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public ConfigInfo getConfigInfo() {
		return this.configInfo;
	}
	public void setConfigInfo(ConfigInfo configInfo) {
		this.configInfo = configInfo;
	}

	public List<TemplateInfo> getTemplateInfos() {
		return this.templateInfos;
	}
	public void setTemplateInfos(List<TemplateInfo> templateInfos) {
		this.templateInfos = templateInfos;
	}

}
