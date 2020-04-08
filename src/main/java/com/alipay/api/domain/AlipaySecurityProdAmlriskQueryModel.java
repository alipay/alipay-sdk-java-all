package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 该API用于外部商户准入时的反洗钱风险分析。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
 */
public class AlipaySecurityProdAmlriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3854556617341114261L;

	/**
	 * 办公地址
	 */
	@ApiField("business_address")
	private String businessAddress;

	/**
	 * 标识该次反洗钱风险分析事件请求的id，商户应保证此id唯一。
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 与商户相关个体的信息列表，可以有0个到多个。
	 */
	@ApiListField("individual_list")
	@ApiField("individual_info")
	private List<IndividualInfo> individualList;

	/**
	 * 公司名称、类型、性质
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 该商户准入申请的id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 公司注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 公司注册号
	 */
	@ApiField("registration_number")
	private String registrationNumber;

	public String getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public List<IndividualInfo> getIndividualList() {
		return this.individualList;
	}
	public void setIndividualList(List<IndividualInfo> individualList) {
		this.individualList = individualList;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
