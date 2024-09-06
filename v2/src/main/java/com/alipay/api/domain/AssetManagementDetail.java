package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料管控详细信息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:57:51
 */
public class AssetManagementDetail extends AlipayObject {

	private static final long serialVersionUID = 1592241327898738662L;

	/**
	 * 校验名称
	 */
	@ApiField("check_name")
	private String checkName;

	/**
	 * 校验类型
	 */
	@ApiField("check_type")
	private String checkType;

	/**
	 * 需求阶段
	 */
	@ApiField("require_phase")
	private String requirePhase;

	/**
	 * 需求资源
	 */
	@ApiField("require_resource")
	private String requireResource;

	public String getCheckName() {
		return this.checkName;
	}
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public String getCheckType() {
		return this.checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getRequirePhase() {
		return this.requirePhase;
	}
	public void setRequirePhase(String requirePhase) {
		this.requirePhase = requirePhase;
	}

	public String getRequireResource() {
		return this.requireResource;
	}
	public void setRequireResource(String requireResource) {
		this.requireResource = requireResource;
	}

}
