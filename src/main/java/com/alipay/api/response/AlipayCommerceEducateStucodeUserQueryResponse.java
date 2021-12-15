package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StuStatusArchive;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.stucode.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-08 21:35:52
 */
public class AlipayCommerceEducateStucodeUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3271919772952192994L;

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
