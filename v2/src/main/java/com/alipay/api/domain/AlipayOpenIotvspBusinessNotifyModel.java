package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核身业务结果通知
 *
 * @author auto create
 * @since 1.0, 2023-06-09 19:31:17
 */
public class AlipayOpenIotvspBusinessNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3397275584752112285L;

	/**
	 * 业务信息列表
	 */
	@ApiListField("business_list")
	@ApiField("business_info_request")
	private List<BusinessInfoRequest> businessList;

	/**
	 * ISV的PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 人员标签，如酒店住客:guest
	 */
	@ApiField("label_out_no")
	private String labelOutNo;

	/**
	 * 对象类型，详见对象定义
	 */
	@ApiField("notify_event_param")
	private NotifyEventParam notifyEventParam;

	/**
	 * 机构编码
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 场景码，用于区别不同的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户唯一标识
	 */
	@ApiField("vid")
	private String vid;

	public List<BusinessInfoRequest> getBusinessList() {
		return this.businessList;
	}
	public void setBusinessList(List<BusinessInfoRequest> businessList) {
		this.businessList = businessList;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getLabelOutNo() {
		return this.labelOutNo;
	}
	public void setLabelOutNo(String labelOutNo) {
		this.labelOutNo = labelOutNo;
	}

	public NotifyEventParam getNotifyEventParam() {
		return this.notifyEventParam;
	}
	public void setNotifyEventParam(NotifyEventParam notifyEventParam) {
		this.notifyEventParam = notifyEventParam;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
