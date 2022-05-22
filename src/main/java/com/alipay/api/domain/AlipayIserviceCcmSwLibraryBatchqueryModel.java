package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-库-批量查询
 *
 * @author auto create
 * @since 1.0, 2021-01-26 15:20:49
 */
public class AlipayIserviceCcmSwLibraryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3369522299423467812L;

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
