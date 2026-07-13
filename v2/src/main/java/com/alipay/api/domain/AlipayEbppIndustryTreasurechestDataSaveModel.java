package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 办事保险箱数据保存
 *
 * @author auto create
 * @since 1.0, 2026-06-16 13:43:41
 */
public class AlipayEbppIndustryTreasurechestDataSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2383194385912473596L;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("save_data_item_d_t_o")
	private List<SaveDataItemDTO> items;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 在市民中心办事保险箱注册的授权场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public List<SaveDataItemDTO> getItems() {
		return this.items;
	}
	public void setItems(List<SaveDataItemDTO> items) {
		this.items = items;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
