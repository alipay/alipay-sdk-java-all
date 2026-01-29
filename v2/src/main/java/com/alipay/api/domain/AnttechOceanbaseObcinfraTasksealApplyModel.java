package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多云任务中心文件用印
 *
 * @author auto create
 * @since 1.0, 2025-12-11 14:07:42
 */
public class AnttechOceanbaseObcinfraTasksealApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1116755265674987416L;

	/**
	 * 部署云环境
	 */
	@ApiField("deploy_cloud")
	private String deployCloud;

	/**
	 * 任务id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 环境标识
	 */
	@ApiField("x_boss_env")
	private String xBossEnv;

	public String getDeployCloud() {
		return this.deployCloud;
	}
	public void setDeployCloud(String deployCloud) {
		this.deployCloud = deployCloud;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getxBossEnv() {
		return this.xBossEnv;
	}
	public void setxBossEnv(String xBossEnv) {
		this.xBossEnv = xBossEnv;
	}

}
