package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销优惠预核销
 *
 * @author auto create
 * @since 1.0, 2022-09-23 16:20:04
 */
public class AlipayInsMarketingDiscountPreuseModel extends AlipayObject {

	private static final long serialVersionUID = 7417351346144869949L;

	/**
	 * 保险营销账号Id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 保险营销账号类型
	 */
	@ApiField("account_type")
	private Long accountType;

	/**
	 * 保险营销业务类型
	 */
	@ApiField("business_type")
	private Long businessType;

	/**
	 * 优惠决策因子
	 */
	@ApiListField("factors")
	@ApiField("ins_mkt_factor_d_t_o")
	private List<InsMktFactorDTO> factors;

	/**
	 * 营销市场列表
	 */
	@ApiListField("market_types")
	@ApiField("number")
	private List<Long> marketTypes;

	/**
	 * 权益活动列表
	 */
	@ApiListField("mkt_coupon_campaigns")
	@ApiField("ins_mkt_coupon_cmpgn_base_d_t_o")
	private List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns;

	/**
	 * 用户选择的权益列表
	 */
	@ApiListField("mkt_coupons")
	@ApiField("ins_mkt_coupon_base_d_t_o")
	private List<InsMktCouponBaseDTO> mktCoupons;

	/**
	 * 营销标的列表
	 */
	@ApiListField("mkt_objects")
	@ApiField("ins_mkt_object_d_t_o")
	private List<InsMktObjectDTO> mktObjects;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Long getAccountType() {
		return this.accountType;
	}
	public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

	public Long getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public List<InsMktFactorDTO> getFactors() {
		return this.factors;
	}
	public void setFactors(List<InsMktFactorDTO> factors) {
		this.factors = factors;
	}

	public List<Long> getMarketTypes() {
		return this.marketTypes;
	}
	public void setMarketTypes(List<Long> marketTypes) {
		this.marketTypes = marketTypes;
	}

	public List<InsMktCouponCmpgnBaseDTO> getMktCouponCampaigns() {
		return this.mktCouponCampaigns;
	}
	public void setMktCouponCampaigns(List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns) {
		this.mktCouponCampaigns = mktCouponCampaigns;
	}

	public List<InsMktCouponBaseDTO> getMktCoupons() {
		return this.mktCoupons;
	}
	public void setMktCoupons(List<InsMktCouponBaseDTO> mktCoupons) {
		this.mktCoupons = mktCoupons;
	}

	public List<InsMktObjectDTO> getMktObjects() {
		return this.mktObjects;
	}
	public void setMktObjects(List<InsMktObjectDTO> mktObjects) {
		this.mktObjects = mktObjects;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
