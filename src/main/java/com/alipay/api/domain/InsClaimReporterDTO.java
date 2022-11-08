package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台报案接口-报案人模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:20:29
 */
public class InsClaimReporterDTO extends AlipayObject {

	private static final long serialVersionUID = 3743465147588522843L;

	/**
	 * 报案人身份证号
	 */
	@ApiField("reporter_id_card_no")
	private String reporterIdCardNo;

	/**
	 * 报案人姓名
	 */
	@ApiField("reporter_name")
	private String reporterName;

	/**
	 * 报案人user_id
	 */
	@ApiField("reporter_uid")
	private String reporterUid;

	public String getReporterIdCardNo() {
		return this.reporterIdCardNo;
	}
	public void setReporterIdCardNo(String reporterIdCardNo) {
		this.reporterIdCardNo = reporterIdCardNo;
	}

	public String getReporterName() {
		return this.reporterName;
	}
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	public String getReporterUid() {
		return this.reporterUid;
	}
	public void setReporterUid(String reporterUid) {
		this.reporterUid = reporterUid;
	}

}
