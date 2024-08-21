package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC服务机上报线圈消费时间
 *
 * @author auto create
 * @since 1.0, 2024-07-03 19:43:45
 */
public class AlipayCommerceCityfacilitatorIotbspFwjnfcUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6491737723983334314L;

	/**
	 * 线圈链接被读取时事件的时间戳，单位为秒或毫秒的时间戳
	 */
	@ApiField("fetch_time")
	private String fetchTime;

	/**
	 * NFC模块SN
	 */
	@ApiField("nfc_sn")
	private String nfcSn;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 上位机SN，具体取值为服务商设备唯一标识
	 */
	@ApiField("upper_sn")
	private String upperSn;

	/**
	 * NFC模块烧录的链接，通过初始化接口获得的链接内容
	 */
	@ApiField("url")
	private String url;

	public String getFetchTime() {
		return this.fetchTime;
	}
	public void setFetchTime(String fetchTime) {
		this.fetchTime = fetchTime;
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
