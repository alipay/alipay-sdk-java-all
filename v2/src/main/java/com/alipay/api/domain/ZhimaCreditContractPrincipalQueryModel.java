package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份主体查询接口
 *
 * @author auto create
 * @since 1.0, 2021-07-30 14:34:55
 */
public class ZhimaCreditContractPrincipalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6114527648622328898L;

	/**
	 * 用户加入合约成功后跳转的小程序地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 外部类目,样例：BOOK：图书。目前仅支持图书，后续会开放更多类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 扩展字段，目前留空
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 0:二维码扫描模式 1：扫码枪模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 授权成功后的异步通知页面，一般为http的地址，在收到通知后，商户做自身的业务逻辑处理
	 */
	@ApiField("notify_addr")
	private String notifyAddr;

	/**
	 * 外部订单号。需要商户确保唯一性。
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 以28开头的二维码字符串，在mode=1(扫码枪模式)下必须传
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 信用服务id，商户入驻芝麻服务后，得到的服务id，在服务入驻后台可看到。
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getNotifyAddr() {
		return this.notifyAddr;
	}
	public void setNotifyAddr(String notifyAddr) {
		this.notifyAddr = notifyAddr;
	}

	public String getOutTransNo() {
		return this.outTransNo;
	}
	public void setOutTransNo(String outTransNo) {
		this.outTransNo = outTransNo;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
