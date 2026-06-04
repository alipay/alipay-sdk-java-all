package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PhoneItemInfo;
import com.alipay.api.domain.MobilePhoneInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.mcp.phone.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 10:24:45
 */
public class AlipayCommerceAcommunicationMcpPhoneRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6258273646514764997L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("phone_item_info")
	private List<PhoneItemInfo> items;

	/** 
	 * 手机号信息
	 */
	@ApiField("mobile_info")
	private MobilePhoneInfo mobileInfo;

	/** 
	 * 查询余额链接
	 */
	@ApiField("query_balance_link")
	private String queryBalanceLink;

	public void setItems(List<PhoneItemInfo> items) {
		this.items = items;
	}
	public List<PhoneItemInfo> getItems( ) {
		return this.items;
	}

	public void setMobileInfo(MobilePhoneInfo mobileInfo) {
		this.mobileInfo = mobileInfo;
	}
	public MobilePhoneInfo getMobileInfo( ) {
		return this.mobileInfo;
	}

	public void setQueryBalanceLink(String queryBalanceLink) {
		this.queryBalanceLink = queryBalanceLink;
	}
	public String getQueryBalanceLink( ) {
		return this.queryBalanceLink;
	}

}
