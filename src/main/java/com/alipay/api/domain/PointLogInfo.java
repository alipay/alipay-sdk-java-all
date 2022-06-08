package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 详细数据
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:18:50
 */
public class PointLogInfo extends AlipayObject {

	private static final long serialVersionUID = 1544878782742995341L;

	/**
	 * 积分明细数量
	 */
	@ApiField("point_log_amount")
	private String pointLogAmount;

	/**
	 * 积分明细时间
格式 “yyyy.MM.dd HH:mm:ss”
	 */
	@ApiField("point_log_date")
	private String pointLogDate;

	/**
	 * 积分明细id，唯一标识
	 */
	@ApiField("point_log_id")
	private String pointLogId;

	/**
	 * 积分明细标题
	 */
	@ApiField("point_log_title")
	private String pointLogTitle;

	public String getPointLogAmount() {
		return this.pointLogAmount;
	}
	public void setPointLogAmount(String pointLogAmount) {
		this.pointLogAmount = pointLogAmount;
	}

	public String getPointLogDate() {
		return this.pointLogDate;
	}
	public void setPointLogDate(String pointLogDate) {
		this.pointLogDate = pointLogDate;
	}

	public String getPointLogId() {
		return this.pointLogId;
	}
	public void setPointLogId(String pointLogId) {
		this.pointLogId = pointLogId;
	}

	public String getPointLogTitle() {
		return this.pointLogTitle;
	}
	public void setPointLogTitle(String pointLogTitle) {
		this.pointLogTitle = pointLogTitle;
	}

}
