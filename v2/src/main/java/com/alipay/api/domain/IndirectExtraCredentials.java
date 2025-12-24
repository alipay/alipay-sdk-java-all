package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 补充材料信息
 *
 * @author auto create
 * @since 1.0, 2023-02-06 11:12:02
 */
public class IndirectExtraCredentials extends AlipayObject {

	private static final long serialVersionUID = 5699456514332839599L;

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
