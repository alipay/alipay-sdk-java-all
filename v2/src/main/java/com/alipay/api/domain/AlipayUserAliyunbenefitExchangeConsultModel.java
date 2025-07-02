package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云权益兑换咨询api
 *
 * @author auto create
 * @since 1.0, 2024-12-25 11:11:14
 */
public class AlipayUserAliyunbenefitExchangeConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2294986918159821991L;

	/**
	 * 业务发生日期
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 传入阿里云侧获取的商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
