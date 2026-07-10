package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创SAAS交易单
 *
 * @author auto create
 * @since 1.0, 2026-07-09 14:17:55
 */
public class AlipayCommerceMedicalBuyerOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2771116378151225656L;

	/**
	 * 应用类型端 (支付宝，阿福)
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_no")
	private String fulfillmentNo;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("item_infos")
	private List<ItemInfos> items;

	/**
	 * 就诊人id
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 商家id
	 */
	@ApiField("seller")
	private String seller;

	/**
	 * 服务项信息
	 */
	@ApiField("service_package")
	private ServicePackageInfo servicePackage;

	/**
	 * 订单来源，传advisor_proxy
	 */
	@ApiField("source")
	private String source;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getFulfillmentNo() {
		return this.fulfillmentNo;
	}
	public void setFulfillmentNo(String fulfillmentNo) {
		this.fulfillmentNo = fulfillmentNo;
	}

	public List<ItemInfos> getItems() {
		return this.items;
	}
	public void setItems(List<ItemInfos> items) {
		this.items = items;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getSeller() {
		return this.seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}

	public ServicePackageInfo getServicePackage() {
		return this.servicePackage;
	}
	public void setServicePackage(ServicePackageInfo servicePackage) {
		this.servicePackage = servicePackage;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
