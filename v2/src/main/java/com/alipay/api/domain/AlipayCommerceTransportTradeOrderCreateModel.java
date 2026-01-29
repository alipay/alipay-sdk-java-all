package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易创单
 *
 * @author auto create
 * @since 1.0, 2026-01-26 17:52:42
 */
public class AlipayCommerceTransportTradeOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3117817116391427674L;

	/**
	 * 订单描述信息
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 可打折金额。 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。 如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入。
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 商品名字
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 区分业务类型字段
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/**
	 * 支付宝服务器主动通知商户服务器里指定的页面 http/https 路径
	 */
	@ApiField("notify")
	private String notify;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 和订单状态同步订单号一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代扣账期订单号
	 */
	@ApiField("out_sub_biz_no")
	private String outSubBizNo;

	/**
	 * 平台商uniqueCod
	 */
	@ApiField("partner_unique_code")
	private String partnerUniqueCode;

	/**
	 * 业务参数
	 */
	@ApiField("portable")
	private String portable;

	/**
	 * 商品价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量，单位辆
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 二级商户号
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 二级商户名字
	 */
	@ApiField("sub_merchant_name")
	private String subMerchantName;

	/**
	 * 二级商户的服务描述
	 */
	@ApiField("sub_merchant_service_description")
	private String subMerchantServiceDescription;

	/**
	 * 二级商户的服务名称
	 */
	@ApiField("sub_merchant_service_name")
	private String subMerchantServiceName;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额。 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。 如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入。
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 商户签约号
	 */
	@ApiField("withholding_agreement_no")
	private String withholdingAgreementNo;

	/**
	 * 代扣详情信息
	 */
	@ApiField("withholding_detail")
	private WithholdingDetail withholdingDetail;

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getMerchantBizType() {
		return this.merchantBizType;
	}
	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}

	public String getNotify() {
		return this.notify;
	}
	public void setNotify(String notify) {
		this.notify = notify;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutSubBizNo() {
		return this.outSubBizNo;
	}
	public void setOutSubBizNo(String outSubBizNo) {
		this.outSubBizNo = outSubBizNo;
	}

	public String getPartnerUniqueCode() {
		return this.partnerUniqueCode;
	}
	public void setPartnerUniqueCode(String partnerUniqueCode) {
		this.partnerUniqueCode = partnerUniqueCode;
	}

	public String getPortable() {
		return this.portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSubMerchantName() {
		return this.subMerchantName;
	}
	public void setSubMerchantName(String subMerchantName) {
		this.subMerchantName = subMerchantName;
	}

	public String getSubMerchantServiceDescription() {
		return this.subMerchantServiceDescription;
	}
	public void setSubMerchantServiceDescription(String subMerchantServiceDescription) {
		this.subMerchantServiceDescription = subMerchantServiceDescription;
	}

	public String getSubMerchantServiceName() {
		return this.subMerchantServiceName;
	}
	public void setSubMerchantServiceName(String subMerchantServiceName) {
		this.subMerchantServiceName = subMerchantServiceName;
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

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWithholdingAgreementNo() {
		return this.withholdingAgreementNo;
	}
	public void setWithholdingAgreementNo(String withholdingAgreementNo) {
		this.withholdingAgreementNo = withholdingAgreementNo;
	}

	public WithholdingDetail getWithholdingDetail() {
		return this.withholdingDetail;
	}
	public void setWithholdingDetail(WithholdingDetail withholdingDetail) {
		this.withholdingDetail = withholdingDetail;
	}

}
