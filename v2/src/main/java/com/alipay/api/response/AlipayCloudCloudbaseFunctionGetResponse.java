package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:21
 */
public class AlipayCloudCloudbaseFunctionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2484382883276985817L;

	/** 
	 * 云函数的描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/** 
	 * 函数创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 运行环境
 - nodejs12
 - nodejs18
 - python39
 - php74
 - java17
	 */
	@ApiField("image_name")
	private String imageName;

	/** 
	 * 内存规格配置
- 0.25c0.5g
 - 0.5c1g
 - 1c2g
	 */
	@ApiField("quota_name")
	private String quotaName;

	/** 
	 * 发布状态值
	 */
	@ApiField("status")
	private String status;

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getFunctionName( ) {
		return this.functionName;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageName( ) {
		return this.imageName;
	}

	public void setQuotaName(String quotaName) {
		this.quotaName = quotaName;
	}
	public String getQuotaName( ) {
		return this.quotaName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
