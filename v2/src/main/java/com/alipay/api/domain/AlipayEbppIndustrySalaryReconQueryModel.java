package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询交易对账文件
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:25:41
 */
public class AlipayEbppIndustrySalaryReconQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3272996269387869442L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 交易日期，格式为yyyyMMdd
交易最终成功或失败的日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 扩展信息，Map的json序列化后Base64(暂无需填写)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 代发商户的商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 外部交易号。由合作方系统生成，只能包含字母、数字、下划线；需保证合作方系统不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 对接收付通加签的xml，通过base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	/**
	 * 下载账单类型
	 */
	@ApiField("type")
	private String type;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSignXml() {
		return this.signXml;
	}
	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
