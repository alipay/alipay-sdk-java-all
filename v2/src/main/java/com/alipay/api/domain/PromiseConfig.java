package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务守护配置
 *
 * @author auto create
 * @since 1.0, 2019-11-15 09:40:23
 */
public class PromiseConfig extends AlipayObject {

	private static final long serialVersionUID = 4447226549223693993L;

	/**
	 * 提醒用户完成行为的守约方式，可取值：promise_link(跳转到去守约页面完成守约)；promise_remind(文字提醒守约)。
	 */
	@ApiField("action_operation_type")
	private String actionOperationType;

	/**
	 * 提醒用户完成行为的守约方式的取值，值为去守约页面的url或者说明文案。
	 */
	@ApiField("action_operation_value")
	private String actionOperationValue;

	/**
	 * 信用服务履约单买断按钮的url
	 */
	@ApiField("button_buy")
	private String buttonBuy;

	/**
	 * 信用服务履约单提前结束按钮的url
	 */
	@ApiField("button_end")
	private String buttonEnd;

	/**
	 * 信用服务履约单分期按钮的url
	 */
	@ApiField("button_installment")
	private String buttonInstallment;

	/**
	 * 信用服务履约单延期按钮的url
	 */
	@ApiField("button_postpone")
	private String buttonPostpone;

	/**
	 * 信用服务履约单维修按钮的url
	 */
	@ApiField("button_repair")
	private String buttonRepair;

	/**
	 * 信用服务履约单换新按钮的url
	 */
	@ApiField("button_replace")
	private String buttonReplace;

	/**
	 * 合约履约周期，以天为单位。
	 */
	@ApiField("fulfillment_days")
	private Long fulfillmentDays;

	/**
	 * 商户客服电话，为必填字段，需为合法电话号码。
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	/**
	 * 商户主页链接，取值为商户小程序地址或H5页面地址。
	 */
	@ApiField("merchant_service_url")
	private String merchantServiceUrl;

	/**
	 * 待还款的守约方式，可取值：promise_link(跳转到去守约页面完成守约)；promise_remind(文字提醒守约)。
	 */
	@ApiField("money_operation_type")
	private String moneyOperationType;

	/**
	 * 待还款守约方式的取值，值为去守约页面的url或者说明文案。
	 */
	@ApiField("money_operation_value")
	private String moneyOperationValue;

	/**
	 * 待还物的守约方式，可取值：promise_link(跳转到去守约页面完成守约)；promise_remind(文字提醒守约)。
	 */
	@ApiField("product_operation_type")
	private String productOperationType;

	/**
	 * 待还物守约方式的取值，值为去守约页面的url或者说明文案。
	 */
	@ApiField("product_operation_value")
	private String productOperationValue;

	public String getActionOperationType() {
		return this.actionOperationType;
	}
	public void setActionOperationType(String actionOperationType) {
		this.actionOperationType = actionOperationType;
	}

	public String getActionOperationValue() {
		return this.actionOperationValue;
	}
	public void setActionOperationValue(String actionOperationValue) {
		this.actionOperationValue = actionOperationValue;
	}

	public String getButtonBuy() {
		return this.buttonBuy;
	}
	public void setButtonBuy(String buttonBuy) {
		this.buttonBuy = buttonBuy;
	}

	public String getButtonEnd() {
		return this.buttonEnd;
	}
	public void setButtonEnd(String buttonEnd) {
		this.buttonEnd = buttonEnd;
	}

	public String getButtonInstallment() {
		return this.buttonInstallment;
	}
	public void setButtonInstallment(String buttonInstallment) {
		this.buttonInstallment = buttonInstallment;
	}

	public String getButtonPostpone() {
		return this.buttonPostpone;
	}
	public void setButtonPostpone(String buttonPostpone) {
		this.buttonPostpone = buttonPostpone;
	}

	public String getButtonRepair() {
		return this.buttonRepair;
	}
	public void setButtonRepair(String buttonRepair) {
		this.buttonRepair = buttonRepair;
	}

	public String getButtonReplace() {
		return this.buttonReplace;
	}
	public void setButtonReplace(String buttonReplace) {
		this.buttonReplace = buttonReplace;
	}

	public Long getFulfillmentDays() {
		return this.fulfillmentDays;
	}
	public void setFulfillmentDays(Long fulfillmentDays) {
		this.fulfillmentDays = fulfillmentDays;
	}

	public String getMerchantServicePhone() {
		return this.merchantServicePhone;
	}
	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}

	public String getMerchantServiceUrl() {
		return this.merchantServiceUrl;
	}
	public void setMerchantServiceUrl(String merchantServiceUrl) {
		this.merchantServiceUrl = merchantServiceUrl;
	}

	public String getMoneyOperationType() {
		return this.moneyOperationType;
	}
	public void setMoneyOperationType(String moneyOperationType) {
		this.moneyOperationType = moneyOperationType;
	}

	public String getMoneyOperationValue() {
		return this.moneyOperationValue;
	}
	public void setMoneyOperationValue(String moneyOperationValue) {
		this.moneyOperationValue = moneyOperationValue;
	}

	public String getProductOperationType() {
		return this.productOperationType;
	}
	public void setProductOperationType(String productOperationType) {
		this.productOperationType = productOperationType;
	}

	public String getProductOperationValue() {
		return this.productOperationValue;
	}
	public void setProductOperationValue(String productOperationValue) {
		this.productOperationValue = productOperationValue;
	}

}
