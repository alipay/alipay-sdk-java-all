package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违规记录列表查询
 *
 * @author auto create
 * @since 1.0, 2023-07-24 10:41:03
 */
public class AlipayOpenViolationViolationeventBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4666512643493342499L;

	/**
	 * 查询开始时间 时间格式：yyyy-MM-dd HH:mm:ss 若不填写，则默认当前时间30天前。 注意：begin_time和end_time时间跨度最大一年
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 查询结束时间 时间格式：yyyy-MM-dd HH:mm:ss 若不填写，则默认当前时间。 注意：begin_time和end_time时间跨度最大一年
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 违规工单状态
	 */
	@ApiField("status")
	private String status;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
