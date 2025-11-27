package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * leads信息查询接口
 *
 * @author auto create
 * @since 1.0, 2025-07-21 10:44:17
 */
public class AntMerchantExpandLeadsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1335551425128684613L;

	/**
	 * leads信息查询主键
	 */
	@ApiField("leads_id")
	private String leadsId;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

}
