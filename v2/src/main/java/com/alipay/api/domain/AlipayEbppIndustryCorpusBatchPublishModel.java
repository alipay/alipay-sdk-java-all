package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业智能体知识发布上线
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:32
 */
public class AlipayEbppIndustryCorpusBatchPublishModel extends AlipayObject {

	private static final long serialVersionUID = 7666611416145237792L;

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
	 * 用于传递哪些语料需要上线或下线操作。根据不同的corpus_type传递对应的语料列表
	 */
	@ApiListField("out_corpus_id_list")
	@ApiField("string")
	private List<String> outCorpusIdList;

	/**
	 * 用于说明发布任务信息，需要注明是哪种语料，上线还是下线，尽量描述的清晰准确
	 */
	@ApiField("publish_name")
	private String publishName;

	/**
	 * 知识发布类型
	 */
	@ApiField("publish_type")
	private String publishType;

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

	public List<String> getOutCorpusIdList() {
		return this.outCorpusIdList;
	}
	public void setOutCorpusIdList(List<String> outCorpusIdList) {
		this.outCorpusIdList = outCorpusIdList;
	}

	public String getPublishName() {
		return this.publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}

	public String getPublishType() {
		return this.publishType;
	}
	public void setPublishType(String publishType) {
		this.publishType = publishType;
	}

}
