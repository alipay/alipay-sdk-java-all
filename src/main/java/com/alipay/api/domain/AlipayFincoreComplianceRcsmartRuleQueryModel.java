package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解语花审核规则查询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-28 10:39:30
 */
public class AlipayFincoreComplianceRcsmartRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7696164321593491462L;

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
	 * 文件id,审核结果查询返回的file_id。用于查询审核当前文件的所有规则信息
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 请求Id，与app_name组成唯一健，保证审核工单为该调用方所有
	 */
	@ApiField("request_id")
	private String requestId;

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

}
