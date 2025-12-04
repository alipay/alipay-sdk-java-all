package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫APP运营投放内容查询接口
 *
 * @author auto create
 * @since 1.0, 2025-12-01 15:47:29
 */
public class AlipayCommerceMedicalOperationDeliverQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8514375625417697664L;

	/**
	 * 账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 用户类型:0/1:支付宝/好大夫
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 参数信息
	 */
	@ApiField("parameter_info")
	private String parameterInfo;

	/**
	 * 用户输入的搜索词内容
	 */
	@ApiField("query_str")
	private String queryStr;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 模版编码
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getParameterInfo() {
		return this.parameterInfo;
	}
	public void setParameterInfo(String parameterInfo) {
		this.parameterInfo = parameterInfo;
	}

	public String getQueryStr() {
		return this.queryStr;
	}
	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
