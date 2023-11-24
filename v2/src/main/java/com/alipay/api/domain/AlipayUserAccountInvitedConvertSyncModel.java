package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 被邀请者淘宝端转化同步
 *
 * @author auto create
 * @since 1.0, 2023-04-21 17:24:15
 */
public class AlipayUserAccountInvitedConvertSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4814129647561495622L;

	/**
	 * 业务转化数据内容
	 */
	@ApiField("biz_ext_info")
	private String bizExtInfo;

	/**
	 * 转化标签
	 */
	@ApiField("convert_tag")
	private String convertTag;

	/**
	 * OpenId网关转换字段
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户转换同步场景
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝userid加密后token
	 */
	@ApiField("user_token")
	private String userToken;

	public String getBizExtInfo() {
		return this.bizExtInfo;
	}
	public void setBizExtInfo(String bizExtInfo) {
		this.bizExtInfo = bizExtInfo;
	}

	public String getConvertTag() {
		return this.convertTag;
	}
	public void setConvertTag(String convertTag) {
		this.convertTag = convertTag;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
