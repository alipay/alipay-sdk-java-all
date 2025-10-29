package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代入驻申请单进驻状态查询
 *
 * @author auto create
 * @since 1.0, 2025-09-29 20:07:18
 */
public class AlipayMerchantIsvhelpEntryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3173343453179215235L;

	/**
	 * 服务商自定义的申请编号，每个申请编号唯一对应一个申请单，需在服务商下唯一。只能用数字、字母或下划线组成
	 */
	@ApiField("external_id")
	private String externalId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}
