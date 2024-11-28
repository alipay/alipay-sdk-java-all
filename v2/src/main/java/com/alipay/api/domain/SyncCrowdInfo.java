package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群同步信息
 *
 * @author auto create
 * @since 1.0, 2023-03-20 20:44:21
 */
public class SyncCrowdInfo extends AlipayObject {

	private static final long serialVersionUID = 4838644992528812457L;

	/**
	 * 来源app
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 外部app给出
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 业务code
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 操作的人群对象
	 */
	@ApiListField("operations")
	@ApiField("crowd_operations")
	private List<CrowdOperations> operations;

	/**
	 * 目标用户
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 目标类型
	 */
	@ApiField("target_type")
	private String targetType;

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

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<CrowdOperations> getOperations() {
		return this.operations;
	}
	public void setOperations(List<CrowdOperations> operations) {
		this.operations = operations;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
