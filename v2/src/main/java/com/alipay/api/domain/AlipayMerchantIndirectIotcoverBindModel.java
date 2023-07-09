package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连IoT设备标准化覆盖绑定接口
 *
 * @author auto create
 * @since 1.0, 2023-05-15 09:49:50
 */
public class AlipayMerchantIndirectIotcoverBindModel extends AlipayObject {

	private static final long serialVersionUID = 7171695592577471375L;

	/**
	 * 声网入网申请单编号编号是由服务商和支付宝BD录入IoT设备接入协议后生成的，用于后续政策返佣、播报跟踪等重要场景。需要联系支付宝的业务经理获取。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备SN号，阿里云物联网平台传设备deviceName
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 间连商户在支付宝体系内的唯一id,一般以2088开头。
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 不同物联网平台接入渠道不同值，支付宝物联网平台传设备sourceId号，阿里云物联网平台传设备productKey。
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
