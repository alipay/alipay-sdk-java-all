package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 档案对接
 *
 * @author auto create
 * @since 1.0, 2022-06-29 18:35:01
 */
public class AlipayDigitalmgmtEcmcoreDataarchivesCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3873952172198931853L;

	/**
	 * 业务编码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 校验值
	 */
	@ApiField("checksum")
	private String checksum;

	/**
	 * 校验算法
	 */
	@ApiField("checksum_type")
	private String checksumType;

	/**
	 * 数据描述
	 */
	@ApiField("data_desc")
	private String dataDesc;

	/**
	 * 数据id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 归档数据包存放路径
	 */
	@ApiField("data_path")
	private String dataPath;

	/**
	 * 系统编码
	 */
	@ApiField("system_code")
	private String systemCode;

	/**
	 * 系统名称
	 */
	@ApiField("system_heading")
	private String systemHeading;

	/**
	 * 单位编码
	 */
	@ApiField("unit_code")
	private String unitCode;

	/**
	 * 单位名称
	 */
	@ApiField("unit_heading")
	private String unitHeading;

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getChecksum() {
		return this.checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getChecksumType() {
		return this.checksumType;
	}
	public void setChecksumType(String checksumType) {
		this.checksumType = checksumType;
	}

	public String getDataDesc() {
		return this.dataDesc;
	}
	public void setDataDesc(String dataDesc) {
		this.dataDesc = dataDesc;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataPath() {
		return this.dataPath;
	}
	public void setDataPath(String dataPath) {
		this.dataPath = dataPath;
	}

	public String getSystemCode() {
		return this.systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getSystemHeading() {
		return this.systemHeading;
	}
	public void setSystemHeading(String systemHeading) {
		this.systemHeading = systemHeading;
	}

	public String getUnitCode() {
		return this.unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitHeading() {
		return this.unitHeading;
	}
	public void setUnitHeading(String unitHeading) {
		this.unitHeading = unitHeading;
	}

}
