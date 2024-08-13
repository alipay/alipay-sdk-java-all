package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建权益模板
 *
 * @author auto create
 * @since 1.0, 2024-05-27 13:58:38
 */
public class AlipayAssetPointVoucherprodBenefittemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8814967361469227723L;

	/**
	 * 资产类型，要创建的资产的类型，BENEFIT_TEMPLATE表示权益模板，由支付宝权益结算平台定义
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 自动拉起收银台，true表示自动拉起收银台，默认为false
	 */
	@ApiField("auto_recharge")
	private Boolean autoRecharge;

	/**
	 * 业务时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务来源，使用业务系统的名称
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 业务号，用于保证幂等，业务系统保证其唯一性
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 权益模板所对应的业务方活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 创建模板的资金信息，包括出资账号，账号类型，金额，结算类型和结算截止时间，金额必填，数组中只用填充一个
	 */
	@ApiListField("fund_infos")
	@ApiField("asset_fund_info")
	private List<AssetFundInfo> fundInfos;

	/**
	 * 权益名称，权益模板的名称标识，业务系统与权益结算平台共同约定
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝会员ID，需要创建权益模板的商户的支付宝会员id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 权益产品码，不同场景下会有不同的产品码，由支付宝权益结算平台指定，GAODE_SHADOW表示高德权益结算场景下的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 权益模板过期时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 权益实体有效期，此对象不能为空，对象内部的内部过期时间可以为空（表示相对时间为0m）
	 */
	@ApiField("valid_period")
	private AssetValidPeriod validPeriod;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public Boolean getAutoRecharge() {
		return this.autoRecharge;
	}
	public void setAutoRecharge(Boolean autoRecharge) {
		this.autoRecharge = autoRecharge;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public List<AssetFundInfo> getFundInfos() {
		return this.fundInfos;
	}
	public void setFundInfos(List<AssetFundInfo> fundInfos) {
		this.fundInfos = fundInfos;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public AssetValidPeriod getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(AssetValidPeriod validPeriod) {
		this.validPeriod = validPeriod;
	}

}
