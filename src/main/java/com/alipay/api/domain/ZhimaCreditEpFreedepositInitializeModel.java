package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业免押额度申请初始化
 *
 * @author auto create
 * @since 1.0, 2019-01-17 17:06:47
 */
public class ZhimaCreditEpFreedepositInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2212364632857438938L;

	/**
	 * 业务场景，
生活号：SHENGHUOHAO
小程序:XIAOCHENGXU
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 业务来源标识，由前置跳转传递给服务商系统，服务商不需要理解，在本接口传入即可
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 法人证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 法人证件类型，大陆身份证：IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 类目
	 */
	@ApiField("credit_category")
	private String creditCategory;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业证件类型：
NATIONAL_LEGAL---工商注册号
NATIONAL_LEGAL_MERGE---社会统一信用代码
	 */
	@ApiField("ep_cert_type")
	private String epCertType;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 商户传入的跳转地址，该地址由商户调用时候传入，系统不处理，在applay接口完成处理后在biz_content内容带回，由商户系统做完回跳解析后执行redirect
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 企业会员类型，支持的类型为ENTERPRISE和INDIVIDUAL_BUSINESS。可空，不传按照默认行为，即企业身份。
	 */
	@ApiField("member_type")
	private String memberType;

	/**
	 * 商户业务流水号，确保每次业务唯一。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 法人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部请求号，用作关联使用，该号可以是前置业务产生传递给商户，需要商户验签后解析使用
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 企业免押额度申请产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求ID，如果是企业信用页面发起的，会在前置流程里面传递给商户该请求值，商户直接在本接口传递接收到的值即可
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizChannel() {
		return this.bizChannel;
	}
	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
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

	public String getEpCertType() {
		return this.epCertType;
	}
	public void setEpCertType(String epCertType) {
		this.epCertType = epCertType;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getGotoUrl() {
		return this.gotoUrl;
	}
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	public String getMemberType() {
		return this.memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
