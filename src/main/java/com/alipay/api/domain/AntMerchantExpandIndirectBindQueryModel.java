package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户绑定查询接口
 *
 * @author auto create
 * @since 1.0, 2020-05-15 11:49:35
 */
public class AntMerchantExpandIndirectBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3551667668744953982L;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * smid传入后，传入的partner_id无效
smid和partner_id二选一必填
	 */
	@ApiField("smid")
	private String smid;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
