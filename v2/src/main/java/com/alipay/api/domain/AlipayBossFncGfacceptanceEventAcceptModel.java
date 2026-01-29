package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财事件受理
 *
 * @author auto create
 * @since 1.0, 2026-01-21 20:07:58
 */
public class AlipayBossFncGfacceptanceEventAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 3773169354822843926L;

	/**
	 * 受理幂等字段，唯一标识一笔报帐单据。当收到两笔相同的acceptUniqueNo时，第二笔会被当作是重复报送不作处理。因此对于同一笔交易在不同阶段（比如订单创建、确认收货、退款等）触发的不同财务事件，也应该采用不同的acceptUniqueNo
	 */
	@ApiField("accept_uniq_no")
	private String acceptUniqNo;

	/**
	 * 签约合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 业务事件码，长度必须小于等于8
	 */
	@ApiField("biz_ev_code")
	private String bizEvCode;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 端事件码（8位数字）
	 */
	@ApiField("cnl_ev_code")
	private String cnlEvCode;

	/**
	 * 端产品码，长度必须小于等于64
	 */
	@ApiField("cnl_pd_code")
	private String cnlPdCode;

	/**
	 * 业财事件受理模型，事件处理码，事件处理参数，事件触发条件，事件触发时间等主要内容定义在这里。
	 */
	@ApiField("event_acceptance")
	private GFAOpenAPIEventAcceptance eventAcceptance;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务流水号（受理幂等字段之一），长度必须小于等于128
	 */
	@ApiField("out_business_no")
	private String outBusinessNo;

	/**
	 * 16位。支付宝UID或者2088000000000XX0，倒数2、3位数字用来决策LDC ZoneUid和分库位
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务唯一标识（受理幂等字段之一），长度必须小于等于12
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 外部业务子单据号（受理幂等字段之一），长度必须小于等于128
	 */
	@ApiField("sub_out_business_no")
	private String subOutBusinessNo;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAcceptUniqNo() {
		return this.acceptUniqNo;
	}
	public void setAcceptUniqNo(String acceptUniqNo) {
		this.acceptUniqNo = acceptUniqNo;
	}

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getBizEvCode() {
		return this.bizEvCode;
	}
	public void setBizEvCode(String bizEvCode) {
		this.bizEvCode = bizEvCode;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getCnlEvCode() {
		return this.cnlEvCode;
	}
	public void setCnlEvCode(String cnlEvCode) {
		this.cnlEvCode = cnlEvCode;
	}

	public String getCnlPdCode() {
		return this.cnlPdCode;
	}
	public void setCnlPdCode(String cnlPdCode) {
		this.cnlPdCode = cnlPdCode;
	}

	public GFAOpenAPIEventAcceptance getEventAcceptance() {
		return this.eventAcceptance;
	}
	public void setEventAcceptance(GFAOpenAPIEventAcceptance eventAcceptance) {
		this.eventAcceptance = eventAcceptance;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBusinessNo() {
		return this.outBusinessNo;
	}
	public void setOutBusinessNo(String outBusinessNo) {
		this.outBusinessNo = outBusinessNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSubOutBusinessNo() {
		return this.subOutBusinessNo;
	}
	public void setSubOutBusinessNo(String subOutBusinessNo) {
		this.subOutBusinessNo = subOutBusinessNo;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
