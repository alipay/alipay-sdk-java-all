package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行预付融资订单关闭
 *
 * @author auto create
 * @since 1.0, 2018-12-14 19:37:42
 */
public class MybankPaymentTradeFinancingOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3883698473587578524L;

	/**
	 * 扩展字段，JSON格式 URLEncoder.encode(String,"UTF-8")
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 合作机构编码，阿里云填aliyun
	 */
	@ApiField("ext_partner")
	private String extPartner;

	/**
	 * order_no
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单类型，FINANCING_PAY-预付融资
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 请求时间，格式yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 填MYBKC1CN，表示网商
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExtPartner() {
		return this.extPartner;
	}
	public void setExtPartner(String extPartner) {
		this.extPartner = extPartner;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
