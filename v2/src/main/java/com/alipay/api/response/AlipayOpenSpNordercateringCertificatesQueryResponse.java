package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateSimpleInfo;
import com.alipay.api.domain.UnavailableCertificate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordercatering.certificates.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-12 13:47:58
 */
public class AlipayOpenSpNordercateringCertificatesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7781766844115838659L;

	/** 
	 * null
	 */
	@ApiListField("certificate_list")
	@ApiField("certificate_simple_info")
	private List<CertificateSimpleInfo> certificateList;

	/** 
	 * 聚合完成状态
	 */
	@ApiField("completion_status")
	private String completionStatus;

	/** 
	 * 原始凭证列表是否还有下一页，与本页补齐结果数量无关
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 当前分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 凭证中心返回的总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * null
	 */
	@ApiListField("unavailable_certificates")
	@ApiField("unavailable_certificate")
	private List<UnavailableCertificate> unavailableCertificates;

	public void setCertificateList(List<CertificateSimpleInfo> certificateList) {
		this.certificateList = certificateList;
	}
	public List<CertificateSimpleInfo> getCertificateList( ) {
		return this.certificateList;
	}

	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}
	public String getCompletionStatus( ) {
		return this.completionStatus;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

	public void setUnavailableCertificates(List<UnavailableCertificate> unavailableCertificates) {
		this.unavailableCertificates = unavailableCertificates;
	}
	public List<UnavailableCertificate> getUnavailableCertificates( ) {
		return this.unavailableCertificates;
	}

}
