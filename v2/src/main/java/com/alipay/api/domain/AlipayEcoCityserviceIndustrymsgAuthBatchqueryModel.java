package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户行业授权状态批量查询接口
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:35:23
 */
public class AlipayEcoCityserviceIndustrymsgAuthBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8276858832374726992L;

	/**
	 * 用户身份信息列表，传入上限为100条
	 */
	@ApiListField("certificate_info_list")
	@ApiField("certificate_info")
	private List<CertificateInfo> certificateInfoList;

	/**
	 * 行业类型，目前可选：
1：社保
2：公积金
3：交管
4：公安非交管
5：医保
	 */
	@ApiField("industry_type")
	private Long industryType;

	public List<CertificateInfo> getCertificateInfoList() {
		return this.certificateInfoList;
	}
	public void setCertificateInfoList(List<CertificateInfo> certificateInfoList) {
		this.certificateInfoList = certificateInfoList;
	}

	public Long getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(Long industryType) {
		this.industryType = industryType;
	}

}
