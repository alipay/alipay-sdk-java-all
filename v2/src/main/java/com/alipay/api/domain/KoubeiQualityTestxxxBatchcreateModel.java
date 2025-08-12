package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * koubei.quality.
 *
 * @author auto create
 * @since 1.0, 2023-11-14 13:21:42
 */
public class KoubeiQualityTestxxxBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 5683499797871766179L;

	/**
	 * 1
	 */
	@ApiField("s")
	private String s;

	/**
	 * 1
	 */
	@ApiField("ss_openid")
	private String ssOpenid;

	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}

	public String getSsOpenid() {
		return this.ssOpenid;
	}
	public void setSsOpenid(String ssOpenid) {
		this.ssOpenid = ssOpenid;
	}

}
