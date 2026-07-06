package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保存康乃心小程序心电图报告
 *
 * @author auto create
 * @since 1.0, 2026-05-14 16:22:49
 */
public class AlipayCommerceMedicalArchiveEcgSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2823866254681182284L;

	/**
	 * 认证令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 数据来源
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * null
	 */
	@ApiListField("ecg_report_datail")
	@ApiField("ecg_report_datail")
	private List<EcgReportDatail> ecgReportDatail;

	/**
	 * 采集成员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<EcgReportDatail> getEcgReportDatail() {
		return this.ecgReportDatail;
	}
	public void setEcgReportDatail(List<EcgReportDatail> ecgReportDatail) {
		this.ecgReportDatail = ecgReportDatail;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
