package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人工打标规则结果提交
 *
 * @author auto create
 * @since 1.0, 2022-10-28 10:39:19
 */
public class AlipayFincoreComplianceRcsmartRulemarkSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 3179939435886715383L;

	/**
	 * app_name为调用方系统名称(英文)，与分配的app_token一起做调用系统合法性校验
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * app_token为系统分配的密钥，与app_name一起做调用系统合法性校验
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 打标文件id,审核结果查询返回的file_id。
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 请求Id，与app_name组成唯一健，保证审核工单为该调用方所有
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 规则打标返回信息列表
	 */
	@ApiListField("rule_mark_info_list")
	@ApiField("rule_mark_info")
	private List<RuleMarkInfo> ruleMarkInfoList;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RuleMarkInfo> getRuleMarkInfoList() {
		return this.ruleMarkInfoList;
	}
	public void setRuleMarkInfoList(List<RuleMarkInfo> ruleMarkInfoList) {
		this.ruleMarkInfoList = ruleMarkInfoList;
	}

}
