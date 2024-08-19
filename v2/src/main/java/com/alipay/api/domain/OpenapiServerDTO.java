package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务实例
 *
 * @author auto create
 * @since 1.0, 2024-08-15 11:51:04
 */
public class OpenapiServerDTO extends AlipayObject {

	private static final long serialVersionUID = 1684973153235633517L;

	/**
	 * 逻辑zone
	 */
	@ApiField("cell")
	private String cell;

	/**
	 * 服务实例名, 有状态服务将会固定该实例名称，在重建或者故障迁移后，依然能保持服务实例名不变
	 */
	@ApiField("hostname")
	private String hostname;

	/**
	 * 实例的IP地址
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 实例名
	 */
	@ApiField("pod_name")
	private String podName;

	/**
	 * 实例序号
	 */
	@ApiField("pod_no")
	private String podNo;

	/**
	 * 实例全局唯一id
	 */
	@ApiField("pod_uuid")
	private String podUuid;

	/**
	 * 实例部署版本
	 */
	@ApiField("pod_version")
	private String podVersion;

	/**
	 * 重建原因和方式
	 */
	@ApiField("recreate_info")
	private RecreateStatus recreateInfo;

	/**
	 * 发布部署状态
	 */
	@ApiField("release_status")
	private String releaseStatus;

	/**
	 * 服务状态，常用值Running、Pending、Terminating、Available等
	 */
	@ApiField("status")
	private String status;

	/**
	 * 实例最新状态更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 实例详细状态信息
	 */
	@ApiField("upgrade_progress")
	private String upgradeProgress;

	public String getCell() {
		return this.cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getHostname() {
		return this.hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPodName() {
		return this.podName;
	}
	public void setPodName(String podName) {
		this.podName = podName;
	}

	public String getPodNo() {
		return this.podNo;
	}
	public void setPodNo(String podNo) {
		this.podNo = podNo;
	}

	public String getPodUuid() {
		return this.podUuid;
	}
	public void setPodUuid(String podUuid) {
		this.podUuid = podUuid;
	}

	public String getPodVersion() {
		return this.podVersion;
	}
	public void setPodVersion(String podVersion) {
		this.podVersion = podVersion;
	}

	public RecreateStatus getRecreateInfo() {
		return this.recreateInfo;
	}
	public void setRecreateInfo(RecreateStatus recreateInfo) {
		this.recreateInfo = recreateInfo;
	}

	public String getReleaseStatus() {
		return this.releaseStatus;
	}
	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpgradeProgress() {
		return this.upgradeProgress;
	}
	public void setUpgradeProgress(String upgradeProgress) {
		this.upgradeProgress = upgradeProgress;
	}

}
