package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发布云函数
 *
 * @author auto create
 * @since 1.0, 2023-08-13 21:45:54
 */
public class AlipayCloudCloudbaseFunctionPublishModel extends AlipayObject {

	private static final long serialVersionUID = 1468228588931133159L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 是否安装依赖
	 */
	@ApiField("need_dependency")
	private Boolean needDependency;

	/**
	 * 上传ID
	 */
	@ApiField("upload_id")
	private String uploadId;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Boolean getNeedDependency() {
		return this.needDependency;
	}
	public void setNeedDependency(Boolean needDependency) {
		this.needDependency = needDependency;
	}

	public String getUploadId() {
		return this.uploadId;
	}
	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

}
