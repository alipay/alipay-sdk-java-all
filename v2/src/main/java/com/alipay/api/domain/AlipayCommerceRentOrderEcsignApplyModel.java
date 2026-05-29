package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁电子合同签约申请
 *
 * @author auto create
 * @since 1.0, 2026-05-21 19:37:45
 */
public class AlipayCommerceRentOrderEcsignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2151669775629238418L;

	/**
	 * 用于填充合同模板的信息，json格式字符串
	 */
	@ApiField("additional_info")
	private String additionalInfo;

	/**
	 * 业务流水号，发起一次签约申请的唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * null
	 */
	@ApiListField("ec_template_codes")
	@ApiField("string")
	private List<String> ecTemplateCodes;

	/**
	 * 支付宝服务器主动通知商户服务器里指定的页面http/https路径
	 */
	@ApiField("ecsign_notify_url")
	private String ecsignNotifyUrl;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * null
	 */
	@ApiListField("signers")
	@ApiField("rent_ec_signer_d_t_o")
	private List<RentEcSignerDTO> signers;

	public String getAdditionalInfo() {
		return this.additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public List<String> getEcTemplateCodes() {
		return this.ecTemplateCodes;
	}
	public void setEcTemplateCodes(List<String> ecTemplateCodes) {
		this.ecTemplateCodes = ecTemplateCodes;
	}

	public String getEcsignNotifyUrl() {
		return this.ecsignNotifyUrl;
	}
	public void setEcsignNotifyUrl(String ecsignNotifyUrl) {
		this.ecsignNotifyUrl = ecsignNotifyUrl;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<RentEcSignerDTO> getSigners() {
		return this.signers;
	}
	public void setSigners(List<RentEcSignerDTO> signers) {
		this.signers = signers;
	}

}
