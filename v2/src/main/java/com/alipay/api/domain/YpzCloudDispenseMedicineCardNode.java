package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云陪诊首页卡节点
 *
 * @author auto create
 * @since 1.0, 2026-07-07 14:32:26
 */
public class YpzCloudDispenseMedicineCardNode extends AlipayObject {

	private static final long serialVersionUID = 8444195342252459212L;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 编码
	 */
	@ApiField("node_code")
	private String nodeCode;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
