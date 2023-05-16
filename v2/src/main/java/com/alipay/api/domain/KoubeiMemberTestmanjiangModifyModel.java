package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * testmanjiang
 *
 * @author auto create
 * @since 1.0, 2023-02-23 20:17:40
 */
public class KoubeiMemberTestmanjiangModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3124919584447895678L;

	/**
	 * 1
	 */
	@ApiField("json_test")
	private String jsonTest;

	/**
	 * 1
	 */
	@ApiField("sss_uid")
	private String sssUid;

	/**
	 * 1
	 */
	@ApiField("sss_uid_openid")
	private String sssUidOpenid;

	public String getJsonTest() {
		return this.jsonTest;
	}
	public void setJsonTest(String jsonTest) {
		this.jsonTest = jsonTest;
	}

	public String getSssUid() {
		return this.sssUid;
	}
	public void setSssUid(String sssUid) {
		this.sssUid = sssUid;
	}

	public String getSssUidOpenid() {
		return this.sssUidOpenid;
	}
	public void setSssUidOpenid(String sssUidOpenid) {
		this.sssUidOpenid = sssUidOpenid;
	}

}
