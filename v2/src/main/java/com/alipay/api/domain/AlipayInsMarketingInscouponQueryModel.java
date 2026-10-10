package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销权益查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:12:51
 */
public class AlipayInsMarketingInscouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5357118915996226678L;

	/**
	 * 绑定券id，可选，如果传了券id，则只查该券对应的权益
	 */
	@ApiField("bind_voucher_id")
	private String bindVoucherId;

	/**
	 * null
	 */
	@ApiListField("coupon_type")
	@ApiField("string")
	private List<String> couponType;

	/**
	 * 开放平台用户的唯一标识符
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部供应商请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBindVoucherId() {
		return this.bindVoucherId;
	}
	public void setBindVoucherId(String bindVoucherId) {
		this.bindVoucherId = bindVoucherId;
	}

	public List<String> getCouponType() {
		return this.couponType;
	}
	public void setCouponType(List<String> couponType) {
		this.couponType = couponType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
