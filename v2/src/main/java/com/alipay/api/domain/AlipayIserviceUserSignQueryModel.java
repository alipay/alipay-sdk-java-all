package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户签约信息
 *
 * @author auto create
 * @since 1.0, 2025-11-20 14:32:42
 */
public class AlipayIserviceUserSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6382892886558457544L;

	/**
	 * 签约创建时间查询截止时间
	 */
	@ApiField("agreement_gmt_create_end")
	private Date agreementGmtCreateEnd;

	/**
	 * 签约创建时间查询起始时间
	 */
	@ApiField("agreement_gmt_create_start")
	private Date agreementGmtCreateStart;

	/**
	 * 当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 身份证号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 每页数据条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Date getAgreementGmtCreateEnd() {
		return this.agreementGmtCreateEnd;
	}
	public void setAgreementGmtCreateEnd(Date agreementGmtCreateEnd) {
		this.agreementGmtCreateEnd = agreementGmtCreateEnd;
	}

	public Date getAgreementGmtCreateStart() {
		return this.agreementGmtCreateStart;
	}
	public void setAgreementGmtCreateStart(Date agreementGmtCreateStart) {
		this.agreementGmtCreateStart = agreementGmtCreateStart;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
