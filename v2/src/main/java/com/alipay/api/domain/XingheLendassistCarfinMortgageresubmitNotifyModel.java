package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抵押流程推进
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:03
 */
public class XingheLendassistCarfinMortgageresubmitNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7594595997452173555L;

	/**
	 * 协议文件
	 */
	@ApiListField("agreement_file_list")
	@ApiField("agreement_file")
	private List<AgreementFile> agreementFileList;

	/**
	 * 星河侧唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 需要替换的审核文件列表
	 */
	@ApiListField("approve_file_list")
	@ApiField("carfin_mortgage_received_file")
	private List<CarfinMortgageReceivedFile> approveFileList;

	/**
	 * 星河侧唯一支用申请单号
	 */
	@ApiField("lend_apply_no")
	private String lendApplyNo;

	/**
	 * 星河侧唯一抵押订单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 机构侧唯一支用申请单号
	 */
	@ApiField("out_lend_apply_no")
	private String outLendApplyNo;

	/**
	 * 重推时替换的车辆信息
	 */
	@ApiField("vehicle_info")
	private CarfinMortgageVehicleInfo vehicleInfo;

	public List<AgreementFile> getAgreementFileList() {
		return this.agreementFileList;
	}
	public void setAgreementFileList(List<AgreementFile> agreementFileList) {
		this.agreementFileList = agreementFileList;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public List<CarfinMortgageReceivedFile> getApproveFileList() {
		return this.approveFileList;
	}
	public void setApproveFileList(List<CarfinMortgageReceivedFile> approveFileList) {
		this.approveFileList = approveFileList;
	}

	public String getLendApplyNo() {
		return this.lendApplyNo;
	}
	public void setLendApplyNo(String lendApplyNo) {
		this.lendApplyNo = lendApplyNo;
	}

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getOutLendApplyNo() {
		return this.outLendApplyNo;
	}
	public void setOutLendApplyNo(String outLendApplyNo) {
		this.outLendApplyNo = outLendApplyNo;
	}

	public CarfinMortgageVehicleInfo getVehicleInfo() {
		return this.vehicleInfo;
	}
	public void setVehicleInfo(CarfinMortgageVehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

}
