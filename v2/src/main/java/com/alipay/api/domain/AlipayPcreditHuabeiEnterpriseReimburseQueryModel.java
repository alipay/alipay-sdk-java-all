package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业单据数据导出查询
 *
 * @author auto create
 * @since 1.0, 2020-08-04 14:35:55
 */
public class AlipayPcreditHuabeiEnterpriseReimburseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3545728781272267366L;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 获取数据的code，在消息发送时会带出
	 */
	@ApiField("record_code")
	private String recordCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRecordCode() {
		return this.recordCode;
	}
	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
