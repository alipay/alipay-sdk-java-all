package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家生活号信息查询
 *
 * @author auto create
 * @since 1.0, 2022-12-14 17:18:50
 */
public class AlipayOpenPublicSummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4751143585932763271L;

	/**
	 * 支付宝用户的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 上架：ON_LINE,下架：OFF_LINE，为空时查询全部
	 */
	@ApiField("status")
	private String status;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
