package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收单个商品模型
 *
 * @author auto create
 * @since 1.0, 2025-03-04 10:33:30
 */
public class RecycleItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3735176454825474341L;

	/**
	 * 预估价格，单位元
	 */
	@ApiField("assess_amount")
	private String assessAmount;

	/**
	 * 预估最高金额，单位元
	 */
	@ApiField("assess_amount_max")
	private String assessAmountMax;

	/**
	 * 预估最低金额，单位元
	 */
	@ApiField("assess_amount_min")
	private String assessAmountMin;

	/**
	 * 品牌code
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品类code
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 可预付金额，单位元
	 */
	@ApiField("pre_assess_amount")
	private String preAssessAmount;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 单个回收商品ID
	 */
	@ApiField("product_item_id")
	private String productItemId;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 回收问题
	 */
	@ApiListField("question_list")
	@ApiField("recycle_question")
	private List<RecycleQuestion> questionList;

	public String getAssessAmount() {
		return this.assessAmount;
	}
	public void setAssessAmount(String assessAmount) {
		this.assessAmount = assessAmount;
	}

	public String getAssessAmountMax() {
		return this.assessAmountMax;
	}
	public void setAssessAmountMax(String assessAmountMax) {
		this.assessAmountMax = assessAmountMax;
	}

	public String getAssessAmountMin() {
		return this.assessAmountMin;
	}
	public void setAssessAmountMin(String assessAmountMin) {
		this.assessAmountMin = assessAmountMin;
	}

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getPreAssessAmount() {
		return this.preAssessAmount;
	}
	public void setPreAssessAmount(String preAssessAmount) {
		this.preAssessAmount = preAssessAmount;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductItemId() {
		return this.productItemId;
	}
	public void setProductItemId(String productItemId) {
		this.productItemId = productItemId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<RecycleQuestion> getQuestionList() {
		return this.questionList;
	}
	public void setQuestionList(List<RecycleQuestion> questionList) {
		this.questionList = questionList;
	}

}
