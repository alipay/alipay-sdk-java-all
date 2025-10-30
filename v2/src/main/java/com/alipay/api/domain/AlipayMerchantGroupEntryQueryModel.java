package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团通用入驻申请单信息查询
 *
 * @author auto create
 * @since 1.0, 2024-04-11 14:08:10
 */
public class AlipayMerchantGroupEntryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5241447143788486268L;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 集团入驻单号
	 */
	@ApiField("external_id")
	private String externalId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}
