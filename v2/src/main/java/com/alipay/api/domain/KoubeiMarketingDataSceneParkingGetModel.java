package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户场景广告投放
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:03:29
 */
public class KoubeiMarketingDataSceneParkingGetModel extends AlipayObject {

	private static final long serialVersionUID = 2346635159215991365L;

	/**
	 * 停车场景业务参数
	 */
	@ApiField("biz_info")
	private ParkingScene bizInfo;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部请求号，确保唯一，用于幂等控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public ParkingScene getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(ParkingScene bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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

}
