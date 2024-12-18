package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot用户权限识别
 *
 * @author auto create
 * @since 1.0, 2023-06-09 16:23:54
 */
public class AlipayOpenIotmbsUserpermissionIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 8828646529565191834L;

	/**
	 * 根据param_type输入参数值
	 */
	@ApiField("param_id")
	private String paramId;

	/**
	 * param_id的参数类型
	 */
	@ApiField("param_type")
	private String paramType;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	public String getParamId() {
		return this.paramId;
	}
	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	public String getParamType() {
		return this.paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
