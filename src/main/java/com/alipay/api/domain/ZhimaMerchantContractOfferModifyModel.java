package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定发约单修改接口
 *
 * @author auto create
 * @since 1.0, 2020-02-24 14:34:21
 */
public class ZhimaMerchantContractOfferModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2778112554228878662L;

	/**
	 * 约定内容描述
	 */
	@ApiField("contract_content")
	private String contractContent;

	/**
	 * 合约主体描述，用于呈现支付端内约定详情中的主体描述
	 */
	@ApiField("contract_principal_desc")
	private String contractPrincipalDesc;

	/**
	 * 合约主体图片链接
	 */
	@ApiField("contract_principal_logo")
	private String contractPrincipalLogo;

	/**
	 * 去履约完成时点击的链接地址
	 */
	@ApiField("fufilment_callback_url")
	private String fufilmentCallbackUrl;

	/**
	 * 履约需要完成的事项描述
	 */
	@ApiField("fufilment_desc")
	private String fufilmentDesc;

	/**
	 * 发约创建者主体id(商户pid/用户芝麻id/支付宝用户id/淘宝用户id)
	 */
	@ApiField("offer_creater_id")
	private String offerCreaterId;

	/**
	 * 发约创建者类型： MERCHANT:商户 ZHIMA_ROLE:芝麻用户 ALIPAY_ROLE:支付宝用户 TAOBAO_ROLE:淘宝用户
	 */
	@ApiField("offer_creater_type")
	private String offerCreaterType;

	/**
	 * 发约单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 信用服务id，需要与芝麻技术确定此值
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getContractContent() {
		return this.contractContent;
	}
	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

	public String getContractPrincipalDesc() {
		return this.contractPrincipalDesc;
	}
	public void setContractPrincipalDesc(String contractPrincipalDesc) {
		this.contractPrincipalDesc = contractPrincipalDesc;
	}

	public String getContractPrincipalLogo() {
		return this.contractPrincipalLogo;
	}
	public void setContractPrincipalLogo(String contractPrincipalLogo) {
		this.contractPrincipalLogo = contractPrincipalLogo;
	}

	public String getFufilmentCallbackUrl() {
		return this.fufilmentCallbackUrl;
	}
	public void setFufilmentCallbackUrl(String fufilmentCallbackUrl) {
		this.fufilmentCallbackUrl = fufilmentCallbackUrl;
	}

	public String getFufilmentDesc() {
		return this.fufilmentDesc;
	}
	public void setFufilmentDesc(String fufilmentDesc) {
		this.fufilmentDesc = fufilmentDesc;
	}

	public String getOfferCreaterId() {
		return this.offerCreaterId;
	}
	public void setOfferCreaterId(String offerCreaterId) {
		this.offerCreaterId = offerCreaterId;
	}

	public String getOfferCreaterType() {
		return this.offerCreaterType;
	}
	public void setOfferCreaterType(String offerCreaterType) {
		this.offerCreaterType = offerCreaterType;
	}

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
