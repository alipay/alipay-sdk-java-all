package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店服务提报
 *
 * @author auto create
 * @since 1.0, 2023-06-05 14:01:07
 */
public class AlipayCommerceDataHotelServiceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1273958244535387432L;

	/**
	 * 酒店所在小程序的appid
	 */
	@ApiField("hotel_app_id")
	private String hotelAppId;

	/**
	 * 酒店信息
	 */
	@ApiField("hotel_info")
	private HotelInfo hotelInfo;

	/**
	 * [SERVICE_CREATE：服务创建，
SERVICE_UPDATE：服务更新，
SERVICE_ONLINE: 服务上架，
SERVICE_OFFLINE：服务下架
]

说明：值为SERVICE_CREATE时， 参数servic_id为空；值为其他时， 参数servic_id必填
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 服务商侧酒店id
	 */
	@ApiField("outer_hotel_id")
	private String outerHotelId;

	/**
	 * 提报服务的描述
	 */
	@ApiField("service_description")
	private String serviceDescription;

	/**
	 * 支付宝行业酒店服务的标识，第一次服务提报时为null， 更新服务提报时必传，和出参中service_id一致
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 提报服务名称，不要出现特殊字符，建议以 酒店名称+服务类型 组合作为服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务提报类型， 可选值
[HOTEL_RESERVATION : 酒店预订服务,
HOTEL_CHECK_IN:酒店入住服务
]
	 */
	@ApiField("service_submit_type")
	private String serviceSubmitType;

	/**
	 * 服务提报url
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 服务商的标识， 需要支付宝技术配置。联调前请提前找技术人员配置
	 */
	@ApiField("source_system")
	private String sourceSystem;

	public String getHotelAppId() {
		return this.hotelAppId;
	}
	public void setHotelAppId(String hotelAppId) {
		this.hotelAppId = hotelAppId;
	}

	public HotelInfo getHotelInfo() {
		return this.hotelInfo;
	}
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOuterHotelId() {
		return this.outerHotelId;
	}
	public void setOuterHotelId(String outerHotelId) {
		this.outerHotelId = outerHotelId;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceSubmitType() {
		return this.serviceSubmitType;
	}
	public void setServiceSubmitType(String serviceSubmitType) {
		this.serviceSubmitType = serviceSubmitType;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

}
