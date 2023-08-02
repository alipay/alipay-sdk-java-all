package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用客户信用评估初始化
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:17:22
 */
public class ZhimaCreditEpSceneRatingInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7383899969796956218L;

	/**
	 * 申请的信用额度，单位为分（人民币），整型。
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
	 * 评估类型。为空时默认为 CUSTOMER（对客户进行评估）。枚举如下：
* CUSTOMER：对客户进行评估。
* TRADE：对交易进行评估。
	 */
	@ApiField("evaluate_type")
	private String evaluateType;

	/**
	 * 客户经营行业分类。请参考<a href="https://docs.open.alipay.com/11270#s2">客户经营行业分类</a>
	 */
	@ApiField("m_category")
	private String mCategory;

	/**
	 * 会员类型。为空时默认为 INDIVIDUAL_BUSINESS（商家类型）进行评估。枚举如下：
* ENTERPRISE：评估的会员类型为企业；
* INDIVIDUAL_BUSINESS：评估的会员类型为商家。
	 */
	@ApiField("member_type")
	private String memberType;

	/**
	 * 商户请求订单号，由商户自定义且必须在当前PID下唯一。用于唯一标识商户发起的一次请求。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品码。固定为 w1010100001000003531。
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
