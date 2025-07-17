package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解绑移动应用
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:58:50
 */
public class AlipayOpenMiniAmpeMobileappUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 4166647998734978811L;

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
