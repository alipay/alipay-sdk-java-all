package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询云函数列表
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:41:27
 */
public class AlipayCloudCloudbaseFunctionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2464446211218129561L;

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
	 * 云函数名称（精准匹配）
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 云函数名称（模糊匹配）
	 */
	@ApiField("function_name_like")
	private String functionNameLike;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页展示数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 状态
 - PUB_UNDONE
 - PUB_DOING
 - PUB_SUCCESS
 - PUB_FAILED
	 */
	@ApiField("status")
	private String status;

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

	public String getFunctionNameLike() {
		return this.functionNameLike;
	}
	public void setFunctionNameLike(String functionNameLike) {
		this.functionNameLike = functionNameLike;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
