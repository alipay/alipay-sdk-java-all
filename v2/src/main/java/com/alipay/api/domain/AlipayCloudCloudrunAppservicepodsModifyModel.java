package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重构实例
 *
 * @author auto create
 * @since 1.0, 2024-08-15 16:05:47
 */
public class AlipayCloudCloudrunAppservicepodsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1845453299886485415L;

	/**
	 * 应用服务名
	 */
	@ApiField("app_service_name")
	private String appServiceName;

	/**
	 * 环境id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 主机实例名
	 */
	@ApiField("host_name")
	private String hostName;

	/**
	 * 实例名
	 */
	@ApiField("pod_name")
	private String podName;

	/**
	 * 实例全局唯一id
	 */
	@ApiField("pod_uuid")
	private String podUuid;

	public String getAppServiceName() {
		return this.appServiceName;
	}
	public void setAppServiceName(String appServiceName) {
		this.appServiceName = appServiceName;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getHostName() {
		return this.hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPodName() {
		return this.podName;
	}
	public void setPodName(String podName) {
		this.podName = podName;
	}

	public String getPodUuid() {
		return this.podUuid;
	}
	public void setPodUuid(String podUuid) {
		this.podUuid = podUuid;
	}

}
