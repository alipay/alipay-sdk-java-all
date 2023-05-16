package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文档回归测试勿动openapi_openid_put多场景
 *
 * @author auto create
 * @since 1.0, 2022-11-19 15:02:15
 */
public class AlipaySecurityDumQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3896895613292163545L;

	/**
	 * 122
	 */
	@ApiField("cc_open_id")
	private String ccOpenId;

	/**
	 * 122
	 */
	@ApiField("ccc")
	private Long ccc;

	/**
	 * ccdd
	 */
	@ApiField("f")
	private JinyoutestopenidThree f;

	/**
	 * 邮政编码
	 */
	@ApiField("zip")
	private String zip;

	public String getCcOpenId() {
		return this.ccOpenId;
	}
	public void setCcOpenId(String ccOpenId) {
		this.ccOpenId = ccOpenId;
	}

	public Long getCcc() {
		return this.ccc;
	}
	public void setCcc(Long ccc) {
		this.ccc = ccc;
	}

	public JinyoutestopenidThree getF() {
		return this.f;
	}
	public void setF(JinyoutestopenidThree f) {
		this.f = f;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
