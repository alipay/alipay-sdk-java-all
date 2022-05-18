package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 停车ISV系统配置接口
 *
 * @author auto create
 * @since 1.0, 2020-12-21 17:54:01
 */
public class AlipayEcoMycarParkingConfigSetModel extends AlipayObject {

	private static final long serialVersionUID = 4619715915953922712L;

	/**
	 * 签约支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 接口信息列表，停车业务需要配置的接口列表，该值为JSON数据格式的LIST对象，现阶段只需要配置一个页面接口即可 。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
	 */
	@ApiListField("interface_info_list")
	@ApiField("interface_info_list")
	private List<InterfaceInfoList> interfaceInfoList;

	/**
	 * 商户在停车平台首页露出的LOGO。
注意：
*该图片为PNG格式，内容为BASE64的字符串，建议图片尺寸27px*27px，大小不要超过60K。
*若为空则停车平台首页将不露出商户LOGO。
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商户简称，由开发者提供
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户客服电话
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public List<InterfaceInfoList> getInterfaceInfoList() {
		return this.interfaceInfoList;
	}
	public void setInterfaceInfoList(List<InterfaceInfoList> interfaceInfoList) {
		this.interfaceInfoList = interfaceInfoList;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantServicePhone() {
		return this.merchantServicePhone;
	}
	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}

}
