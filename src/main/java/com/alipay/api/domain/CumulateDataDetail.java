package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回传明细数据
 *
 * @author auto create
 * @since 1.0, 2021-02-01 10:50:43
 */
public class CumulateDataDetail extends AlipayObject {

	private static final long serialVersionUID = 2283523261242126972L;

	/**
	 * 数据回传的动作类型，正向或逆向。
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 回传数据发生的实际时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 回传数据类型。
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 优惠描述
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 数据回传时传入的外部业务号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 数据回传时逆向单据记录的对应正向单据的外部业务号。
	 */
	@ApiField("refer_out_biz_no")
	private String referOutBizNo;

	/**
	 * 回传数据子类型。
	 */
	@ApiField("sub_data_type")
	private String subDataType;

	/**
	 * 任务金额
	 */
	@ApiField("task_amount")
	private String taskAmount;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务次数
	 */
	@ApiField("task_times")
	private Long taskTimes;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReferOutBizNo() {
		return this.referOutBizNo;
	}
	public void setReferOutBizNo(String referOutBizNo) {
		this.referOutBizNo = referOutBizNo;
	}

	public String getSubDataType() {
		return this.subDataType;
	}
	public void setSubDataType(String subDataType) {
		this.subDataType = subDataType;
	}

	public String getTaskAmount() {
		return this.taskAmount;
	}
	public void setTaskAmount(String taskAmount) {
		this.taskAmount = taskAmount;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public Long getTaskTimes() {
		return this.taskTimes;
	}
	public void setTaskTimes(Long taskTimes) {
		this.taskTimes = taskTimes;
	}

}
