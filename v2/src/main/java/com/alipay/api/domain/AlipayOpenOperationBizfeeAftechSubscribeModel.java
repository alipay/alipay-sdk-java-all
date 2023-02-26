package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融科技订购生效通知
 *
 * @author auto create
 * @since 1.0, 2019-07-08 21:11:50
 */
public class AlipayOpenOperationBizfeeAftechSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 4352129559684116957L;

	/**
	 * 系统/应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 客户信息（JSON对象） 包含principalType主体类型、principalId主体Id、extInfo扩展信息等字段。其中，需要从extInfo透传消费的key有：relEntityId关联主体Id。
	 */
	@ApiField("customer")
	private String customer;

	/**
	 * 订购费用金额 单位元，最多两位小数。
	 */
	@ApiField("fee_amount")
	private String feeAmount;

	/**
	 * 订购费用币种 币种数字编码。
	 */
	@ApiField("fee_currency")
	private String feeCurrency;

	/**
	 * 订购开始时间
	 */
	@ApiField("gmt_begin")
	private String gmtBegin;

	/**
	 * 订购结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * 机构OU编码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 外部业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订购包量类型
SERVICE_TIME: 包时间
SERVICE_QUANTITY: 包量
	 */
	@ApiField("pkg_type")
	private String pkgType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 扩展属性（Map的JSON对象） key和value中不能有英文逗号及等于符号。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 关联订单流水号
	 */
	@ApiField("rel_order_no")
	private String relOrderNo;

	/**
	 * 订购服务量
传天数/次数等数值。
	 */
	@ApiField("service_amount")
	private String serviceAmount;

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

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getCustomer() {
		return this.customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getFeeAmount() {
		return this.feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeCurrency() {
		return this.feeCurrency;
	}
	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
	}

	public String getGmtBegin() {
		return this.gmtBegin;
	}
	public void setGmtBegin(String gmtBegin) {
		this.gmtBegin = gmtBegin;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPkgType() {
		return this.pkgType;
	}
	public void setPkgType(String pkgType) {
		this.pkgType = pkgType;
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

	public String getRelOrderNo() {
		return this.relOrderNo;
	}
	public void setRelOrderNo(String relOrderNo) {
		this.relOrderNo = relOrderNo;
	}

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
