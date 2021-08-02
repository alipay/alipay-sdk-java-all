package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StuStatusArchive;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.stucode.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:04
 */
public class AlipayCommerceEducateStucodeUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1265695511132233531L;

	/** 
	 * 学籍档案
	 */
	@ApiField("archive")
	private StuStatusArchive archive;

	/** 
	 * 是否通过学生认证
	 */
	@ApiField("stu_certify")
	private Boolean stuCertify;

	public void setArchive(StuStatusArchive archive) {
		this.archive = archive;
	}
	public StuStatusArchive getArchive( ) {
		return this.archive;
	}

	public void setStuCertify(Boolean stuCertify) {
		this.stuCertify = stuCertify;
	}
	public Boolean getStuCertify( ) {
		return this.stuCertify;
	}

}
