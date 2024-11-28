package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源复用应用环境关联关系模型
 *
 * @author auto create
 * @since 1.0, 2024-01-08 16:25:24
 */
public class AppEnvShare extends AlipayObject {

	private static final long serialVersionUID = 5617719214549785917L;

	/**
	 * 应用类型为普通小程序
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 环境信息描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 环境的id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 序列值
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 表示这条资源复用关联关系来自云托管
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 资源复用关联应用ID
	 */
	@ApiField("share_app_id")
	private String shareAppId;

	/**
	 * 应用环境状态值，1表示资源复用应用环境
	 */
	@ApiField("state")
	private Long state;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getShareAppId() {
		return this.shareAppId;
	}
	public void setShareAppId(String shareAppId) {
		this.shareAppId = shareAppId;
	}

	public Long getState() {
		return this.state;
	}
	public void setState(Long state) {
		this.state = state;
	}

}
