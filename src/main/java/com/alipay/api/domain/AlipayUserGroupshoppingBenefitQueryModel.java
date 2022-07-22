package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝&淘宝拼团成团成功后查询发奖
 *
 * @author auto create
 * @since 1.0, 2018-10-13 11:45:16
 */
public class AlipayUserGroupshoppingBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4891425713935852243L;

	/**
	 * 支付宝淘宝拼团的组团id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 拼团是否混合出资
	 */
	@ApiField("is_platform_invest")
	private Boolean isPlatformInvest;

	/**
	 * 淘宝支付宝拼团的商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 拼团原始价格
	 */
	@ApiField("original_prize")
	private String originalPrize;

	/**
	 * 拼团的价格
	 */
	@ApiField("pin_prize")
	private String pinPrize;

	/**
	 * 1表示拼团中；2表示拼团成功；3表示拼团失败
	 */
	@ApiField("pin_status")
	private String pinStatus;

	/**
	 * DETAIL_PAGE拼团详情页，FINISH_PAGE拼团成功页
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 当前已参团的用户id
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Boolean getIsPlatformInvest() {
		return this.isPlatformInvest;
	}
	public void setIsPlatformInvest(Boolean isPlatformInvest) {
		this.isPlatformInvest = isPlatformInvest;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOriginalPrize() {
		return this.originalPrize;
	}
	public void setOriginalPrize(String originalPrize) {
		this.originalPrize = originalPrize;
	}

	public String getPinPrize() {
		return this.pinPrize;
	}
	public void setPinPrize(String pinPrize) {
		this.pinPrize = pinPrize;
	}

	public String getPinStatus() {
		return this.pinStatus;
	}
	public void setPinStatus(String pinStatus) {
		this.pinStatus = pinStatus;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
