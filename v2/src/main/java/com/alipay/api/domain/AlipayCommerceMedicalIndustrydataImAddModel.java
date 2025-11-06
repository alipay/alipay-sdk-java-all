package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * im群聊加入
 *
 * @author auto create
 * @since 1.0, 2025-01-06 14:56:42
 */
public class AlipayCommerceMedicalIndustrydataImAddModel extends AlipayObject {

	private static final long serialVersionUID = 2385576233592193677L;

	/**
	 * 问诊订单回流接口出参的order_id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * out_biz_no，唯一，外部商户自有问诊订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部im会话chatId
	 */
	@ApiField("out_chat_id")
	private String outChatId;

	/**
	 * 加人列表
	 */
	@ApiListField("service_providers")
	@ApiField("service_provider")
	private List<ServiceProvider> serviceProviders;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutChatId() {
		return this.outChatId;
	}
	public void setOutChatId(String outChatId) {
		this.outChatId = outChatId;
	}

	public List<ServiceProvider> getServiceProviders() {
		return this.serviceProviders;
	}
	public void setServiceProviders(List<ServiceProvider> serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

}
