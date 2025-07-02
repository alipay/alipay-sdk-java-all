package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款业务单代扣支付
 *
 * @author auto create
 * @since 1.0, 2025-06-19 13:46:04
 */
public class AlipayCommerceWithholdrepayorderTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 8286262752214256227L;

	/**
	 * 代扣信息。 代扣业务需要传入的协议相关信息，使用本参数传入协议号后scene和auth_code不需要再传值。
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 业务扩展参数，二级参数字段会动态新增
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	/**
	 * 订单包含的商品列表信息，json格式。
	 */
	@ApiField("goods_detail")
	private GoodsDetail goodsDetail;

	/**
	 * 商户订单号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付相关参数
	 */
	@ApiField("pay_params")
	private IndustryPayParams payParams;

	/**
	 * 产品码。 商家和支付宝签约的产品码。 注意：本参数必填，且固定值为GENERAL_WITHHOLDING。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 优惠明细参数，通过此属性补充营销参数
	 */
	@ApiField("promo_params")
	private IndustryPromoParam promoParams;

	/**
	 * 返回参数选项。 商户通过传递该参数来定制同步需要额外返回的信息字段，数组格式。包括但不限于：["fund_bill_list","voucher_detail_list","enterprise_pay_info","discount_goods_detail","discount_amount","mdiscount_amount"]
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	/**
	 * 扣款条目，传入对应还款计划的扣款信息
	 */
	@ApiListField("repay_plan")
	@ApiField("industry_withhold_plan_d_t_o")
	private List<IndustryWithholdPlanDTO> repayPlan;

	/**
	 * 卖家支付宝用户ID。 当需要指定收款账号时，通过该参数传入，如果该值为空，则默认为商户签约账号对应的支付宝用户ID。 收款账号优先级规则：门店绑定的收款账户>请求传入的seller_id>商户签约账号对应的支付宝用户ID； 注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致； 如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系； 支付宝预授权和新当面资金授权场景下必填。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单标题。 注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额。 单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}
	public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

	public ExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public GoodsDetail getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(GoodsDetail goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public IndustryPayParams getPayParams() {
		return this.payParams;
	}
	public void setPayParams(IndustryPayParams payParams) {
		this.payParams = payParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public IndustryPromoParam getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(IndustryPromoParam promoParams) {
		this.promoParams = promoParams;
	}

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
	}

	public List<IndustryWithholdPlanDTO> getRepayPlan() {
		return this.repayPlan;
	}
	public void setRepayPlan(List<IndustryWithholdPlanDTO> repayPlan) {
		this.repayPlan = repayPlan;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
