package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.redis.instance.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-13 14:17:28
 */
public class AlipayCloudCloudbaseRedisInstanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1774493263341772245L;

	/** 
	 * 架构类型。集群版：分片集群架构，支持扩缩容、规格调整; 标准版：标准的 master-slave 架构，支持规格调整
 - CLUSTER(集群版)
 - STANDARD(标准版)
- MINISPEC(极简版)
	 */
	@ApiField("architecture_type")
	private String architectureType;

	/** 
	 * 实例名称
	 */
	@ApiField("instance_name")
	private String instanceName;

	/** 
	 * 实例规格，每个数据节点的内存大小
 - 1GB
 - 4GB
-128MB
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
	 * 访问端口
	 */
	@ApiField("proxy_port")
	private String proxyPort;

	/** 
	 * 访问域名
	 */
	@ApiField("proxy_url")
	private String proxyUrl;

	/** 
	 * 代理节点Version
	 */
	@ApiField("proxy_version")
	private String proxyVersion;

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

	/** 
	 * 状态
 - RUNNING(正常)
 - CREATING(创建中)
 - PAUSE(暂停)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 机房
	 */
	@ApiField("zone")
	private String zone;

	public void setArchitectureType(String architectureType) {
		this.architectureType = architectureType;
	}
	public String getArchitectureType( ) {
		return this.architectureType;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	public String getInstanceName( ) {
		return this.instanceName;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
	}
	public String getInstanceSpec( ) {
		return this.instanceSpec;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public String getNodeType( ) {
		return this.nodeType;
	}

	public void setProxyPort(String proxyPort) {
		this.proxyPort = proxyPort;
	}
	public String getProxyPort( ) {
		return this.proxyPort;
	}

	public void setProxyUrl(String proxyUrl) {
		this.proxyUrl = proxyUrl;
	}
	public String getProxyUrl( ) {
		return this.proxyUrl;
	}

	public void setProxyVersion(String proxyVersion) {
		this.proxyVersion = proxyVersion;
	}
	public String getProxyVersion( ) {
		return this.proxyVersion;
	}

	public void setRedisVersion(String redisVersion) {
		this.redisVersion = redisVersion;
	}
	public String getRedisVersion( ) {
		return this.redisVersion;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion( ) {
		return this.region;
	}

	public void setShardNumber(String shardNumber) {
		this.shardNumber = shardNumber;
	}
	public String getShardNumber( ) {
		return this.shardNumber;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getZone( ) {
		return this.zone;
	}

}
