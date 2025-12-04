package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterfaceInfoList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:54
 */
public class AlipayEcoMycarParkingConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8649564764516241977L;

	/** 
	 * 签约支付宝账号，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 业务接口列表数据
Json格式数据
	 */
	@ApiField("interface_info_list")
	private InterfaceInfoList interfaceInfoList;

	/** 
	 * 商户在停车平台首页露出的LOGO链接地址，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)调用自动生成该链接
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/** 
	 * 商户简称，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户客服电话，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setInterfaceInfoList(InterfaceInfoList interfaceInfoList) {
		this.interfaceInfoList = interfaceInfoList;
	}
	public InterfaceInfoList getInterfaceInfoList( ) {
		return this.interfaceInfoList;
	}

	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}
	public String getMerchantLogo( ) {
		return this.merchantLogo;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}
	public String getMerchantServicePhone( ) {
		return this.merchantServicePhone;
	}

}
