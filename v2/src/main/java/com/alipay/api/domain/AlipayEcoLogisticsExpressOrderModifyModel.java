package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单更新接口
 *
 * @author auto create
 * @since 1.0, 2017-04-06 18:04:24
 */
public class AlipayEcoLogisticsExpressOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1676148535427266571L;

	/**
	 * 接单类型，已接单状态时必填
courier_accept：快递员接单，
site_accept：快递站接单
	 */
	@ApiField("accept_type")
	private String acceptType;

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
	 * 接单快递员头像文件二进制内容的BASE64编码串
头像格式为100X100的PNG图片
	 */
	@ApiField("courier_head_img")
	private String courierHeadImg;

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
	 * 物品重量（克），已取件状态时必填
	 */
	@ApiField("goods_weight")
	private Long goodsWeight;

	/**
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/**
	 * 订单金额（元），已取件状态时必填
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
collected:已取件
accepted:已接单
canceled:已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 产品类型变更原因，产品类型变更时选填。
	 */
	@ApiField("product_type_change_reason")
	private String productTypeChangeReason;

	/**
	 * 产品类型编码，如果快递公司变更了产品类型，则需要将变更后的产品类型编码回传。取值如下：
STANDARD：标准快递。这是寄件平台默认支持的产品分类，如有其他产品分类的支持需求，可以发送邮件至xxx@alipay.com联系。
	 */
	@ApiField("product_type_code")
	private String productTypeCode;

	/**
	 * 快递公司拒绝接单原因编码，已取消状态时必填，取值如下：
R01  揽收地超服务范围
R02  派送地超服务范围
R03  揽收预约时间超范围，无法协商
R04  虚假揽货电话（客户电话与联系人不符）
R05  托寄物品为禁限寄品
R06  用户恶意下单
R07  用户取消订单
R08  其他原因，需自定义描述
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 快递公司拒绝接单原因描述，快递公司拒绝接单原因编码取值为R08时必填
	 */
	@ApiField("refuse_desc")
	private String refuseDesc;

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
	 * 运单号，已取件状态时必填
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

	public String getAcceptType() {
		return this.acceptType;
	}
	public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}

	public String getCourierAlipayAccount() {
		return this.courierAlipayAccount;
	}
	public void setCourierAlipayAccount(String courierAlipayAccount) {
		this.courierAlipayAccount = courierAlipayAccount;
	}

	public String getCourierEmpNum() {
		return this.courierEmpNum;
	}
	public void setCourierEmpNum(String courierEmpNum) {
		this.courierEmpNum = courierEmpNum;
	}

	public String getCourierHeadImg() {
		return this.courierHeadImg;
	}
	public void setCourierHeadImg(String courierHeadImg) {
		this.courierHeadImg = courierHeadImg;
	}

	public String getCourierIdCard() {
		return this.courierIdCard;
	}
	public void setCourierIdCard(String courierIdCard) {
		this.courierIdCard = courierIdCard;
	}

	public String getCourierMobile() {
		return this.courierMobile;
	}
	public void setCourierMobile(String courierMobile) {
		this.courierMobile = courierMobile;
	}

	public String getCourierName() {
		return this.courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public Long getGoodsWeight() {
		return this.goodsWeight;
	}
	public void setGoodsWeight(Long goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public String getLogisMerchCode() {
		return this.logisMerchCode;
	}
	public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getProductTypeChangeReason() {
		return this.productTypeChangeReason;
	}
	public void setProductTypeChangeReason(String productTypeChangeReason) {
		this.productTypeChangeReason = productTypeChangeReason;
	}

	public String getProductTypeCode() {
		return this.productTypeCode;
	}
	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getRefuseDesc() {
		return this.refuseDesc;
	}
	public void setRefuseDesc(String refuseDesc) {
		this.refuseDesc = refuseDesc;
	}

	public String getSiteAreaCode() {
		return this.siteAreaCode;
	}
	public void setSiteAreaCode(String siteAreaCode) {
		this.siteAreaCode = siteAreaCode;
	}

	public String getSiteCode() {
		return this.siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSiteComplainTel() {
		return this.siteComplainTel;
	}
	public void setSiteComplainTel(String siteComplainTel) {
		this.siteComplainTel = siteComplainTel;
	}

	public String getSiteDetailAddr() {
		return this.siteDetailAddr;
	}
	public void setSiteDetailAddr(String siteDetailAddr) {
		this.siteDetailAddr = siteDetailAddr;
	}

	public String getSiteLeaderMobile() {
		return this.siteLeaderMobile;
	}
	public void setSiteLeaderMobile(String siteLeaderMobile) {
		this.siteLeaderMobile = siteLeaderMobile;
	}

	public String getSiteLeaderName() {
		return this.siteLeaderName;
	}
	public void setSiteLeaderName(String siteLeaderName) {
		this.siteLeaderName = siteLeaderName;
	}

	public String getSiteName() {
		return this.siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getWayBillNo() {
		return this.wayBillNo;
	}
	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}

}
