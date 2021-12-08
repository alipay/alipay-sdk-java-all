package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.groupshopping.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserGroupshoppingBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1675772581362259147L;

	/** 
	 * 拼团支付宝权益透出金额
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 该用户是否有权益
	 */
	@ApiField("have_benefit")
	private Boolean haveBenefit;

	/** 
	 * 查询权益的图标地址
	 */
	@ApiField("icon")
	private String icon;

	/** 
	 * 查询权益的跳转地址
	 */
	@ApiField("link")
	private String link;

	/** 
	 * 发放权益原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 查询权益的副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/** 
	 * 查询权益的标题
	 */
	@ApiField("title")
	private String title;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setHaveBenefit(Boolean haveBenefit) {
		this.haveBenefit = haveBenefit;
	}
	public Boolean getHaveBenefit( ) {
		return this.haveBenefit;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIcon( ) {
		return this.icon;
	}

	public void setLink(String link) {
		this.link = link;
	}
	public String getLink( ) {
		return this.link;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getSubTitle( ) {
		return this.subTitle;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
