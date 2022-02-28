package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建电子合同签署流程(E签宝)
 *
 * @author auto create
 * @since 1.0, 2020-08-21 15:25:42
 */
public class AlipayEcoContractSignflowsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7529987975776668751L;

	/**
	 * 附件信息（附件可作为合同的辅助证明材料，无需签署。需通过文件直传接口上传附件，获取文件id后添加）。注意事项参见 <a href="https://opendocs.alipay.com/mini/00kr2w">文件流上传方法</a>。
	 */
	@ApiListField("attachments")
	@ApiField("attachment")
	private List<Attachment> attachments;

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
	@ApiListField("template_infos")
	@ApiField("template_info_bean")
	private List<TemplateInfoBean> templateInfos;

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

	public ConfigInfoBean getConfigInfo() {
		return this.configInfo;
	}
	public void setConfigInfo(ConfigInfoBean configInfo) {
		this.configInfo = configInfo;
	}

	public List<TemplateInfoBean> getTemplateInfos() {
		return this.templateInfos;
	}
	public void setTemplateInfos(List<TemplateInfoBean> templateInfos) {
		this.templateInfos = templateInfos;
	}

}
