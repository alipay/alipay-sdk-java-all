package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC服务机初始化
 *
 * @author auto create
 * @since 1.0, 2024-05-07 16:01:16
 */
public class AlipayCommerceCityfacilitatorIotbspFwjnfcSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3166281376613589115L;

	/**
	 * nfc设备BizTid
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
	 * pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 上位机biztid
	 */
	@ApiField("upper_biz_tid")
	private String upperBizTid;

	/**
	 * 上位机sn
	 */
	@ApiField("upper_sn")
	private String upperSn;

	/**
	 * isv小程序跳转url
	 */
	@ApiField("url")
	private String url;

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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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
