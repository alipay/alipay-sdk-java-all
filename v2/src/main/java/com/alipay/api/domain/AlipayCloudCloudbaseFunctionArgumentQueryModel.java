package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询参数配置
 *
 * @author auto create
 * @since 1.0, 2023-08-10 20:01:07
 */
public class AlipayCloudCloudbaseFunctionArgumentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4548187738997946549L;

	/**
	 * 参数名称模糊查询
	 */
	@ApiField("argument_name_like")
	private String argumentNameLike;

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
	 * 是否逆序
	 */
	@ApiField("desc")
	private Boolean desc;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getArgumentNameLike() {
		return this.argumentNameLike;
	}
	public void setArgumentNameLike(String argumentNameLike) {
		this.argumentNameLike = argumentNameLike;
	}

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

	public Boolean getDesc() {
		return this.desc;
	}
	public void setDesc(Boolean desc) {
		this.desc = desc;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
