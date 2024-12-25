package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计收费主体信息配置
 *
 * @author auto create
 * @since 1.0, 2020-06-04 20:30:50
 */
public class BFActivityFundInfo extends AlipayObject {

	private static final long serialVersionUID = 8145172961494748152L;

	/**
	 * 计收费主体是否激活
	 */
	@ApiField("activity")
	private Boolean activity;

	/**
	 * 老场景 活动模板ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * 签署的贴息协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 收费产品码
	 */
	@ApiField("charge_code")
	private String chargeCode;

	/**
	 * 老场景 活动ID
	 */
	@ApiField("key")
	private String key;

	/**
	 * 计收费减收配置ID
	 */
	@ApiField("platform_subsidy_id")
	private String platformSubsidyId;

	/**
	 * bigdecimal subsidyMode=rate 表示折扣值 eg: 0.5 表示承担50%
	 */
	@ApiField("ratio")
	private String ratio;

	/**
	 * 商家可见费率
	 */
	@ApiField("seller_rate")
	private String sellerRate;

	/**
	 * rate:折扣,fixed:定额扣减
	 */
	@ApiField("subsidy_mode")
	private String subsidyMode;

	/**
	 * 贴息商户ID
	 */
	@ApiField("subsidy_user")
	private String subsidyUser;

	/**
	 * 期数信息
	 */
	@ApiField("term")
	private String term;

	/**
	 * 计收费主体类型
	 */
	@ApiField("type")
	private String type;

	public Boolean getActivity() {
		return this.activity;
	}
	public void setActivity(Boolean activity) {
		this.activity = activity;
	}

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getChargeCode() {
		return this.chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getPlatformSubsidyId() {
		return this.platformSubsidyId;
	}
	public void setPlatformSubsidyId(String platformSubsidyId) {
		this.platformSubsidyId = platformSubsidyId;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(String sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getSubsidyMode() {
		return this.subsidyMode;
	}
	public void setSubsidyMode(String subsidyMode) {
		this.subsidyMode = subsidyMode;
	}

	public String getSubsidyUser() {
		return this.subsidyUser;
	}
	public void setSubsidyUser(String subsidyUser) {
		this.subsidyUser = subsidyUser;
	}

	public String getTerm() {
		return this.term;
	}
	public void setTerm(String term) {
		this.term = term;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
