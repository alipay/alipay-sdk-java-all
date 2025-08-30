package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.logistics.express.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEcoLogisticsExpressOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3431493688658259772L;

	/** 
	 * 接单类型，已接单状态时必填
courier_accept：快递员接单，
site_accept：快递站接单
	 */
	@ApiField("accept_type")
	private String acceptType;

	/** 
	 * 取消原因，已取消状态时必填
	 */
	@ApiField("cancel_cause")
	private String cancelCause;

	/** 
	 * 快递员支付宝帐号，快递员接单时选填
	 */
	@ApiField("courier_alipay_account")
	private String courierAlipayAccount;

	/** 
	 * 员工号，快递员接单时必填
	 */
	@ApiField("courier_emp_num")
	private String courierEmpNum;

	/** 
	 * 身份证，快递员接单时选填
	 */
	@ApiField("courier_id_card")
	private String courierIdCard;

	/** 
	 * 快递员手机号，快递员接单时必填
	 */
	@ApiField("courier_mobile")
	private String courierMobile;

	/** 
	 * 快递员姓名，快递员接单时必填
	 */
	@ApiField("courier_name")
	private String courierName;

	/** 
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 运费险理赔金额（元）
	 */
	@ApiField("fare_claims_amount")
	private String fareClaimsAmount;

	/** 
	 * 订单最后更新时间
	 */
	@ApiField("last_modified_time")
	private Date lastModifiedTime;

	/** 
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/** 
	 * 订单总金额（元）
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/** 
	 * 寄件平台订单号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
waiting_accept:待接单，
accepted:已接单，待取件，
collected:已取件
canceled:已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 支付状态
non_pay:未支付
payed:已支付
pay_failed:支付失败
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 产品类型变更原因。
	 */
	@ApiField("product_type_change_reason")
	private String productTypeChangeReason;

	/** 
	 * 产品类型编码，取值如下：
STANDARD：标准快递。这是寄件平台默认支持的产品分类，如有其他产品分类的支持需求，可以发送邮件至xxx@alipay.com联系。
	 */
	@ApiField("product_type_code")
	private String productTypeCode;

	/** 
	 * 站点所在区县编码，快递站点接单时必填。采用国家标准编码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("site_area_code")
	private String siteAreaCode;

	/** 
	 * 快递站点编号，快递站点接单时必填
	 */
	@ApiField("site_code")
	private String siteCode;

	/** 
	 * 站点投诉电话，快递站点接单时选填
	 */
	@ApiField("site_complain_tel")
	private String siteComplainTel;

	/** 
	 * 站点所在详细地址，快递站点接单时必填
	 */
	@ApiField("site_detail_addr")
	private String siteDetailAddr;

	/** 
	 * 站点负责人手机号，快递站点接单时必填
	 */
	@ApiField("site_leader_mobile")
	private String siteLeaderMobile;

	/** 
	 * 站点负责人，快递站点接单时必填
	 */
	@ApiField("site_leader_name")
	private String siteLeaderName;

	/** 
	 * 快递站点名称，快递站点接单时必填
	 */
	@ApiField("site_name")
	private String siteName;

	/** 
	 * 支付宝交易金额（元）
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/** 
	 * 支付宝交易号，已支付状态必填
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 运单号，已取件状态时必填
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

	public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}
	public String getAcceptType( ) {
		return this.acceptType;
	}

	public void setCancelCause(String cancelCause) {
		this.cancelCause = cancelCause;
	}
	public String getCancelCause( ) {
		return this.cancelCause;
	}

	public void setCourierAlipayAccount(String courierAlipayAccount) {
		this.courierAlipayAccount = courierAlipayAccount;
	}
	public String getCourierAlipayAccount( ) {
		return this.courierAlipayAccount;
	}

	public void setCourierEmpNum(String courierEmpNum) {
		this.courierEmpNum = courierEmpNum;
	}
	public String getCourierEmpNum( ) {
		return this.courierEmpNum;
	}

	public void setCourierIdCard(String courierIdCard) {
		this.courierIdCard = courierIdCard;
	}
	public String getCourierIdCard( ) {
		return this.courierIdCard;
	}

	public void setCourierMobile(String courierMobile) {
		this.courierMobile = courierMobile;
	}
	public String getCourierMobile( ) {
		return this.courierMobile;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}
	public String getCourierName( ) {
		return this.courierName;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setFareClaimsAmount(String fareClaimsAmount) {
		this.fareClaimsAmount = fareClaimsAmount;
	}
	public String getFareClaimsAmount( ) {
		return this.fareClaimsAmount;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	public Date getLastModifiedTime( ) {
		return this.lastModifiedTime;
	}

	public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
	}
	public String getLogisMerchCode( ) {
		return this.logisMerchCode;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount( ) {
		return this.orderAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setProductTypeChangeReason(String productTypeChangeReason) {
		this.productTypeChangeReason = productTypeChangeReason;
	}
	public String getProductTypeChangeReason( ) {
		return this.productTypeChangeReason;
	}

	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}
	public String getProductTypeCode( ) {
		return this.productTypeCode;
	}

	public void setSiteAreaCode(String siteAreaCode) {
		this.siteAreaCode = siteAreaCode;
	}
	public String getSiteAreaCode( ) {
		return this.siteAreaCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getSiteCode( ) {
		return this.siteCode;
	}

	public void setSiteComplainTel(String siteComplainTel) {
		this.siteComplainTel = siteComplainTel;
	}
	public String getSiteComplainTel( ) {
		return this.siteComplainTel;
	}

	public void setSiteDetailAddr(String siteDetailAddr) {
		this.siteDetailAddr = siteDetailAddr;
	}
	public String getSiteDetailAddr( ) {
		return this.siteDetailAddr;
	}

	public void setSiteLeaderMobile(String siteLeaderMobile) {
		this.siteLeaderMobile = siteLeaderMobile;
	}
	public String getSiteLeaderMobile( ) {
		return this.siteLeaderMobile;
	}

	public void setSiteLeaderName(String siteLeaderName) {
		this.siteLeaderName = siteLeaderName;
	}
	public String getSiteLeaderName( ) {
		return this.siteLeaderName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSiteName( ) {
		return this.siteName;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public String getTradeAmount( ) {
		return this.tradeAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}
	public String getWayBillNo( ) {
		return this.wayBillNo;
	}

}
