package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC服务机初始化
 *
 * @author auto create
 * @since 1.0, 2024-07-03 20:23:15
 */
public class AlipayCommerceCityfacilitatorIotbspFwjnfcSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6531426793641832439L;

	/**
	 * 贴一贴后需要跳转的小程序appId
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * nfc设备BizTid，为NFC模块生成的设备唯一ID，非必填属性
	 */
	@ApiField("nfc_biz_tid")
	private String nfcBizTid;

	/**
	 * nfc设备Sn编码
	 */
	@ApiField("nfc_sn")
	private String nfcSn;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 小程序跳转地址参数，非必填，无参数可不配置
	 */
	@ApiField("params")
	private String params;

	/**
	 * 调用方的商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 小程序跳转时，需要额外传递的页面参数
	 */
	@ApiField("query_params")
	private String queryParams;

	/**
	 * 贴一贴小程序跳转的页面地址
	 */
	@ApiField("route_page")
	private String routePage;

	/**
	 * 上位机biztid，，为上位机设备唯一ID
	 */
	@ApiField("upper_biz_tid")
	private String upperBizTid;

	/**
	 * 上位机sn，为商户设备的设备唯一ID
	 */
	@ApiField("upper_sn")
	private String upperSn;

	/**
	 * isv小程序跳转url
	 */
	@ApiField("url")
	private String url;

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getNfcBizTid() {
		return this.nfcBizTid;
	}
	public void setNfcBizTid(String nfcBizTid) {
		this.nfcBizTid = nfcBizTid;
	}

	public String getNfcSn() {
		return this.nfcSn;
	}
	public void setNfcSn(String nfcSn) {
		this.nfcSn = nfcSn;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getQueryParams() {
		return this.queryParams;
	}
	public void setQueryParams(String queryParams) {
		this.queryParams = queryParams;
	}

	public String getRoutePage() {
		return this.routePage;
	}
	public void setRoutePage(String routePage) {
		this.routePage = routePage;
	}

	public String getUpperBizTid() {
		return this.upperBizTid;
	}
	public void setUpperBizTid(String upperBizTid) {
		this.upperBizTid = upperBizTid;
	}

	public String getUpperSn() {
		return this.upperSn;
	}
	public void setUpperSn(String upperSn) {
		this.upperSn = upperSn;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
