package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.holographic.factor.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 17:47:46
 */
public class AlipayDataDataserviceHolographicFactorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1393946872392678218L;

	/** 
	 * 参数中文名称:身份证号
是否唯一：否
参数作用/应用场景：查询人脉因子和多头因子必备的用户三要素之一
枚举值：无
如何获取：商户传递给上数，上数传递到openapi
特殊说明：无
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 参数中文名称:用户手机号
是否唯一：否
参数作用/应用场景：查询人脉因子和多头因子必备的用户三要素之一
枚举值：无
如何获取：商户传递给上数，上数传递到openapi
特殊说明：无
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 参数中文名称:多头因子map打平成json的字符串
是否唯一：否
参数作用/应用场景：返回给上数商户全息报告中的多头因子
枚举值：无
如何获取：信用中台运行模型产生
特殊说明：无
	 */
	@ApiField("muti_loan_factor_map")
	private String mutiLoanFactorMap;

	/** 
	 * 参数中文名称:人脉因子map打平成json字符串
是否唯一：否
参数作用/应用场景：返回给上数商户全息报告中的人脉因子
枚举值：无
如何获取：信用中台运行模型产生
特殊说明：无
	 */
	@ApiField("rsm_factor_map")
	private String rsmFactorMap;

	/** 
	 * 参数中文名称:用户姓名
是否唯一：否
参数作用/应用场景：查询人脉因子和多头因子必备的用户三要素之一
枚举值：无
如何获取：商户传递给上数，上数传递到openapi
特殊说明：无
	 */
	@ApiField("user_name")
	private String userName;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setMutiLoanFactorMap(String mutiLoanFactorMap) {
		this.mutiLoanFactorMap = mutiLoanFactorMap;
	}
	public String getMutiLoanFactorMap( ) {
		return this.mutiLoanFactorMap;
	}

	public void setRsmFactorMap(String rsmFactorMap) {
		this.rsmFactorMap = rsmFactorMap;
	}
	public String getRsmFactorMap( ) {
		return this.rsmFactorMap;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
