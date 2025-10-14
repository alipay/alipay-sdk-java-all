package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 巡检平台数据同步
 *
 * @author auto create
 * @since 1.0, 2019-03-20 21:37:20
 */
public class AlipayEbppInspectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3615739945145645781L;

	/**
	 * 业务类型。由巡检平台统一分配。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 数据创建者
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 数据来源: 业务系统名称_TrSync
	 */
	@ApiField("data_from_type")
	private String dataFromType;

	/**
	 * 是否同步检测。true-同步检测，false-不需要同步检测。默认false。
	 */
	@ApiField("is_sync_check")
	private Boolean isSyncCheck;

	/**
	 * 外部流程业务标识。一个标识可以同步多条数据。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务服务数据列表
	 */
	@ApiListField("service_list")
	@ApiField("mst_data_sync_service_entity")
	private List<MstDataSyncServiceEntity> serviceList;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDataFromType() {
		return this.dataFromType;
	}
	public void setDataFromType(String dataFromType) {
		this.dataFromType = dataFromType;
	}

	public Boolean getIsSyncCheck() {
		return this.isSyncCheck;
	}
	public void setIsSyncCheck(Boolean isSyncCheck) {
		this.isSyncCheck = isSyncCheck;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<MstDataSyncServiceEntity> getServiceList() {
		return this.serviceList;
	}
	public void setServiceList(List<MstDataSyncServiceEntity> serviceList) {
		this.serviceList = serviceList;
	}

}
