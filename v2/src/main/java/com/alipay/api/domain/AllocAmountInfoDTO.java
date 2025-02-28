package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分账条款
 *
 * @author auto create
 * @since 1.0, 2025-02-19 16:55:56
 */
public class AllocAmountInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7482554986193475568L;

	/**
	 * 买断分账计划
	 */
	@ApiField("buy_out_royalty")
	private RoyaltyDTO buyOutRoyalty;

	/**
	 * 用于资方明确指定app时使用
	 */
	@ApiField("invest_app_id")
	private String investAppId;

	/**
	 * 资方PID，对应合作融资的资方pid
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 租金分账明细
	 */
	@ApiListField("rent_royalty_details")
	@ApiField("rent_royalty_detail_d_t_o")
	private List<RentRoyaltyDetailDTO> rentRoyaltyDetails;

	public RoyaltyDTO getBuyOutRoyalty() {
		return this.buyOutRoyalty;
	}
	public void setBuyOutRoyalty(RoyaltyDTO buyOutRoyalty) {
		this.buyOutRoyalty = buyOutRoyalty;
	}

	public String getInvestAppId() {
		return this.investAppId;
	}
	public void setInvestAppId(String investAppId) {
		this.investAppId = investAppId;
	}

	public String getInvestId() {
		return this.investId;
	}
	public void setInvestId(String investId) {
		this.investId = investId;
	}

	public List<RentRoyaltyDetailDTO> getRentRoyaltyDetails() {
		return this.rentRoyaltyDetails;
	}
	public void setRentRoyaltyDetails(List<RentRoyaltyDetailDTO> rentRoyaltyDetails) {
		this.rentRoyaltyDetails = rentRoyaltyDetails;
	}

}
