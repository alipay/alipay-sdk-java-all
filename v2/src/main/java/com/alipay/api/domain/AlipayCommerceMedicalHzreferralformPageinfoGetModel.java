package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 杭州数字家医转诊分页列表
 *
 * @author auto create
 * @since 1.0, 2025-10-27 10:44:20
 */
public class AlipayCommerceMedicalHzreferralformPageinfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 6475626438185828881L;

	/**
	 * 医生的身份信息
	 */
	@ApiField("doctor_cert_no")
	private String doctorCertNo;

	/**
	 * 转诊单分页列表的查询分页页数，第n页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 转诊单分页列表的分页大小，即n条记录为一页
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 转诊单的来源，"HZ_XH"为杭州来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 转诊单状态
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public String getDoctorCertNo() {
		return this.doctorCertNo;
	}
	public void setDoctorCertNo(String doctorCertNo) {
		this.doctorCertNo = doctorCertNo;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
