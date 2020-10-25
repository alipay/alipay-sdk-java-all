package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户前置营销内容咨询接口
 *
 * @author auto create
 * @since 1.0, 2020-10-22 17:11:22
 */
public class AlipayPayAppMarketingConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2183438874352831726L;

	/**
	 * 业务场景，用于区分商户具体的咨场景，示例：
OPENING_PAGE：开屏页营销咨询；
ORDER_PAGE：下单页营销咨询
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 使用morse匿名技术对原始手机号MD5值进行盲化后的结果(可通过morse工具包生成)；
若接口调用采用morse匿名方式，此字段必须与混淆后的手机号列表(confused_mobile_list)字段一起传入，二者缺一不可
	 */
	@ApiField("blind_mobile")
	private String blindMobile;

	/**
	 * 混淆后的手机号MD5值列表；
若接口调用采用morse匿名方式，此字段必须与盲化的原始手机号MD5值(blind_mobile)字段一起传入，二者缺一不可；
	 */
	@ApiListField("confused_mobile_list")
	@ApiField("string")
	private List<String> confusedMobileList;

	/**
	 * 设备号密文，使用SHA256加密；设备号类型由device_type字段指定；（手机号、设备号或morse匿名查询，三种匹配方式至少有一种参数不能为空）
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备号类型，与设备号device_id字段组合使用，默认为IMEI
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 手机号md5值密文；（手机号、设备号或morse匿名查询，三种匹配方式至少有一种参数不能为空）
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 已废弃不支持
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBlindMobile() {
		return this.blindMobile;
	}
	public void setBlindMobile(String blindMobile) {
		this.blindMobile = blindMobile;
	}

	public List<String> getConfusedMobileList() {
		return this.confusedMobileList;
	}
	public void setConfusedMobileList(List<String> confusedMobileList) {
		this.confusedMobileList = confusedMobileList;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
