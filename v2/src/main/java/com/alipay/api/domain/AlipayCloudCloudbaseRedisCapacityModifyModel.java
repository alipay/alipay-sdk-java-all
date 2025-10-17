package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Redis实例扩缩容
 *
 * @author auto create
 * @since 1.0, 2025-04-09 11:16:34
 */
public class AlipayCloudCloudbaseRedisCapacityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3832869116343345873L;

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
	 * 实例规格，单位为1GB、4GB、8GB、16GB、128M
	 */
	@ApiField("instance_spec")
	private String instanceSpec;

	/**
	 * 区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 分片数，数据节点数量，仅集群版可用 - 1(分片) - 2(分片) - 4(分片) - 8(分片) - 16(分片) - 32(分片)
	 */
	@ApiField("shard_number")
	private String shardNumber;

	/**
	 * 机房
	 */
	@ApiField("zone")
	private String zone;

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

	public String getZone() {
		return this.zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

}
