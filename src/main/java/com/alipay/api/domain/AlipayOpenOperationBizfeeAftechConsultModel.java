package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务询价接口
 *
 * @author auto create
 * @since 1.0, 2019-07-08 21:12:16
 */
public class AlipayOpenOperationBizfeeAftechConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1337349871158118921L;

	/**
	 * 系统/应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 客户信息（JSON对象）
包含principalType主体类型、principalId主体Id、extInfo扩展信息等字段。其中，需要从extInfo透传消费的key有：relEntityId关联主体Id。
	 */
	@ApiField("customer")
	private String customer;

	/**
	 * 事件码列表（List<String>的JSON对象）
	 */
	@ApiField("event_codes")
	private String eventCodes;

	/**
	 * 计价时间
	 */
	@ApiField("gmt_charge")
	private String gmtCharge;

	/**
	 * 外部业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 扩展属性（Map<String, String>的JSON对象）
key和value中不能有英文逗号及等于符号。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 租户Id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCustomer() {
		return this.customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getEventCodes() {
		return this.eventCodes;
	}
	public void setEventCodes(String eventCodes) {
		this.eventCodes = eventCodes;
	}

	public String getGmtCharge() {
		return this.gmtCharge;
	}
	public void setGmtCharge(String gmtCharge) {
		this.gmtCharge = gmtCharge;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
