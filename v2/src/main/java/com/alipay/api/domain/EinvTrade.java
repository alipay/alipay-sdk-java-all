package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票交易模型
 *
 * @author auto create
 * @since 1.0, 2024-11-11 15:31:05
 */
public class EinvTrade extends AlipayObject {

	private static final long serialVersionUID = 3363238336752467244L;

	/**
	 * 订单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 下单时间
	 */
	@ApiField("bill_time")
	private Date billTime;

	/**
	 * 商户所在城市(经营地址)
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 账单明细信息，酒店水单信息，行程单信息，餐饮小票信息
	 */
	@ApiField("detail_json")
	private String detailJson;

	/**
	 * 账单明细信息，酒店水单，行程单，餐饮小票等pdf原件链接
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 扩展参数

不同组的k-v通过换行符区分
	 */
	@ApiField("extend_map")
	private String extendMap;

	/**
	 * 商家名称（显示名称，非企业名称，餐饮店、酒店、打车平台名称）
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 透传字段，不做处理，用于isv向后续报销税控方传递特殊信息标记
	 */
	@ApiField("out_json")
	private String outJson;

	/**
	 * 销方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 支付金额，单位（元），
对应账单中的交易金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 支付时间

对应账单中的账单日期
	 */
	@ApiField("payment_time")
	private Date paymentTime;

	/**
	 * 交易类型来源 需要按照枚举映射
	 */
	@ApiField("souce")
	private String souce;

	/**
	 * 交易类型/账单分类
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Date getBillTime() {
		return this.billTime;
	}
	public void setBillTime(Date billTime) {
		this.billTime = billTime;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDetailJson() {
		return this.detailJson;
	}
	public void setDetailJson(String detailJson) {
		this.detailJson = detailJson;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getExtendMap() {
		return this.extendMap;
	}
	public void setExtendMap(String extendMap) {
		this.extendMap = extendMap;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOutJson() {
		return this.outJson;
	}
	public void setOutJson(String outJson) {
		this.outJson = outJson;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getSouce() {
		return this.souce;
	}
	public void setSouce(String souce) {
		this.souce = souce;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
