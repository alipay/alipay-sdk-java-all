package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业智能体知识创建
 *
 * @author auto create
 * @since 1.0, 2025-07-04 13:22:37
 */
public class AlipayEbppIndustryCorpusBatchSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2221494478989175459L;

	/**
	 * 政务智能体id。在政务AI（光华）开放平台配置云端私有化版本智能体后可以获取该参数信息
	 */
	@ApiField("bot_id")
	private String botId;

	/**
	 * 知识语料类型
	 */
	@ApiField("corpus_type")
	private String corpusType;

	/**
	 * 政策文件列表
	 */
	@ApiListField("doc_list")
	@ApiField("doc_d_t_o")
	private List<DocDTO> docList;

	/**
	 * FAQ问答列表参数
	 */
	@ApiListField("faq_list")
	@ApiField("common_qa_d_t_o")
	private List<CommonQaDTO> faqList;

	/**
	 * 办事事项列表
	 */
	@ApiListField("item_list")
	@ApiField("service_item_d_t_o")
	private List<ServiceItemDTO> itemList;

	/**
	 * 服务信息
	 */
	@ApiListField("service_list")
	@ApiField("gov_org_service_d_t_o")
	private List<GovOrgServiceDTO> serviceList;

	public String getBotId() {
		return this.botId;
	}
	public void setBotId(String botId) {
		this.botId = botId;
	}

	public String getCorpusType() {
		return this.corpusType;
	}
	public void setCorpusType(String corpusType) {
		this.corpusType = corpusType;
	}

	public List<DocDTO> getDocList() {
		return this.docList;
	}
	public void setDocList(List<DocDTO> docList) {
		this.docList = docList;
	}

	public List<CommonQaDTO> getFaqList() {
		return this.faqList;
	}
	public void setFaqList(List<CommonQaDTO> faqList) {
		this.faqList = faqList;
	}

	public List<ServiceItemDTO> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ServiceItemDTO> itemList) {
		this.itemList = itemList;
	}

	public List<GovOrgServiceDTO> getServiceList() {
		return this.serviceList;
	}
	public void setServiceList(List<GovOrgServiceDTO> serviceList) {
		this.serviceList = serviceList;
	}

}
