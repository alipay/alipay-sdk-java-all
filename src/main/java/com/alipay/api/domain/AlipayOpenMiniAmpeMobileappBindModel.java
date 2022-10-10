package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 移动应用绑定
 *
 * @author auto create
 * @since 1.0, 2020-07-06 15:04:11
 */
public class AlipayOpenMiniAmpeMobileappBindModel extends AlipayObject {

	private static final long serialVersionUID = 1117198115864142459L;

	/**
	 * 移动应用签名
	 */
	@ApiField("app_sign")
	private String appSign;

	/**
	 * 移动应用id
	 */
	@ApiField("mobile_app_id")
	private String mobileAppId;

	/**
	 * 产品ID列表
	 */
	@ApiListField("product_id_list")
	@ApiField("number")
	private List<Long> productIdList;

	/**
	 * 场景码，申请后平台分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAppSign() {
		return this.appSign;
	}
	public void setAppSign(String appSign) {
		this.appSign = appSign;
	}

	public String getMobileAppId() {
		return this.mobileAppId;
	}
	public void setMobileAppId(String mobileAppId) {
		this.mobileAppId = mobileAppId;
	}

	public List<Long> getProductIdList() {
		return this.productIdList;
	}
	public void setProductIdList(List<Long> productIdList) {
		this.productIdList = productIdList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
