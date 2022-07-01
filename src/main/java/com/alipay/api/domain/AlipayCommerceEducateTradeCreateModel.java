package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV回流订单数据接口
 *
 * @author auto create
 * @since 1.0, 2021-03-16 21:05:50
 */
public class AlipayCommerceEducateTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1482356182967593519L;

	/**
	 * 购买数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private EduTradeExtInfo extInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 缴费过期时间
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 实际支付时间
	 */
	@ApiField("gmt_paytime")
	private String gmtPaytime;

	/**
	 * 支付宝内部商品编号
	 */
	@ApiField("good_id")
	private String goodId;

	/**
	 * 外部账单编号
	 */
	@ApiField("isv_order_no")
	private String isvOrderNo;

	/**
	 * 实际支付金额，单位元，两位小数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 门店编号
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 二级商户
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 订单来源：
  2-钉钉
  3-支课堂
	 */
	@ApiField("source")
	private String source;

	/**
	 * 交易单名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 账单总金额，单位元，两位小数
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 订单状态
 1-待支付
 3-已支付
 6-已关闭
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 标价币种
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public EduTradeExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(EduTradeExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGmtPaytime() {
		return this.gmtPaytime;
	}
	public void setGmtPaytime(String gmtPaytime) {
		this.gmtPaytime = gmtPaytime;
	}

	public String getGoodId() {
		return this.goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public String getIsvOrderNo() {
		return this.isvOrderNo;
	}
	public void setIsvOrderNo(String isvOrderNo) {
		this.isvOrderNo = isvOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
