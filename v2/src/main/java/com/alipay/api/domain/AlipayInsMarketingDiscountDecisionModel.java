package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销优惠咨询
 *
 * @author auto create
 * @since 1.0, 2022-09-23 16:19:42
 */
public class AlipayInsMarketingDiscountDecisionModel extends AlipayObject {

	private static final long serialVersionUID = 1811612883986399955L;

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
	 * 优惠咨询因子
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
	 * 营销标的列表
	 */
	@ApiListField("mkt_objects")
	@ApiField("ins_mkt_object_d_t_o")
	private List<InsMktObjectDTO> mktObjects;

	/**
	 * 请求流水Id
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
