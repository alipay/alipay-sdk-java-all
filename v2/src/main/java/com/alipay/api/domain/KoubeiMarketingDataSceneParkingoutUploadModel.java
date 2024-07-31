package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * koubei.marketing.data.scene.parkingout.upload
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:02:55
 */
public class KoubeiMarketingDataSceneParkingoutUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7591237816121873422L;

	/**
	 * 停车出库场景业务参数
	 */
	@ApiField("biz_info")
	private ParkingOutScene bizInfo;

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

	public ParkingOutScene getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(ParkingOutScene bizInfo) {
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
