package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁风控数据查询接口(阿里内部调用)
 *
 * @author auto create
 * @since 1.0, 2022-11-16 14:30:14
 */
public class AlipaySecurityDataAlibabaSecuritydataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7685776217388122252L;

	/**
	 * 业务方调用唯一标识，可以是traceID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询服务名，由服务方给定
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 调用系统名
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 查询服务表名
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 设备ID，需要hash处理，不能反解析。
	 */
	@ApiField("umid")
	private String umid;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUmid() {
		return this.umid;
	}
	public void setUmid(String umid) {
		this.umid = umid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
