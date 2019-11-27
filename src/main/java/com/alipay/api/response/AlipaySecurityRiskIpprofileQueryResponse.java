package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.ipprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityRiskIpprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2854316732976411275L;

	/** 
	 * IP地址
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/** 
	 * IP归属运营商所属市
	 */
	@ApiField("ip_carrier_city")
	private String ipCarrierCity;

	/** 
	 * IP归属运营商所属区县
	 */
	@ApiField("ip_carrier_district")
	private String ipCarrierDistrict;

	/** 
	 * IP归属运营商所属省
	 */
	@ApiField("ip_carrier_province")
	private String ipCarrierProvince;

	/** 
	 * 真实使用地所在市
	 */
	@ApiField("ip_gps_city")
	private String ipGpsCity;

	/** 
	 * 真实使用地所在区县
	 */
	@ApiField("ip_gps_district")
	private String ipGpsDistrict;

	/** 
	 * 真实使用地所在省
	 */
	@ApiField("ip_gps_province")
	private String ipGpsProvince;

	/** 
	 * IP最大概率经纬度点的纬度
	 */
	@ApiField("ip_latitude")
	private String ipLatitude;

	/** 
	 * IP最大概率经纬度点的经度
	 */
	@ApiField("ip_longitude")
	private String ipLongitude;

	/** 
	 * 近三个月是否发生过案件
	 */
	@ApiField("is_case_threemonth")
	private String isCaseThreemonth;

	/** 
	 * 是否3G/4G等基站类IP
	 */
	@ApiField("is_cellular_ip")
	private String isCellularIp;

	/** 
	 * 是否教育网IP
	 */
	@ApiField("is_edu_ip")
	private String isEduIp;

	/** 
	 * 是否IDCIP
	 */
	@ApiField("is_idc_ip")
	private String isIdcIp;

	/** 
	 * 是否境外IP
	 */
	@ApiField("is_oversea_ip")
	private String isOverseaIp;

	/** 
	 * 是否代理IP
	 */
	@ApiField("is_proxy_ip")
	private String isProxyIp;

	/** 
	 * 身份证持有人使用当前IP的概率
	 */
	@ApiField("net_cert_ratio")
	private String netCertRatio;

	/** 
	 * 手机号持有人使用当前IP的概率
	 */
	@ApiField("net_phone_ratio")
	private String netPhoneRatio;

	/** 
	 * IP使用时间类型
	 */
	@ApiField("usage_time_type")
	private String usageTimeType;

	/** 
	 * IP上近半年的活跃用户数
	 */
	@ApiField("user_cnt_halfyear")
	private String userCntHalfyear;

	/** 
	 * IP上周活跃平均用户数
	 */
	@ApiField("user_cnt_weekavg")
	private String userCntWeekavg;

	/** 
	 * IP上周用户数波动指数
	 */
	@ApiField("user_cnt_weekstddev")
	private String userCntWeekstddev;

	/** 
	 * IP上活跃用户的稳定指数
	 */
	@ApiField("user_stability")
	private String userStability;

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getIpAddress( ) {
		return this.ipAddress;
	}

	public void setIpCarrierCity(String ipCarrierCity) {
		this.ipCarrierCity = ipCarrierCity;
	}
	public String getIpCarrierCity( ) {
		return this.ipCarrierCity;
	}

	public void setIpCarrierDistrict(String ipCarrierDistrict) {
		this.ipCarrierDistrict = ipCarrierDistrict;
	}
	public String getIpCarrierDistrict( ) {
		return this.ipCarrierDistrict;
	}

	public void setIpCarrierProvince(String ipCarrierProvince) {
		this.ipCarrierProvince = ipCarrierProvince;
	}
	public String getIpCarrierProvince( ) {
		return this.ipCarrierProvince;
	}

	public void setIpGpsCity(String ipGpsCity) {
		this.ipGpsCity = ipGpsCity;
	}
	public String getIpGpsCity( ) {
		return this.ipGpsCity;
	}

	public void setIpGpsDistrict(String ipGpsDistrict) {
		this.ipGpsDistrict = ipGpsDistrict;
	}
	public String getIpGpsDistrict( ) {
		return this.ipGpsDistrict;
	}

	public void setIpGpsProvince(String ipGpsProvince) {
		this.ipGpsProvince = ipGpsProvince;
	}
	public String getIpGpsProvince( ) {
		return this.ipGpsProvince;
	}

	public void setIpLatitude(String ipLatitude) {
		this.ipLatitude = ipLatitude;
	}
	public String getIpLatitude( ) {
		return this.ipLatitude;
	}

	public void setIpLongitude(String ipLongitude) {
		this.ipLongitude = ipLongitude;
	}
	public String getIpLongitude( ) {
		return this.ipLongitude;
	}

	public void setIsCaseThreemonth(String isCaseThreemonth) {
		this.isCaseThreemonth = isCaseThreemonth;
	}
	public String getIsCaseThreemonth( ) {
		return this.isCaseThreemonth;
	}

	public void setIsCellularIp(String isCellularIp) {
		this.isCellularIp = isCellularIp;
	}
	public String getIsCellularIp( ) {
		return this.isCellularIp;
	}

	public void setIsEduIp(String isEduIp) {
		this.isEduIp = isEduIp;
	}
	public String getIsEduIp( ) {
		return this.isEduIp;
	}

	public void setIsIdcIp(String isIdcIp) {
		this.isIdcIp = isIdcIp;
	}
	public String getIsIdcIp( ) {
		return this.isIdcIp;
	}

	public void setIsOverseaIp(String isOverseaIp) {
		this.isOverseaIp = isOverseaIp;
	}
	public String getIsOverseaIp( ) {
		return this.isOverseaIp;
	}

	public void setIsProxyIp(String isProxyIp) {
		this.isProxyIp = isProxyIp;
	}
	public String getIsProxyIp( ) {
		return this.isProxyIp;
	}

	public void setNetCertRatio(String netCertRatio) {
		this.netCertRatio = netCertRatio;
	}
	public String getNetCertRatio( ) {
		return this.netCertRatio;
	}

	public void setNetPhoneRatio(String netPhoneRatio) {
		this.netPhoneRatio = netPhoneRatio;
	}
	public String getNetPhoneRatio( ) {
		return this.netPhoneRatio;
	}

	public void setUsageTimeType(String usageTimeType) {
		this.usageTimeType = usageTimeType;
	}
	public String getUsageTimeType( ) {
		return this.usageTimeType;
	}

	public void setUserCntHalfyear(String userCntHalfyear) {
		this.userCntHalfyear = userCntHalfyear;
	}
	public String getUserCntHalfyear( ) {
		return this.userCntHalfyear;
	}

	public void setUserCntWeekavg(String userCntWeekavg) {
		this.userCntWeekavg = userCntWeekavg;
	}
	public String getUserCntWeekavg( ) {
		return this.userCntWeekavg;
	}

	public void setUserCntWeekstddev(String userCntWeekstddev) {
		this.userCntWeekstddev = userCntWeekstddev;
	}
	public String getUserCntWeekstddev( ) {
		return this.userCntWeekstddev;
	}

	public void setUserStability(String userStability) {
		this.userStability = userStability;
	}
	public String getUserStability( ) {
		return this.userStability;
	}

}
