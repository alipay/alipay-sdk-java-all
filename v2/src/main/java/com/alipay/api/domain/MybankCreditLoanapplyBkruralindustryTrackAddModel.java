package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农村埋点信息
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:13:14
 */
public class MybankCreditLoanapplyBkruralindustryTrackAddModel extends AlipayObject {

	private static final long serialVersionUID = 2459953771832876557L;

	/**
	 * 业务编号
	 */
	@ApiField("business_no")
	private String businessNo;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用户编号类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 代表唯一的请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 埋点数据
	 */
	@ApiField("track_data")
	private String trackData;

	/**
	 * 用户编号
	 */
	@ApiField("uid")
	private String uid;

	public String getBusinessNo() {
		return this.businessNo;
	}
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTrackData() {
		return this.trackData;
	}
	public void setTrackData(String trackData) {
		this.trackData = trackData;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
