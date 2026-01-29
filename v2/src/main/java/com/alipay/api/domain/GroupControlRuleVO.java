package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家群广告屏蔽策略规则模型
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:22
 */
public class GroupControlRuleVO extends AlipayObject {

	private static final long serialVersionUID = 5364556222631515523L;

	/**
	 * 应用ID列表
	 */
	@ApiListField("app_id_list")
	@ApiField("string")
	private List<String> appIdList;

	/**
	 * 检测点列表
	 */
	@ApiListField("check_position_list")
	@ApiField("string")
	private List<String> checkPositionList;

	/**
	 * 白名单域名列表
	 */
	@ApiListField("domain_name_white_list")
	@ApiField("string")
	private List<String> domainNameWhiteList;

	/**
	 * 敏感词列表
	 */
	@ApiListField("key_word_list")
	@ApiField("string")
	private List<String> keyWordList;

	/**
	 * 消息类型列表
	 */
	@ApiListField("msg_type_list")
	@ApiField("string")
	private List<String> msgTypeList;

	/**
	 * 规则类型
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 时间限制
	 */
	@ApiField("time_limit")
	private String timeLimit;

	/**
	 * 连发总数
	 */
	@ApiField("total_msg_limit")
	private String totalMsgLimit;

	public List<String> getAppIdList() {
		return this.appIdList;
	}
	public void setAppIdList(List<String> appIdList) {
		this.appIdList = appIdList;
	}

	public List<String> getCheckPositionList() {
		return this.checkPositionList;
	}
	public void setCheckPositionList(List<String> checkPositionList) {
		this.checkPositionList = checkPositionList;
	}

	public List<String> getDomainNameWhiteList() {
		return this.domainNameWhiteList;
	}
	public void setDomainNameWhiteList(List<String> domainNameWhiteList) {
		this.domainNameWhiteList = domainNameWhiteList;
	}

	public List<String> getKeyWordList() {
		return this.keyWordList;
	}
	public void setKeyWordList(List<String> keyWordList) {
		this.keyWordList = keyWordList;
	}

	public List<String> getMsgTypeList() {
		return this.msgTypeList;
	}
	public void setMsgTypeList(List<String> msgTypeList) {
		this.msgTypeList = msgTypeList;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getTimeLimit() {
		return this.timeLimit;
	}
	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getTotalMsgLimit() {
		return this.totalMsgLimit;
	}
	public void setTotalMsgLimit(String totalMsgLimit) {
		this.totalMsgLimit = totalMsgLimit;
	}

}
