package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户数据回流同步
 *
 * @author auto create
 * @since 1.0, 2018-08-27 21:02:36
 */
public class KoubeiMemberDataCampaignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2529584588166362298L;

	/**
	 * 真实给用户发奖的日期，精确到天的维度， 格式：yyyymmdd
	 */
	@ApiField("date")
	private String date;

	/**
	 * 给用户发奖的金额，带小数点时精确到小数点后两位（例如：5.05），整数时去掉小数点部分（5）。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 发奖操作成功还是失败
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
