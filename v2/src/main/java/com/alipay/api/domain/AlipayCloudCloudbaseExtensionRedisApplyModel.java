package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安装Redis扩展
 *
 * @author auto create
 * @since 1.0, 2025-05-08 17:13:55
 */
public class AlipayCloudCloudbaseExtensionRedisApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4843277424747976611L;

	/**
	 * 架构类型。集群版：分片集群架构，支持扩缩容、规格调整; 标准版：标准的 master-slave 架构，支持规格调整; 极简版：第一年免费;
	 */
	@ApiField("architecture_type")
	private String architectureType;

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
	 * 实例名称
	 */
	@ApiField("instance_name")
	private String instanceName;

	/**
	 * 实例规格，每个数据节点的内存大小
 - 1GB
 - 4GB
 - 8GB
 - 16GB
 - 128MB
	 */
	@ApiField("instance_spec")
	private String instanceSpec;

	/**
	 * 节点类型，仅集群版可用。单副本：数据节点中只有一个主数据节点，数据可靠性低；双副本：数据节点中具有主从两个数据节点，数据可靠性高
 - SINGLE(单副本)
 - DUPLICATES(双副本)
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 密码
	 */
	@ApiField("password")
	private String password;

	/**
	 * Redis版本
 - 4.0
	 */
	@ApiField("redis_version")
	private String redisVersion;

	/**
	 * 区域
 - cn-hangzhou
	 */
	@ApiField("region")
	private String region;

	/**
	 * 分片数，数据节点数量，仅集群版可用
 - 1(分片)
 - 2(分片)
 - 4(分片)
 - 8(分片)
 - 16(分片)
 - 32(分片)
	 */
	@ApiField("shard_number")
	private String shardNumber;

	public String getArchitectureType() {
		return this.architectureType;
	}
	public void setArchitectureType(String architectureType) {
		this.architectureType = architectureType;
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

	public String getInstanceName() {
		return this.instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}
	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRedisVersion() {
		return this.redisVersion;
	}
	public void setRedisVersion(String redisVersion) {
		this.redisVersion = redisVersion;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getShardNumber() {
		return this.shardNumber;
	}
	public void setShardNumber(String shardNumber) {
		this.shardNumber = shardNumber;
	}

}
