package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 算法档案修改基本信息
 *
 * @author auto create
 * @since 1.0, 2022-03-25 14:46:30
 */
public class AlipayFincoreComplianceApccenterAlgorithmbaseinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1438588783757677977L;

	/**
	 * 平台算法唯一编码
	 */
	@ApiField("platform_algorithm_code")
	private String platformAlgorithmCode;

	/**
	 * 平台算法创建时间
	 */
	@ApiField("platform_algorithm_create_time")
	private String platformAlgorithmCreateTime;

	/**
	 * 平台算法描述
	 */
	@ApiField("platform_algorithm_desc")
	private String platformAlgorithmDesc;

	/**
	 * 平台算法最新迭代唯一编码
	 */
	@ApiField("platform_algorithm_last_iteration_code")
	private String platformAlgorithmLastIterationCode;

	/**
	 * 平台算法最新迭代操作用户工号
	 */
	@ApiField("platform_algorithm_last_iteration_op_user_emp_no")
	private String platformAlgorithmLastIterationOpUserEmpNo;

	/**
	 * 平台算法修改时间
	 */
	@ApiField("platform_algorithm_modify_time")
	private String platformAlgorithmModifyTime;

	/**
	 * 平台算法名称
	 */
	@ApiField("platform_algorithm_name")
	private String platformAlgorithmName;

	/**
	 * 平台算法负责人工号
	 */
	@ApiField("platform_algorithm_owner_emp_no")
	private String platformAlgorithmOwnerEmpNo;

	/**
	 * 平台算法来源
	 */
	@ApiField("platform_algorithm_source")
	private String platformAlgorithmSource;

	/**
	 * 平台算法状态
	 */
	@ApiField("platform_algorithm_status")
	private String platformAlgorithmStatus;

	public String getPlatformAlgorithmCode() {
		return this.platformAlgorithmCode;
	}
	public void setPlatformAlgorithmCode(String platformAlgorithmCode) {
		this.platformAlgorithmCode = platformAlgorithmCode;
	}

	public String getPlatformAlgorithmCreateTime() {
		return this.platformAlgorithmCreateTime;
	}
	public void setPlatformAlgorithmCreateTime(String platformAlgorithmCreateTime) {
		this.platformAlgorithmCreateTime = platformAlgorithmCreateTime;
	}

	public String getPlatformAlgorithmDesc() {
		return this.platformAlgorithmDesc;
	}
	public void setPlatformAlgorithmDesc(String platformAlgorithmDesc) {
		this.platformAlgorithmDesc = platformAlgorithmDesc;
	}

	public String getPlatformAlgorithmLastIterationCode() {
		return this.platformAlgorithmLastIterationCode;
	}
	public void setPlatformAlgorithmLastIterationCode(String platformAlgorithmLastIterationCode) {
		this.platformAlgorithmLastIterationCode = platformAlgorithmLastIterationCode;
	}

	public String getPlatformAlgorithmLastIterationOpUserEmpNo() {
		return this.platformAlgorithmLastIterationOpUserEmpNo;
	}
	public void setPlatformAlgorithmLastIterationOpUserEmpNo(String platformAlgorithmLastIterationOpUserEmpNo) {
		this.platformAlgorithmLastIterationOpUserEmpNo = platformAlgorithmLastIterationOpUserEmpNo;
	}

	public String getPlatformAlgorithmModifyTime() {
		return this.platformAlgorithmModifyTime;
	}
	public void setPlatformAlgorithmModifyTime(String platformAlgorithmModifyTime) {
		this.platformAlgorithmModifyTime = platformAlgorithmModifyTime;
	}

	public String getPlatformAlgorithmName() {
		return this.platformAlgorithmName;
	}
	public void setPlatformAlgorithmName(String platformAlgorithmName) {
		this.platformAlgorithmName = platformAlgorithmName;
	}

	public String getPlatformAlgorithmOwnerEmpNo() {
		return this.platformAlgorithmOwnerEmpNo;
	}
	public void setPlatformAlgorithmOwnerEmpNo(String platformAlgorithmOwnerEmpNo) {
		this.platformAlgorithmOwnerEmpNo = platformAlgorithmOwnerEmpNo;
	}

	public String getPlatformAlgorithmSource() {
		return this.platformAlgorithmSource;
	}
	public void setPlatformAlgorithmSource(String platformAlgorithmSource) {
		this.platformAlgorithmSource = platformAlgorithmSource;
	}

	public String getPlatformAlgorithmStatus() {
		return this.platformAlgorithmStatus;
	}
	public void setPlatformAlgorithmStatus(String platformAlgorithmStatus) {
		this.platformAlgorithmStatus = platformAlgorithmStatus;
	}

}
