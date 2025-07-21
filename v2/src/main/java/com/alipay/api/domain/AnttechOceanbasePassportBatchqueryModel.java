package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通行证批量查询
 *
 * @author auto create
 * @since 1.0, 2025-06-16 14:50:56
 */
public class AnttechOceanbasePassportBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1614325215584892536L;

	/**
	 * 通行证id列表
	 */
	@ApiListField("passport_ids")
	@ApiField("string")
	private List<String> passportIds;

	public List<String> getPassportIds() {
		return this.passportIds;
	}
	public void setPassportIds(List<String> passportIds) {
		this.passportIds = passportIds;
	}

}
