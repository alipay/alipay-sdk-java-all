package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户开立
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:26:29
 */
public class AlipayEbppIndustrySalaryAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4653149393993316436L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * Map<String,String>,
JSON BASE64Encode
key=AccountAlias, value为账户标识，用于备注
key=Scene, value为场景编号
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 代发商户的商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 合作方系统生成的外部交易流水号，同一交易流水号被视为同一笔交易。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 代发场景和发薪贷场景开子户必填，对应外部对该子户的唯一标识
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 对应的merchantId
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 母户类型
	 */
	@ApiField("parent_type")
	private String parentType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 开户场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 对接收付通加签的xml，通过base64Encode编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentType() {
		return this.parentType;
	}
	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSignXml() {
		return this.signXml;
	}
	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}

}
