package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试用例领域模型
 *
 * @author auto create
 * @since 1.0, 2019-11-27 19:27:15
 */
public class TestCaseDomain extends AlipayObject {

	private static final long serialVersionUID = 1224824637885283638L;

	/**
	 * ISV的测试节点
	 */
	@ApiField("action")
	private String action;

	/**
	 * 测试用例id
	 */
	@ApiField("case_id")
	private String caseId;

	/**
	 * 测试集id
	 */
	@ApiField("collection_id")
	private String collectionId;

	/**
	 * 测试用例描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 测试用例拓展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 测试用例优先级
	 */
	@ApiField("priority")
	private String priority;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getCaseId() {
		return this.caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCollectionId() {
		return this.collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

}
