package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组消息群发
 *
 * @author auto create
 * @since 1.0, 2022-09-20 19:27:44
 */
public class AlipaySocialBaseBcClustermsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 6896359896534674643L;

	/**
	 * 是否at所有人
	 */
	@ApiField("at_all")
	private Boolean atAll;

	/**
	 * 业务方id，消息发送时可传入，消息列表返回
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 客户群分组id，此id唯一，分组下会管理一系列的客户群
	 */
	@ApiListField("cluster_ids")
	@ApiField("string")
	private List<String> clusterIds;

	/**
	 * template_code= IMAGE是的消息数据结构体
	 */
	@ApiField("image_template_data")
	private ImageTemplateData imageTemplateData;

	/**
	 * template_code= LINKS时的消息数据结构体
	 */
	@ApiField("links_template_data")
	private LinksTemplateData linksTemplateData;

	/**
	 * template_code= MINIAPP时的消息结构体
	 */
	@ApiField("miniapp_template_data")
	private MiniAppTemplateData miniappTemplateData;

	/**
	 * 分组发消息名称
	 */
	@ApiField("msg_name")
	private String msgName;

	/**
	 * 操作的商家标识id，可选，默认是应用app下的pid；如果填写第三方商家标识id，需要保证app下的pid是该商家的管理员
	 */
	@ApiField("operate_business_id")
	private String operateBusinessId;

	/**
	 * 发送模板code，可选以下值 TEXT,IMAGE,LINKS,MINIAPP
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 客户群业务租户id，比如生态商家此id为7，b站开通商户为18
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 模板code=TEXT的消息结构体
	 */
	@ApiField("text_template_data")
	private TextTemplateData textTemplateData;

	public Boolean getAtAll() {
		return this.atAll;
	}
	public void setAtAll(Boolean atAll) {
		this.atAll = atAll;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<String> getClusterIds() {
		return this.clusterIds;
	}
	public void setClusterIds(List<String> clusterIds) {
		this.clusterIds = clusterIds;
	}

	public ImageTemplateData getImageTemplateData() {
		return this.imageTemplateData;
	}
	public void setImageTemplateData(ImageTemplateData imageTemplateData) {
		this.imageTemplateData = imageTemplateData;
	}

	public LinksTemplateData getLinksTemplateData() {
		return this.linksTemplateData;
	}
	public void setLinksTemplateData(LinksTemplateData linksTemplateData) {
		this.linksTemplateData = linksTemplateData;
	}

	public MiniAppTemplateData getMiniappTemplateData() {
		return this.miniappTemplateData;
	}
	public void setMiniappTemplateData(MiniAppTemplateData miniappTemplateData) {
		this.miniappTemplateData = miniappTemplateData;
	}

	public String getMsgName() {
		return this.msgName;
	}
	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}

	public String getOperateBusinessId() {
		return this.operateBusinessId;
	}
	public void setOperateBusinessId(String operateBusinessId) {
		this.operateBusinessId = operateBusinessId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public TextTemplateData getTextTemplateData() {
		return this.textTemplateData;
	}
	public void setTextTemplateData(TextTemplateData textTemplateData) {
		this.textTemplateData = textTemplateData;
	}

}
