package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据基础信息创建流水号
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:03:28
 */
public class AlipayOpenSpNcoilopenReferenceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4158548378484874418L;

	/**
	 * 行业解决方案id，不同场景对应的值不同，需要业务分配
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 解决方案id，不同场景对应的值不同，需要业务分配
	 */
	@ApiField("sub_solution_id")
	private String subSolutionId;

	/**
	 * 模板code，不同场景对应的值不同，需要业务分配
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getSubSolutionId() {
		return this.subSolutionId;
	}
	public void setSubSolutionId(String subSolutionId) {
		this.subSolutionId = subSolutionId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
