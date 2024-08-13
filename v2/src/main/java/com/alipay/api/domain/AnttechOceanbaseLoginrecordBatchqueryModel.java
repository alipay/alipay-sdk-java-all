package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户登录记录查询
 *
 * @author auto create
 * @since 1.0, 2024-04-17 13:50:37
 */
public class AnttechOceanbaseLoginrecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6158794357646483671L;

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
