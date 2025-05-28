package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云智能租赁风控查询
 *
 * @author auto create
 * @since 1.0, 2024-12-30 21:04:17
 */
public class AlipayCloudTraasCloudriskRentriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1217328937798995415L;

	/**
	 * 身份证号 当前字段已废弃(请使用 customer_type 和 customer_id 参数)
	 */
	@ApiField("cert_no")
	@Deprecated
	private String certNo;

	/**
	 * 客户详情
	 */
	@ApiField("customer_detail")
	private RentCustomerDetail customerDetail;

	/**
	 * 客户唯一标识：
当 customer_type = MOBILE 时，填写11位手机号；
当 customer_type = CERT_NO 时，填写18位或15位身份证号；
当 customer_type = MOBILE_SHA256 时，填写手机号的 SHA256 值；
当 customer_type = CERT_NO_SHA256 时，填写证件号的 SHA256 值；
当 customer_type = ALIPAY_USER_ID 时，填写支付宝账户 UserId；
当 customer_type = ALIPAY_OPEN_ID 时，填写支付宝账户 OpenId
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 客户支付宝OpenId 当前字段已废弃(针对用户标识字段，在入参上做收口，建议统一用customer_id+customer_type的方式)
	 */
	@ApiField("customer_open_id")
	@Deprecated
	private String customerOpenId;

	/**
	 * 客户标识类型
	 */
	@ApiField("customer_type")
	private String customerType;

	/**
	 * 配送详情
	 */
	@ApiField("delivery_detail")
	private RentDeliveryDetail deliveryDetail;

	/**
	 * 商品详情
	 */
	@ApiField("item_detail")
	private RentItemDetail itemDetail;

	/**
	 * 手机号 当前字段已废弃(请使用 customer_type 和 customer_id 参数)
	 */
	@ApiField("mobile")
	@Deprecated
	private String mobile;

	/**
	 * 外部订单号，商家需保证在商户端不重复。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 价格详情
	 */
	@ApiField("price_detail")
	private RentPriceDetail priceDetail;

	/**
	 * 风险业务场景
	 */
	@ApiField("risk_biz_scene")
	private String riskBizScene;

	/**
	 * 订单下单渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户授权
	 */
	@ApiField("user_authorization")
	private String userAuthorization;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public RentCustomerDetail getCustomerDetail() {
		return this.customerDetail;
	}
	public void setCustomerDetail(RentCustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerOpenId() {
		return this.customerOpenId;
	}
	public void setCustomerOpenId(String customerOpenId) {
		this.customerOpenId = customerOpenId;
	}

	public String getCustomerType() {
		return this.customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public RentDeliveryDetail getDeliveryDetail() {
		return this.deliveryDetail;
	}
	public void setDeliveryDetail(RentDeliveryDetail deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}

	public RentItemDetail getItemDetail() {
		return this.itemDetail;
	}
	public void setItemDetail(RentItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public RentPriceDetail getPriceDetail() {
		return this.priceDetail;
	}
	public void setPriceDetail(RentPriceDetail priceDetail) {
		this.priceDetail = priceDetail;
	}

	public String getRiskBizScene() {
		return this.riskBizScene;
	}
	public void setRiskBizScene(String riskBizScene) {
		this.riskBizScene = riskBizScene;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserAuthorization() {
		return this.userAuthorization;
	}
	public void setUserAuthorization(String userAuthorization) {
		this.userAuthorization = userAuthorization;
	}

}
