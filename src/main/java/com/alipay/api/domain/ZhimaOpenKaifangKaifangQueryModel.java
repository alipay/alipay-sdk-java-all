package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 没有人脸有涉敏参数
 *
 * @author auto create
 * @since 1.0, 2022-07-05 14:24:47
 */
public class ZhimaOpenKaifangKaifangQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2173445422584384575L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 多福多寿 的
	 */
	@ApiField("page_num")
	private String pageNum;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

}
