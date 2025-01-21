package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租车服务提报接口
 *
 * @author auto create
 * @since 1.0, 2022-05-25 10:20:53
 */
public class AlipayCommerceTransportCarrentalServiceSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7473412627753928993L;

	/**
	 * 扩展字段，服务扩展字段，示例：key：service_sub_type，value：car_rental_day
	 */
	@ApiListField("extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> extraInfo;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private CarRentalMerchantInfo merchantInfo;

	/**
	 * 服务动作 
SERVICE_CREATE：服务创建 
SERVICE_UPDATE：服务更新
	 */
	@ApiField("service_action")
	private String serviceAction;

	/**
	 * 服务描述
	 */
	@ApiField("service_description")
	private String serviceDescription;

	/**
	 * 描述服务名称(不可重复)
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务类型
租车固定为CAR_RENTAL
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务url（可直接跳转对应的服务子类型小程序页面）
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 门店信息
	 */
	@ApiField("store_info")
	private CarRentalStoreInfo storeInfo;

	public List<ExtraInfo> getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(List<ExtraInfo> extraInfo) {
		this.extraInfo = extraInfo;
	}

	public CarRentalMerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(CarRentalMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getServiceAction() {
		return this.serviceAction;
	}
	public void setServiceAction(String serviceAction) {
		this.serviceAction = serviceAction;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public CarRentalStoreInfo getStoreInfo() {
		return this.storeInfo;
	}
	public void setStoreInfo(CarRentalStoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}

}
