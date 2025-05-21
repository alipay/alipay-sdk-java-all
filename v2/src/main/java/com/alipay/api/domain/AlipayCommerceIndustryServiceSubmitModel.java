package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业服务标准化服务提报
 *
 * @author auto create
 * @since 1.0, 2022-05-25 10:18:13
 */
public class AlipayCommerceIndustryServiceSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2887633878781164846L;

	/**
	 * 扩展字段，服务扩展字段，示例：key：service_sub_type，value：car_rental_day
	 */
	@ApiListField("extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> extraInfo;

	/**
	 * 行业信息,数据格式详情联系解决方案同学
	 */
	@ApiField("industry_info")
	private String industryInfo;

	/**
	 * 商户侧服务编码。回收行业会优先以该字段作为服务唯一键，如果没有传该字段，会用service_name作为服务唯一键。
	 */
	@ApiField("out_service_code")
	private String outServiceCode;

	/**
	 * 服务动作 SERVICE_CREATE：服务创建 SERVICE_UPDATE：服务更新
	 */
	@ApiField("service_action")
	private String serviceAction;

	/**
	 * 某某到家服务提供优质服务,提升生活品质
	 */
	@ApiField("service_description")
	private String serviceDescription;

	/**
	 * 描述服务名称(不可重复)
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 租车固定为
CAR_RENTAL
到家服务固定为
HOME_SERVICE
上门回收固定为
DOOR_RECYCLING
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务url（可直接跳转对应的服务子类型小程序页面）
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public List<ExtraInfo> getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(List<ExtraInfo> extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getIndustryInfo() {
		return this.industryInfo;
	}
	public void setIndustryInfo(String industryInfo) {
		this.industryInfo = industryInfo;
	}

	public String getOutServiceCode() {
		return this.outServiceCode;
	}
	public void setOutServiceCode(String outServiceCode) {
		this.outServiceCode = outServiceCode;
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

}
