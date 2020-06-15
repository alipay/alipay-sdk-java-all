package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定快速发约接口
 *
 * @author auto create
 * @since 1.0, 2020-03-18 19:55:07
 */
public class ZhimaMerchantContractQuickCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2485496965852135987L;

	/**
	 * 此类目为分配给商户在内容下的不同类目分类，（如直播/电影类目）
	 */
	@ApiField("category_code")
	private String categoryCode;

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
	 * 是否提供优惠券标识true/false
	 */
	@ApiField("coupon_flag")
	private String couponFlag;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 去履约完成时点击的链接地址
	 */
	@ApiField("fufilment_callback_url")
	private String fufilmentCallbackUrl;

	/**
	 * 履约需要完成次数，如看直播一次，关注店铺一次
	 */
	@ApiField("fufilment_cnt")
	private Long fufilmentCnt;

	/**
	 * 履约需要完成的事项描述
	 */
	@ApiField("fufilment_desc")
	private String fufilmentDesc;

	/**
	 * 合约周期结束时间
fufilment_period_type=default时必选
	 */
	@ApiField("fufilment_end_time")
	private String fufilmentEndTime;

	/**
	 * 履约周期类型(default:默认有限周期，需要填写开始结束时间)
	 */
	@ApiField("fufilment_period_type")
	private String fufilmentPeriodType;

	/**
	 * 合约周期开始时间
fufilment_period_type=default时必选
	 */
	@ApiField("fufilment_start_time")
	private String fufilmentStartTime;

	/**
	 * 发约创建者主体id(商户pid/用户芝麻id/支付宝用户id/淘宝用户id)
	 */
	@ApiField("offer_creater_id")
	private String offerCreaterId;

	/**
	 * 发约创建者名称,对应：
商户名称
芝麻用户名称
支付宝用户名称
淘宝用户名称
	 */
	@ApiField("offer_creater_name")
	private String offerCreaterName;

	/**
	 * 发约创建者类型：
MERCHANT:商户
ZHIMA_ROLE:芝麻用户
ALIPAY_ROLE:支付宝用户
TAOBAO_ROLE:淘宝用户
	 */
	@ApiField("offer_creater_type")
	private String offerCreaterType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部内容名称
	 */
	@ApiField("out_content_name")
	private String outContentName;

	/**
	 * 外部内容号，对应标的物id，如直播号，电影id，店铺id，节目id等
	 */
	@ApiField("out_content_no")
	private String outContentNo;

	/**
	 * 信用服务id，需要与芝麻技术确定此值
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 模板id
	 */
	@ApiField("template_no")
	private String templateNo;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

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

	public String getCouponFlag() {
		return this.couponFlag;
	}
	public void setCouponFlag(String couponFlag) {
		this.couponFlag = couponFlag;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFufilmentCallbackUrl() {
		return this.fufilmentCallbackUrl;
	}
	public void setFufilmentCallbackUrl(String fufilmentCallbackUrl) {
		this.fufilmentCallbackUrl = fufilmentCallbackUrl;
	}

	public Long getFufilmentCnt() {
		return this.fufilmentCnt;
	}
	public void setFufilmentCnt(Long fufilmentCnt) {
		this.fufilmentCnt = fufilmentCnt;
	}

	public String getFufilmentDesc() {
		return this.fufilmentDesc;
	}
	public void setFufilmentDesc(String fufilmentDesc) {
		this.fufilmentDesc = fufilmentDesc;
	}

	public String getFufilmentEndTime() {
		return this.fufilmentEndTime;
	}
	public void setFufilmentEndTime(String fufilmentEndTime) {
		this.fufilmentEndTime = fufilmentEndTime;
	}

	public String getFufilmentPeriodType() {
		return this.fufilmentPeriodType;
	}
	public void setFufilmentPeriodType(String fufilmentPeriodType) {
		this.fufilmentPeriodType = fufilmentPeriodType;
	}

	public String getFufilmentStartTime() {
		return this.fufilmentStartTime;
	}
	public void setFufilmentStartTime(String fufilmentStartTime) {
		this.fufilmentStartTime = fufilmentStartTime;
	}

	public String getOfferCreaterId() {
		return this.offerCreaterId;
	}
	public void setOfferCreaterId(String offerCreaterId) {
		this.offerCreaterId = offerCreaterId;
	}

	public String getOfferCreaterName() {
		return this.offerCreaterName;
	}
	public void setOfferCreaterName(String offerCreaterName) {
		this.offerCreaterName = offerCreaterName;
	}

	public String getOfferCreaterType() {
		return this.offerCreaterType;
	}
	public void setOfferCreaterType(String offerCreaterType) {
		this.offerCreaterType = offerCreaterType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutContentName() {
		return this.outContentName;
	}
	public void setOutContentName(String outContentName) {
		this.outContentName = outContentName;
	}

	public String getOutContentNo() {
		return this.outContentNo;
	}
	public void setOutContentNo(String outContentNo) {
		this.outContentNo = outContentNo;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

}
