package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV创建
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:30:01
 */
public class AlipayEbppCommunityIsvCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8532284637113361984L;

	/**
	 * 更多账单跳转地址
	 */
	@ApiField("bill_link_url")
	private String billLinkUrl;

	/**
	 * 户号查询电话
	 */
	@ApiField("billkey_query_mobile")
	private String billkeyQueryMobile;

	/**
	 * 小程序id
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 服务商的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收款账号, 必须为支付宝商户账号
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 返佣账号
	 */
	@ApiField("rake_back_acct")
	private String rakeBackAcct;

	/**
	 * 支付宝：ALIPAY，银行卡：BANK
	 */
	@ApiField("rake_back_acct_type")
	private String rakeBackAcctType;

	/**
	 * 对应的商务人员
	 */
	@ApiField("related_bd")
	private String relatedBd;

	/**
	 * LE_10("LE_10", "10小区"),
BETWEEN10_100("BETWEEN10_100", "10~100小区"),
BETWEEN100_500("BETWEEN100_500", "100~500小区"),
BETWEEN500_1000("BETWEEN500_1000", GE1000("GE1000", "1000+");
	 */
	@ApiField("scale")
	private String scale;

	/**
	 * ISV类型 开发者 SYSTEM_PROVIDER 大物业 TOP_PROPERTY_COMP 政府 GOVERMENT
	 */
	@ApiField("type")
	private String type;

	public String getBillLinkUrl() {
		return this.billLinkUrl;
	}
	public void setBillLinkUrl(String billLinkUrl) {
		this.billLinkUrl = billLinkUrl;
	}

	public String getBillkeyQueryMobile() {
		return this.billkeyQueryMobile;
	}
	public void setBillkeyQueryMobile(String billkeyQueryMobile) {
		this.billkeyQueryMobile = billkeyQueryMobile;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRakeBackAcct() {
		return this.rakeBackAcct;
	}
	public void setRakeBackAcct(String rakeBackAcct) {
		this.rakeBackAcct = rakeBackAcct;
	}

	public String getRakeBackAcctType() {
		return this.rakeBackAcctType;
	}
	public void setRakeBackAcctType(String rakeBackAcctType) {
		this.rakeBackAcctType = rakeBackAcctType;
	}

	public String getRelatedBd() {
		return this.relatedBd;
	}
	public void setRelatedBd(String relatedBd) {
		this.relatedBd = relatedBd;
	}

	public String getScale() {
		return this.scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
