package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 补充材料信息
 *
 * @author auto create
 * @since 1.0, 2022-09-05 14:09:49
 */
public class IndirectExtraCredentials extends AlipayObject {

	private static final long serialVersionUID = 7669269694833278145L;

	/**
	 * 待确认商户号列表，最多20个
	 */
	@ApiListField("smid_list")
	@ApiField("string")
	private List<String> smidList;

	public List<String> getSmidList() {
		return this.smidList;
	}
	public void setSmidList(List<String> smidList) {
		this.smidList = smidList;
	}

}
