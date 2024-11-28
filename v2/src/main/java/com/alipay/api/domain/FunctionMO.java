package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云函数详细信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:17:47
 */
public class FunctionMO extends AlipayObject {

	private static final long serialVersionUID = 3322789698171653833L;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 创建时间
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
	 * 规格配置
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

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getImageName() {
		return this.imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getQuotaName() {
		return this.quotaName;
	}
	public void setQuotaName(String quotaName) {
		this.quotaName = quotaName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
