package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信息回传接口
 *
 * @author auto create
 * @since 1.0, 2025-10-22 15:48:03
 */
public class XingheLendassistCarfinInstinfoNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8136793725842618783L;

	/**
	 * 星河侧唯一业务编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 车辆信息，详情见下面CarInfo参数
	 */
	@ApiField("car_info")
	private CarInfo carInfo;

	/**
	 * 车管所所在区
	 */
	@ApiField("dmv_location")
	private DMVLocation dmvLocation;

	/**
	 * 文件列表
	 */
	@ApiListField("file_list")
	@ApiField("file_detail")
	private List<FileDetail> fileList;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 传输信息列表，指定回传信息
	 */
	@ApiListField("postback_list")
	@ApiField("string")
	private List<String> postbackList;

	/**
	 * 车辆估值信息，详情见下面ValuationInfo参数
	 */
	@ApiField("valuation_info")
	private ValuationInfo valuationInfo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public CarInfo getCarInfo() {
		return this.carInfo;
	}
	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}

	public DMVLocation getDmvLocation() {
		return this.dmvLocation;
	}
	public void setDmvLocation(DMVLocation dmvLocation) {
		this.dmvLocation = dmvLocation;
	}

	public List<FileDetail> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<FileDetail> fileList) {
		this.fileList = fileList;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public List<String> getPostbackList() {
		return this.postbackList;
	}
	public void setPostbackList(List<String> postbackList) {
		this.postbackList = postbackList;
	}

	public ValuationInfo getValuationInfo() {
		return this.valuationInfo;
	}
	public void setValuationInfo(ValuationInfo valuationInfo) {
		this.valuationInfo = valuationInfo;
	}

}
