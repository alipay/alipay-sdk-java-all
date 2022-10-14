package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融科技预付订单创建并支付
 *
 * @author auto create
 * @since 1.0, 2019-07-08 21:12:10
 */
public class AlipayOpenOperationBizfeeAftechCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 4535311731952192634L;

	/**
	 * 系统/应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 订单币种
币种数字编码。
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 客户信息（JSON对象） 包含principalType主体类型、principalId主体Id、extInfo扩展信息等字段。其中，需要从extInfo透传消费的key有：relEntityId关联主体Id。
	 */
	@ApiField("customer")
	private String customer;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * 机构OU编码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 订单金额
单位元，最多两位小数。
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 扩展属性（Map的JSON对象）
key和value中不能有英文逗号及等于符号。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 可退金额
可退金额=本次订单金额+前序订单转移金额。
单位元，最多两位小数。
	 */
	@ApiField("refundable_amount")
	private String refundableAmount;

	/**
	 * 租户Id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomer() {
		return this.customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getRefundableAmount() {
		return this.refundableAmount;
	}
	public void setRefundableAmount(String refundableAmount) {
		this.refundableAmount = refundableAmount;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
