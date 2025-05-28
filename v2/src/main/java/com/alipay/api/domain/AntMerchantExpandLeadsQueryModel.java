package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * leads信息查询接口
 *
 * @author auto create
 * @since 1.0, 2025-04-28 21:04:36
 */
public class AntMerchantExpandLeadsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3637781575498878634L;

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
