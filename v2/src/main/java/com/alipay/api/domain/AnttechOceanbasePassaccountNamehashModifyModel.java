package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预检并补齐邮箱账号哈希
 *
 * @author auto create
 * @since 1.0, 2026-09-29 10:43:17
 */
public class AnttechOceanbasePassaccountNamehashModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1513139333118337543L;

	/**
	 * 账号id数组
	 */
	@ApiListField("pass_account_id_list")
	@ApiField("string")
	private List<String> passAccountIdList;

	/**
	 * 预校验
	 */
	@ApiField("precheck")
	private Boolean precheck;

	/**
	 * hash值
	 */
	@ApiField("snapshot_token")
	private String snapshotToken;

	public List<String> getPassAccountIdList() {
		return this.passAccountIdList;
	}
	public void setPassAccountIdList(List<String> passAccountIdList) {
		this.passAccountIdList = passAccountIdList;
	}

	public Boolean getPrecheck() {
		return this.precheck;
	}
	public void setPrecheck(Boolean precheck) {
		this.precheck = precheck;
	}

	public String getSnapshotToken() {
		return this.snapshotToken;
	}
	public void setSnapshotToken(String snapshotToken) {
		this.snapshotToken = snapshotToken;
	}

}
