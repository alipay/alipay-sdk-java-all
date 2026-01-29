package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机器人任务创建
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:42
 */
public class RobbyOpenTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5427558593265948295L;

	/**
	 * null
	 */
	@ApiListField("biz_info_list")
	@ApiField("biz_info_map")
	private List<BizInfoMap> bizInfoList;

	/**
	 * 业务编号，如用户侧订单编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息，附属的其他信息
	 */
	@ApiField("ext_info")
	private OtherInfo extInfo;

	/**
	 * 场景类型，根据自己的业务类型填值，具体查看枚举值
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 机器人编号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 子业务编号，全局唯一，如用户侧订单有多个批次，批次号是当前订单的子业务编号
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

	/**
	 * 任务类型，根据自己的业务类型填值，如 PICK_UP
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 任务执行超时时间，超过此设置的超时时间未执行成功即为执行失败，单位：秒
	 */
	@ApiField("time_out")
	private Long timeOut;

	public List<BizInfoMap> getBizInfoList() {
		return this.bizInfoList;
	}
	public void setBizInfoList(List<BizInfoMap> bizInfoList) {
		this.bizInfoList = bizInfoList;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public OtherInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(OtherInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSubBizNo() {
		return this.subBizNo;
	}
	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Long getTimeOut() {
		return this.timeOut;
	}
	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}

}
