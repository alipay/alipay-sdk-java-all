package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险统一投保
 *
 * @author auto create
 * @since 1.0, 2021-07-08 14:23:49
 */
public class AnttechBlockchainDefinInsuranceUnifiedApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2483661237583919153L;

	/**
	 * 附加条款信息
	 */
	@ApiField("additional_item")
	private String additionalItem;

	/**
	 * 投保人证件号码
	 */
	@ApiField("apply_card_code")
	private String applyCardCode;

	/**
	 * 投保人证件类型
01-居民身份证
03-营业执照
	 */
	@ApiField("apply_card_type")
	private String applyCardType;

	/**
	 * 投保人（企业或者自然人）名称
	 */
	@ApiField("apply_name")
	private String applyName;

	/**
	 * 中台客户服务中的业务线编码
	 */
	@ApiField("defin_business_code")
	private String definBusinessCode;

	/**
	 * 平台在客户服务中心的会员类型
	 */
	@ApiField("defin_platform_access_type")
	private String definPlatformAccessType;

	/**
	 * 保险止期
	 */
	@ApiField("insure_end_date")
	private Date insureEndDate;

	/**
	 * 保险起期
	 */
	@ApiField("insure_start_date")
	private Date insureStartDate;

	/**
	 * 被保人证件号码
	 */
	@ApiField("insured_card_code")
	private String insuredCardCode;

	/**
	 * 被保人证件类型：
01-居民身份证
03-营业执照
	 */
	@ApiField("insured_card_type")
	private String insuredCardType;

	/**
	 * 被保人姓名
	 */
	@ApiField("insured_name")
	private String insuredName;

	/**
	 * 主险条款代码
	 */
	@ApiField("main_item_code")
	private String mainItemCode;

	/**
	 * 主险条款内容
	 */
	@ApiField("main_item_content")
	private String mainItemContent;

	/**
	 * 客户平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 保费，单位为：元（保留两位小数）
	 */
	@ApiField("premium")
	private String premium;

	/**
	 * 产品运营中心开通的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 费率，最多兼容9位小数
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 业务线内全局唯一请求号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 特别约定
	 */
	@ApiField("special")
	private String special;

	/**
	 * 标的信息
	 */
	@ApiField("subject_information")
	private String subjectInformation;

	public String getAdditionalItem() {
		return this.additionalItem;
	}
	public void setAdditionalItem(String additionalItem) {
		this.additionalItem = additionalItem;
	}

	public String getApplyCardCode() {
		return this.applyCardCode;
	}
	public void setApplyCardCode(String applyCardCode) {
		this.applyCardCode = applyCardCode;
	}

	public String getApplyCardType() {
		return this.applyCardType;
	}
	public void setApplyCardType(String applyCardType) {
		this.applyCardType = applyCardType;
	}

	public String getApplyName() {
		return this.applyName;
	}
	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public String getDefinBusinessCode() {
		return this.definBusinessCode;
	}
	public void setDefinBusinessCode(String definBusinessCode) {
		this.definBusinessCode = definBusinessCode;
	}

	public String getDefinPlatformAccessType() {
		return this.definPlatformAccessType;
	}
	public void setDefinPlatformAccessType(String definPlatformAccessType) {
		this.definPlatformAccessType = definPlatformAccessType;
	}

	public Date getInsureEndDate() {
		return this.insureEndDate;
	}
	public void setInsureEndDate(Date insureEndDate) {
		this.insureEndDate = insureEndDate;
	}

	public Date getInsureStartDate() {
		return this.insureStartDate;
	}
	public void setInsureStartDate(Date insureStartDate) {
		this.insureStartDate = insureStartDate;
	}

	public String getInsuredCardCode() {
		return this.insuredCardCode;
	}
	public void setInsuredCardCode(String insuredCardCode) {
		this.insuredCardCode = insuredCardCode;
	}

	public String getInsuredCardType() {
		return this.insuredCardType;
	}
	public void setInsuredCardType(String insuredCardType) {
		this.insuredCardType = insuredCardType;
	}

	public String getInsuredName() {
		return this.insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getMainItemCode() {
		return this.mainItemCode;
	}
	public void setMainItemCode(String mainItemCode) {
		this.mainItemCode = mainItemCode;
	}

	public String getMainItemContent() {
		return this.mainItemContent;
	}
	public void setMainItemContent(String mainItemContent) {
		this.mainItemContent = mainItemContent;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPremium() {
		return this.premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSpecial() {
		return this.special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}

	public String getSubjectInformation() {
		return this.subjectInformation;
	}
	public void setSubjectInformation(String subjectInformation) {
		this.subjectInformation = subjectInformation;
	}

}
