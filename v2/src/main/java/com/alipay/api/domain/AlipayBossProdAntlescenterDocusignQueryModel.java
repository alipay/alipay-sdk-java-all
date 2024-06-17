package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署状态查询，返回签署任务状态和多方签署人细分状态
 *
 * @author auto create
 * @since 1.0, 2024-02-27 15:04:52
 */
public class AlipayBossProdAntlescenterDocusignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4487759814356223969L;

	/**
	 * 电子签业务受理流水号
	 */
	@ApiField("sign_task_request_id")
	private String signTaskRequestId;

	public String getSignTaskRequestId() {
		return this.signTaskRequestId;
	}
	public void setSignTaskRequestId(String signTaskRequestId) {
		this.signTaskRequestId = signTaskRequestId;
	}

}
