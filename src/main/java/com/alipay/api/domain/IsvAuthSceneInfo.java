package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代运营授权场景信息
 *
 * @author auto create
 * @since 1.0, 2021-11-10 05:00:31
 */
public class IsvAuthSceneInfo extends AlipayObject {

	private static final long serialVersionUID = 2547794376111555736L;

	/**
	 * 运营场景编码
OPERATION_POINTS：管理运营积分
SHOP_MANAGE：管理门店信息
MINI_APP_OPER：运营支付宝小程序
PROMOTION_MANAGE：运营营销活动
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 运营场景下的权限编码，多个权限编码以,隔开
1、管理门店信息：SHOP_MANAGE；基础权限（升级）：SHOP_MANAGE_BASE
2、运营营销活动：PROMOTION_MANAGE ；基础权限（升级）：PROMOTION_MANAGE_BASE
3、运营支付宝小程序：MINI_APP_OPER；基础权限（升级）：MINI_APP_OPER_BASE
4、管理运营积分：OPERATION_POINTS；基础权限（升级）：OPERATION_POINTS_BASE
	 */
	@ApiField("scene_permissions")
	private String scenePermissions;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getScenePermissions() {
		return this.scenePermissions;
	}
	public void setScenePermissions(String scenePermissions) {
		this.scenePermissions = scenePermissions;
	}

}
