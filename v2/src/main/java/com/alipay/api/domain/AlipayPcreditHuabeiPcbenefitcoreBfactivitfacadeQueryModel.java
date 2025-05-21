package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询花呗营销分期贴息活动信息
 *
 * @author auto create
 * @since 1.0, 2025-04-30 10:34:57
 */
public class AlipayPcreditHuabeiPcbenefitcoreBfactivitfacadeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6779148446117322733L;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 活动类型，传空默认查所有
	 */
	@ApiListField("product_ids")
	@ApiField("string")
	private List<String> productIds;

	/**
	 * 来源系统
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 查询对应状态活动，默认所有状态活动类型
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

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

	public List<String> getProductIds() {
		return this.productIds;
	}
	public void setProductIds(List<String> productIds) {
		this.productIds = productIds;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public List<String> getStatus() {
		return this.status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
