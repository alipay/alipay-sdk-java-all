package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序删除收藏业务关系
 *
 * @author auto create
 * @since 1.0, 2019-11-21 19:56:26
 */
public class AlipayOpenMiniMiniappFavoriteextDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3822636646998729366L;

	/**
	 * 小程序收藏业务类型，需要申请分配
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * json格式，扩展信息，key是principleId，value是json串
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 小程序appid
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 收藏实体principleIds的来源，需要申请分配
	 */
	@ApiField("principal_biz_type")
	private String principalBizType;

	/**
	 * 业务id，比如口碑店铺id
	 */
	@ApiListField("principal_ids")
	@ApiField("string")
	private List<String> principalIds;

	/**
	 * 收藏实体的枚举类型，ITEM：商品，SHOP：店铺，SERVICE：服务
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPrincipalBizType() {
		return this.principalBizType;
	}
	public void setPrincipalBizType(String principalBizType) {
		this.principalBizType = principalBizType;
	}

	public List<String> getPrincipalIds() {
		return this.principalIds;
	}
	public void setPrincipalIds(List<String> principalIds) {
		this.principalIds = principalIds;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
