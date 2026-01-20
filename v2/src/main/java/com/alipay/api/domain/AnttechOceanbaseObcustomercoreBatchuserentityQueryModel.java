package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量客户信息查询
 *
 * @author auto create
 * @since 1.0, 2025-11-06 15:34:05
 */
public class AnttechOceanbaseObcustomercoreBatchuserentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1391136743185767237L;

	/**
	 * 用户通行证ID集合，通过入参传入
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
