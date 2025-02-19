package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝租车保障服务
 *
 * @author auto create
 * @since 1.0, 2024-12-05 11:04:10
 */
public class GuaranteeService extends AlipayObject {

	private static final long serialVersionUID = 4332154267473598581L;

	/**
	 * 垫付保障
	 */
	@ApiField("advance_payment_guarantee")
	private GuaranteeDetail advancePaymentGuarantee;

	/**
	 * 保障服务的价格，单位分。注意这里是总价，不是单价，也就是说在当前租期、车型下，用户购买此保障服务需要额外支付的金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 折旧费保障
	 */
	@ApiField("depreciation_guarantee")
	private GuaranteeDetail depreciationGuarantee;

	/**
	 * 保障服务详细描述
	 */
	@ApiListField("guarantee_detail_description")
	@ApiField("rent_car_guarantee_detail_description")
	private List<RentCarGuaranteeDetailDescription> guaranteeDetailDescription;

	/**
	 * 保障服务的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 乘客保障
	 */
	@ApiField("passenger_guarantee")
	private GuaranteeDetail passengerGuarantee;

	/**
	 * 保障服务的简介。用户在费用明细中给用户展示服务简介。
	 */
	@ApiField("service_description")
	private String serviceDescription;

	/**
	 * 需要用户承担的服务明细
	 */
	@ApiListField("service_exclude_detail")
	@ApiField("string")
	private List<String> serviceExcludeDetail;

	/**
	 * 保障服务提供的不需用户承担的服务明细
	 */
	@ApiListField("service_include_detail")
	@ApiField("string")
	private List<String> serviceIncludeDetail;

	/**
	 * 停运费保障
	 */
	@ApiField("stop_business_guarantee")
	private GuaranteeDetail stopBusinessGuarantee;

	/**
	 * 用户展示补充说明的附图
	 */
	@ApiField("supplementary_img")
	private String supplementaryImg;

	/**
	 * 三者保障
	 */
	@ApiField("third_party_guarantee")
	private GuaranteeDetail thirdPartyGuarantee;

	/**
	 * 保障服务唯一标识
	 */
	@ApiField("unique_code")
	private String uniqueCode;

	/**
	 * 车损保障
	 */
	@ApiField("vehicle_damage_guarantee")
	private GuaranteeDetail vehicleDamageGuarantee;

	public GuaranteeDetail getAdvancePaymentGuarantee() {
		return this.advancePaymentGuarantee;
	}
	public void setAdvancePaymentGuarantee(GuaranteeDetail advancePaymentGuarantee) {
		this.advancePaymentGuarantee = advancePaymentGuarantee;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public GuaranteeDetail getDepreciationGuarantee() {
		return this.depreciationGuarantee;
	}
	public void setDepreciationGuarantee(GuaranteeDetail depreciationGuarantee) {
		this.depreciationGuarantee = depreciationGuarantee;
	}

	public List<RentCarGuaranteeDetailDescription> getGuaranteeDetailDescription() {
		return this.guaranteeDetailDescription;
	}
	public void setGuaranteeDetailDescription(List<RentCarGuaranteeDetailDescription> guaranteeDetailDescription) {
		this.guaranteeDetailDescription = guaranteeDetailDescription;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public GuaranteeDetail getPassengerGuarantee() {
		return this.passengerGuarantee;
	}
	public void setPassengerGuarantee(GuaranteeDetail passengerGuarantee) {
		this.passengerGuarantee = passengerGuarantee;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public List<String> getServiceExcludeDetail() {
		return this.serviceExcludeDetail;
	}
	public void setServiceExcludeDetail(List<String> serviceExcludeDetail) {
		this.serviceExcludeDetail = serviceExcludeDetail;
	}

	public List<String> getServiceIncludeDetail() {
		return this.serviceIncludeDetail;
	}
	public void setServiceIncludeDetail(List<String> serviceIncludeDetail) {
		this.serviceIncludeDetail = serviceIncludeDetail;
	}

	public GuaranteeDetail getStopBusinessGuarantee() {
		return this.stopBusinessGuarantee;
	}
	public void setStopBusinessGuarantee(GuaranteeDetail stopBusinessGuarantee) {
		this.stopBusinessGuarantee = stopBusinessGuarantee;
	}

	public String getSupplementaryImg() {
		return this.supplementaryImg;
	}
	public void setSupplementaryImg(String supplementaryImg) {
		this.supplementaryImg = supplementaryImg;
	}

	public GuaranteeDetail getThirdPartyGuarantee() {
		return this.thirdPartyGuarantee;
	}
	public void setThirdPartyGuarantee(GuaranteeDetail thirdPartyGuarantee) {
		this.thirdPartyGuarantee = thirdPartyGuarantee;
	}

	public String getUniqueCode() {
		return this.uniqueCode;
	}
	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public GuaranteeDetail getVehicleDamageGuarantee() {
		return this.vehicleDamageGuarantee;
	}
	public void setVehicleDamageGuarantee(GuaranteeDetail vehicleDamageGuarantee) {
		this.vehicleDamageGuarantee = vehicleDamageGuarantee;
	}

}
