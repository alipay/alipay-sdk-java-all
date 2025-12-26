package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改用户积分
 *
 * @author auto create
 * @since 1.0, 2025-11-28 16:12:41
 */
public class AlipayCommerceOperationTaskbenefitcenterPointModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2311952163158937853L;

	/**
	 * 变动积分，以积分为单位
	 */
	@ApiField("change_num")
	private Long changeNum;

	/**
	 * 变动类型
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 商户自定义的积分变动事件编码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 对积分变动事件的详细描述
	 */
	@ApiField("event_desc")
	private String eventDesc;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 积分类型的唯一标识码，用于区分不同种类的积分
	 */
	@ApiField("point_code")
	private String pointCode;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Long getChangeNum() {
		return this.changeNum;
	}
	public void setChangeNum(Long changeNum) {
		this.changeNum = changeNum;
	}

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventDesc() {
		return this.eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPointCode() {
		return this.pointCode;
	}
	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
