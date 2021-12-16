package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-类目-批量查询
 *
 * @author auto create
 * @since 1.0, 2021-03-30 20:15:28
 */
public class AlipayIserviceCcmSwTreeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6827617529512765184L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

}
