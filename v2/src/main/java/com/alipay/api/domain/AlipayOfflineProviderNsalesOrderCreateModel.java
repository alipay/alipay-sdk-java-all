package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卖进订单创建
 *
 * @author auto create
 * @since 1.0, 2025-04-01 14:52:13
 */
public class AlipayOfflineProviderNsalesOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1112638439415331494L;

	/**
	 * 卖进后设备绑定需要的账号信息列表
	 */
	@ApiListField("device_record_files")
	@ApiField("device_record_info")
	private List<DeviceRecordInfo> deviceRecordFiles;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 卖进扩展信息
	 */
	@ApiField("sales_solution_ext")
	private SalesSolutionExt salesSolutionExt;

	/**
	 * 卖进后对应的设备绑定场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 卖进方案id，必传
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 相对超时时间，取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论订单何时创建，都在0点关闭），不允许传入小数。不传时默认值：30m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public List<DeviceRecordInfo> getDeviceRecordFiles() {
		return this.deviceRecordFiles;
	}
	public void setDeviceRecordFiles(List<DeviceRecordInfo> deviceRecordFiles) {
		this.deviceRecordFiles = deviceRecordFiles;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public SalesSolutionExt getSalesSolutionExt() {
		return this.salesSolutionExt;
	}
	public void setSalesSolutionExt(SalesSolutionExt salesSolutionExt) {
		this.salesSolutionExt = salesSolutionExt;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
