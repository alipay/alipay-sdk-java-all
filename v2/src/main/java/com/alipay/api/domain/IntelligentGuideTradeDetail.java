package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户单门店下线下交易数据详细信息，按照给定格式上传
 *
 * @author auto create
 * @since 1.0, 2020-04-13 17:20:14
 */
public class IntelligentGuideTradeDetail extends AlipayObject {

	private static final long serialVersionUID = 1551766166865476669L;

	/**
	 * 非必填，商户会员的会员卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 线下到点客户来源类型，非必填项，商户可自填
	 */
	@ApiField("customer_source")
	private String customerSource;

	/**
	 * 客户类型，支持枚举值：轮牌 - LP、指牌 - ZP。非必填
	 */
	@ApiField("customer_type")
	private String customerType;

	/**
	 * 交易发生时间，精确到天。
	 */
	@ApiField("date")
	private String date;

	/**
	 * 第五推荐语，同上
	 */
	@ApiField("fifth_recommendation")
	private String fifthRecommendation;

	/**
	 * 商户服务项目产品的一级类目，是一个枚举enum类型。项目/商品/卡项。单选、必填。
	 */
	@ApiField("first_category")
	private String firstCategory;

	/**
	 * 第一推荐语，选填项。用于商家描述产品优势，推荐理由。
	 */
	@ApiField("first_recommendation")
	private String firstRecommendation;

	/**
	 * 第四推荐语，同上
	 */
	@ApiField("fourth_recommendation")
	private String fourthRecommendation;

	/**
	 * 通过智能导购查询智能推荐的推荐记录ID，用于反馈给算法进行模型校准。非必填
	 */
	@ApiField("guide_record_id")
	private String guideRecordId;

	/**
	 * 商户提供服务的商品名称(三级类目)，是二级类目下的细化具体项目品种名称。
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 交易用户的手机号，校验纯数字，11位。
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 原价金额。单位：元。精确到小数点后两位。例：11.11。校验数字，大于0。
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 支付方式，多种类型可用逗号分隔
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 实际消费金额。单位：元。精确到小数点后两位。例：11.11。校验数字，大于0。实际消费金额需要小于等于原价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商户提供服务的二级类目，是一级类目下的细化项目名称
	 */
	@ApiField("second_category")
	private String secondCategory;

	/**
	 * 第二推荐语，选填项。用于商家描述产品优势，推荐理由。
	 */
	@ApiField("second_recommendation")
	private String secondRecommendation;

	/**
	 * 服务员工名，或员工ID，非必填
	 */
	@ApiField("service_staff")
	private String serviceStaff;

	/**
	 * 第三推荐语，选填项。用于商家描述产品优势，推荐理由。
	 */
	@ApiField("third_recommendation")
	private String thirdRecommendation;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCustomerSource() {
		return this.customerSource;
	}
	public void setCustomerSource(String customerSource) {
		this.customerSource = customerSource;
	}

	public String getCustomerType() {
		return this.customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getFifthRecommendation() {
		return this.fifthRecommendation;
	}
	public void setFifthRecommendation(String fifthRecommendation) {
		this.fifthRecommendation = fifthRecommendation;
	}

	public String getFirstCategory() {
		return this.firstCategory;
	}
	public void setFirstCategory(String firstCategory) {
		this.firstCategory = firstCategory;
	}

	public String getFirstRecommendation() {
		return this.firstRecommendation;
	}
	public void setFirstRecommendation(String firstRecommendation) {
		this.firstRecommendation = firstRecommendation;
	}

	public String getFourthRecommendation() {
		return this.fourthRecommendation;
	}
	public void setFourthRecommendation(String fourthRecommendation) {
		this.fourthRecommendation = fourthRecommendation;
	}

	public String getGuideRecordId() {
		return this.guideRecordId;
	}
	public void setGuideRecordId(String guideRecordId) {
		this.guideRecordId = guideRecordId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSecondCategory() {
		return this.secondCategory;
	}
	public void setSecondCategory(String secondCategory) {
		this.secondCategory = secondCategory;
	}

	public String getSecondRecommendation() {
		return this.secondRecommendation;
	}
	public void setSecondRecommendation(String secondRecommendation) {
		this.secondRecommendation = secondRecommendation;
	}

	public String getServiceStaff() {
		return this.serviceStaff;
	}
	public void setServiceStaff(String serviceStaff) {
		this.serviceStaff = serviceStaff;
	}

	public String getThirdRecommendation() {
		return this.thirdRecommendation;
	}
	public void setThirdRecommendation(String thirdRecommendation) {
		this.thirdRecommendation = thirdRecommendation;
	}

}
