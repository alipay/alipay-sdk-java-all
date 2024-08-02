package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务提报申请
 *
 * @author auto create
 * @since 1.0, 2023-11-29 13:53:14
 */
public class AlipayOpenAppServiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6529814944896559768L;

	/**
	 * 行业类目id,获取请参考<a href="https://opendocs.alipay.com/mini/03ci0w?pathHash=ed3c875c">各个行业场景服务接入资料</a>
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 外部业务编号,平台会基于appId+out_biz_no做幂等控制，如果出现幂等，会返回幂等的service_code
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务schema版本
	 */
	@ApiField("schema_version")
	private String schemaVersion;

	/**
	 * 服务编码, 首次提报时设置空值，支付宝侧返回ServiceCode；当传入serviceCode，则对已提报服务做编辑操作。
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务xml,格式请参考<a href="https://opendocs.alipay.com/mini/03cj40?pathHash=a5de4bd9">Schema 规则介绍</a>
	 */
	@ApiField("service_xml")
	private String serviceXml;

	/**
	 * 默认值:DEFAULT。
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * 商户提报服务履约类型
	 */
	@ApiField("user_service_delivery_type")
	private String userServiceDeliveryType;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSchemaVersion() {
		return this.schemaVersion;
	}
	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceXml() {
		return this.serviceXml;
	}
	public void setServiceXml(String serviceXml) {
		this.serviceXml = serviceXml;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public String getUserServiceDeliveryType() {
		return this.userServiceDeliveryType;
	}
	public void setUserServiceDeliveryType(String userServiceDeliveryType) {
		this.userServiceDeliveryType = userServiceDeliveryType;
	}

}
