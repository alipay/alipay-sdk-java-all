package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业个性化信息
 *
 * @author auto create
 * @since 1.0, 2024-07-04 19:16:48
 */
public class EnterpriseProfilesDTO extends AlipayObject {

	private static final long serialVersionUID = 3578129197224454452L;

	/**
	 * 是否需创建企业人脸库，适用于对接团餐刷脸付、门禁刷脸通行等场景；不传默认为 false，传 true 时会自动创建 IOT 设备企业人脸库，人脸库创建失败会阻塞企业的创建。
	 */
	@ApiField("create_iot_group")
	private Boolean createIotGroup;

	/**
	 * 用于区分资金因公付协议、以及收银台文案等差异；不传默认为ISV_QYM。
	 */
	@ApiField("fund_biz_scene")
	private String fundBizScene;

	/**
	 * 订购支付宝「一脸通行开通插件」的小程序appId
	 */
	@ApiField("group_app_id")
	private String groupAppId;

	public Boolean getCreateIotGroup() {
		return this.createIotGroup;
	}
	public void setCreateIotGroup(Boolean createIotGroup) {
		this.createIotGroup = createIotGroup;
	}

	public String getFundBizScene() {
		return this.fundBizScene;
	}
	public void setFundBizScene(String fundBizScene) {
		this.fundBizScene = fundBizScene;
	}

	public String getGroupAppId() {
		return this.groupAppId;
	}
	public void setGroupAppId(String groupAppId) {
		this.groupAppId = groupAppId;
	}

}
