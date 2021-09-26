package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建处理中的分佣任务信息
审批阶段，分佣任务尚未创建，只返回状态等信息
任务尚未创建，因此不分配任务ID
 *
 * @author auto create
 * @since 1.0, 2017-04-11 14:05:02
 */
public class KbAdvertProcessMissionResponse extends AlipayObject {

	private static final long serialVersionUID = 6893678376815553972L;

	/**
	 * 标识ID
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 主键类型
activity_id：运营活动ID
voucher：商品ID
mission：分佣任务ID
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 任务状态
UNCONFIRMED-未确认（代表任务还在等待商户确认）
EFFECTIVE-有效
INVALID-无效
	 */
	@ApiField("promote_status")
	private String promoteStatus;

	public String getIdentify() {
		return this.identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getIdentifyType() {
		return this.identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public String getPromoteStatus() {
		return this.promoteStatus;
	}
	public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}

}
