package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申请新增机构API
 *
 * @author auto create
 * @since 1.0, 2026-01-06 17:26:35
 */
public class AlipayOverseasOpenIndrbeneficiaryApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1857361179741528586L;

	/**
	 * 机构地址信息
	 */
	@ApiField("address")
	private IndrAddress address;

	/**
	 * 机构简称
	 */
	@ApiField("beneficiary_abb_name")
	private String beneficiaryAbbName;

	/**
	 * 机构本地名称
	 */
	@ApiField("beneficiary_local_name")
	private String beneficiaryLocalName;

	/**
	 * 机构名称
	 */
	@ApiField("beneficiary_name")
	private String beneficiaryName;

	/**
	 * 1. 大学：COLLEGE
2. 高中：HIGH_SCHOOL
3. 房东：LANDLORD
4. 租房服务商：RENTING_ISV
	 */
	@ApiField("beneficiary_sub_type")
	private String beneficiarySubType;

	/**
	 * 1. 学校：SCHOOL
2. 租赁机构：RENTING
	 */
	@ApiField("beneficiary_type")
	private String beneficiaryType;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 文件list
	 */
	@ApiListField("file_list")
	@ApiField("indr_file_info")
	private List<IndrFileInfo> fileList;

	/**
	 * 联系电话
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 1. 留学场景：TUITION
2. 租房场景：HOUSE_RENTAL
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 网址
	 */
	@ApiField("websites")
	private String websites;

	public IndrAddress getAddress() {
		return this.address;
	}
	public void setAddress(IndrAddress address) {
		this.address = address;
	}

	public String getBeneficiaryAbbName() {
		return this.beneficiaryAbbName;
	}
	public void setBeneficiaryAbbName(String beneficiaryAbbName) {
		this.beneficiaryAbbName = beneficiaryAbbName;
	}

	public String getBeneficiaryLocalName() {
		return this.beneficiaryLocalName;
	}
	public void setBeneficiaryLocalName(String beneficiaryLocalName) {
		this.beneficiaryLocalName = beneficiaryLocalName;
	}

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBeneficiarySubType() {
		return this.beneficiarySubType;
	}
	public void setBeneficiarySubType(String beneficiarySubType) {
		this.beneficiarySubType = beneficiarySubType;
	}

	public String getBeneficiaryType() {
		return this.beneficiaryType;
	}
	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<IndrFileInfo> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<IndrFileInfo> fileList) {
		this.fileList = fileList;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getWebsites() {
		return this.websites;
	}
	public void setWebsites(String websites) {
		this.websites = websites;
	}

}
