package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多方安全商业化对外输出合规任务，查询审批流程进展
 *
 * @author auto create
 * @since 1.0, 2023-05-22 19:31:46
 */
public class AlipaySecurityRiskGravityWorkflowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1484535544536425558L;

	/**
	 * 合规流程的主键id
	 */
	@ApiField("pu_id")
	private String puId;

	public String getPuId() {
		return this.puId;
	}
	public void setPuId(String puId) {
		this.puId = puId;
	}

}
