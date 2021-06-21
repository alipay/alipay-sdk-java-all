package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务提报申请
 *
 * @author auto create
 * @since 1.0, 2021-04-19 14:11:02
 */
public class AlipayOpenAppServiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5141225732917873487L;

	/**
	 * 行业类目id
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
	 * 服务xml
	 */
	@ApiField("service_xml")
	private String serviceXml;

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

	public String getServiceXml() {
		return this.serviceXml;
	}
	public void setServiceXml(String serviceXml) {
		this.serviceXml = serviceXml;
	}

}
