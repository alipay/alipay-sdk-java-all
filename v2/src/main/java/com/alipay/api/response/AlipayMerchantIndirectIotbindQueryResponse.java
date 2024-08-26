package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.iotbind.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-17 11:28:28
 */
public class AlipayMerchantIndirectIotbindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4818856161168988687L;

	/** 
	 * 设备绑定状态：BIND代表绑定，UNBIND代表未绑定
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/** 
	 * 设备最新一次绑定时间（格式为yyyy-MM-dd HH:mm:ss）。如果设备没有绑定过或者已经解绑，该字段为空
	 */
	@ApiField("bind_time")
	private Date bindTime;

	/** 
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备SN号，阿里云物联网平台传设备deviceName
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 设备绑定的商户在支付宝体系内的唯一id,一般以2088开头。设备处于已绑定状态时会返回对应绑定商户id。如果设备没有绑定过或者已经解绑，该字段为空
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备sourceId号，阿里云物联网平台传设备productKey
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}
	public String getBindStatus( ) {
		return this.bindStatus;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}
	public Date getBindTime( ) {
		return this.bindTime;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierId( ) {
		return this.supplierId;
	}

}
