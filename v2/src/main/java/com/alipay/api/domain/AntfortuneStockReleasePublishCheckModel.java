package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证券前置平台release发布检查
 *
 * @author auto create
 * @since 1.0, 2024-09-23 16:20:26
 */
public class AntfortuneStockReleasePublishCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7644394995736239877L;

	/**
	 * 当前发布环境
	 */
	@ApiField("env")
	private String env;

	/**
	 * 给各机构分配的标识
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 本次发布的包名称
	 */
	@ApiField("tgz_name")
	private String tgzName;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getTgzName() {
		return this.tgzName;
	}
	public void setTgzName(String tgzName) {
		this.tgzName = tgzName;
	}

}
