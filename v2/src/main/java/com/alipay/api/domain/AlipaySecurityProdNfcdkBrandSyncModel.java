package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC碰一下品牌车厂钥匙数据同步
 *
 * @author auto create
 * @since 1.0, 2025-03-06 14:10:24
 */
public class AlipaySecurityProdNfcdkBrandSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5859476819239581135L;

	/**
	 * 用户账号名称，分享时选择的用户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 同步的操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 蓝牙名称
	 */
	@ApiField("ble_name")
	private String bleName;

	/**
	 * 用户钥匙绑定渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 钥匙基本信息
	 */
	@ApiField("dk_info")
	private String dkInfo;

	/**
	 * 钥匙使用次数
	 */
	@ApiField("dk_max_count")
	private Long dkMaxCount;

	/**
	 * 子钥匙有效期结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 钥匙唯一ID，用于标识钥匙信息
	 */
	@ApiField("key_id")
	private String keyId;

	/**
	 * 钥匙类型
	 */
	@ApiField("key_type")
	private String keyType;

	/**
	 * 蓝牙地址，需保障蓝牙地址的唯一性
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 主钥匙所属的子钥匙账户
	 */
	@ApiField("master_account_no")
	private String masterAccountNo;

	/**
	 * 子钥匙所属的主钥匙keyId
	 */
	@ApiField("master_key_id")
	private String masterKeyId;

	/**
	 * 用户在车企app绑定的账号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * nfc补充信息
	 */
	@ApiField("nfc_info")
	private String nfcInfo;

	/**
	 * 通信协议类型
	 */
	@ApiField("protocol_type")
	private String protocolType;

	/**
	 * 子钥匙有效期开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 钥匙状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 同步时间戳
	 */
	@ApiField("time")
	private String time;

	/**
	 * IIFAA中控设备唯一标识
	 */
	@ApiField("tuid")
	private String tuid;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBleName() {
		return this.bleName;
	}
	public void setBleName(String bleName) {
		this.bleName = bleName;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDkInfo() {
		return this.dkInfo;
	}
	public void setDkInfo(String dkInfo) {
		this.dkInfo = dkInfo;
	}

	public Long getDkMaxCount() {
		return this.dkMaxCount;
	}
	public void setDkMaxCount(Long dkMaxCount) {
		this.dkMaxCount = dkMaxCount;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getKeyId() {
		return this.keyId;
	}
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public String getKeyType() {
		return this.keyType;
	}
	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMasterAccountNo() {
		return this.masterAccountNo;
	}
	public void setMasterAccountNo(String masterAccountNo) {
		this.masterAccountNo = masterAccountNo;
	}

	public String getMasterKeyId() {
		return this.masterKeyId;
	}
	public void setMasterKeyId(String masterKeyId) {
		this.masterKeyId = masterKeyId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getNfcInfo() {
		return this.nfcInfo;
	}
	public void setNfcInfo(String nfcInfo) {
		this.nfcInfo = nfcInfo;
	}

	public String getProtocolType() {
		return this.protocolType;
	}
	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTuid() {
		return this.tuid;
	}
	public void setTuid(String tuid) {
		this.tuid = tuid;
	}

}
