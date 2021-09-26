package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-15 17:00:22
 */
public class ZhimaMerchantOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6725251675963727253L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 渠道来源
	 */
	@ApiField("channel_id")
	private String channelId;

	/** 
	 * 本次订单信用权益金额（如免押、极速付）
	 */
	@ApiField("credit_amout")
	private String creditAmout;

	/** 
	 * 民族
	 */
	@ApiField("ethnic_group")
	private String ethnicGroup;

	/** 
	 * 住宅地址，如：西湖区文三路168号
	 */
	@ApiField("house")
	private String house;

	/** 
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 蚂蚁开放平台商户不在使用此字段
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 人脸核身结果
	 */
	@ApiField("zm_face")
	private String zmFace;

	/** 
	 * 较差、中等、良好、优秀、极好5个级别
	 */
	@ApiField("zm_grade")
	private String zmGrade;

	/** 
	 * 芝麻风控产品集联合结果,Y/N
	 */
	@ApiField("zm_risk")
	private String zmRisk;

	/** 
	 * 芝麻分
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getChannelId( ) {
		return this.channelId;
	}

	public void setCreditAmout(String creditAmout) {
		this.creditAmout = creditAmout;
	}
	public String getCreditAmout( ) {
		return this.creditAmout;
	}

	public void setEthnicGroup(String ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
	}
	public String getEthnicGroup( ) {
		return this.ethnicGroup;
	}

	public void setHouse(String house) {
		this.house = house;
	}
	public String getHouse( ) {
		return this.house;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setZmFace(String zmFace) {
		this.zmFace = zmFace;
	}
	public String getZmFace( ) {
		return this.zmFace;
	}

	public void setZmGrade(String zmGrade) {
		this.zmGrade = zmGrade;
	}
	public String getZmGrade( ) {
		return this.zmGrade;
	}

	public void setZmRisk(String zmRisk) {
		this.zmRisk = zmRisk;
	}
	public String getZmRisk( ) {
		return this.zmRisk;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
