package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿拉丁后端openbizmock查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:43:16
 */
public class AlipayOpenOpenbizmocktoolsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3419433582185651748L;

	/**
	 * APPID
	 */
	@ApiField("app_number")
	private String appNumber;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询GroupId关系的维度
	 */
	@ApiField("condition")
	private String condition;

	/**
	 * 环境
	 */
	@ApiField("env")
	private String env;

	/**
	 * GROUPID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 接口名
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * OID值
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 商户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 接口名
	 */
	@ApiField("service")
	private String service;

	public String getAppNumber() {
		return this.appNumber;
	}
	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCondition() {
		return this.condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

}
