package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询华为云买家列表
 *
 * @author auto create
 * @since 1.0, 2025-04-21 09:59:57
 */
public class AnttechOceanbaseEntityroleHuaweimpBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2111612548822217453L;

	/**
	 * 通行证id列表
	 */
	@ApiListField("passport_id_list")
	@ApiField("string")
	private List<String> passportIdList;

	public List<String> getPassportIdList() {
		return this.passportIdList;
	}
	public void setPassportIdList(List<String> passportIdList) {
		this.passportIdList = passportIdList;
	}

}
