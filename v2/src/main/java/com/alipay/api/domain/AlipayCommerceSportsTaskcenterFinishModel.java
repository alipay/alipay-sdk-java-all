package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 完成用户任务
 *
 * @author auto create
 * @since 1.0, 2023-07-11 20:02:10
 */
public class AlipayCommerceSportsTaskcenterFinishModel extends AlipayObject {

	private static final long serialVersionUID = 2342661748962515881L;

	/**
	 * 用户在支付宝APP或服务商小程序选择的城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 服务商业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
