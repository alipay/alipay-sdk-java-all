package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用客户信用评估初始化
 *
 * @author auto create
 * @since 1.0, 2019-04-17 17:01:46
 */
public class ZhimaCreditEpSceneRatingInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4322939831173833522L;

	/**
	 * 申请的信用额度，单位为人民币分，整型。
	 */
	@ApiField("apply_amount")
	private Long applyAmount;

	/**
	 * 特定业务场景传输的扩展参数，以JSON形式传输。具体业务场景需要传入参数请参考<a href="https://docs.open.alipay.com/11270#s3">业务场景传输的扩展参数</a>
	 */
	@ApiField("biz_ext_param")
	private String bizExtParam;

	/**
	 * 企业信用类目。请参考<a href= "https://docs.open.alipay.com/11270#s0">企业信用类目</a>
	 */
	@ApiField("credit_category")
	private String creditCategory;

	/**
	 * 企业证件号，如果MemberType=ENTERPRISE,支持传入企业证件号来指定企业认证。
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业名称，如果MemberType=ENTERPRISE,支持传入企业名称进行指定企业认证。
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 评估类型。如果是对客户进行评估填写CUSTOMER；如果是对交易进行评估填写TRADE;
不填默认为CUSTOMER
	 */
	@ApiField("evaluate_type")
	private String evaluateType;

	/**
	 * 客户经营行业分类。请参考<a href="https://docs.open.alipay.com/11270#s2">客户经营行业分类</a>
	 */
	@ApiField("m_category")
	private String mCategory;

	/**
	 * 会员类型。如果是评估的会员类型为企业填写ENTERPRISE；如果是商家填写INDIVIDUAL_BUSINESS。可空，如果为空则默认为INDIVIDUAL_BUSINESS即默认商家类型进行评估。
	 */
	@ApiField("member_type")
	private String memberType;

	/**
	 * 商户请求订单号，必须唯一。用于唯一标识商户发起的一次请求。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品码。请填写示例值里提供的值。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户userId，为2088开头的支付宝用户唯一id。获取方式开发者可以参考<a href="https://docs.open.alipay.com/284/106001">获取会员信息</a>。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(Long applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getBizExtParam() {
		return this.bizExtParam;
	}
	public void setBizExtParam(String bizExtParam) {
		this.bizExtParam = bizExtParam;
	}

	public String getCreditCategory() {
		return this.creditCategory;
	}
	public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEvaluateType() {
		return this.evaluateType;
	}
	public void setEvaluateType(String evaluateType) {
		this.evaluateType = evaluateType;
	}

	public String getmCategory() {
		return this.mCategory;
	}
	public void setmCategory(String mCategory) {
		this.mCategory = mCategory;
	}

	public String getMemberType() {
		return this.memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
