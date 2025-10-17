package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZmCarOwnerDrivingLicenseInfo;
import com.alipay.api.domain.ZmCarOwnerIdentityInfo;
import com.alipay.api.domain.ZmCarOwnerVehicleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.zmcard.carowner.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 17:47:40
 */
public class ZhimaCustomerZmcardCarownerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3674571457384892785L;

	/** 
	 * 车主名片驾驶证信息
	 */
	@ApiField("driving_license_info")
	private ZmCarOwnerDrivingLicenseInfo drivingLicenseInfo;

	/** 
	 * 车主名片用户身份信息
	 */
	@ApiField("identity_info")
	private ZmCarOwnerIdentityInfo identityInfo;

	/** 
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/** 
	 * 车主名片车辆信息列表
	 */
	@ApiListField("vehicle_info_list")
	@ApiField("zm_car_owner_vehicle_info")
	private List<ZmCarOwnerVehicleInfo> vehicleInfoList;

	public void setDrivingLicenseInfo(ZmCarOwnerDrivingLicenseInfo drivingLicenseInfo) {
		this.drivingLicenseInfo = drivingLicenseInfo;
	}
	public ZmCarOwnerDrivingLicenseInfo getDrivingLicenseInfo( ) {
		return this.drivingLicenseInfo;
	}

	public void setIdentityInfo(ZmCarOwnerIdentityInfo identityInfo) {
		this.identityInfo = identityInfo;
	}
	public ZmCarOwnerIdentityInfo getIdentityInfo( ) {
		return this.identityInfo;
	}

	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}
	public String getOutAgreementNo( ) {
		return this.outAgreementNo;
	}

	public void setVehicleInfoList(List<ZmCarOwnerVehicleInfo> vehicleInfoList) {
		this.vehicleInfoList = vehicleInfoList;
	}
	public List<ZmCarOwnerVehicleInfo> getVehicleInfoList( ) {
		return this.vehicleInfoList;
	}

}
