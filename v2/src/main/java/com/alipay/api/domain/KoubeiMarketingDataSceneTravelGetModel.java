package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取口碑商圈&店铺信息
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:11:02
 */
public class KoubeiMarketingDataSceneTravelGetModel extends AlipayObject {

	private static final long serialVersionUID = 2739898627532342161L;

	/**
	 * 出行营销场景业务参数
	 */
	@ApiField("biz_info")
	private TravelScene bizInfo;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 场景类型，固定值：TRAVEL
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public TravelScene getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(TravelScene bizInfo) {
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
