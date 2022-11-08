package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新订购
 *
 * @author auto create
 * @since 1.0, 2022-08-29 16:22:47
 */
public class AlipayInsSceneEcommercePurchaseModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3287613617645555351L;

	/**
	 * 业务扩展信息
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 是否需要核验保障方案定价
	 */
	@ApiField("check_quote")
	private Boolean checkQuote;

	/**
	 * 指定生效时间，可选,限时订购时有效
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 指定失效时间，可选,限时订购时有效
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 商品:订购主体为商品时必传
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 订购合约id
	 */
	@ApiField("purchase_contract_id")
	private String purchaseContractId;

	/**
	 * 订购选定的保障方案
	 */
	@ApiField("purchase_insure_plan_dto")
	private PurchaseInsurePlanDTO purchaseInsurePlanDto;

	/**
	 * 是否自动续订:限时/限量订购时有效
	 */
	@ApiField("renew")
	private Boolean renew;

	/**
	 * 自动续订期限，若需要限时，则必传
	 */
	@ApiField("renew_period")
	private InsPeriodDTO renewPeriod;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	/**
	 * 订购数量，可选,按量订购时有效
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 客户端渠道:ios / android / pc / wx_applet(微信小程序)
	 */
	@ApiField("user_client")
	private String userClient;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Boolean getCheckQuote() {
		return this.checkQuote;
	}
	public void setCheckQuote(Boolean checkQuote) {
		this.checkQuote = checkQuote;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPurchaseContractId() {
		return this.purchaseContractId;
	}
	public void setPurchaseContractId(String purchaseContractId) {
		this.purchaseContractId = purchaseContractId;
	}

	public PurchaseInsurePlanDTO getPurchaseInsurePlanDto() {
		return this.purchaseInsurePlanDto;
	}
	public void setPurchaseInsurePlanDto(PurchaseInsurePlanDTO purchaseInsurePlanDto) {
		this.purchaseInsurePlanDto = purchaseInsurePlanDto;
	}

	public Boolean getRenew() {
		return this.renew;
	}
	public void setRenew(Boolean renew) {
		this.renew = renew;
	}

	public InsPeriodDTO getRenewPeriod() {
		return this.renewPeriod;
	}
	public void setRenewPeriod(InsPeriodDTO renewPeriod) {
		this.renewPeriod = renewPeriod;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
