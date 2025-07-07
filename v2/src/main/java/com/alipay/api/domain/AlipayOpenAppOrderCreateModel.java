package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 端外应用创单
 *
 * @author auto create
 * @since 1.0, 2024-12-03 13:44:13
 */
public class AlipayOpenAppOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5853494586125138213L;

	/**
	 * 芝麻信息
	 */
	@ApiField("credit_info")
	private CreditInfoDTO creditInfo;

	/**
	 * 订单类型
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/**
	 * 订单信息
	 */
	@ApiField("order_detail")
	private MiniOrderDetailDTO orderDetail;

	/**
	 * 商户订单号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 商家小程序对应的订单详情页路径地址 value。仅需传入小程序页面路径即可。同一笔订单的链接必须与第一次传入的地址相同，且需是小程序内部页面路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 当需要指定收款账号时，通过该参数传入，如果该值为空，则默认为商户签约账号对应的支付宝用户ID。  收款账号优先级规则：门店绑定的收款账户>请求传入的seller_id>商户签约账号对应的支付宝用户ID；  注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致；  如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系；本地商品无需填写
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 阶段付款计划
	 */
	@ApiField("stage_pay_plans")
	private StagePayPlanDTO stagePayPlans;

	/**
	 * 二级商户信息
	 */
	@ApiField("sub_merchant")
	private SubMerchantDTO subMerchant;

	/**
	 * 注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("title")
	private String title;

	public CreditInfoDTO getCreditInfo() {
		return this.creditInfo;
	}
	public void setCreditInfo(CreditInfoDTO creditInfo) {
		this.creditInfo = creditInfo;
	}

	public String getMerchantBizType() {
		return this.merchantBizType;
	}
	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}

	public MiniOrderDetailDTO getOrderDetail() {
		return this.orderDetail;
	}
	public void setOrderDetail(MiniOrderDetailDTO orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public StagePayPlanDTO getStagePayPlans() {
		return this.stagePayPlans;
	}
	public void setStagePayPlans(StagePayPlanDTO stagePayPlans) {
		this.stagePayPlans = stagePayPlans;
	}

	public SubMerchantDTO getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchantDTO subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
