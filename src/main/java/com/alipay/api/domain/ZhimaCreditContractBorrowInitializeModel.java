package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 借还合约初始化
 *
 * @author auto create
 * @since 1.0, 2019-07-31 14:03:12
 */
public class ZhimaCreditContractBorrowInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4181555826555922268L;

	/**
	 * 用户加入合约成功后跳转的小程序地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 外部类目,样例：图书馆:book
	 */
	@ApiField("category")
	private String category;

	/**
	 * 扩展字段，目前留空
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 是否isv模式，0:非ISV模式,1:isv模式
	 */
	@ApiField("isv_mode")
	private String isvMode;

	/**
	 * 0:二维码扫描模式 1：扫码枪模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 加入合约成功后的异步通知页面，一般为http的地址，在收到通知后，商户做自身的业务逻辑处理
	 */
	@ApiListField("notify_addr")
	@ApiField("string")
	private List<String> notifyAddr;

	/**
	 * 商户自定义的外部订单号
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 以28开头的二维码字符串，在mode=1(扫码枪模式)下必须传
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 商户入驻芝麻服务后，得到的服务id，在服务入驻后台可看到
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

	public String getIsvMode() {
		return this.isvMode;
	}
	public void setIsvMode(String isvMode) {
		this.isvMode = isvMode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<String> getNotifyAddr() {
		return this.notifyAddr;
	}
	public void setNotifyAddr(List<String> notifyAddr) {
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
