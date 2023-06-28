package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.stocktools.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:16:50
 */
public class AlipayFinanceQuotationStocktoolsUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5766739218334324477L;

	/** 
	 * 是否存在有效的订阅。如果存在有效的订阅，说明用户是已经付费过的用户，可查看完整的服务内容。
	 */
	@ApiField("auth_status")
	private Boolean authStatus;

	/** 
	 * 表示用户的订阅的到期时间。可用于提示用户及时续订等功能。未订阅时此字段为空
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 用户是否可参与免费试用。如果可参与免费试用的话，会允许用户享受一个7天的免费体验期。
	 */
	@ApiField("free_experience_available")
	private Boolean freeExperienceAvailable;

	/** 
	 * 剩余可用天数。与过期时间相对应。40代表会在40天后过期。部分机构希望有此字段避免前端做额外计算。
	 */
	@ApiField("remain_days")
	private Long remainDays;

	/** 
	 * 建议的价格文案描述。方便机构给非付费用户提示。实际定价以蚂蚁域内的功能为准。此处纯展示目的。
	 */
	@ApiField("suggest_price")
	private String suggestPrice;

	public void setAuthStatus(Boolean authStatus) {
		this.authStatus = authStatus;
	}
	public Boolean getAuthStatus( ) {
		return this.authStatus;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setFreeExperienceAvailable(Boolean freeExperienceAvailable) {
		this.freeExperienceAvailable = freeExperienceAvailable;
	}
	public Boolean getFreeExperienceAvailable( ) {
		return this.freeExperienceAvailable;
	}

	public void setRemainDays(Long remainDays) {
		this.remainDays = remainDays;
	}
	public Long getRemainDays( ) {
		return this.remainDays;
	}

	public void setSuggestPrice(String suggestPrice) {
		this.suggestPrice = suggestPrice;
	}
	public String getSuggestPrice( ) {
		return this.suggestPrice;
	}

}
