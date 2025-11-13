package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserCertDocDrivingLicense;
import com.alipay.api.domain.AlipayUserCertDocIDCard;
import com.alipay.api.domain.AlipayUserCertDocPassport;
import com.alipay.api.domain.AlipayUserCertDocVehicleLicense;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:13
 */
public class AlipayUserCertdocQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2341818722114289633L;

	/** 
	 * 进行授权的用户本人的驾驶证信息
	 */
	@ApiField("driving_license")
	private AlipayUserCertDocDrivingLicense drivingLicense;

	/** 
	 * 所有驾驶证信息列表
	 */
	@ApiListField("driving_license_list")
	@ApiField("alipay_user_cert_doc_driving_license")
	private List<AlipayUserCertDocDrivingLicense> drivingLicenseList;

	/** 
	 * 进行授权的用户本人的身份证信息
	 */
	@ApiField("identity_card")
	private AlipayUserCertDocIDCard identityCard;

	/** 
	 * 所有身份证信息列表
	 */
	@ApiListField("identity_card_list")
	@ApiField("alipay_user_cert_doc_i_d_card")
	private List<AlipayUserCertDocIDCard> identityCardList;

	/** 
	 * 护照列表
	 */
	@ApiListField("passport_list")
	@ApiField("alipay_user_cert_doc_passport")
	private List<AlipayUserCertDocPassport> passportList;

	/** 
	 * 进行授权的用户本人的行驶证信息列表
	 */
	@ApiListField("self_vehicle_license_list")
	@ApiField("alipay_user_cert_doc_vehicle_license")
	private List<AlipayUserCertDocVehicleLicense> selfVehicleLicenseList;

	/** 
	 * 所有行驶证信息列表
	 */
	@ApiListField("vehicle_license_list")
	@ApiField("alipay_user_cert_doc_vehicle_license")
	private List<AlipayUserCertDocVehicleLicense> vehicleLicenseList;

	public void setDrivingLicense(AlipayUserCertDocDrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public AlipayUserCertDocDrivingLicense getDrivingLicense( ) {
		return this.drivingLicense;
	}

	public void setDrivingLicenseList(List<AlipayUserCertDocDrivingLicense> drivingLicenseList) {
		this.drivingLicenseList = drivingLicenseList;
	}
	public List<AlipayUserCertDocDrivingLicense> getDrivingLicenseList( ) {
		return this.drivingLicenseList;
	}

	public void setIdentityCard(AlipayUserCertDocIDCard identityCard) {
		this.identityCard = identityCard;
	}
	public AlipayUserCertDocIDCard getIdentityCard( ) {
		return this.identityCard;
	}

	public void setIdentityCardList(List<AlipayUserCertDocIDCard> identityCardList) {
		this.identityCardList = identityCardList;
	}
	public List<AlipayUserCertDocIDCard> getIdentityCardList( ) {
		return this.identityCardList;
	}

	public void setPassportList(List<AlipayUserCertDocPassport> passportList) {
		this.passportList = passportList;
	}
	public List<AlipayUserCertDocPassport> getPassportList( ) {
		return this.passportList;
	}

	public void setSelfVehicleLicenseList(List<AlipayUserCertDocVehicleLicense> selfVehicleLicenseList) {
		this.selfVehicleLicenseList = selfVehicleLicenseList;
	}
	public List<AlipayUserCertDocVehicleLicense> getSelfVehicleLicenseList( ) {
		return this.selfVehicleLicenseList;
	}

	public void setVehicleLicenseList(List<AlipayUserCertDocVehicleLicense> vehicleLicenseList) {
		this.vehicleLicenseList = vehicleLicenseList;
	}
	public List<AlipayUserCertDocVehicleLicense> getVehicleLicenseList( ) {
		return this.vehicleLicenseList;
	}

}
