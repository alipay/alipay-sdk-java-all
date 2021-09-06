package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝行业云验收任务功能
 *
 * @author auto create
 * @since 1.0, 2018-11-14 20:42:26
 */
public class AlipayEcoAcceptanceTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1195293112853613566L;

	/**
	 * 验收任务需要验收的用例
	 */
	@ApiListField("case_list")
	@ApiField("test_case_param")
	private List<TestCaseParam> caseList;

	/**
	 * TMALL_NEWRETAIL 调用方需要申请自己调用来源，以便于做一些逻辑管控
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 商家ID、机构ID，支付宝域即商户PID；淘宝域应该是SELLERID之类
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 公司、机构、商家等名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 创建人USERID
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建人姓名
	 */
	@ApiField("creator_nick")
	private String creatorNick;

	/**
	 * 用户账号类型
	 */
	@ApiField("creator_user_type")
	private String creatorUserType;

	/**
	 * TIANSUOB表示 天猫新零售；BUS 表示公交行业
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 用于双向数据关联，外部ID
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 一段简要的验收描述
	 */
	@ApiField("topic")
	private String topic;

	public List<TestCaseParam> getCaseList() {
		return this.caseList;
	}
	public void setCaseList(List<TestCaseParam> caseList) {
		this.caseList = caseList;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorNick() {
		return this.creatorNick;
	}
	public void setCreatorNick(String creatorNick) {
		this.creatorNick = creatorNick;
	}

	public String getCreatorUserType() {
		return this.creatorUserType;
	}
	public void setCreatorUserType(String creatorUserType) {
		this.creatorUserType = creatorUserType;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
